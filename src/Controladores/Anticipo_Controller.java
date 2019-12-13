package Controladores;

import Clases.Conexion;
import Objetos.Anticipo;
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

}
