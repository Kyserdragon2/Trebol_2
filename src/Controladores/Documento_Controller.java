package Controladores;

import Clases.Conexion;
import Objetos.Documento;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Documento_Controller {

    Conexion cc = new Conexion();

    public boolean crear_documento(int id_tipo_doc, int id_factura, String consecutivo, String ubicacion) {
        Documento D = new Documento(id_tipo_doc, id_factura, consecutivo, ubicacion);
        String sql;
        if (consecutivo.equals("")) {
            sql = "INSERT INTO trebol_documentos (id_tipo_doc, id_factura, ubicacion)\n"
                    + "VALUES (" + D.getId_tipo_doc() + ", " + D.getId_factura() + ",'" + D.getUbicacion() + "')";
        } else {
            sql = "INSERT INTO trebol_documentos (id_tipo_doc, id_factura, consecutivo, ubicacion)\n"
                    + "VALUES (" + D.getId_tipo_doc() + ", " + D.getId_factura() + ",'" + D.getConsecutivo() + "','" + D.getUbicacion() + "')";
        }
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificar_documento(int id_factura, String ubicacion, String nueva_ubicacion) {
        Documento D = new Documento(id_factura, ubicacion);
        String sql;
        sql = "UPDATE trebol_documentos\n"
                + "SET ubicacion ='" + nueva_ubicacion + "'\n"
                + "WHERE ubicacion='" + D.getUbicacion() + "'\n"
                + "AND id_factura =" + D.getId_factura() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void ver_documento(String doc, int idf) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT ubicacion\n"
                        + "FROM trebol_documentos AS td\n"
                        + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`"
                        + "WHERE nombre LIKE '" + doc + "'\n"
                        + "AND id_factura=" + idf + ";")) {
            if (rs.next()) {
                File ruta = new File(rs.getString("ubicacion"));
                Desktop.getDesktop().open(ruta);
            }
        } catch (SQLException | IOException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean eliminar_documento(int id_tipo_doc, int id_factura) {
        Documento D = new Documento(id_tipo_doc, id_factura);
        String sql;
        sql = "DELETE FROM trebol_documentos\n"
                + "WHERE id_tipo_doc =" + D.getId_tipo_doc() + "\n"
                + "AND id_factura=" + id_factura + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String ubicacion_documento(String doc, int id_factura) {
        String ub = "";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT ubicacion\n"
                        + "FROM trebol_documentos AS td\n"
                        + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`"
                        + "WHERE nombre LIKE '" + doc + "'\n"
                        + "AND id_factura=" + id_factura + ";")) {
            if (rs.next()) {
                ub = rs.getString("ubicacion");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public boolean actualizar_documento(int id_tipo_doc, int id_factura, String ubicacion) {
        Documento D = new Documento(id_tipo_doc, id_factura, ubicacion);
        String sql;
        sql = "UPDATE trebol_documentos\n"
                + "SET ubicacion='" + D.getUbicacion() + "'\n"
                + "WHERE id_tipo_doc =" + D.getId_tipo_doc() + "\n"
                + "AND id_factura=" + id_factura + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existe_documento(String doc, int idf) {
        boolean ub = false;
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT ubicacion\n"
                        + "FROM trebol_documentos AS td\n"
                        + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`"
                        + "WHERE nombre LIKE '" + doc + "'\n"
                        + "AND id_factura=" + idf + ";")) {
            ub = rs.next();

        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public String consecutivo_doc(String doc, int idf) {
        String cons = "";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT consecutivo\n"
                        + "FROM trebol_documentos AS td\n"
                        + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`"
                        + "WHERE nombre LIKE '" + doc + "'\n"
                        + "AND id_factura=" + idf + ";")) {
            if (rs.next()) {
                cons = rs.getString("consecutivo");
            }

        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return cons;
    }
}
