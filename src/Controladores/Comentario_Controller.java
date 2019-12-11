package Controladores;

import Clases.Conexion;
import Objetos.Comentario;
import java.sql.*;

public class Comentario_Controller {

    Conexion cc = new Conexion();

    public boolean crear_comentario(int id, int id_usuario, int id_factura, int id_estado, String detalle) {
        Comentario C = new Comentario(0, id_usuario, id_factura, id_estado, detalle);
        String sql = "";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }
}
