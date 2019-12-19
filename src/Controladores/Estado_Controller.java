package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estado_Controller {

    Conexion cc = new Conexion();

    public int id_estado(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_estados\n"
                + "WHERE nom_estado='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Estado_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public int estado_prev(int id_usuario_rechazo) {
        int id = 0;
        String idc = "SELECT id_estado_prev\n"
                + "FROM trebol_tiempos AS tt\n"
                + "JOIN trebol_usuario AS tu ON tt.`id_usuario`=tu.`id`\n"
                + "WHERE tt.`id_estado_post`=11\n"
                + "AND tt.`id_usuario` = "+id_usuario_rechazo+"\n"
                + "ORDER BY tt.creacion DESC;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id_estado_prev");
            }
        } catch (SQLException e) {
            Logger.getLogger(Estado_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }
}
