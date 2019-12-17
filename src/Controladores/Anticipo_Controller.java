package Controladores;

import Clases.Conexion;
import Objetos.Anticipo;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Anticipo_Controller {

    Conexion cc = new Conexion();

    public boolean crear_anticipo(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo, String ub_documento, double valor) {
        Anticipo Ant = new Anticipo(id_proveedor, id_empresa, id_tipo_doc, consecutivo, ub_documento, valor);
        String sql = "INSERT INTO trebol_anticipos(id_proveedor, id_empresa, valor, id_tipo_doc, consecutivo, ub_documento)\n"
                + "VALUES(" + Ant.getId_proveedor() + "," + Ant.getId_empresa() + "," + Ant.getValor() + "," + Ant.getId_tipo_doc()
                + ",'" + Ant.getConsecutivo() + "','" + Ant.getUb_documento() + "')";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean anular_ant_prov(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo) {
        Anticipo Ant = new Anticipo(id_proveedor, id_empresa, id_tipo_doc, consecutivo);
        String sql = "UPDATE trebol_anticipos\n"
                + "SET cargado=0, anulado = 1 \n"
                + "WHERE id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + "\n"
                + "AND id_tipo_doc=" + id_tipo_doc + "\n"
                + "AND consecutivo='" + consecutivo + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void ver_documento_anticipo(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT ta.`ub_documento`\n"
                        + "FROM trebol_anticipos ta\n"
                        + "INNER JOIN trebol_proveedor AS tp ON ta.`id_proveedor`=tp.`id`\n"
                        + "INNER JOIN trebol_empresa AS te ON ta.`id_empresa`=te.`id`\n"
                        + "WHERE id_proveedor=" + id_proveedor + "\n"
                        + "AND id_empresa=" + id_empresa + "\n"
                        + "AND id_tipo_doc=" + id_tipo_doc + "\n"
                        + "AND consecutivo=" + consecutivo + ";")) {
            if (rs.next()) {
                File ruta = new File(rs.getString("ub_documento"));
                Desktop.getDesktop().open(ruta);
            }
        } catch (SQLException | IOException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean anticipo_cargado(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo) {
        Anticipo Ant = new Anticipo(id_proveedor, id_empresa, id_tipo_doc, consecutivo);
        String sql = "UPDATE trebol_anticipos\n"
                + "SET cargado=1 \n"
                + "WHERE id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + "\n"
                + "AND id_tipo_doc=" + id_tipo_doc + "\n"
                + "AND consecutivo='" + consecutivo + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean anticipo_no_cargado(int id_proveedor, int id_empresa, String consecutivo) {
        Anticipo Ant = new Anticipo(id_proveedor, id_empresa, consecutivo);
        String sql = "UPDATE trebol_anticipos\n"
                + "SET cargado=0 \n"
                + "WHERE id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + "\n"
                + "AND consecutivo='" + consecutivo + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String ubicacion_documento_anticipo(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo) {
        String ub = "";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT ta.`ub_documento`\n"
                        + "FROM trebol_anticipos ta\n"
                        + "INNER JOIN trebol_proveedor AS tp ON ta.`id_proveedor`=tp.`id`\n"
                        + "INNER JOIN trebol_empresa AS te ON ta.`id_empresa`=te.`id`\n"
                        + "WHERE id_proveedor=" + id_proveedor + "\n"
                        + "AND id_empresa=" + id_empresa + "\n"
                        + "AND id_tipo_doc=" + id_tipo_doc + "\n"
                        + "AND consecutivo=" + consecutivo + ";")) {
            if (rs.next()) {
                ub = rs.getString("ub_documento");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return ub;
    }

    public int registros_anticipos_proveedor(int id_proveedor, int id_empresa) {
        int cantidad = 0;
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'Cantidad'\n"
                        + "FROM trebol_anticipos ta\n"
                        + "INNER JOIN trebol_proveedor AS tp ON ta.`id_proveedor`=tp.`id`\n"
                        + "INNER JOIN trebol_empresa AS te ON ta.`id_empresa`=te.`id`\n"
                        + "WHERE id_proveedor=" + id_proveedor + "\n"
                        + "AND id_empresa=" + id_empresa + "\n"
                        + "AND cargado = 0;")) {
            if (rs.next()) {
                cantidad = rs.getInt("Cantidad");
            }
        } catch (SQLException e) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return cantidad;
    }

}
