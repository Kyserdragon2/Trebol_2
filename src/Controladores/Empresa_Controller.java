package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empresa_Controller {

    Conexion cc = new Conexion();

    public int id_empresa(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_empresa\n"
                + "WHERE nom_empresa='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Empresa_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public String empresa(int dato) {
        String emp = "";
        String idc = "SELECT nom_empresa FROM trebol_empresa\n"
                + "WHERE id='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                emp = rs.getString("nom_empresa");
            }
        } catch (SQLException e) {
            Logger.getLogger(Empresa_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return emp;
    }
}
