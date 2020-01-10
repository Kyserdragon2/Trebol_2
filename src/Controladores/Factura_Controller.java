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
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            while (rs.next()) {
                F.setId(rs.getInt("tf.id"));
                F.setNo_factura(rs.getString("tf.no_factura"));
                F.setValor(rs.getDouble("tf.valor"));
                F.setMoneda(rs.getString("tf.moneda"));
                F.setFecha_recepcion(formatoDeFecha.format(rs.getDate("tf.creacion")));
                F.setFecha_generada(formatoDeFecha.format(rs.getTimestamp("tf.fecha_generada")));
                if (rs.getTimestamp("tf.fecha_venc") == null) {
                    F.setFecha_venc("");
                } else {
                    F.setFecha_venc(formatoDeFecha.format(rs.getTimestamp("tf.fecha_venc")));
                }
                F.setAprobada(rs.getInt("tf.aprobada"));
                F.setRevisada(rs.getInt("tf.revisada"));
                F.setNo_radicado(rs.getString("tf.no_radicado"));
                F.setId_proveedor(rs.getInt("tf.id_proveedor"));
                F.setId_tipo_factura(rs.getInt("tf.id_tipo_factura"));
                F.setId_gestion(rs.getInt("tf.id_gestion"));
                F.setId_area(rs.getInt("tf.id_area"));
                F.setId_empresa(rs.getInt("tf.id_empresa"));
                F.setId_estado(rs.getInt("tf.id_estado"));
                F.setUbicacion(rs.getString("td.ubicacion"));
                if (rs.getString("tc.no_cuenta") == null) {
                    F.setConvenio("");
                } else {
                    F.setConvenio(rs.getString("tc.no_cuenta"));
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

    public boolean confirmacion_pago(String no_factura, int id_proveedor, int id_empresa, int id_estado, int id_gestion, String fecha_pago) {
        String sql = "UPDATE trebol_facturas\n"
                + "SET fecha_pago = '" + fecha_pago + "',\n"
                + "id_estado=" + id_estado + ",\n"
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
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)){
            while (rs.next()) {
                id = rs.getInt("id");
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
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)){
            while (rs.next()) {
                id_est = rs.getInt("id_estado");
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

    public int id_area_factura(int id_factura) {
        int id_area = 0;
        String sql = "SELECT DISTINCT id_area\n"
                + "FROM trebol_facturas\n"
                + "WHERE id =" + id_factura + ";";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)){
            while (rs.next()) {
                id_area = rs.getInt("id_area");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id_area = 0;
        }
        return id_area;
    }
}
