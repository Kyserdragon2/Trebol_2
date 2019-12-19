package Controladores;

import Clases.Conexion;
import Objetos.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs_Controller {

    Conexion cc = new Conexion();

    public boolean crear_log(int id_usuario, int id_factura, int id_comentario, int id_estado) {
        Log L = new Log(id_usuario, id_factura, id_comentario, id_estado);
        String sql;
        if (id_comentario == 0) {
            sql = "INSERT INTO trebol_logs(id_usuario, id_factura, id_estado)\n"
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

    public int area_creacion_fact(int id_factura, int id_estado) {
        int area = 0;
        String sql = "SELECT tu.`id_area`\n"
                + "FROM trebol_logs AS tl\n"
                + "JOIN trebol_usuario AS tu ON tl.`id_usuario`=tu.`id`\n"
                + "WHERE tl.`id_factura` = " + id_factura + "\n"
                + "AND tl.`id_estado` = " + id_estado + ";";
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                area = datos.getInt("tu.id_area");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Logs_Controller.class.getName()).log(Level.SEVERE, null, ex);
            area = 0;
        }
        return area;
    }
}
