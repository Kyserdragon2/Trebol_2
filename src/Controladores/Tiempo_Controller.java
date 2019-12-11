package Controladores;

import Clases.Conexion;
import Objetos.Tiempo;
import java.sql.SQLException;

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

}
