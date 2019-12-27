package Controladores;

import Clases.Conexion;
import Objetos.Programacion;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programacion_Controller {

    Conexion cc = new Conexion();

    public boolean crear_programacion(int id_factura, int id_usuario, String fecha_prog) {
        Programacion P = new Programacion(id_factura, id_usuario, fecha_prog);
        String sql;
        sql = "INSERT INTO trebol_programaciones (id_factura, id_usuario,fecha_prog)\n"
                + "VALUES (" + P.getId_factura() + "," + P.getId_usuario() + ",'" + P.getFecha_prog() + "')";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String fecha_programada(int id_factura) {
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechap = "";
        String idc = "SELECT fecha_prog\n"
                + "FROM trebol_programaciones\n"
                + "WHERE id_factura=" + id_factura + "\n"
                + "AND activo=1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            if (rs.next()) {
                fechap = formatoDeFecha.format(rs.getTimestamp("fecha_prog"));;
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return fechap;
    }

    public String fecha_programada_sql(int id_factura) {
        String fechap = "";
        String idc = "SELECT fecha_prog\n"
                + "FROM trebol_programaciones\n"
                + "WHERE id_factura=" + id_factura + "\n"
                + "AND activo=1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            if (rs.next()) {
                fechap = rs.getString("fecha_prog");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return fechap;
    }

    public boolean existe_programacion(int id_factura) {
        boolean existe = false;
        String idc = "SELECT fecha_prog\n"
                + "FROM trebol_programaciones\n"
                + "WHERE id_factura=" + id_factura + "\n"
                + "AND activo=1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            existe = rs.next();
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return existe;
    }

    public boolean cambiar_est_prog(int id_factura, int id_usuario, String fecha_prog) {
        Programacion P = new Programacion(id_factura, id_usuario, fecha_prog);
        String sql;
        sql = "UPDATE trebol_programaciones\n"
                + "SET activo =0\n"
                + "WHERE id_factura=" + P.getId_factura() + "\n"
                + "AND fecha_prog='" + P.getFecha_prog() + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
