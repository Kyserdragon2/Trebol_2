package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Area_Controller {

    Conexion cc = new Conexion();

    public int id_area(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_areas\n"
                + "WHERE nombre_area='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Area_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }
}
