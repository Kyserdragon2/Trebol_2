package Clases;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Renderizado {

    Conexion cc = new Conexion();

    public void cmbcentrado(JComboBox cmb) {
        JTextField jcb = (JTextField) cmb.getEditor().getEditorComponent();
        jcb.setHorizontalAlignment(JTextField.CENTER);
    }

    public void jdccentrado(JDateChooser jcd) {
        JTextFieldDateEditor dateEditor = (JTextFieldDateEditor) jcd.getDateEditor();
        dateEditor.setHorizontalAlignment(JTextField.CENTER);
        dateEditor.setBorder(null);

    }

    public void empresa(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nom_empresa FROM trebol_empresa;")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("nom_empresa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void area(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nombre_area FROM trebol_areas;")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("nombre_area"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void areas_creacion_factura(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nombre_area\n"
                        + "FROM trebol_areas\n"
                        + "WHERE id in (1,2,3,8);")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("nombre_area"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tipo_factura(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT tipo_factura\n"
                        + "FROM trebol_tipo_factura\n"
                        + "WHERE id NOT IN (1,2,3);")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("tipo_factura"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tipo_documento(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT nombre\n"
                        + "FROM trebol_tipo_documento\n"
                        + "WHERE id NOT IN (3,4,5,6,7,8,9,10,11,12,13,14,16,17);")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void razon_social(JComboBox cmb) {
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT razon_social FROM trebol_proveedor;")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("razon_social"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void convenios(JComboBox cmb, String prov, String emp) {
        String consulta = "SELECT TC.`no_cuenta`\n"
                + "FROM trebol_convenios AS TC\n"
                + "INNER JOIN trebol_proveedor AS TP ON TC.`id_proveedor`=TP.`id`\n"
                + "INNER JOIN trebol_empresa AS TEMP ON TC.`id_empresa`=TEMP.`id`\n"
                + "WHERE TP.razon_social = '" + prov + "'\n"
                + "AND TEMP.nom_empresa = '" + emp + "'\n"
                + "ORDER BY TC.`no_cuenta`;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(consulta)) {
            while (rs.next()) {
                cmb.addItem(rs.getString("TC.no_cuenta"));
            }
        } catch (SQLException ex) {
            System.out.println(consulta);
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Revision(JComboBox cmb) {
        try (Connection cn = cc.Conexion(); 
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT CONCAT(nombres,' ',apellidos) AS 'nombre' "
                        + "FROM trebol_usuario\n"
                        + "WHERE id_area=5\n"
                        + "AND retirado=0\n"
                        + "ORDER BY nombre ASC")) {
            while (rs.next()) {
                cmb.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Renderizado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
