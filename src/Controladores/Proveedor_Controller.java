package Controladores;

import Clases.Conexion;
import Objetos.Proveedor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proveedor_Controller {

    Conexion cc = new Conexion();

    public boolean crear_proveedor(int id_tipo_factura, int id_area, String nit, String razon_social, String correo,
            String direccion, String telefono) {
        Proveedor P = new Proveedor(0, id_tipo_factura, id_area, nit, razon_social, correo, direccion, telefono);
        String sql = "INSERT INTO trebol_proveedor(nit, razon_social, correo, direccion, telefono, id_tipo_factura, id_area)\n"
                + "VALUES ('" + P.getNit() + "','" + P.getRazon_social() + "','" + P.getCorreo() + "','" + P.getDireccion() + "','"
                + P.getTelefono() + "'," + P.getId_tipo_factura() + "," + P.getId_area() + ");";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }

    public Proveedor buscar(String razon_social) {
        Proveedor P = new Proveedor();
        P.setRazon_social(razon_social);
        String sql = "SELECT * FROM trebol_proveedor WHERE razon_social LIKE '" + P.getRazon_social() + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                P.setId(rs.getInt("id"));
                P.setNit(rs.getString("nit"));
                P.setRazon_social(rs.getString("razon_social"));
                P.setCorreo(rs.getString("correo"));
                P.setDireccion(rs.getString("direccion"));
                P.setTelefono(rs.getString("telefono"));
                P.setId_area(rs.getInt("id_area"));
                P.setId_tipo_factura(rs.getInt("id_tipo_factura"));
            }
            return P;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean modificar_proveedor(int id, int id_tipo_factura, int id_area, String nit, String razon_social, String correo, String direccion, String telefono) {
        Proveedor P = new Proveedor(id, id_tipo_factura, id_area, nit, razon_social, correo, direccion, telefono);
        String sql = "UPDATE trebol_proveedor "
                + "SET nit='" + P.getNit() + "', "
                + "razon_social='" + P.getRazon_social() + "', "
                + "correo='" + P.getCorreo() + "', "
                + "direccion='" + P.getDireccion() + "', "
                + "telefono='" + P.getTelefono() + "', "
                + "id_area=" + P.getId_area() + ", "
                + "id_tipo_factura=" + P.getId_tipo_factura() + "\n"
                + "WHERE id =" + P.getId() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean eliminar_proveedor(int id) {
        Proveedor P = new Proveedor(id);
        String sql = "DELETE FROM trebol_proveedor\n"
                + "WHERE id=" + id + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String area_proveedor(String dato) {
        String id = "";
        String idc = "SELECT ta.`nombre_area` FROM trebol_proveedor AS tp\n"
                + "INNER JOIN trebol_areas AS ta ON tp.`id_area`=ta.`id`\n"
                + "WHERE razon_social='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            if (rs.next()) {
                id = rs.getString("ta.nombre_area");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public String tipo_factura_proveedor(String dato) {
        String id = "";
        String idc = "SELECT ttf.`tipo_factura` FROM trebol_proveedor AS tp\n"
                + "INNER JOIN trebol_tipo_factura AS ttf ON tp.`id_tipo_factura`=ttf.`id`\n"
                + "WHERE razon_social='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc);) {
            if (rs.next()) {
                id = rs.getString("ttf.tipo_factura");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public int id_proveedor(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_proveedor\n"
                + "WHERE razon_social='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

    public String nit_proveedor(String dato) {
        String nit = "";
        String idc = "SELECT nit FROM trebol_proveedor\n"
                + "WHERE razon_social='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                nit = rs.getString("nit");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return nit;
    }

    public String rs_proveedor(int dato) {
        String razon_s = "";
        String idc = "SELECT razon_social FROM trebol_proveedor\n"
                + "WHERE id='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                razon_s = rs.getString("razon_social");
            }
        } catch (SQLException e) {
            Logger.getLogger(Proveedor_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return razon_s;
    }
}
