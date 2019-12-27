package Clases;

import Controladores.Factura_Controller;
import Objetos.Factura;
import Principal.Principal;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controles_Adicionales {

    Factura_Controller FC = new Factura_Controller();

    public void buscar_documento(JTextField ruta, String doc_perm) {
        String rutausuario = System.getProperty("user.home");
        FileNameExtensionFilter pdf = new FileNameExtensionFilter("PDF Files(*.pdf)", "pdf");
        FileNameExtensionFilter jpg = new FileNameExtensionFilter("JPEG(*.jpg;*jpeg)", "jpg", "jpeg");
        FileNameExtensionFilter png = new FileNameExtensionFilter("PNG(*.png)", "png");
        JFileChooser archivo = new JFileChooser();
        File directorio1 = new File(rutausuario + "\\Documents");
        if (directorio1.exists()) {
            switch (doc_perm) {
                case "PDF":
                    archivo.setAcceptAllFileFilterUsed(false);
                    archivo.addChoosableFileFilter(pdf);
                    break;
                default:
                    archivo.addChoosableFileFilter(pdf);
                    archivo.addChoosableFileFilter(jpg);
                    archivo.addChoosableFileFilter(png);
                    break;
            }
            archivo.setCurrentDirectory(directorio1);
            archivo.setDialogTitle("Abrir Archivo");
            int ventana = archivo.showOpenDialog(Principal.Escritorio);
            if (ventana == JFileChooser.APPROVE_OPTION) {
                File file = archivo.getSelectedFile();
                ruta.setText(String.valueOf(file));
            }
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "No se puede acceder a '" + directorio1 + "'\nLa carpeta no existe o fue eliminada", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Borde_Componente(JComponent comp, String color) {
        if (color.equals("rojo")) {
            comp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    null, new Color(153, 0, 0)));
        } else {
            comp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
        }
    }

    public boolean es_numero(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String no_factura_pref(String dato, String no_factura, String proveedor, String empresa) {
        Factura F = FC.buscar(no_factura, proveedor, empresa);
        String prefijo;
        if (F.getNo_factura().contains("-")) {
            String[] array_no_factura = F.getNo_factura().split("-");
            if (!es_numero(array_no_factura[0]) && !es_numero(array_no_factura[1])) {
                prefijo = array_no_factura[0] + "-" + array_no_factura[1];
            } else if (!es_numero(array_no_factura[0])) {
                prefijo = array_no_factura[0];
            } else {
                prefijo = "";
            }
        } else {
            prefijo = "";
        }
        return prefijo;
    }

    public String no_factura_nf(String dato, String no_factura, String proveedor, String empresa) {
        Factura F = FC.buscar(no_factura, proveedor, empresa);
        String nf;
        if (F.getNo_factura().contains("-")) {
            String[] array_no_factura = F.getNo_factura().split("-");
            if (es_numero(array_no_factura[0])) {
                switch (array_no_factura.length) {
                    case 2:
                        nf = array_no_factura[0] + "-" + array_no_factura[1];
                        break;
                    case 3:
                        nf = array_no_factura[0] + "-" + array_no_factura[1] + "-" + array_no_factura[2];
                        break;
                    case 4:
                        nf = array_no_factura[0] + "-" + array_no_factura[1] + "-" + array_no_factura[2] + "-" + array_no_factura[3];
                        break;
                    default:
                        nf = array_no_factura[1];
                        break;
                }
            } else if (!es_numero(array_no_factura[0]) && !es_numero(array_no_factura[1])) {
                switch (array_no_factura.length) {
                    case 3:
                        nf = array_no_factura[2];
                        break;
                    case 4:
                        nf = array_no_factura[2] + "-" + array_no_factura[3];
                        break;
                    default:
                        nf = array_no_factura[1];
                        break;
                }
            } else {
                switch (array_no_factura.length) {
                    case 2:
                        nf = array_no_factura[1];
                        break;
                    case 3:
                        nf = array_no_factura[1] + "-" + array_no_factura[2];
                        break;
                    case 4:
                        nf = array_no_factura[1] + "-" + array_no_factura[2] + "-" + array_no_factura[3];
                        break;
                    default:
                        nf = array_no_factura[1];
                        break;
                }
            }
        } else {
            nf = F.getNo_factura();
        }
        return nf;
    }
   
    public void llenar_cmb_tabla(JComboBox cmb, JTable table, int col_table) {
        ArrayList<String> datos = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            boolean error = true;
            for (int j = 0; j < datos.size(); j++) {
                if (table.getValueAt(i, col_table).toString().equals(datos.get(j))) {
                    error = false;
                }
            }
            if (error == true) {
                datos.add(table.getValueAt(i, col_table).toString());
            }
        }
        DefaultComboBoxModel jcmb = new DefaultComboBoxModel();
        cmb.setModel(jcmb);
        jcmb.removeAllElements();
        jcmb.addElement("---");
        Collections.sort(datos);
        for (int i = 0; i < datos.size(); i++) {
            jcmb.addElement(datos.get(i));
        }
    }
}
