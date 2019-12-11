package Controladores;

import Clases.Conexion;
import Objetos.Factura_Convenio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura_Convenio_Controller {

    Conexion cc = new Conexion();

    public boolean crear_factura_convenio(int id_factura, int id_convenio) {
        Factura_Convenio FCon = new Factura_Convenio(id_factura, id_convenio);
        String sql = "INSERT INTO trebol_factura_convenio (id_factura, id_convenio)\n"
                + "VALUES(" + FCon.getId_factura() + "," + FCon.getId_convenio() + ")";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
