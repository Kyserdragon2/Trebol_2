package Controladores;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoFactura_Controller {

    Conexion cc = new Conexion();

    public int id_tipo_factura(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_tipo_factura\n"
                + "WHERE tipo_factura='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(TipoFactura_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }

}
