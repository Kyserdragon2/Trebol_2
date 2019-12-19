package Controladores;

import Clases.Conexion;
import Objetos.Factura;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura_Controller {

    Conexion cc = new Conexion();

    public boolean crear_factura(int id, int id_proveedor, int id_tipo_factura, int id_gestion, int id_area, int id_empresa, String no_factura,
            String moneda, String fecha_generada, String fecha_venc, String no_radicado, double valor) {
        Factura F = new Factura(id, id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa, no_factura,
                moneda, fecha_generada, fecha_venc, no_radicado, valor);
        String sql;
        if (F.getFecha_venc().equals("") && F.getNo_radicado().equals("")) {
            sql = "INSERT INTO trebol_facturas(no_factura, valor, moneda, fecha_generada,\n"
                    + "id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa)\n"
                    + "VALUES ('" + F.getNo_factura() + "', " + F.getValor() + ", '" + F.getMoneda() + "', '" + F.getFecha_generada() + "',"
                    + id_proveedor + ", " + F.getId_tipo_factura() + ", " + F.getId_gestion() + ", "
                    + F.getId_area() + ", " + F.getId_empresa() + ");";
        } else if (F.getFecha_venc().equals("")) {
            sql = "INSERT INTO trebol_facturas(no_factura, valor, moneda, fecha_generada, no_radicado,\n"
                    + "id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa)\n"
                    + "VALUES ('" + F.getNo_factura() + "', " + F.getValor() + ", '" + F.getMoneda() + "', '" + F.getFecha_generada() + "', '"
                    + F.getNo_radicado() + "'," + id_proveedor + ", " + F.getId_tipo_factura() + ", " + F.getId_gestion() + ", "
                    + F.getId_area() + ", " + F.getId_empresa() + ");";
        } else if (F.getNo_radicado().equals("")) {

            sql = "INSERT INTO trebol_facturas(no_factura, valor, moneda, fecha_generada, fecha_venc,\n"
                    + "id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa)\n"
                    + "VALUES ('" + F.getNo_factura() + "', " + F.getValor() + ", '" + F.getMoneda() + "', '" + F.getFecha_generada() + "', '"
                    + F.getFecha_venc() + "', " + id_proveedor + ", " + F.getId_tipo_factura() + ", " + F.getId_gestion() + ", "
                    + F.getId_area() + ", " + F.getId_empresa() + ");";
        } else {
            sql = "INSERT INTO trebol_facturas(no_factura, valor, moneda, fecha_generada, fecha_venc, no_radicado,\n"
                    + "id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa)\n"
                    + "VALUES ('" + F.getNo_factura() + "', " + F.getValor() + ", '" + F.getMoneda() + "', '" + F.getFecha_generada() + "', '"
                    + F.getFecha_venc() + "', '" + F.getNo_radicado() + "'," + id_proveedor + ", " + F.getId_tipo_factura() + ", " + F.getId_gestion() + ", "
                    + F.getId_area() + ", " + F.getId_empresa() + ");";
        }
        try {
            if (id_factura(no_factura, id_proveedor, id_empresa) == 0) {
                return cc.sentenciaSQL(sql);
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Factura buscar(String no_factura, String proveedor, String empresa) {
        Factura F = new Factura();
        String sql = "SELECT DISTINCT *\n"
                + "FROM trebol_facturas AS tf\n"
                + "JOIN trebol_proveedor AS tp ON tf.`id_proveedor`=tp.`id`\n"
                + "JOIN trebol_empresa AS temp ON tf.`id_empresa`=temp.`id`\n"
                + "JOIN trebol_documentos as td ON td.`id_factura`=tf.`id`\n"
                + "LEFT JOIN trebol_factura_convenio as tfc ON tfc.`id_factura`=tf.`id`\n"
                + "LEFT JOIN trebol_convenios as tc ON tfc.`id_convenio`=tc.`id`\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND razon_social LIKE '" + proveedor + "'\n"
                + "AND nom_empresa LIKE '" + empresa + "'\n"
                + "LIMIT 1;";
        ResultSet datos = cc.consultas(sql);
        try {
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            while (datos.next()) {
                F.setId(datos.getInt("tf.id"));
                F.setNo_factura(datos.getString("tf.no_factura"));
                F.setValor(datos.getDouble("tf.valor"));
                F.setMoneda(datos.getString("tf.moneda"));
                F.setFecha_recepcion(formatoDeFecha.format(datos.getTimestamp("TF.creacion")));
                F.setFecha_generada(formatoDeFecha.format(datos.getTimestamp("TF.fecha_generada")));
                if (datos.getTimestamp("TF.fecha_venc") == null) {
                    F.setFecha_venc("");
                } else {
                    F.setFecha_venc(formatoDeFecha.format(datos.getTimestamp("TF.fecha_venc")));
                }
                F.setAprobada(datos.getInt("tf.aprobada"));
                F.setRevisada(datos.getInt("tf.revisada"));
                F.setNo_radicado(datos.getString("tf.no_radicado"));
                F.setId_proveedor(datos.getInt("tf.id_proveedor"));
                F.setId_tipo_factura(datos.getInt("tf.id_tipo_factura"));
                F.setId_gestion(datos.getInt("tf.id_gestion"));
                F.setId_area(datos.getInt("tf.id_area"));
                F.setId_empresa(datos.getInt("tf.id_empresa"));
                F.setId_estado(datos.getInt("tf.id_estado"));
                F.setUbicacion(datos.getString("td.ubicacion"));
                if (datos.getString("tc.no_cuenta") == null) {
                    F.setConvenio("");
                } else {
                    F.setConvenio(datos.getString("tc.no_cuenta"));
                }
            }
            return F;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean modificar_factura(int id, int id_proveedor, int id_tipo_factura, int id_gestion, int id_area, int id_empresa, String no_factura,
            String moneda, String fecha_generada, String fecha_venc, String no_radicado, double valor) {
        SimpleDateFormat fechayhora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date fecha = new java.util.Date();
        Factura F = new Factura(id, id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa, no_factura,
                moneda, fecha_generada, fecha_venc, no_radicado, valor);
        String sql;
        if (F.getFecha_venc().equals("") && F.getNo_radicado().equals("")) {
            sql = "UPDATE trebol_facturas\n"
                    + "SET no_factura ='" + F.getNo_factura() + "', "
                    + "valor =" + F.getValor() + ", "
                    + "moneda ='" + F.getMoneda() + "', "
                    + "fecha_generada ='" + F.getFecha_generada() + "', "
                    + "fecha_venc = NULL, "
                    + "no_radicado = NULL, "
                    + "id_proveedor =" + F.getId_proveedor() + ", "
                    + "id_tipo_factura =" + F.getId_tipo_factura() + ", "
                    + "id_gestion =" + F.getId_gestion() + ", "
                    + "id_area =" + F.getId_area() + ", "
                    + "id_empresa =" + F.getId_empresa() + ", "
                    + "modificacion ='" + fechayhora.format(fecha) + "'\n"
                    + "WHERE id = " + F.getId() + ";";
        } else if (F.getFecha_venc().equals("")) {
            sql = "UPDATE trebol_facturas\n"
                    + "SET no_factura ='" + F.getNo_factura() + "', "
                    + "valor =" + F.getValor() + ", "
                    + "moneda ='" + F.getMoneda() + "', "
                    + "fecha_generada ='" + F.getFecha_generada() + "', "
                    + "fecha_venc = NULL, "
                    + "no_radicado ='" + F.getNo_radicado() + "', "
                    + "id_proveedor =" + F.getId_proveedor() + ", "
                    + "id_tipo_factura =" + F.getId_tipo_factura() + ", "
                    + "id_gestion =" + F.getId_gestion() + ", "
                    + "id_area =" + F.getId_area() + ", "
                    + "id_empresa =" + F.getId_empresa() + ", "
                    + "modificacion ='" + fechayhora.format(fecha) + "'\n"
                    + "WHERE id = " + F.getId() + ";";
        } else if (F.getNo_radicado().equals("")) {
            sql = "UPDATE trebol_facturas\n"
                    + "SET no_factura ='" + F.getNo_factura() + "', "
                    + "valor =" + F.getValor() + ", "
                    + "moneda ='" + F.getMoneda() + "', "
                    + "fecha_generada ='" + F.getFecha_generada() + "', "
                    + "fecha_venc ='" + F.getFecha_venc() + "', "
                    + "no_radicado = NULL, "
                    + "id_proveedor =" + F.getId_proveedor() + ", "
                    + "id_tipo_factura =" + F.getId_tipo_factura() + ", "
                    + "id_gestion =" + F.getId_gestion() + ", "
                    + "id_area =" + F.getId_area() + ", "
                    + "id_empresa =" + F.getId_empresa() + ", "
                    + "modificacion ='" + fechayhora.format(fecha) + "'\n"
                    + "WHERE id = " + F.getId() + ";";
        } else {
            sql = "UPDATE trebol_facturas\n"
                    + "SET no_factura ='" + F.getNo_factura() + "', "
                    + "valor =" + F.getValor() + ", "
                    + "moneda ='" + F.getMoneda() + "', "
                    + "fecha_generada ='" + F.getFecha_generada() + "', "
                    + "fecha_venc ='" + F.getFecha_venc() + "', "
                    + "no_radicado ='" + F.getNo_radicado() + "', "
                    + "id_proveedor =" + F.getId_proveedor() + ", "
                    + "id_tipo_factura =" + F.getId_tipo_factura() + ", "
                    + "id_gestion =" + F.getId_gestion() + ", "
                    + "id_area =" + F.getId_area() + ", "
                    + "id_empresa =" + F.getId_empresa() + ", "
                    + "modificacion ='" + fechayhora.format(fecha) + "'\n"
                    + "WHERE id = " + F.getId() + ";";
        }
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cambiar_asignacion_factura(String no_factura, int id_proveedor, int id_empresa, int id_estado, int id_gestion) {
        String sql = "UPDATE trebol_facturas\n"
                + "SET id_estado=" + id_estado + ",\n"
                + "id_gestion=" + id_gestion + "\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cambiar_estado_factura(String no_factura, int id_proveedor, int id_empresa, int id_estado) {
        String sql = "UPDATE trebol_facturas\n"
                + "SET id_estado=" + id_estado + "\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cambiar_aprobacion_factura(String no_factura, int id_proveedor, int id_empresa, int id_estado) {
        String sql = "UPDATE trebol_facturas\n"
                + "SET aprobada=1\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cambiar_revision_factura(String no_factura, int id_proveedor, int id_empresa, int id_estado) {
        String sql = "UPDATE trebol_facturas\n"
                + "SET revisada=1\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND id_proveedor=" + id_proveedor + "\n"
                + "AND id_empresa=" + id_empresa + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Factura_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int id_factura(String no_factura, int proveedor, int empresa) {
        int id = 0;
        String sql = "SELECT DISTINCT id\n"
                + "FROM trebol_facturas\n"
                + "WHERE no_factura LIKE '" + no_factura + "'\n"
                + "AND id_proveedor LIKE '" + proveedor + "'\n"
                + "AND id_empresa LIKE '" + empresa + "';";
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                id = datos.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }

    public int id_estado_factura(int id_factura) {
        int id_est = 0;
        String sql = "SELECT DISTINCT id_estado\n"
                + "FROM trebol_facturas\n"
                + "WHERE id =" + id_factura + ";";
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                id_est = datos.getInt("id_estado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id_est = 0;
        }
        return id_est;
    }

    public boolean factura_aprobada(int id_factura) {
        Factura F = new Factura(id_factura);
        String sql;
        sql = "UPDATE trebol_facturas\n"
                + "SET aprobada = 1\n"
                + "WHERE id = " + F.getId() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean factura_revisada(int id_factura) {
        Factura F = new Factura(id_factura);
        String sql;
        sql = "UPDATE trebol_facturas\n"
                + "SET revisada = 1\n"
                + "WHERE id = " + F.getId() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Documento_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
