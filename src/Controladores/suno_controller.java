package Controladores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Conexion;
import Objetos.Sistema_UNO;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class suno_controller {

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

    public boolean existe_documento(String nit, int id_empresa, int id_tipo_doc) {
        boolean ub = false;
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + nit + "'\n"
                + "AND id_empresa = " + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + ";";
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

    public String ubicacion_documento(String nit, int id_empresa, int id_tipo_doc) {
        String ub = "";
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + nit + "'\n"
                + "AND id_empresa = " + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + ";";

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

    public String consecutivo_documento(String nit, int id_empresa, int id_tipo_doc) {
        String ub = "";
        String sql;
        sql = "SELECT *\n"
                + "FROM trebol_sistema_uno\n"
                + "WHERE nit LIKE '" + nit + "'\n"
                + "AND id_empresa = " + id_empresa + "\n"
                + "AND id_tipo_doc =" + id_tipo_doc + ";";

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
            Logger.getLogger(suno_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
