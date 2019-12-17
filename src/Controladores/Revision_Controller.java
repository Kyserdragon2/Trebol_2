package Controladores;

import Clases.Conexion;
import Objetos.Revision;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Revision_Controller {

    Conexion cc = new Conexion();

    public boolean crear_revision(int id_factura, int id_usuario) {
        Revision R = new Revision(id_factura, id_usuario);
        String sql;
        sql = "INSERT INTO trebol_revisiones (id_factura, id_usuario)\n"
                + "VALUES (" + R.getId_factura() + "," + R.getId_usuario() + ")";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean revizar(int id_factura, int id_usuario) {
        Revision R = new Revision(id_factura, id_usuario);
        String sql;
        sql = "UPDATE trebol_revisiones\n"
                + "SET revisado=1\n"
                + "WHERE id_factura=" + R.getId_factura() + "\n"
                + "AND id_usuario=" + R.getId_usuario() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
