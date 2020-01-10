package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Area_Controller {

    Conexion cc = new Conexion();

    public int id_area(String dato) {
        int id = 0;
        String sql = "SELECT id FROM trebol_areas\n"
                + "WHERE nombre_area='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Area_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public int id_area_rechazo(int id_usuario_rechazo) {
        int id = 0;
        String sql = "SELECT tu.id_area\n"
                + "FROM trebol_tiempos AS tt\n"
                + "JOIN trebol_usuario AS tu ON tt.`id_usuario`=tu.`id`\n"
                + "WHERE tt.`id_estado_post`=11\n"
                + "AND tt.`id_usuario` = " + id_usuario_rechazo + "\n"
                + "ORDER BY tt.creacion DESC;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                id = rs.getInt("tu.id_area");
            }
        } catch (SQLException e) {
            Logger.getLogger(Area_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }
}
