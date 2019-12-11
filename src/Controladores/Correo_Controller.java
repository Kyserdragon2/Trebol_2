package Controladores;

import Clases.Conexion;
import Objetos.Correo;
import java.sql.SQLException;

public class Correo_Controller {

    Conexion cc = new Conexion();

    public boolean crear_correo(int id_factura, String destinatario, String asunto, String mensaje) {
        Correo C = new Correo(id_factura, destinatario, asunto, mensaje);
        String sql = "INSERT INTO trebol_correos (id_factura, destinatario, asunto, mensaje)\n"
                + "VALUES(" + C.getId_factura() + ",'" + C.getDestinatario() + "', '" + C.getAsunto() + "', '" + C.getMensaje() + "');";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }
}
