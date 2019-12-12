package Controladores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Conexion;

public class suno_controller {

    Conexion cc = new Conexion();

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
                ub=rs.getString("ubicacion");
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
                ub=rs.getString("consecutivo");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

}
