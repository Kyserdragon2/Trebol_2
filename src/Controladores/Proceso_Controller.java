package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proceso_Controller {

    Conexion cc = new Conexion();

    public int id_area_proceso(String motivo) {
        int id_area = 0;
        String sql = "SELECT tproc.id\n"
                + "FROM trebol_motivos_rechazo AS tmr\n"
                + "JOIN trebol_procesos AS tproc ON tmr.`id_proceso`=tproc.`id`\n"
                + "WHERE motivo LIKE '" + motivo + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);) {
            if (rs.next()) {
                id_area = rs.getInt("tproc.id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proceso_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id_area;
    }
}
