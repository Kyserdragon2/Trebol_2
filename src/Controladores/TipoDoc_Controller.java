package Controladores;

import Clases.Conexion;
import Objetos.Tipo_Documento;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoDoc_Controller {

    Conexion cc = new Conexion();

    public boolean crear_tipo_documento(String tipo_doc, String nombre) {
        Tipo_Documento TD = new Tipo_Documento(tipo_doc, nombre);
        String sql;
        sql = "INSERT INTO trebol_tipo_documento (tipo_doc, nombre)\n"
                + "VALUES ('" + TD.getNombre() + "', '" + TD.getTipo_doc() + "');";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int id_tipo_doc(String dato) {
        int id = 0;
        String idc = "SELECT id FROM trebol_tipo_documento\n"
                + "WHERE nombre='" + dato + "'";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(idc)) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(TipoDoc_Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }
}
