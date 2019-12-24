package Clases;

import Controladores.Usuario_Controller;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Llenar_Tablas {

    Usuario_Controller UC = new Usuario_Controller();
    Conexion cc = new Conexion();
    DefaultTableModel model;
    TableRowSorter sorter;
    Encabezado_Tabla encabezado;
    Alineacion_Texto_Tabla alineacion;
    Multilinea_en_Tabla ajustartabla;
    JButton btndetalles, btndocs, btnaceptar, btnrechazar, btnver, btneditar, btnborrar;

    /**
     *
     * @param tabla
     * @param Usuario
     */
    public void Usuarios(JTable tabla, String Usuario) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String consulta;
        if (Usuario.isEmpty()) {
            consulta = "SELECT tu.`usuario`, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS nombre, \n"
                    + "tu.`correo`, ta.`nombre_area`, tem.`nom_empresa`,tu.`aprueba`,tu.`retirado`\n"
                    + "FROM trebol_usuario AS tu\n"
                    + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                    + "JOIN trebol_empresa AS tem ON tu.`id_empresa`=tem.`id`\n"
                    + "ORDER BY nombre";
        } else {
            consulta = "SELECT tu.`usuario`, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS nombre, \n"
                    + "tu.`correo`, ta.`nombre_area`, tem.`nom_empresa`,tu.`aprueba`,tu.`retirado`\n"
                    + "FROM trebol_usuario AS tu\n"
                    + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                    + "JOIN trebol_empresa AS tem ON tu.`id_empresa`=tem.`id`\n"
                    + "WHERE usuario LIKE '" + Usuario + "'\n"
                    + "ORDER BY nombre";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"USUARIO", "NOMBRE COMPLETO", "CORREO", "AREA", "EMPRESA", "APRUEBA", "ESTADO"};
            Object[] registros = new Object[7];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("tu.usuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("tu.correo");
                registros[3] = rs.getString("ta.nombre_area");
                registros[4] = rs.getString("tem.nom_empresa");
                if (rs.getInt("tu.aprueba") == 1) {
                    registros[5] = "SI";
                } else {
                    registros[5] = "NO";
                }
                if (rs.getInt("tu.retirado") == 0) {
                    registros[6] = "Activo";
                } else {
                    registros[6] = "Retirado";
                }
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(25);

            for (int i = 0; i < 7; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
            }

            tabla.getColumnModel().getColumn(0).setPreferredWidth(116);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(240);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(270);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(90);

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(4).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(5).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(6).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));

        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param tabla
     * @param Proveedor
     */
    public void Proveedor(JTable tabla, String Proveedor) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String consulta;
        if (Proveedor.equals("--Seleccione--")) {
            consulta = "SELECT tp.`nit`, tp.`razon_social`, tp.`correo`, tp.`direccion`, tp.`telefono`, ttf.`tipo_factura`, ta.`nombre_area`\n"
                    + "FROM trebol_proveedor AS tp\n"
                    + "JOIN trebol_areas AS ta ON tp.`id_area`=ta.`id`\n"
                    + "JOIN trebol_tipo_factura AS ttf ON tp.`id_tipo_factura`=ttf.`id`";
        } else {
            consulta = "SELECT tp.`nit`, tp.`razon_social`, tp.`correo`, tp.`direccion`, tp.`telefono`, ttf.`tipo_factura`, ta.`nombre_area`\n"
                    + "FROM trebol_proveedor AS tp\n"
                    + "JOIN trebol_areas AS ta ON tp.`id_area`=ta.`id`\n"
                    + "JOIN trebol_tipo_factura AS ttf ON tp.`id_tipo_factura`=ttf.`id`\n"
                    + "WHERE razon_social LIKE '" + Proveedor + "'";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"NIT", "RAZON SOCIAL", "CORREO", "DIRECCION", "TELEFONO", "TIPO FACTURA", "AREA"};
            Object[] registros = new Object[7];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("tp.nit");
                registros[1] = rs.getString("tp.razon_social");
                registros[2] = rs.getString("tp.correo");
                registros[3] = rs.getString("tp.direccion");
                registros[4] = rs.getString("tp.telefono");
                registros[5] = rs.getString("ttf.tipo_factura");
                registros[6] = rs.getString("ta.nombre_area");
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(25);

            for (int i = 0; i < 7; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
            }

            tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(215);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(270);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(115);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(105);

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(6).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(1).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(1, 14));
            tabla.getColumnModel().getColumn(3).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(3, 14));
            tabla.getColumnModel().getColumn(4).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(4, 14));
            tabla.getColumnModel().getColumn(5).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(5, 14));

        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param tabla
     * @param area
     * @param proveedor
     * @param empresa
     * @param estado
     * @param asignado
     * @param id_rev
     */
    public void Facturas(JTable tabla, int area, String proveedor, String empresa, String estado, String asignado, String id_rev) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String estados;
        switch (area) {
            case 1:
                estados = "2,4,5,8,9,10,11,13";
                break;
            case 2:
                estados = "2,3,4,5,6,8,9,10,11,13";
                break;
            case 3:
                estados = "7";
                break;
            case 4:
                estados = "1,12";
                break;
            default:
                throw new AssertionError();
        }
        String consulta;
        if (id_rev.equals("")) {
            consulta = "SELECT DISTINCT tf.No_Factura, tp.razon_social, tp.nit, tem.`nom_empresa`, te.`nom_estado`, ta2.`nombre_area`, \n"
                    + "ta.`nombre_area`,IF(td.`ubicacion` IS NULL, '',td.`ubicacion`) AS doc_ubicacion, tf.`valor`,tf.`creacion`,\n"
                    + "tf.`fecha_generada`,tf.`fecha_venc`, IF(tprog.`fecha_prog` IS NULL, 0,1) AS programada, tprog.`fecha_prog`,\n"
                    + "tipo_fact.`tipo_factura`\n"
                    + "FROM trebol_facturas AS tf\n"
                    + "INNER JOIN trebol_proveedor AS tp ON tf.`id_proveedor`=tp.`id`\n"
                    + "INNER JOIN trebol_estados AS te ON tf.`id_estado`=te.`id`\n"
                    + "INNER JOIN trebol_areas AS ta ON tf.`id_area`=ta.`id`\n"
                    + "INNER JOIN trebol_areas AS ta2 ON tf.`id_gestion`=ta2.`id`\n"
                    + "INNER JOIN trebol_empresa AS tem ON tf.`id_empresa`=tem.`id`\n"
                    + "INNER JOIN trebol_tipo_factura AS tipo_fact ON tf.`id_tipo_factura`=tipo_fact.`id`\n"
                    + "LEFT JOIN trebol_documentos AS td ON td.`id_factura`=tf.`id`\n"
                    + "LEFT JOIN trebol_programaciones AS tprog ON tprog.`id_factura`=tf.`id`\n"
                    + "WHERE te.`id` IN (" + estados + ")\n"
                    + "AND tp.razon_social LIKE '%" + proveedor + "%'\n"
                    + "AND tem.`nom_empresa` LIKE '%" + empresa + "%'\n"
                    + "AND te.nom_estado LIKE '%" + estado + "%'\n"
                    + "AND ta2.nombre_area LIKE '%" + asignado + "'\n"
                    + "GROUP BY tf.id\n"
                    + "ORDER BY tf.`creacion` DESC;";
        } else {
            consulta = "SELECT DISTINCT tf.No_Factura, tp.razon_social, tp.nit, tem.`nom_empresa`, te.`nom_estado`, ta2.`nombre_area`, \n"
                    + "ta.`nombre_area`,IF(td.`ubicacion` IS NULL, '',td.`ubicacion`) AS doc_ubicacion, tf.`valor`,tf.`creacion`,\n"
                    + "tf.`fecha_generada`,tf.`fecha_venc`, IF(tprog.`fecha_prog` IS NULL, 0,1) AS programada, tprog.`fecha_prog`,\n"
                    + "tipo_fact.`tipo_factura`\n"
                    + "FROM trebol_facturas AS tf\n"
                    + "INNER JOIN trebol_proveedor AS tp ON tf.`id_proveedor`=tp.`id`\n"
                    + "INNER JOIN trebol_estados AS te ON tf.`id_estado`=te.`id`\n"
                    + "INNER JOIN trebol_areas AS ta ON tf.`id_area`=ta.`id`\n"
                    + "INNER JOIN trebol_areas AS ta2 ON tf.`id_gestion`=ta2.`id`\n"
                    + "INNER JOIN trebol_empresa AS tem ON tf.`id_empresa`=tem.`id`\n"
                    + "INNER JOIN trebol_tipo_factura AS tipo_fact ON tf.`id_tipo_factura`=tipo_fact.`id`\n"
                    + "INNER JOIN trebol_revisiones AS tr ON tr.`id_factura`=tf.`id`"
                    + "LEFT JOIN trebol_documentos AS td ON td.`id_factura`=tf.`id`\n"
                    + "LEFT JOIN trebol_programaciones AS tprog ON tprog.`id_factura`=tf.`id`\n"
                    + "WHERE te.`id` IN (" + estados + ")\n"
                    + "AND tp.razon_social LIKE '%" + proveedor + "%'\n"
                    + "AND tem.`nom_empresa` LIKE '%" + empresa + "%'\n"
                    + "AND te.nom_estado LIKE '%" + estado + "%'\n"
                    + "AND ta2.nombre_area LIKE '%" + asignado + "'\n"
                    + "AND tr.`id_usuario` LIKE '%" + id_rev + "%'"
                    + "GROUP BY tf.id\n"
                    + "ORDER BY tf.`creacion` DESC;";

        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"# Factura", "Valor", "Recibida", "Generada", "Vence", "Programada", "Tipo Factura", "Asignada a",
                "Estado", "Empresa", "Nit", "Proveedor"};
            Object[] registros = new Object[12];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("tf.No_Factura");
                registros[1] = rs.getDouble("tf.valor");
                registros[2] = rs.getDate("tf.creacion");
                registros[3] = rs.getDate("tf.fecha_generada");
                if (rs.getDate("tf.fecha_venc") == null) {
                    registros[4] = "N/A";
                } else {
                    registros[4] = rs.getDate("tf.fecha_venc");
                }
                if (rs.getDate("tprog.fecha_prog") == null) {
                    registros[5] = "N/A";
                } else {
                    registros[5] = rs.getDate("tprog.fecha_prog");
                }
                registros[6] = rs.getString("tipo_fact.tipo_factura");
                registros[7] = rs.getString("ta2.nombre_area");
                registros[8] = rs.getString("te.nom_estado");
                registros[9] = rs.getString("tem.nom_empresa");
                registros[10] = rs.getString("tp.nit");
                registros[11] = rs.getString("tp.razon_social");
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(30);

            for (int i = 0; i < 12; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
            }

            tabla.getColumnModel().getColumn(0).setPreferredWidth(115);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(72);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(73);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(95);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(135);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(65);
            tabla.getColumnModel().getColumn(10).setPreferredWidth(65);
            tabla.getColumnModel().getColumn(11).setPreferredWidth(220);

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(4).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(5).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(6).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(7).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(8).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 8, 12));
            tabla.getColumnModel().getColumn(9).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(10).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 5, 12));
            tabla.getColumnModel().getColumn(11).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(11, 12));

        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param tabla
     * @param id
     */
    public void Seguimiento(JTable tabla, int id) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String consulta = "SELECT DISTINCT te.`nom_estado` AS 'Proceso', \n"
                + "CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'Gestiona', \n"
                + "tc.`detalle` AS 'Comentario', \n"
                + "DATE(tl.creacion) AS 'Fecha', \n"
                + "TIME_FORMAT(tl.creacion,'%h:%i %p') AS 'Hora'\n"
                + "FROM trebol_logs AS tl\n"
                + "LEFT JOIN trebol_comentarios AS tc ON tl.`id_comentario`=tc.`id`\n"
                + "INNER JOIN trebol_usuario AS tu ON tl.`id_usuario`=tu.`id`\n"
                + "INNER JOIN trebol_estados AS te ON tl.`id_estado`=te.`id`\n"
                + "WHERE tl.id_factura=" + id + "\n"
                + "ORDER BY tl.`creacion`";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"Usuario", "Procedimiento", "Fecha", "Hora", "Comentario"};
            Object[] registros = new Object[5];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("Gestiona");
                registros[1] = rs.getString("Proceso");
                registros[2] = rs.getDate("Fecha");
                registros[3] = rs.getString("Hora");
                registros[4] = rs.getString("Comentario");
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(30);

            for (int i = 0; i < 5; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 16));
            }

            tabla.getColumnModel().getColumn(0).setPreferredWidth(180);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(115);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(390);

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 1, 14));
            tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(4).setCellRenderer(ajustartabla = new Multilinea_en_Tabla(4, 14));

        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param tabla
     * @param id
     * @param usuario
     */
    public void Documentos(JTable tabla, int id, String usuario) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String estados;
        if (UC.id_area_usuario(usuario) == 6 || UC.id_area_usuario(usuario) == 7) {
            estados = "3,4,5,6,7,8,9,10,11,12,13,14";
        } else {
            estados = "1,3,4,5,6,7,8,9,10,11,12,13,14";
        }
        String consulta = "SELECT ttd.`nombre`\n"
                + "FROM trebol_documentos AS td\n"
                + "JOIN trebol_facturas AS tf ON td.`id_factura`=tf.`id`\n"
                + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`\n"
                + "WHERE td.`id_tipo_doc` NOT IN (" + estados + ")\n"
                + "AND tf.`id`=" + id + "\n"
                + "ORDER BY td.id_tipo_doc ASC;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"Documento", "Ver", "Editar", "Borrar"};
            Object[] registros = new Object[4];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("ttd.nombre");
                if (rs.getString("ttd.nombre").equals("Anexo Recibido con la Factura")) {
                    if (UC.id_area_usuario(usuario) == 6 || UC.id_area_usuario(usuario) == 7) {
                        btnver = new JButton("");
                        btnver.setName("ver");
                        registros[1] = btnver;
                        btneditar = new JButton("");
                        btneditar.setName("editar");
                        registros[2] = btneditar;
                        btnborrar = new JButton("");
                        btnborrar.setName("borrar");
                        registros[3] = btnborrar;
                    } else {
                        registros[1] = "";
                        registros[2] = "";
                        registros[3] = "";
                    }
                } else {
                    btnver = new JButton("");
                    btnver.setName("ver");
                    registros[1] = btnver;
                    btneditar = new JButton("");
                    btneditar.setName("editar");
                    registros[2] = btneditar;
                    btnborrar = new JButton("");
                    btnborrar.setName("borrar");
                    registros[3] = btnborrar;
                }
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(30);

            for (int i = 0; i < 4; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
            }

            tabla.getColumnModel().getColumn(0).setPreferredWidth(335);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(52);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(55);

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 1, 14));
            tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 2, 14));
            tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 3, 14));

        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param tabla
     * @param id
     */
    public void Documentos_Factura(JTable tabla, int id, int vista) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        String consulta = "SELECT ttd.`nombre`\n"
                + "FROM trebol_documentos AS td\n"
                + "JOIN trebol_facturas AS tf ON td.`id_factura`=tf.`id`\n"
                + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`\n"
                + "WHERE td.`id_tipo_doc` NOT IN (1,3,4,5,6,7,8,9,10,11,12,13,14,16,17)\n"
                + "AND tf.`id`=" + id + "\n"
                + "ORDER BY td.id_tipo_doc ASC;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta);) {
            Object[] titulos = {"Documento", "Ver"};
            Object[] registros = new Object[2];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    Class returnValue;
                    if (column == 1 && tabla.getRowCount() > 0) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                    return returnValue;
                }
            };

            sorter = new TableRowSorter(model);

            while (rs.next()) {
                registros[0] = rs.getString("ttd.nombre");
                btnver = new JButton("");
                btnver.setName("ver");
                registros[1] = btnver;
                model.addRow(registros);
            }

            tabla.setModel(model);
            tabla.setRowSorter(sorter);
            tabla.setRowHeight(30);

            for (int i = 0; i < 2; i++) {
                tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
            }

            if (vista == 1) {
                tabla.getColumnModel().getColumn(0).setPreferredWidth(380);
                tabla.getColumnModel().getColumn(1).setPreferredWidth(55);
            } else {
                tabla.getColumnModel().getColumn(0).setPreferredWidth(250);
                tabla.getColumnModel().getColumn(1).setPreferredWidth(55);
            }

            tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
            tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        } catch (SQLException ex) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void anticipos_prov(JTable tabla, String prov, String emp) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(255, 255, 255);
        Color CB = new Color(255, 255, 255);
        Object[] titulos = {"Doc.", "Cons.", "Valor", "Asociar", "Ver"};
        Object[] registros = new Object[5];
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {
                Class returnValue;
                if (column == 2 && tabla.getRowCount() > 0) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        sorter = new TableRowSorter(model);
        try (Connection cn = cc.Conexion();
                Statement stg = cn.createStatement();
                ResultSet rsg = stg.executeQuery("SELECT ttd.`tipo_doc`,ta.`consecutivo`,ta.`valor`\n"
                        + "FROM trebol_anticipos ta\n"
                        + "INNER JOIN trebol_proveedor AS tp ON ta.`id_proveedor`=tp.`id`\n"
                        + "INNER JOIN trebol_empresa AS te ON ta.`id_empresa`=te.`id`\n"
                        + "INNER JOIN trebol_tipo_documento AS ttd ON ta.`id_tipo_doc`=ttd.`id`\n"
                        + "WHERE razon_social LIKE'%" + prov + "%'\n"
                        + "AND te.`nom_empresa` LIKE '%" + emp + "%'\n"
                        + "AND ta.estado=1\n"
                        + "AND ta.cargado=0;");) {
            while (rsg.next()) {
                registros[0] = rsg.getString("ttd.tipo_doc");
                registros[1] = rsg.getString("ta.consecutivo");
                registros[2] = rsg.getDouble("ta.valor");
                btnaceptar = new JButton("");
                btnaceptar.setName("aceptar");
                registros[3] = btnaceptar;
                btnver = new JButton("");
                btnver.setName("ver");
                registros[4] = btnver;
                model.addRow(registros);
            }
        } catch (SQLException e) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, e);
        }

        tabla.setModel(model);

        tabla.setRowSorter(sorter);
        tabla.setRowHeight(25);

        for (int i = 0; i < 5; i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
        }

        tabla.getColumnModel().getColumn(0).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(102);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(50);

        tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(4).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
    }

    public void pre_anticipos(JTable tabla, String id_proveedor, String id_empresa, String valor) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(0, 0, 0);
        Color CB = new Color(255, 255, 255);
        Color CT = new Color(0, 0, 0);
        Object[] titulos = {"Proveedor", "Empresa", "Valor", "Cons.", "Ver", "Anular"};
        Object[] registros = new Object[6];
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {
                Class returnValue;
                if (column == 2 && tabla.getRowCount() > 0) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        sorter = new TableRowSorter(model);
        try (Connection cn = cc.Conexion();
                Statement stg = cn.createStatement();
                ResultSet rsg = stg.executeQuery("SELECT tp.razon_social, temp.`nom_empresa`, ta.`valor`, anulado, "
                        + "CONCAT(ttd.`tipo_doc`,'-',ta.`consecutivo`) AS 'Consecutivo', ta.`ub_documento`\n"
                        + "FROM trebol_anticipos AS ta\n"
                        + "JOIN trebol_proveedor AS tp ON ta.id_proveedor=tp.id\n"
                        + "JOIN trebol_empresa AS temp ON ta.id_empresa=temp.id\n"
                        + "JOIN trebol_tipo_documento AS ttd ON ta.id_tipo_doc=ttd.id\n"
                        + "WHERE id_proveedor LIKE '%" + id_proveedor + "%'\n"
                        + "AND id_empresa LIKE '%" + id_empresa + "%'\n"
                        + "AND valor LIKE '%" + valor + "%';");) {
            while (rsg.next()) {
                registros[0] = rsg.getString("tp.razon_social");
                registros[1] = rsg.getString("temp.nom_empresa");
                registros[2] = rsg.getString("Consecutivo");
                registros[3] = rsg.getDouble("ta.valor");
                if (rsg.getInt("anulado") == 0) {
                    btnver = new JButton("");
                    btnver.setName("ver");
                    registros[4] = btnver;
                    btnborrar = new JButton("");
                    btnborrar.setName("borrar");
                    registros[5] = btnborrar;
                } else {
                    btnver = new JButton("");
                    btnver.setName("ver");
                    registros[4] = btnver;
                    registros[5] = "Anulado";
                }

                model.addRow(registros);
            }
        } catch (SQLException e) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, e);
        }

        tabla.setModel(model);
        tabla.setRowSorter(sorter);
        tabla.setRowHeight(25);

        for (int i = 0; i < 6; i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
        }

        tabla.getColumnModel().getColumn(0).setPreferredWidth(365);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(98);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(60);

        tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("izquierda", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(4).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(5).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
    }

    public void anticipos_proveedor(JTable tabla, String proveedor, String empresa) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(0, 0, 0);
        Color CB = new Color(255, 255, 255);
        Object[] titulos = {"Doc.", "Cons.", "Valor", "Asociar", "Ver"};
        Object[] registros = new Object[5];
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {
                Class returnValue;
                if (column == 2 && tabla.getRowCount() > 0) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        sorter = new TableRowSorter(model);
        try (Connection cn = cc.Conexion();
                Statement stg = cn.createStatement();
                ResultSet rsg = stg.executeQuery("SELECT ttd.`tipo_doc`, ta.`consecutivo`,ta.`valor`\n"
                        + "FROM trebol_anticipos AS ta\n"
                        + "JOIN trebol_proveedor AS tp ON ta.id_proveedor=tp.id\n"
                        + "JOIN trebol_empresa AS temp ON ta.id_empresa=temp.id\n"
                        + "JOIN trebol_tipo_documento AS ttd ON ta.id_tipo_doc=ttd.id\n"
                        + "WHERE tp.`razon_social` LIKE '%" + proveedor + "%'\n"
                        + "AND temp.`nom_empresa` LIKE '%" + empresa + "%'\n"
                        + "AND cargado =0;");) {
            while (rsg.next()) {
                registros[0] = rsg.getString("ttd.tipo_doc");
                registros[1] = rsg.getString("ta.consecutivo");
                registros[2] = rsg.getString("ta.valor");
                btnaceptar = new JButton("");
                btnaceptar.setName("aceptar");
                registros[3] = btnaceptar;
                btnver = new JButton("");
                btnver.setName("ver");
                registros[4] = btnver;
                model.addRow(registros);
            }
        } catch (SQLException e) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, e);
        }

        tabla.setModel(model);
        tabla.setRowSorter(sorter);
        tabla.setRowHeight(25);

        for (int i = 0; i < 5; i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
        }

        tabla.getColumnModel().getColumn(0).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(61);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(50);

        tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(4).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
    }

    public void docs_tesoreria(JTable tabla, int id_factura) {
        Color H = new Color(75, 156, 109);
        Color T = new Color(0, 0, 0);
        Color CB = new Color(255, 255, 255);
        Color CT = new Color(0, 0, 0);
        Object[] titulos = {"Doc.", "Cons.", "Ver", "Borrar"};
        Object[] registros = new Object[4];
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int column) {
                Class returnValue;
                if (column == 2 && tabla.getRowCount() > 0) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        sorter = new TableRowSorter(model);
        try (Connection cn = cc.Conexion();
                Statement stg = cn.createStatement();
                ResultSet rsg = stg.executeQuery("SELECT ttd.`tipo_doc`, td.`consecutivo`\n"
                        + "FROM trebol_documentos AS td\n"
                        + "JOIN trebol_facturas AS tf ON td.`id_factura`=tf.`id`\n"
                        + "JOIN trebol_tipo_documento AS ttd ON td.`id_tipo_doc`=ttd.`id`\n"
                        + "WHERE td.`id_tipo_doc` IN (5,8)\n"
                        + "AND tf.`id`=" + id_factura + "\n"
                        + "ORDER BY ttd.`nombre` ASC;");) {
            while (rsg.next()) {
                registros[0] = rsg.getString("ttd.tipo_doc");
                registros[1] = rsg.getString("td.consecutivo");
                btnaceptar = new JButton("");
                btnaceptar.setName("ver");
                registros[2] = btnaceptar;
                btnver = new JButton("");
                btnver.setName("borrar");
                registros[3] = btnver;
                model.addRow(registros);
            }
        } catch (SQLException e) {
            Logger.getLogger(Llenar_Tablas.class.getName()).log(Level.SEVERE, null, e);
        }

        tabla.setModel(model);
        tabla.setRowSorter(sorter);
        tabla.setRowHeight(25);

        for (int i = 0; i < 4; i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(new Encabezado_Tabla(H, T, tabla.getTableHeader().getDefaultRenderer(), 15));
        }

        tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(55);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(50);

        tabla.getColumnModel().getColumn(0).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(1).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(2).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
        tabla.getColumnModel().getColumn(3).setCellRenderer(alineacion = new Alineacion_Texto_Tabla("centrado", CB, T, 0, 14));
    }

}
