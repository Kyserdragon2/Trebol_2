package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.Calendar;
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

    public int nconvenios(String no_cuenta) {
        int cant = 0;
        String consulta = "SELECT cantidad_mes\n"
                + "FROM trebol_convenios\n"
                + "WHERE no_cuenta LIKE '%" + no_cuenta + "%';";
        try (Connection cn = cc.Conexion();
                Statement stc = cn.createStatement();
                ResultSet rsc = stc.executeQuery(consulta)) {
            if (rsc.next()) {
                cant = rsc.getInt("cantidad_mes");
            }
        } catch (Exception e) {
            Logger.getLogger(Convenio_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return cant;
    }

    public int convenios_mes(int id_convenio) {
        int cant = 0;
        Calendar now = Calendar.getInstance();
        String consulta = "SELECT COUNT(*) AS 'cant_conv'\n"
                + "FROM trebol_factura_convenio\n"
                + "WHERE id_convenio =" + id_convenio + "\n"
                + "AND MONTH(creacion)= " + (now.get(Calendar.MONTH) + 1) + "\n"
                + "AND activo=1;";
        try (Connection cn = cc.Conexion();
                Statement stc = cn.createStatement();
                ResultSet rsc = stc.executeQuery(consulta)) {
            if (rsc.next()) {
                cant = rsc.getInt("cant_conv");
            }
        } catch (Exception e) {
            Logger.getLogger(Convenio_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return cant;
    }
}
