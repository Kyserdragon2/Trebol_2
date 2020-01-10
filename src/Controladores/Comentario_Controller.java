package Controladores;

import Clases.Conexion;
import Objetos.Comentario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comentario_Controller {

    Conexion cc = new Conexion();

    public boolean crear_comentario(int id, int id_usuario, int id_factura, int id_estado, String detalle) {
        Comentario C = new Comentario(id, id_usuario, id_factura, id_estado, detalle);
        String sql = "INSERT INTO trebol_comentarios (id_factura, id_usuario, id_estado, detalle)\n"
                + "VALUES (" + C.getId_factura() + ", " + C.getId_usuario() + ", " + C.getId_estado() + ",'" + C.getDetalle() + "')";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Comentario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int id_comentario(int id_factura, int id_usuario, int id_estado, String detalle) {
        int id = 0;
        String sql = "SELECT id\n"
                + "FROM trebol_comentarios\n"
                + "WHERE id_factura = "+id_factura+"\n"
                + "AND id_usuario = "+id_usuario+"\n"
                + "AND id_estado = "+id_estado+"\n"
                + "AND detalle LIKE '"+detalle+"'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)){
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Comentario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }
}
