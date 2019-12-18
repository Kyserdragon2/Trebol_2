package Modulos;

import Clases.*;
import Controladores.*;
import Objetos.Factura;
import Principal.Principal;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class Grabar_Factura extends javax.swing.JInternalFrame {

    Renderizado R = new Renderizado();
    Controles_Adicionales CA = new Controles_Adicionales();
    Proveedor_Controller PC = new Proveedor_Controller();
    Area_Controller AC = new Area_Controller();
    TipoFactura_Controller TFC = new TipoFactura_Controller();
    Empresa_Controller EMPC = new Empresa_Controller();
    Manipuacion_Documentos MD = new Manipuacion_Documentos();
    Factura_Controller FC = new Factura_Controller();
    Notificaciones_Sistema NS = new Notificaciones_Sistema();
    Convenio_Controller CCon = new Convenio_Controller();
    Factura_Convenio_Controller FCC = new Factura_Convenio_Controller();
    Documento_Controller DC = new Documento_Controller();
    Logs_Controller LC = new Logs_Controller();
    Tiempo_Controller TC = new Tiempo_Controller();
    Comentario_Controller CC = new Comentario_Controller();
    Correo_Controller CorC = new Correo_Controller();
    Usuario_Controller UC = new Usuario_Controller();
    Envio_Correos EC = new Envio_Correos();
    Llenar_Tablas LT = new Llenar_Tablas();
    TipoDoc_Controller TDC = new TipoDoc_Controller();
    Aprobacion_Controller ApC = new Aprobacion_Controller();

    public Grabar_Factura() {
        initComponents();
        render();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcf = new javax.swing.JPanel();
        jpgf = new javax.swing.JPanel();
        lblempresa = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();
        btnfile = new javax.swing.JButton();
        cmbproveedor = new javax.swing.JComboBox<>();
        lblgenerada = new javax.swing.JLabel();
        jdcfechaf = new com.toedter.calendar.JDateChooser();
        lblrecibida = new javax.swing.JLabel();
        jdcfechar = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        lbldocfactura = new javax.swing.JLabel();
        jdcfechav = new com.toedter.calendar.JDateChooser();
        lblNfactura = new javax.swing.JLabel();
        lblradicado = new javax.swing.JLabel();
        txtnf = new javax.swing.JTextField();
        txtccorresp = new javax.swing.JTextField();
        lblproveedor = new javax.swing.JLabel();
        txtruta = new javax.swing.JTextField();
        lblconvenio = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<>();
        lblnit = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        lblvence = new javax.swing.JLabel();
        lblmoneda = new javax.swing.JLabel();
        cmbmoneda = new javax.swing.JComboBox<>();
        lblAsignar = new javax.swing.JLabel();
        cmbtfactura = new javax.swing.JComboBox<>();
        lblrequerido1 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtpref = new javax.swing.JTextField();
        lblvalor = new javax.swing.JLabel();
        lbltipofact = new javax.swing.JLabel();
        cmbconvenio = new javax.swing.JComboBox<>();
        btncrear = new javax.swing.JButton();
        jcbanexo = new javax.swing.JCheckBox();
        btnanexo = new javax.swing.JButton();
        txtanexo = new javax.swing.JTextField();
        jtabedpane = new javax.swing.JTabbedPane();
        jpseguimiento = new javax.swing.JPanel();
        jsseguimiento = new javax.swing.JScrollPane();
        jtseguimiento = new javax.swing.JTable();
        jpdocs = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtdocumentos = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cmbtipodoc = new javax.swing.JComboBox<>();
        txtubA = new javax.swing.JTextField();
        Nuevo_T_Documento = new javax.swing.JPanel();
        txtnombretd = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btncreartd = new javax.swing.JButton();
        btncancelartd = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtnpreftd = new javax.swing.JTextField();
        btncargar = new javax.swing.JButton();
        btnctdoc = new javax.swing.JButton();
        btnbuscarA = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblrequerido2 = new javax.swing.JLabel();
        lblrequerido3 = new javax.swing.JLabel();
        lblrequerido4 = new javax.swing.JLabel();
        lblrequerido5 = new javax.swing.JLabel();
        lblrequerido6 = new javax.swing.JLabel();
        lblrequerido7 = new javax.swing.JLabel();
        lblrequerido8 = new javax.swing.JLabel();
        lblrequerido9 = new javax.swing.JLabel();
        lblrequerido10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Grabar Factura");
        setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(889, 345));
        setMinimumSize(new java.awt.Dimension(889, 345));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(892, 329));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        panelcf.setBackground(new java.awt.Color(234, 255, 255));
        panelcf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelcf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        panelcf.setMinimumSize(new java.awt.Dimension(722, 208));
        panelcf.setLayout(null);

        jpgf.setBackground(new java.awt.Color(255, 255, 255));
        jpgf.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpgf.setLayout(null);

        lblempresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblempresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblempresa.setText("Empresa");
        lblempresa.setPreferredSize(new java.awt.Dimension(55, 26));
        jpgf.add(lblempresa);
        lblempresa.setBounds(35, 100, 90, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbempresa.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbempresa.setPreferredSize(new java.awt.Dimension(138, 26));
        jpgf.add(cmbempresa);
        cmbempresa.setBounds(130, 100, 190, 26);

        btnfile.setBackground(new java.awt.Color(255, 229, 178));
        btnfile.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnfile.setForeground(new java.awt.Color(107, 70, 0));
        btnfile.setText("Seleccionar...");
        btnfile.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfileActionPerformed(evt);
            }
        });
        jpgf.add(btnfile);
        btnfile.setBounds(629, 220, 115, 26);

        cmbproveedor.setEditable(true);
        cmbproveedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbproveedor.setPreferredSize(new java.awt.Dimension(138, 26));
        jpgf.add(cmbproveedor);
        cmbproveedor.setBounds(130, 20, 510, 26);

        lblgenerada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblgenerada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblgenerada.setText("Generada");
        lblgenerada.setPreferredSize(new java.awt.Dimension(38, 26));
        jpgf.add(lblgenerada);
        lblgenerada.setBounds(355, 140, 100, 26);

        jdcfechaf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jdcfechaf.setDateFormatString("dd/MM/yyyy");
        jdcfechaf.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jdcfechaf.setMinSelectableDate(jdcfechar.getDate());
        jdcfechaf.setPreferredSize(new java.awt.Dimension(89, 26));
        jpgf.add(jdcfechaf);
        jdcfechaf.setBounds(460, 140, 140, 26);

        lblrecibida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblrecibida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrecibida.setText("Recibida");
        lblrecibida.setPreferredSize(new java.awt.Dimension(79, 26));
        jpgf.add(lblrecibida);
        lblrecibida.setBounds(35, 140, 90, 26);

        jdcfechar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jdcfechar.setDateFormatString("dd/MM/yyyy");
        jdcfechar.setFocusable(false);
        jdcfechar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jdcfechar.setMaximumSize(new java.awt.Dimension(140, 29));
        jdcfechar.setMinSelectableDate(new java.util.Date(1546322515000L));
        jdcfechar.setMinimumSize(new java.awt.Dimension(140, 29));
        jdcfechar.setPreferredSize(new java.awt.Dimension(140, 29));
        jdcfechar.setRequestFocusEnabled(false);
        jdcfechar.setVerifyInputWhenFocusTarget(false);
        jpgf.add(jdcfechar);
        jdcfechar.setBounds(130, 140, 190, 26);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.setPreferredSize(new java.awt.Dimension(35, 26));
        jpgf.add(jLabel5);
        jLabel5.setBounds(205, 60, 10, 26);

        lbldocfactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbldocfactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldocfactura.setText("Factura");
        jpgf.add(lbldocfactura);
        lbldocfactura.setBounds(35, 220, 90, 26);

        jdcfechav.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jdcfechav.setDateFormatString("dd/MM/yyyy");
        jdcfechav.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jdcfechav.setPreferredSize(new java.awt.Dimension(89, 26));
        jpgf.add(jdcfechav);
        jdcfechav.setBounds(710, 140, 160, 26);

        lblNfactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNfactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNfactura.setText("No. Factura");
        lblNfactura.setPreferredSize(new java.awt.Dimension(74, 26));
        jpgf.add(lblNfactura);
        lblNfactura.setBounds(35, 60, 90, 26);

        lblradicado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblradicado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblradicado.setText("Radicado");
        lblradicado.setPreferredSize(new java.awt.Dimension(74, 26));
        jpgf.add(lblradicado);
        lblradicado.setBounds(635, 100, 70, 30);

        txtnf.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtnf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtnf.setMinimumSize(new java.awt.Dimension(6, 26));
        txtnf.setPreferredSize(new java.awt.Dimension(6, 26));
        jpgf.add(txtnf);
        txtnf.setBounds(220, 60, 100, 26);

        txtccorresp.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtccorresp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtccorresp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtccorresp.setPreferredSize(new java.awt.Dimension(6, 26));
        jpgf.add(txtccorresp);
        txtccorresp.setBounds(710, 100, 160, 26);

        lblproveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblproveedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblproveedor.setText("Proveedor");
        jpgf.add(lblproveedor);
        lblproveedor.setBounds(35, 20, 90, 26);

        txtruta.setEditable(false);
        txtruta.setBackground(new java.awt.Color(255, 255, 255));
        txtruta.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtruta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtruta.setPreferredSize(new java.awt.Dimension(6, 26));
        jpgf.add(txtruta);
        txtruta.setBounds(130, 220, 500, 26);

        lblconvenio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblconvenio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblconvenio.setText("Convenio");
        lblconvenio.setPreferredSize(new java.awt.Dimension(55, 26));
        jpgf.add(lblconvenio);
        lblconvenio.setBounds(355, 180, 100, 26);

        cmbarea.setEditable(true);
        cmbarea.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbarea.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbarea.setPreferredSize(new java.awt.Dimension(138, 26));
        jpgf.add(cmbarea);
        cmbarea.setBounds(460, 100, 140, 26);

        lblnit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnit.setText("Nit");
        lblnit.setPreferredSize(new java.awt.Dimension(74, 26));
        jpgf.add(lblnit);
        lblnit.setBounds(675, 20, 30, 30);

        txtnit.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtnit.setFocusable(false);
        txtnit.setPreferredSize(new java.awt.Dimension(6, 26));
        txtnit.setRequestFocusEnabled(false);
        jpgf.add(txtnit);
        txtnit.setBounds(710, 20, 160, 26);

        lblvence.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblvence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblvence.setText("Vence");
        lblvence.setPreferredSize(new java.awt.Dimension(38, 26));
        jpgf.add(lblvence);
        lblvence.setBounds(635, 140, 70, 30);

        lblmoneda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblmoneda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmoneda.setText("Moneda");
        lblmoneda.setPreferredSize(new java.awt.Dimension(35, 26));
        jpgf.add(lblmoneda);
        lblmoneda.setBounds(635, 60, 70, 30);

        cmbmoneda.setEditable(true);
        cmbmoneda.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbmoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "COP", "USD" }));
        cmbmoneda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbmoneda.setFocusable(false);
        cmbmoneda.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbmoneda.setPreferredSize(new java.awt.Dimension(138, 26));
        cmbmoneda.setVerifyInputWhenFocusTarget(false);
        jpgf.add(cmbmoneda);
        cmbmoneda.setBounds(710, 60, 160, 26);

        lblAsignar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAsignar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAsignar.setText("Asignar a");
        lblAsignar.setPreferredSize(new java.awt.Dimension(55, 26));
        jpgf.add(lblAsignar);
        lblAsignar.setBounds(355, 100, 100, 26);

        cmbtfactura.setEditable(true);
        cmbtfactura.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbtfactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbtfactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbtfactura.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbtfactura.setPreferredSize(new java.awt.Dimension(138, 26));
        jpgf.add(cmbtfactura);
        cmbtfactura.setBounds(130, 180, 190, 26);

        lblrequerido1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido1.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido1.setText("*");
        jpgf.add(lblrequerido1);
        lblrequerido1.setBounds(645, 20, 10, 20);

        btnlimpiar.setBackground(new java.awt.Color(153, 204, 255));
        btnlimpiar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnlimpiar.setPreferredSize(new java.awt.Dimension(45, 26));
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jpgf.add(btnlimpiar);
        btnlimpiar.setBounds(780, 220, 94, 26);

        btnmodificar.setBackground(new java.awt.Color(224, 240, 177));
        btnmodificar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(37, 112, 0));
        btnmodificar.setText("Modificar");
        btnmodificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnmodificar.setPreferredSize(new java.awt.Dimension(45, 26));
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jpgf.add(btnmodificar);
        btnmodificar.setBounds(413, 500, 100, 30);

        lblid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jpgf.add(lblid);
        lblid.setBounds(800, 180, 52, 26);

        txtvalor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvalor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtvalor.setMinimumSize(new java.awt.Dimension(6, 26));
        txtvalor.setPreferredSize(new java.awt.Dimension(6, 26));
        txtvalor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtvalorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtvalorFocusLost(evt);
            }
        });
        txtvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorKeyTyped(evt);
            }
        });
        jpgf.add(txtvalor);
        txtvalor.setBounds(460, 60, 140, 26);

        txtpref.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtpref.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpref.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtpref.setMinimumSize(new java.awt.Dimension(6, 26));
        txtpref.setPreferredSize(new java.awt.Dimension(6, 26));
        jpgf.add(txtpref);
        txtpref.setBounds(130, 60, 70, 26);

        lblvalor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblvalor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblvalor.setText("Valor");
        lblvalor.setPreferredSize(new java.awt.Dimension(35, 26));
        jpgf.add(lblvalor);
        lblvalor.setBounds(355, 60, 100, 26);

        lbltipofact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbltipofact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltipofact.setText("Tipo Factura");
        lbltipofact.setPreferredSize(new java.awt.Dimension(55, 26));
        jpgf.add(lbltipofact);
        lbltipofact.setBounds(35, 180, 90, 26);

        cmbconvenio.setEditable(true);
        cmbconvenio.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbconvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbconvenio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbconvenio.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbconvenio.setPreferredSize(new java.awt.Dimension(138, 26));
        jpgf.add(cmbconvenio);
        cmbconvenio.setBounds(460, 180, 140, 26);

        btncrear.setBackground(new java.awt.Color(224, 240, 177));
        btncrear.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncrear.setForeground(new java.awt.Color(37, 112, 0));
        btncrear.setText("Grabar");
        btncrear.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncrear.setPreferredSize(new java.awt.Dimension(45, 26));
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        jpgf.add(btncrear);
        btncrear.setBounds(780, 260, 94, 26);

        jcbanexo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbanexo.setText("Anexo");
        jcbanexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jcbanexo.setOpaque(false);
        jcbanexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbanexoActionPerformed(evt);
            }
        });
        jpgf.add(jcbanexo);
        jcbanexo.setBounds(40, 260, 91, 26);

        btnanexo.setBackground(new java.awt.Color(255, 229, 178));
        btnanexo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnanexo.setForeground(new java.awt.Color(107, 70, 0));
        btnanexo.setText("Seleccionar...");
        btnanexo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnanexo.setEnabled(false);
        btnanexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanexoActionPerformed(evt);
            }
        });
        jpgf.add(btnanexo);
        btnanexo.setBounds(629, 260, 115, 26);

        txtanexo.setEditable(false);
        txtanexo.setBackground(new java.awt.Color(255, 255, 255));
        txtanexo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtanexo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtanexo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtanexo.setEnabled(false);
        txtanexo.setPreferredSize(new java.awt.Dimension(6, 26));
        jpgf.add(txtanexo);
        txtanexo.setBounds(130, 260, 500, 26);

        jtabedpane.setBackground(new java.awt.Color(255, 229, 178));
        jtabedpane.setForeground(new java.awt.Color(107, 70, 0));
        jtabedpane.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jtabedpane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtabedpaneStateChanged(evt);
            }
        });

        jpseguimiento.setBackground(new java.awt.Color(255, 255, 255));
        jpseguimiento.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpseguimiento.setLayout(null);

        jsseguimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jsseguimiento.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsseguimiento.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsseguimiento.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtseguimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtseguimiento.setFillsViewportHeight(true);
        jsseguimiento.setViewportView(jtseguimiento);

        jpseguimiento.add(jsseguimiento);
        jsseguimiento.setBounds(5, 5, 883, 235);

        jtabedpane.addTab("Seguimiento", jpseguimiento);

        jpdocs.setBackground(new java.awt.Color(255, 255, 255));
        jpdocs.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpdocs.setToolTipText("");
        jpdocs.setLayout(null);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane6.setMaximumSize(new java.awt.Dimension(527, 154));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(527, 154));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(527, 154));

        jtdocumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtdocumentos.setFillsViewportHeight(true);
        jtdocumentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtdocumentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtdocumentosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtdocumentos);

        jpdocs.add(jScrollPane6);
        jScrollPane6.setBounds(365, 8, 518, 230);

        jLabel27.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Tipo de Documento:");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setPreferredSize(new java.awt.Dimension(55, 26));
        jpdocs.add(jLabel27);
        jLabel27.setBounds(10, 5, 160, 21);

        cmbtipodoc.setEditable(true);
        cmbtipodoc.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbtipodoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbtipodoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpdocs.add(cmbtipodoc);
        cmbtipodoc.setBounds(10, 30, 350, 26);

        txtubA.setEditable(false);
        txtubA.setBackground(new java.awt.Color(255, 255, 255));
        txtubA.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtubA.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtubA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtubA.setEnabled(false);
        txtubA.setPreferredSize(new java.awt.Dimension(6, 26));
        jpdocs.add(txtubA);
        txtubA.setBounds(120, 60, 240, 26);

        Nuevo_T_Documento.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo_T_Documento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Nuevo Documento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        Nuevo_T_Documento.setLayout(null);

        txtnombretd.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtnombretd.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtnombretd.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtnombretd.setPreferredSize(new java.awt.Dimension(6, 26));
        Nuevo_T_Documento.add(txtnombretd);
        txtnombretd.setBounds(100, 30, 240, 26);

        jLabel37.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Prefijo");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setPreferredSize(new java.awt.Dimension(55, 26));
        Nuevo_T_Documento.add(jLabel37);
        jLabel37.setBounds(10, 65, 80, 26);

        btncreartd.setBackground(new java.awt.Color(224, 240, 177));
        btncreartd.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncreartd.setForeground(new java.awt.Color(37, 112, 0));
        btncreartd.setText("Crear");
        btncreartd.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncreartd.setFocusPainted(false);
        btncreartd.setFocusable(false);
        btncreartd.setPreferredSize(new java.awt.Dimension(83, 26));
        btncreartd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreartdActionPerformed(evt);
            }
        });
        Nuevo_T_Documento.add(btncreartd);
        btncreartd.setBounds(280, 65, 60, 26);

        btncancelartd.setBackground(new java.awt.Color(255, 153, 153));
        btncancelartd.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncancelartd.setForeground(new java.awt.Color(153, 0, 0));
        btncancelartd.setText("Cancelar");
        btncancelartd.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelartd.setFocusPainted(false);
        btncancelartd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelartdActionPerformed(evt);
            }
        });
        Nuevo_T_Documento.add(btncancelartd);
        btncancelartd.setBounds(180, 65, 83, 26);

        jLabel38.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Documento");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setPreferredSize(new java.awt.Dimension(55, 26));
        Nuevo_T_Documento.add(jLabel38);
        jLabel38.setBounds(10, 30, 80, 26);

        txtnpreftd.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtnpreftd.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtnpreftd.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtnpreftd.setPreferredSize(new java.awt.Dimension(6, 26));
        Nuevo_T_Documento.add(txtnpreftd);
        txtnpreftd.setBounds(100, 65, 50, 26);

        jpdocs.add(Nuevo_T_Documento);
        Nuevo_T_Documento.setBounds(10, 130, 350, 110);

        btncargar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        btncargar.setText("Cargar");
        btncargar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncargar.setBorderPainted(false);
        btncargar.setContentAreaFilled(false);
        btncargar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncargar.setEnabled(false);
        btncargar.setFocusPainted(false);
        btncargar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btncargar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        jpdocs.add(btncargar);
        btncargar.setBounds(220, 90, 140, 45);

        btnctdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnctdoc.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnctdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnctdoc.setText("Nuevo Tipo de Documento");
        btnctdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnctdoc.setFocusPainted(false);
        btnctdoc.setFocusable(false);
        btnctdoc.setPreferredSize(new java.awt.Dimension(83, 26));
        btnctdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctdocActionPerformed(evt);
            }
        });
        jpdocs.add(btnctdoc);
        btnctdoc.setBounds(10, 210, 200, 26);

        btnbuscarA.setBackground(new java.awt.Color(0, 153, 204));
        btnbuscarA.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnbuscarA.setText("Seleccionar...");
        btnbuscarA.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscarA.setEnabled(false);
        btnbuscarA.setFocusPainted(false);
        btnbuscarA.setPreferredSize(new java.awt.Dimension(162, 26));
        btnbuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarAActionPerformed(evt);
            }
        });
        jpdocs.add(btnbuscarA);
        btnbuscarA.setBounds(10, 60, 110, 26);

        btnactualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnactualizar.setBorderPainted(false);
        btnactualizar.setContentAreaFilled(false);
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnactualizar.setFocusPainted(false);
        btnactualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnactualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jpdocs.add(btnactualizar);
        btnactualizar.setBounds(90, 90, 140, 45);

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(153, 0, 0));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelar.setFocusPainted(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jpdocs.add(btncancelar);
        btncancelar.setBounds(10, 100, 83, 26);

        jtabedpane.addTab("Documentos", jpdocs);

        jpgf.add(jtabedpane);
        jtabedpane.setBounds(10, 215, 900, 280);

        lblrequerido2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido2.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido2.setText("*");
        jpgf.add(lblrequerido2);
        lblrequerido2.setBounds(325, 60, 10, 20);

        lblrequerido3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido3.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido3.setText("*");
        jpgf.add(lblrequerido3);
        lblrequerido3.setBounds(605, 60, 10, 20);

        lblrequerido4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido4.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido4.setText("*");
        jpgf.add(lblrequerido4);
        lblrequerido4.setBounds(325, 100, 10, 20);

        lblrequerido5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido5.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido5.setText("*");
        jpgf.add(lblrequerido5);
        lblrequerido5.setBounds(605, 100, 10, 20);

        lblrequerido6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido6.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido6.setText("*");
        jpgf.add(lblrequerido6);
        lblrequerido6.setBounds(325, 140, 10, 20);

        lblrequerido7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido7.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido7.setText("*");
        jpgf.add(lblrequerido7);
        lblrequerido7.setBounds(605, 140, 10, 20);

        lblrequerido8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido8.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido8.setText("*");
        jpgf.add(lblrequerido8);
        lblrequerido8.setBounds(325, 180, 10, 20);

        lblrequerido9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido9.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido9.setText("*");
        jpgf.add(lblrequerido9);
        lblrequerido9.setBounds(605, 180, 10, 20);

        lblrequerido10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblrequerido10.setForeground(new java.awt.Color(204, 0, 51));
        lblrequerido10.setText("*");
        jpgf.add(lblrequerido10);
        lblrequerido10.setBounds(747, 220, 10, 20);

        panelcf.add(jpgf);
        jpgf.setBounds(10, 10, 920, 540);

        getContentPane().add(panelcf, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limpiar();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        validar_campos("crear");
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfileActionPerformed
        CA.buscar_documento(txtruta, "PDF");
    }//GEN-LAST:event_btnfileActionPerformed

    private void btnanexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanexoActionPerformed
        CA.buscar_documento(txtanexo, "ALL");
    }//GEN-LAST:event_btnanexoActionPerformed

    private void jcbanexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbanexoActionPerformed
        if (jcbanexo.isSelected()) {
            txtanexo.setEnabled(true);
            btnanexo.setEnabled(true);
        } else {
            txtanexo.setText("");
            txtanexo.setEnabled(false);
            btnanexo.setEnabled(false);
        }
    }//GEN-LAST:event_jcbanexoActionPerformed

    private void txtvalorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvalorFocusGained
        if (!txtvalor.getText().equals("")) {
            String datof;
            String dato = txtvalor.getText();
            String datoreemplazado = dato.replace("$", "");
            String datoreemplazado2 = datoreemplazado.replace(".", "");
            String dator1 = datoreemplazado2.replace(")", "");
            String dator2 = dator1.replace("(", "-");
            if (dator2.contains(",00")) {
                String datoreemplazado3 = dator2.replace(",00", "");
                datof = datoreemplazado3;
            } else {
                String datoreemplazado3 = dator2.replace(",", ".");
                datof = datoreemplazado3;
            }
            txtvalor.setText(datof);
        }
    }//GEN-LAST:event_txtvalorFocusGained

    private void txtvalorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvalorFocusLost
        if (!txtvalor.getText().equals("")) {
            double d = Double.parseDouble(txtvalor.getText());
            NumberFormat formatomoneda = NumberFormat.getCurrencyInstance();
            txtvalor.setText(formatomoneda.format(d));
        }
    }//GEN-LAST:event_txtvalorFocusLost

    private void txtvalorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
            evt.consume();
        }
        if (c == '.' && txtvalor.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtvalorKeyTyped

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        validar_campos("modificar");
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jtdocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtdocumentosMouseClicked
        gestion_documentos(evt);
    }//GEN-LAST:event_jtdocumentosMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar_documento_factura();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnbuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarAActionPerformed
        CA.buscar_documento(txtubA, "ALL");
    }//GEN-LAST:event_btnbuscarAActionPerformed

    private void jtabedpaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtabedpaneStateChanged
        if (jtabedpane.getTitleAt(jtabedpane.getSelectedIndex()).equals("Documentos")) {
            LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
            Nuevo_T_Documento.setVisible(false);
            btnactualizar.setVisible(false);
            btncancelar.setVisible(false);
        }
    }//GEN-LAST:event_jtabedpaneStateChanged

    private void btnctdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctdocActionPerformed
        Nuevo_T_Documento.setLocation(10, 90);
        Nuevo_T_Documento.setVisible(true);
    }//GEN-LAST:event_btnctdocActionPerformed

    private void btncancelartdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelartdActionPerformed
        Nuevo_T_Documento.setVisible(false);
    }//GEN-LAST:event_btncancelartdActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btncancelar.setVisible(false);
        cmbtipodoc.setSelectedIndex(0);
        btncargar.setVisible(true);
        btnactualizar.setVisible(false);
        txtubA.setText("");
        LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btncreartdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreartdActionPerformed
        crear_tipo_documento();
    }//GEN-LAST:event_btncreartdActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        validar_campos("crear documento");
    }//GEN-LAST:event_btncargarActionPerformed

    public void accion(String accion) {
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        String no_factura, moneda, fecha_generada, fecha_venc, no_radicado, ruta_origen, proveedor, empresa, no_cuenta;
        int id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa;
        double valor;
        if (txtpref.getText().isEmpty()) {
            no_factura = txtnf.getText();
        } else {
            no_factura = txtpref.getText() + '-' + txtnf.getText();
        }
        String datof;
        String datot = txtvalor.getText();
        String datoreemplazado = datot.replace("$", "");
        String datoreemplazado2 = datoreemplazado.replace(".", "");
        String dator1 = datoreemplazado2.replace(")", "");
        String dator2 = dator1.replace("(", "-");
        if (dator2.contains(",00")) {
            String datoreemplazado3 = dator2.replace(",00", "");
            datof = datoreemplazado3;
        } else {
            String datoreemplazado3 = dator2.replace(",", ".");
            datof = datoreemplazado3;
        }
        valor = Double.parseDouble(datof);
        moneda = cmbmoneda.getSelectedItem().toString();
        fecha_generada = formatoDeFecha.format(jdcfechaf.getDate());
        if (jdcfechav.getDate() == null) {
            fecha_venc = "";
        } else {
            fecha_venc = formatoDeFecha.format(jdcfechav.getDate());
        }
        no_radicado = txtccorresp.getText();
        id_proveedor = PC.id_proveedor(cmbproveedor.getSelectedItem().toString());
        id_tipo_factura = TFC.id_tipo_factura(cmbtfactura.getSelectedItem().toString());
        id_gestion = AC.id_area(cmbarea.getSelectedItem().toString());
        id_area = AC.id_area(cmbarea.getSelectedItem().toString());
        id_empresa = EMPC.id_empresa(cmbempresa.getSelectedItem().toString());
        ruta_origen = txtruta.getText();
        proveedor = cmbproveedor.getSelectedItem().toString();
        empresa = cmbempresa.getSelectedItem().toString();
        no_cuenta = cmbconvenio.getSelectedItem().toString();
        switch (accion) {
            case "crear":
                if (FC.crear_factura(0, id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa, no_factura, moneda, fecha_generada,
                        fecha_venc, no_radicado, valor)) {
                    MD.Cargar_Documento(no_factura, cmbproveedor.getSelectedItem().toString(), cmbempresa.getSelectedItem().toString(), "Factura",
                            ruta_origen, 1, "", id_proveedor, id_empresa);
                    if (!txtanexo.getText().isEmpty()) {
                        MD.Cargar_Documento(no_factura, cmbproveedor.getSelectedItem().toString(), cmbempresa.getSelectedItem().toString(),
                                "Anexo Recibido con la Factura", ruta_origen, 2, "", id_proveedor, id_empresa);
                    }
                    int id_fact = FC.id_factura(no_factura, id_proveedor, id_empresa);
                    ApC.crear_aprobacion(id_fact, id_area);
                    if (cmbconvenio.isVisible()) {
                        FCC.crear_factura_convenio(FC.id_factura(no_factura, id_proveedor, id_empresa), CCon.id_convenio(no_cuenta, id_proveedor,
                                id_empresa));
                    }
                    int id_usuario = UC.id_usuario(Principal.lbluser.getText());
                    LC.crear_log(id_usuario, id_fact, 0, 6);
                    TC.crear_tiempo(id_usuario, id_fact, 6, 14);
                    TC.crear_tiempo(id_usuario, id_fact, 14, 8);
                    CorC.crear_correo(id_fact, UC.correos(id_area, 0), "Asignacion de Factura",
                            EC.plantilla_correo("Factura Nueva", no_factura, empresa, "0", no_radicado, proveedor, datot, "01/12/2019", fecha_generada,
                                    fecha_venc, "Administrador", ""));
                    NS.notificaciones("Factura Creada", "La factura " + no_factura + " ha sido creada con exito.", "correcto");
                    int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Desea Cargar otra factura?", "Crear Factura",
                            JOptionPane.YES_NO_OPTION);
                    if (opc == 0) {
                        limpiar();
                        txtnf.requestFocus();
                    } else {
                        this.doDefaultCloseAction();
                    }
                    Principal.btnactualizar.doClick();
                } else {
                    NS.notificaciones("Factura no Creada", "La factura " + no_factura + " ya existe.", "error");
                }
                break;
            case "modificar":
                int id;
                int id_factura = Integer.parseInt(lblid.getText());
                id = Integer.parseInt(lblid.getText());
                if (FC.modificar_factura(id, id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa, no_factura, moneda, fecha_generada,
                        fecha_venc, no_radicado, valor)) {
                    MD.modificar_documento(no_factura, proveedor, empresa, txtruta.getText(), id_factura, id_proveedor, id_empresa);
                    NS.notificaciones("Modificación de Factura", "La factura " + no_factura + " ha sido modificada con exito.", "correcto");
                    Principal.btnactualizar.doClick();
                    this.doDefaultCloseAction();
                } else {
                    NS.notificaciones("Modificación de Factura", "La factura " + no_factura + " no ha poido ser modificada.", "error");
                }
                break;
            case "crear documento":
                String documento = cmbtipodoc.getSelectedItem().toString();
                String ruta = txtubA.getText();
                MD.Cargar_Documento(no_factura, cmbproveedor.getSelectedItem().toString(), cmbempresa.getSelectedItem().toString(),
                        documento, ruta, TDC.id_tipo_doc(documento), "", id_proveedor, id_empresa);
                cmbtipodoc.setSelectedIndex(0);
                btncargar.setVisible(true);
                btnactualizar.setVisible(false);
                txtubA.setText("");
                LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
                break;
            default:
                break;
        }
    }

    public void llenar_campos(String no_factura, String proveedor, String empresa) {
        Factura F = FC.buscar(no_factura, proveedor, empresa);
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        limpiar();
        if (F != null) {
            try {
                cmbproveedor.setSelectedIndex(F.getId_proveedor());
                txtpref.setText(CA.no_factura_pref(F.getNo_factura(), no_factura, proveedor, empresa));
                txtnf.setText(CA.no_factura_nf(F.getNo_factura(), no_factura, proveedor, empresa));
                NumberFormat formatomoneda = NumberFormat.getCurrencyInstance();
                txtvalor.setText(formatomoneda.format(F.getValor()));
                cmbmoneda.setSelectedItem(F.getMoneda());
                cmbempresa.setSelectedIndex(F.getId_empresa());
                txtccorresp.setText(F.getNo_radicado());
                if (F.getConvenio().equals("")) {
                    cmbconvenio.setSelectedIndex(0);
                } else {
                    cmbconvenio.setSelectedItem(F.getConvenio());
                }
                if (F.getId_area() == 8) {
                    cmbarea.setSelectedItem("Tecnología");
                } else {
                    cmbarea.setSelectedIndex(F.getId_area());
                }
                Date fecha = formatoDeFecha.parse(F.getFecha_recepcion());
                jdcfechar.setDate(fecha);
                Date fecha2 = formatoDeFecha.parse(F.getFecha_generada());
                jdcfechaf.setDate(fecha2);
                if (F.getFecha_venc().equals("")) {
                    jdcfechav.setDate(null);
                } else {
                    Date fecha3 = formatoDeFecha.parse(F.getFecha_venc());
                    jdcfechav.setDate(fecha3);
                }
                cmbtfactura.setSelectedIndex(F.getId_tipo_factura() - 3);
                btncrear.setVisible(false);
                btnlimpiar.setVisible(false);
                btnmodificar.setVisible(true);
                txtruta.setText(F.getUbicacion());
                lblid.setText(String.valueOf(F.getId()));
                LT.Seguimiento(jtseguimiento, Integer.parseInt(lblid.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(Grabar_Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void validar_campos(String proceso) {
        if (cmbconvenio.isVisible() == true) {
            if ((txtnf.getText().equals("") || txtnf.getText().equals("0")) || txtruta.getText().equals("") || txtvalor.getText().equals("")
                    || cmbempresa.getSelectedIndex() == 0 || cmbarea.getSelectedIndex() == 0 || cmbmoneda.getSelectedIndex() == 0
                    || cmbproveedor.getSelectedIndex() == 0 || cmbtfactura.getSelectedIndex() == 0 || jdcfechaf.getDate() == null
                    || jdcfechar.getDate() == null || cmbconvenio.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(Principal.Escritorio,
                        "<html><div style='font-size: 14px;'>Los campos con"
                        + "<Strong style='color: #CC0033; font-size: 20px;'> * </Strong> son obligatorios</div></html>",
                        "Campos Obligatorios",
                        JOptionPane.ERROR_MESSAGE);
                campos_vacios();
            } else if (jcbanexo.isSelected() && txtanexo.getText().isEmpty()) {
                campos_vacios();
                JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar el anexo de la factura", "Anexo de la Factura",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                accion(proceso);
            }
            if (cmbconvenio.getSelectedIndex() == 0) {
                CA.Borde_Componente(cmbconvenio, "rojo");
            } else {
                CA.Borde_Componente(cmbconvenio, "");
            }
        } else {
            if ((txtnf.getText().equals("") || txtnf.getText().equals("0")) || txtruta.getText().equals("") || txtvalor.getText().equals("")
                    || cmbempresa.getSelectedIndex() == 0 || cmbarea.getSelectedIndex() == 0 || cmbmoneda.getSelectedIndex() == 0
                    || cmbproveedor.getSelectedIndex() == 0 || cmbtfactura.getSelectedIndex() == 0 || jdcfechaf.getDate() == null
                    || jdcfechar.getDate() == null) {
                campos_vacios();
                JOptionPane.showMessageDialog(Principal.Escritorio, "<html><div style='font-size: 14px;'>Los campos con"
                        + "<Strong style='color: #CC0033; font-size: 22px;'> * </Strong> son obligatorios</div></html>",
                        "Campos Obligatorios", JOptionPane.ERROR_MESSAGE);
            } else if (jcbanexo.isSelected() && txtanexo.getText().isEmpty()) {
                campos_vacios();
                JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar el anexo de la factura", "Anexo de la Factura",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                accion(proceso);
            }
        }
    }

    public void campos_vacios() {
        if (txtnf.getText().isEmpty()) {
            CA.Borde_Componente(txtnf, "rojo");
            CA.Borde_Componente(txtpref, "rojo");
        } else {
            CA.Borde_Componente(txtnf, "");
            CA.Borde_Componente(txtpref, "");
        }
        if (txtruta.getText().isEmpty()) {
            CA.Borde_Componente(txtruta, "rojo");
        } else {
            CA.Borde_Componente(txtruta, "");
        }
        if (txtvalor.getText().isEmpty()) {
            CA.Borde_Componente(txtvalor, "rojo");
        } else {
            CA.Borde_Componente(txtvalor, "");
        }
        if (cmbempresa.getSelectedIndex() == 0) {
            CA.Borde_Componente(cmbempresa, "rojo");
        } else {
            CA.Borde_Componente(cmbempresa, "");
        }
        if (cmbarea.getSelectedIndex() == 0) {
            CA.Borde_Componente(cmbarea, "rojo");
        } else {
            CA.Borde_Componente(cmbarea, "");
        }
        if (cmbproveedor.getSelectedIndex() == 0) {
            CA.Borde_Componente(cmbproveedor, "rojo");
        } else {
            CA.Borde_Componente(cmbproveedor, "");
        }
        if (cmbtfactura.getSelectedIndex() == 0) {
            CA.Borde_Componente(cmbtfactura, "rojo");
        } else {
            CA.Borde_Componente(cmbtfactura, "");
        }
        if (jdcfechaf.getDate() == null) {
            CA.Borde_Componente(jdcfechaf, "rojo");
        } else {
            CA.Borde_Componente(jdcfechaf, "");
        }
        if (jdcfechar.getDate() == null) {
            CA.Borde_Componente(jdcfechar, "rojo");
        } else {
            CA.Borde_Componente(jdcfechar, "");
        }
        if (jcbanexo.isSelected() && txtanexo.getText().isEmpty()) {
            CA.Borde_Componente(txtanexo, "rojo");
        } else {
            CA.Borde_Componente(txtanexo, "");
        }
    }

    public void limpiar() {
        txtanexo.setText("");
        txtccorresp.setText("");
        txtpref.setText("");
        txtnf.setText("");
        txtnit.setText("");
        txtruta.setText("");
        txtvalor.setText("");
        cmbempresa.setSelectedIndex(0);
        cmbarea.setSelectedIndex(0);
        cmbmoneda.setSelectedIndex(1);
        cmbproveedor.setSelectedIndex(0);
        cmbtfactura.setSelectedIndex(0);
        cmbconvenio.setSelectedIndex(0);
        jdcfechaf.setDate(null);
        jdcfechar.setDate(new Date());
        jdcfechav.setDate(null);
        jcbanexo.setSelected(false);
        btnanexo.setEnabled(false);

        CA.Borde_Componente(txtanexo, "");
        CA.Borde_Componente(txtccorresp, "");
        CA.Borde_Componente(txtpref, "");
        CA.Borde_Componente(txtnf, "");
        CA.Borde_Componente(txtnit, "");
        CA.Borde_Componente(txtruta, "");
        CA.Borde_Componente(txtvalor, "");
        CA.Borde_Componente(cmbempresa, "");
        CA.Borde_Componente(cmbarea, "");
        CA.Borde_Componente(cmbmoneda, "");
        CA.Borde_Componente(cmbproveedor, "");
        CA.Borde_Componente(cmbtfactura, "");
        CA.Borde_Componente(jdcfechaf, "");
        CA.Borde_Componente(jdcfechar, "");
        CA.Borde_Componente(jdcfechav, "");
        CA.Borde_Componente(jcbanexo, "");
        CA.Borde_Componente(cmbconvenio, "");
    }

    public void render() {
        cmbproveedor.removeAllItems();
        cmbproveedor.addItem("--Seleccione--");
        R.razon_social(cmbproveedor);
        cmbproveedor.setSelectedIndex(0);

        cmbempresa.removeAllItems();
        cmbempresa.addItem("--Seleccione--");
        R.empresa(cmbempresa);
        cmbempresa.setSelectedIndex(0);

        cmbarea.removeAllItems();
        cmbarea.addItem("--Seleccione--");
        R.areas_creacion_factura(cmbarea);
        cmbarea.setSelectedIndex(0);

        cmbtfactura.removeAllItems();
        cmbtfactura.addItem("--Seleccione--");
        R.tipo_factura(cmbtfactura);
        cmbtfactura.setSelectedIndex(0);

        cmbtfactura.removeAllItems();
        cmbtfactura.addItem("--Seleccione--");
        R.tipo_factura(cmbtfactura);
        cmbtfactura.setSelectedIndex(0);

        cmbtipodoc.removeAllItems();
        cmbtipodoc.addItem("--Seleccione--");
        R.tipo_documento(cmbtipodoc);
        cmbtipodoc.setSelectedIndex(0);

        cmbconvenio.setVisible(false);
        lblconvenio.setVisible(false);
        lblrequerido9.setVisible(false);

        jdcfechar.setDate(new Date());
        jdcfechar.setMaxSelectableDate(new Date());
        jdcfechaf.setMaxSelectableDate(jdcfechar.getDate());
        jdcfechav.setMinSelectableDate(new Date());
        cmbmoneda.setSelectedIndex(1);
        lblid.setVisible(false);

        AutoCompleteDecorator.decorate(cmbarea);
        AutoCompleteDecorator.decorate(cmbproveedor);
        AutoCompleteDecorator.decorate(cmbempresa);
        AutoCompleteDecorator.decorate(cmbtfactura);

        R.cmbcentrado(cmbarea);
        R.cmbcentrado(cmbproveedor);
        R.cmbcentrado(cmbempresa);
        R.cmbcentrado(cmbtfactura);
        R.cmbcentrado(cmbmoneda);
        R.cmbcentrado(cmbconvenio);
        R.jdccentrado(jdcfechaf);
        R.jdccentrado(jdcfechar);
        R.jdccentrado(jdcfechav);

        cmbproveedor.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                datos_proveedor();
                buscar_convenios();
            }
        });
        cmbempresa.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                buscar_convenios();
            }
        });
        cmbtipodoc.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (!btnactualizar.isVisible()) {
                    String documento = cmbtipodoc.getSelectedItem().toString();
                    if (DC.existe_documento(documento, Integer.parseInt(lblid.getText()))) {
                        cmbtipodoc.setSelectedIndex(0);
                        cmbtipodoc.requestFocus();
                        btnbuscarA.setEnabled(false);
                        btncargar.setEnabled(false);
                        txtubA.setEnabled(false);
                        JOptionPane.showMessageDialog(Principal.Escritorio, "El documento seleccionado ya se encuentra cargado",
                                "Error al cargar el documento", JOptionPane.ERROR_MESSAGE);
                    } else if (cmbtipodoc.getSelectedItem().toString().equals("---")) {
                        btnbuscarA.setEnabled(false);
                        btncargar.setEnabled(false);
                        txtubA.setEnabled(false);
                    } else {
                        btnbuscarA.setEnabled(true);
                        btncargar.setEnabled(true);
                        txtubA.setEnabled(true);
                    }
                }
            }
        });
    }

    public void datos_proveedor() {
        cmbempresa.setSelectedIndex(0);
        String rs = cmbproveedor.getSelectedItem().toString();
        if (!PC.area_proveedor(rs).equals("")) {
            cmbarea.setSelectedItem(PC.area_proveedor(rs));
        } else {
            cmbarea.setSelectedItem("--Seleccione--");
        }
        if (!PC.tipo_factura_proveedor(rs).equals("")) {
            cmbtfactura.setSelectedItem(PC.tipo_factura_proveedor(rs));
        } else {
            cmbtfactura.setSelectedItem("--Seleccione--");
        }
        txtnit.setText(PC.nit_proveedor(rs));
    }

    public void buscar_convenios() {
        String empresa, proveedor;
        if (cmbempresa.getSelectedItem().toString().equals("--Seleccione--")) {
            empresa = "";
        } else {
            empresa = cmbempresa.getSelectedItem().toString();
        }
        if (cmbproveedor.getSelectedItem().toString().equals("--Seleccione--")) {
            proveedor = "";
        } else {
            proveedor = cmbproveedor.getSelectedItem().toString();
        }

        cmbconvenio.removeAllItems();
        cmbconvenio.addItem("--Seleccione--");
        R.convenios(cmbconvenio, proveedor, empresa);

        if (cmbproveedor.getSelectedIndex() != 0 && cmbempresa.getSelectedIndex() != 0 && cmbconvenio.getItemCount() > 1) {
            cmbconvenio.setVisible(true);
            lblconvenio.setVisible(true);
            lblrequerido9.setVisible(true);
        } else {
            cmbconvenio.setVisible(false);
            lblconvenio.setVisible(false);
            lblrequerido9.setVisible(false);
        }
    }

    public void gestion_documentos(java.awt.event.MouseEvent evt) {
        int column = jtdocumentos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtdocumentos.getRowHeight();
        if (row < jtdocumentos.getRowCount() && row >= 0 && column < jtdocumentos.getColumnCount() && column >= 0) {
            Object value = jtdocumentos.getValueAt(row, column);
            String columnadoc = jtdocumentos.getValueAt(row, 0).toString();
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                switch (boton.getName()) {
                    case "ver":
                        DC.ver_documento(columnadoc, Integer.parseInt(lblid.getText()));
                        break;
                    case "borrar":
                        int id_tipo_doc = TDC.id_tipo_doc(columnadoc);
                        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea eliminar el documento?",
                                "Eliminar " + jtdocumentos.getValueAt(row, 0).toString(), JOptionPane.YES_NO_OPTION);
                        if (opc == 0) {
                            MD.eliminar_documento(DC.ubicacion_documento(columnadoc, Integer.parseInt(lblid.getText())));
                            DC.eliminar_documento(id_tipo_doc, Integer.parseInt(lblid.getText()));
                        }
                        LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
                        break;
                    case "editar":
                        btncancelar.setVisible(true);
                        btncargar.setVisible(false);
                        btnactualizar.setVisible(true);
                        btnactualizar.setLocation(btncargar.getX(), btnactualizar.getY());
                        btnbuscarA.setEnabled(true);
                        txtubA.setEnabled(true);
                        cmbtipodoc.setSelectedItem(jtdocumentos.getValueAt(row, 0).toString());
                }
            }
        }
    }

    public void actualizar_documento_factura() {
        String columnadoc = jtdocumentos.getValueAt(jtdocumentos.getSelectedRow(), 0).toString();
        int id_tipo_doc = TDC.id_tipo_doc(columnadoc);
        String ruta_ant = DC.ubicacion_documento(columnadoc, Integer.parseInt(lblid.getText()));
        String ruta_nueva = txtubA.getText();
        if (!ruta_nueva.isEmpty()) {
            MD.actualizar_documento(ruta_nueva, ruta_ant, columnadoc, id_tipo_doc, Integer.parseInt(lblid.getText()));
            cmbtipodoc.setSelectedIndex(0);
            btncargar.setVisible(true);
            btnactualizar.setVisible(false);
            btncancelar.setVisible(false);
            txtubA.setText("");
            LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor seleccionar el nuevo documento " + columnadoc + ".");
        }
    }

    public void crear_tipo_documento() {
        if (TDC.crear_tipo_documento(txtnombretd.getText(), txtnpreftd.getText())) {
            Nuevo_T_Documento.setVisible(false);
            cmbtipodoc.removeAllItems();
            cmbtipodoc.addItem("--Seleccione--");
            R.tipo_documento(cmbtipodoc);
            cmbtipodoc.setSelectedIndex(0);
            NS.notificaciones("Creación Tipo Documento", "El tipo de documento ha sido creado con exito.", "correcto");
        } else {
            NS.notificaciones("Creación Tipo Documento", "El tipo de documento no ha sido creado.", "error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Nuevo_T_Documento;
    private javax.swing.JButton btnactualizar;
    public static javax.swing.JButton btnanexo;
    public javax.swing.JButton btnbuscarA;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncancelartd;
    private javax.swing.JButton btncargar;
    public static javax.swing.JButton btncrear;
    private javax.swing.JButton btncreartd;
    private javax.swing.JButton btnctdoc;
    public static javax.swing.JButton btnfile;
    public static javax.swing.JButton btnlimpiar;
    public static javax.swing.JButton btnmodificar;
    public static javax.swing.JComboBox<String> cmbarea;
    public static javax.swing.JComboBox<String> cmbconvenio;
    public static javax.swing.JComboBox<String> cmbempresa;
    public static javax.swing.JComboBox<String> cmbmoneda;
    public static javax.swing.JComboBox<String> cmbproveedor;
    public static javax.swing.JComboBox<String> cmbtfactura;
    private javax.swing.JComboBox<String> cmbtipodoc;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JCheckBox jcbanexo;
    public static com.toedter.calendar.JDateChooser jdcfechaf;
    public static com.toedter.calendar.JDateChooser jdcfechar;
    public static com.toedter.calendar.JDateChooser jdcfechav;
    private javax.swing.JPanel jpdocs;
    public static javax.swing.JPanel jpgf;
    private javax.swing.JPanel jpseguimiento;
    private javax.swing.JScrollPane jsseguimiento;
    public static javax.swing.JTabbedPane jtabedpane;
    private javax.swing.JTable jtdocumentos;
    public static javax.swing.JTable jtseguimiento;
    private javax.swing.JLabel lblAsignar;
    private javax.swing.JLabel lblNfactura;
    private javax.swing.JLabel lblconvenio;
    public static javax.swing.JLabel lbldocfactura;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblgenerada;
    public static javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmoneda;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblproveedor;
    private javax.swing.JLabel lblradicado;
    private javax.swing.JLabel lblrecibida;
    private javax.swing.JLabel lblrequerido1;
    public static javax.swing.JLabel lblrequerido10;
    private javax.swing.JLabel lblrequerido2;
    private javax.swing.JLabel lblrequerido3;
    private javax.swing.JLabel lblrequerido4;
    private javax.swing.JLabel lblrequerido5;
    private javax.swing.JLabel lblrequerido6;
    private javax.swing.JLabel lblrequerido7;
    private javax.swing.JLabel lblrequerido8;
    private javax.swing.JLabel lblrequerido9;
    private javax.swing.JLabel lbltipofact;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JLabel lblvence;
    public static javax.swing.JPanel panelcf;
    public static javax.swing.JTextField txtanexo;
    public static javax.swing.JTextField txtccorresp;
    public static javax.swing.JTextField txtnf;
    public static javax.swing.JTextField txtnit;
    public javax.swing.JTextField txtnombretd;
    public javax.swing.JTextField txtnpreftd;
    public static javax.swing.JTextField txtpref;
    public static javax.swing.JTextField txtruta;
    public javax.swing.JTextField txtubA;
    public static javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
