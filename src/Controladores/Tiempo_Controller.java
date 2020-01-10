package Controladores;

import Clases.Conexion;
import Objetos.Tiempo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tiempo_Controller {

    Conexion cc = new Conexion();

    public boolean crear_tiempo(int id_usuario, int id_factura, int is_estado_prev, int id_estado_post) {
        Tiempo T = new Tiempo(id_usuario, id_factura, is_estado_prev, id_estado_post);
        String sql = "INSERT INTO trebol_tiempos(id_usuario, id_factura, id_estado_prev, id_estado_post)\n"
                + "VALUES(" + T.getId_usuario() + ", " + T.getId_factura() + "," + T.getIs_estado_prev() + ", " + T.getId_estado_post() + ")";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }

    public int est_prev(int id_factura) {
        int area = 0;
        String sql = "SELECT id_estado_prev\n"
                + "FROM trebol_tiempos AS tt\n"
                + "WHERE id_factura = " + id_factura + "\n"
                + "ORDER BY creacion DESC\n"
                + "LIMIT 1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                area = rs.getInt("id_estado_prev");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Logs_Controller.class.getName()).log(Level.SEVERE, null, ex);
            area = 0;
        }
        return area;
    }

}
