package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Convenio_Controller {

    Conexion cc = new Conexion();

    public int id_convenio(String no_cuenta, int id_proveedor, int id_empresa) {
        int id = 0;
        String sql = "SELECT DISTINCT id\n"
                + "FROM trebol_convenios\n"
                + "WHERE no_cuenta LIKE '" + no_cuenta + "'\n"
                + "AND id_proveedor LIKE '" + id_proveedor + "'\n"
                + "AND id_empresa LIKE '" + id_empresa + "';";
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                id = datos.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Convenio_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }
}
