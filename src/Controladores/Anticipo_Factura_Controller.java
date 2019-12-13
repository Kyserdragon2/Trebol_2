package Controladores;

import Clases.Conexion;
import Objetos.Anticipo_Factura;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Anticipo_Factura_Controller {

    Conexion cc = new Conexion();

    public boolean crear_tipo_anticipo(int id_factura, int id_tipo_factura) {
        Anticipo_Factura ant = new Anticipo_Factura(id_factura, id_tipo_factura);
        String sql = "INSERT INTO trebol_anticipos_fact (id_factura, id_tipo_factura)\n"
                + "VALUES (" + ant.getId_factura() + ", " + ant.getId_tipo_factura() + ")";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Comentario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existe_anticipo(int id_factura) {
        boolean existe_u = false;
        String sql = "SELECT *\n"
                + "FROM trebol_anticipos_fact\n"
                + "WHERE id_factura = " + id_factura + ";";
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
                existe_u = true;
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            existe_u = false;
        }
        return existe_u;
    }

    public boolean actualizar_anticipo(int id_factura, int id_tipo_factura) {
        String sql = "UPDATE trebol_anticipos_fact\n"
                + "SET id_tipo_factura=" + id_tipo_factura + "\n"
                + "WHERE id_factura=" + id_factura + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminar_anticipo(int id_factura) {
        String sql = "DELETE FROM trebol_anticipos_fact\n"
                + "WHERE id_factura=" + id_factura + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int tipo_anticipo(int id_factura) {
        int ta = 0;
        String sql = "SELECT id_tipo_factura\n"
                + "FROM trebol_anticipos_fact\n"
                + "WHERE id_factura = " + id_factura + ";";
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
                ta = datos.getInt("id_tipo_factura");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            ta = 0;
        }
        return ta;
    }
}
