package Controladores;

import Clases.Conexion;
import Objetos.Log;
import java.sql.SQLException;

public class Logs_Controller {

    Conexion cc = new Conexion();

    public boolean crear_log(int id_usuario, int id_factura, int id_comentario, int id_estado) {
        Log L = new Log(id_usuario, id_factura, id_comentario, id_estado);
        String sql;
        if (id_comentario == 0) {
            sql = "INSERT INTO trebol_logs(id_usuario,id_factura,id_estado)\n"
                    + "VALUES(" + L.getId_usuario() + "," + L.getId_factura() + ", " + L.getId_estado() + ");";
        } else {
            sql = "INSERT INTO trebol_logs(id_usuario,id_factura,id_comentario,id_estado)\n"
                    + "VALUES(" + L.getId_usuario() + "," + L.getId_factura() + "," + L.getId_comentario() + "," + L.getId_estado() + ");";
        }
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }
}
