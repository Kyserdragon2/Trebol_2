package Controladores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Conexion;
import Objetos.Sistema_UNO;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import jcifs.smb.SmbFile;

public class Suno_controller2 {

    Conexion cc = new Conexion();

    public boolean eliminar_suno(String nit, int id_empresa, int id_tipo_doc) {
        Sistema_UNO D = new Sistema_UNO(nit, id_empresa, id_tipo_doc);
        String sql;
        sql = "DELETE FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + D.getNit() + "'\n"
                + "AND id_empresa = " + D.getId_empresa() + "\n"
                + "AND id_tipo_doc  =" + D.getId_tipo_doc() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminar_suno_cont(String no_factura, String nit, int id_empresa, int id_tipo_doc) {
        Sistema_UNO D = new Sistema_UNO(nit, no_factura, id_empresa, id_tipo_doc);
        String sql;
        sql = "DELETE FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + D.getNit() + "'\n"
                + "AND id_empresa = " + D.getId_empresa() + "\n"
                + "AND id_tipo_doc  =" + D.getId_tipo_doc() + "\n"
                + "AND no_factura = '" + D.getNo_factura() + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existe_documento(String no_factura, String nit, int id_empresa, int id_tipo_doc) {
        boolean ub = false;
        String sql;
        if (no_factura.equals("")) {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        } else {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND no_factura LIKE '" + no_factura + "'"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            ub = rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public boolean existe_documento_suno(String nit, int id_empresa, int id_tipo_doc, String consecutivo) {
        boolean ub = false;
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + nit + "'\n"
                + "AND id_empresa = " + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + "\n"
                + "AND consecutivo =" + consecutivo + ";";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            ub = rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public boolean existe_documento_suno_multi(int id_empresa, int id_tipo_doc, String consecutivo) {
        boolean ub = false;
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE id_empresa = " + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + "\n"
                + "AND consecutivo =" + consecutivo + ";";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            ub = rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public String ubicacion_documento(String no_factura, String nit, int id_empresa, int id_tipo_doc) {
        String ub = "";
        String sql;
        if (no_factura.equals("")) {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        } else {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND no_factura LIKE '" + no_factura + "'"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                ub = rs.getString("ubicacion");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public String ubicacion_documento_suno(String consecutivo, String nit, String empresa, String doc) {
        String ub = "";
        String sql;
        sql = "SELECT suno.`ubicacion`\n"
                + "FROM trebol_sistema_uno AS suno\n"
                + "JOIN trebol_proveedor AS tp ON suno.`nit`=tp.`nit`\n"
                + "JOIN trebol_tipo_documento AS ttd ON suno.`id_tipo_doc`=ttd.`id`\n"
                + "JOIN trebol_empresa AS temp ON suno.`id_empresa`=temp.`id`\n"
                + "WHERE CONCAT(ttd.`tipo_doc`,'-',suno.`consecutivo`) LIKE '%" + consecutivo + "%'\n"
                + "AND temp.`nom_empresa` LIKE '%" + empresa + "%'\n"
                + "AND suno.`nit` LIKE '%" + nit + "%'\n"
                + "AND ttd.`nombre` LIKE '%" + doc + "%'\n"
                + "ORDER BY consecutivo;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                ub = rs.getString("suno.ubicacion");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public String ubicacion_documento_multi(int id_empresa, int id_tipo_doc, String consecutivo) {
        String ub = "";
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE id_empresa =" + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + "\n"
                + "AND consecutivo =" + consecutivo + ";";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                ub = rs.getString("ubicacion");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public String ubicacion_documento_txt(String no_factura, String nit, int id_empresa, int id_tipo_doc, String doc) {
        String ub = "", ub2, ub3;
        String sql;
        if (no_factura.equals("")) {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        } else {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND no_factura LIKE '" + no_factura + "'"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                SmbFile fs = new SmbFile("smb:" + rs.getString("ubicacion"));
                ub2 = fs.getParent();
                switch (id_empresa) {
                    case 1:
                        ub3 = ub2.replace("Aviomar/" + doc, "") + "TXT/Aviomar/" + doc;
                        ub = ub3 + "/" + fs.getName().replaceAll(".pdf", ".txt");
                        break;
                    case 2:
                        ub3 = ub2.replace("Colvan/" + doc, "") + "TXT/Colvan/" + doc;
                        ub = ub3 + "/" + fs.getName().replaceAll(".pdf", ".txt");
                        break;
                    case 3:
                        ub3 = ub2.replace("Snider/" + doc, "") + "TXT/Snider/" + doc;
                        ub = ub3 + "/" + fs.getName().replaceAll(".pdf", ".txt");
                        break;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Suno_controller2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public String consecutivo_documento(String no_factura, String nit, int id_empresa, int id_tipo_doc) {
        String ub = "";
        String sql;
        if (no_factura.equals("")) {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        } else {
            sql = "SELECT *\n"
                    + "FROM trebol_sistema_uno\n"
                    + "WHERE nit LIKE '" + nit + "'\n"
                    + "AND no_factura LIKE '" + no_factura + "'"
                    + "AND id_empresa = " + id_empresa + "\n"
                    + "AND id_tipo_doc =" + id_tipo_doc + ";";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                ub = rs.getString("consecutivo");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public void ver_documento(String ubicacion) {
        try {
            File ruta = new File(ubicacion);
            Desktop.getDesktop().open(ruta);
        } catch (IOException ex) {
            Logger.getLogger(Suno_controller2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
