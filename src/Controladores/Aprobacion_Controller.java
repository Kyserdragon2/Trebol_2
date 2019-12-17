package Controladores;

import Clases.Conexion;
import Objetos.Aprobacion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aprobacion_Controller {

    Conexion cc = new Conexion();

    public boolean crear_aprobacion(int id_factura, int id_area) {
        Aprobacion A = new Aprobacion(id_factura, id_area);
        String sql;
        sql = "INSERT INTO trebol_aprobaciones (id_factura, id_area)\n"
                + "VALUES (" + A.getId_factura() + "," + A.getId_area() + ")";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean aprobar(int id_factura, int id_area, int id_usuario) {
        Aprobacion A = new Aprobacion(id_factura, id_area, id_usuario);
        String sql;
        sql = "UPDATE trebol_aprobaciones\n"
                + "SET aprobado=1, id_usuario=" + A.getId_usuario() + "\n"
                + "WHERE id_factura=" + A.getId_factura() + "\n"
                + "AND id_area=" + A.getId_area() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String aprobado_por(int id_factura, int id_area) {
        String usuario = "";
        String idc = "SELECT CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'Nombre'\n"
                + "FROM trebol_aprobaciones AS ta\n"
                + "JOIN trebol_facturas AS tf ON ta.`id_factura`=tf.`id`\n"
                + "JOIN trebol_usuario AS tu ON ta.`id_usuario`=tu.`id`\n"
                + "WHERE ta.id_factura=" + id_factura + "\n"
                + "AND ta.id_area=" + id_area + ";";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            if (rs.next()) {
                usuario = rs.getString("Nombre");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return usuario;
    }
}
