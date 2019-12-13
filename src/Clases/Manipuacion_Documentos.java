package Clases;

import Controladores.Documento_Controller;
import Controladores.Factura_Controller;
import Controladores.Notificaciones_Sistema;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;

public class Manipuacion_Documentos {

    Documento_Controller DC = new Documento_Controller();
    Factura_Controller FC = new Factura_Controller();
    Notificaciones_Sistema NS = new Notificaciones_Sistema();

    @SuppressWarnings("null")
    public static String extencion(String filename) {
        File f = new File(filename);
        if (f == null || f.isDirectory()) {
            return "nulo o directorio";
        } else if (f.isFile()) {
            int index = filename.lastIndexOf('.');
            if (index == -1) {
                return "";
            } else {
                return filename.substring(index + 1);
            }
        } else {
            return "que has enviado?";
        }
    }

    public void Cargar_Documento(String no_factura, String Proveedor, String Empresa, String nombre, String ruta, int id_tipo_factura,
            String consecutivo, int id_proveedor, int id_empresa) {
        try {
            String url = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa;
            String url2 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa + "/" + Proveedor;
            String url3 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa + "/" + Proveedor + "/" + no_factura;
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            SmbFile dir = new SmbFile(url, auth);
            SmbFile dir2 = new SmbFile(url2, auth);
            SmbFile dir3 = new SmbFile(url3, auth);
            if (!dir.exists()) {
                dir.mkdir();
            }
            if (!dir2.exists()) {
                dir2.mkdir();
            }
            if (!dir3.exists()) {
                dir3.mkdir();
            }
            String dest = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa + "/" + Proveedor + "/" + no_factura
                    + "/" + nombre + "." + extencion(ruta);
            Path origen = FileSystems.getDefault().getPath(ruta);
            SmbFile destino = new SmbFile(dest, auth);
            try (OutputStream out = destino.getOutputStream()) {
                Files.copy(origen, out);
                int id_fact = FC.id_factura(no_factura, id_proveedor, id_empresa);
                DC.crear_documento(id_tipo_factura, id_fact, consecutivo, dest.replace("smb:", ""));
            }
        } catch (IOException ex) {
            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar_documento(String Factura, String Proveedor, String Empresa, String nombre, String ruta, String ruta_ant,
            int id_tipo_factura, String consecutivo, int id_proveedor, int id_empresa) {
        try {
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            String url = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa;
            String url2 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa + "/" + Proveedor;
            String url3 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Facturas/" + Empresa + "/" + Proveedor + "/" + Factura + "/";
            SmbFile rutaanterior = new SmbFile("smb:" + ruta_ant, auth);
            SmbFile dir = new SmbFile(url, auth);
            SmbFile dir2 = new SmbFile(url2, auth);
            SmbFile dir3 = new SmbFile(url3, auth);
            if (!dir.exists()) {
                dir.mkdir();
            }
            if (!dir2.exists()) {
                dir2.mkdir();
            }
            if (!dir3.exists()) {
                dir3.mkdir();
            }
            SmbFile ruta1 = new SmbFile(rutaanterior.getParent(), auth);
            String[] archivos = ruta1.list();
            int n_archivos = archivos.length;
            for (int i = 0; i < n_archivos; i++) {
                SmbFile inicio = new SmbFile(ruta1.toString() + archivos[i], auth);
                SmbFile fin = new SmbFile(url3 + archivos[i], auth);
                if (!fin.exists()) {
                    inicio.copyTo(fin);
                    DC.modificar_documento(id_tipo_factura, id_tipo_factura, consecutivo, inicio.toString().replace("smb:", ""),
                            fin.toString().replace("smb:", ""));
                }
            }
            if (!url3.equals(rutaanterior.getParent())) {
                SmbFile eliminar = new SmbFile(rutaanterior.getParent(), auth);
                eliminar.delete();
            } else if (!ruta.equals(rutaanterior.toString().replace("smb:", ""))) {
                SmbFile doc_ant = new SmbFile("smb:" + ruta_ant, auth);
                Path origen = FileSystems.getDefault().getPath(ruta);
                SmbFile destino = new SmbFile(doc_ant.toString(), auth);
                try (OutputStream out = destino.getOutputStream()) {
                    Files.copy(origen, out);
                } catch (IOException ex) {
                    Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (MalformedURLException | SmbException ex) {
            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar_documento(String ruta_eliminar) {
        try {
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            String url = ruta_eliminar;
            SmbFile eliminar = new SmbFile("smb:" + url, auth);
            if (eliminar.exists()) {
                eliminar.delete();
            } else {
                System.out.println("Error");
            }
        } catch (MalformedURLException | SmbException ex) {
            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizar_documento(String doc_nuevo, String ruta_doc, String tipo_doc, int id_tipo_doc, int id_factura) {
        try {
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            SmbFile doc_ant = new SmbFile("smb:" + ruta_doc, auth);
            if (doc_ant.exists()) {
                doc_ant.delete();
                Path origen = FileSystems.getDefault().getPath(doc_nuevo);
                SmbFile destino = new SmbFile(doc_ant.getParent() + tipo_doc + "." + extencion(doc_nuevo), auth);
                try (OutputStream out = destino.getOutputStream()) {
                    Files.copy(origen, out);
                    if (DC.actualizar_documento(id_tipo_doc, id_factura, destino.toString().replace("smb:", ""))) {
                        NS.notificaciones("Actualización Documento", "El documento ha sido actualizado con exito.", "correcto");
                    } else {
                        NS.notificaciones("Actualización Documento", "El documento no pudo ser actualizado.", "error");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (MalformedURLException | SmbException ex) {
            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Cargar_Documento_Ant(String Proveedor, String Empresa, String ruta) {
        String ub = "";
        try {
            String url = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/";
            String url2 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/" + Empresa + "/";
            String url3 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/" + Empresa + "/" + Proveedor + "/";
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
            SmbFile dir = new SmbFile(url, auth);
            SmbFile dir2 = new SmbFile(url2, auth);
            SmbFile dir3 = new SmbFile(url3, auth);
            if (!dir.exists()) {
                dir.mkdir();
            }
            if (!dir2.exists()) {
                dir2.mkdir();
            }
            if (!dir3.exists()) {
                dir3.mkdir();
            }
            SmbFile origen = new SmbFile("smb:" + ruta, auth);
            String dst = url3 + origen.getName();
            SmbFile destino = new SmbFile(dst, auth);
            origen.copyTo(destino);
            ub = destino.toString().replace("smb:", "");
        } catch (IOException ex) {
            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

//    public String Documento_Anticipo(String prov, String emp, String nit, int id_empresa, String tipod, int cons) {
//        String td, ub = "";
//        try (Connection cn = cc.Conexion();
//                Statement st = cn.createStatement();
//                ResultSet rs = st.executeQuery("SELECT TT.`tipo_doc`, TS.`ubicacion`, TT.`nombre`, TT.`id`, TS.`consecutivo`, TS.`ubicacion`\n"
//                        + "FROM trebol_suno AS TS\n"
//                        + "INNER JOIN trebol_tipodoc AS TT ON TS.`id_tipodoc`=TT.`id`\n"
//                        + "WHERE tipo_doc='" + tipod + "'\n"
//                        + "AND nit='" + nit + "'\n"
//                        + "AND empresa=" + id_empresa + "\n"
//                        + "AND consecutivo=" + cons + ";");) {
//            if (rs.next()) {
//                td = rs.getString("TS.ubicacion");
//                String url = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/";
//                String url2 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/" + emp + "/";
//                String url3 = "smb://10.0.2.6/Aviomar-R/APLICACIONES/Treból_V2/Anticipos/" + emp + "/" + prov + "/";
//                NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(null, "Soporte", "Rock2020");
//                SmbFile dir = new SmbFile(url, auth);
//                SmbFile dir2 = new SmbFile(url2, auth);
//                SmbFile dir3 = new SmbFile(url3, auth);
//                if (!dir.exists()) {
//                    dir.mkdir();
//                }
//                if (!dir2.exists()) {
//                    dir2.mkdir();
//                }
//                if (!dir3.exists()) {
//                    dir3.mkdir();
//                }
//                SmbFile origen = new SmbFile("smb:" + td, auth);
//                String dst = url3 + origen.getName();
//                SmbFile destino = new SmbFile(dst, auth);
//                origen.copyTo(destino);
//                ub = destino.toString().replace("smb:", "");
//            }
//        } catch (Exception e) {
//            Logger.getLogger(Manipuacion_Documentos.class.getName()).log(Level.SEVERE, null, e);
//        }
//        return ub;
//    }
}
