package Modulos;

import Clases.*;
import Controladores.*;
import Objetos.*;
import Principal.Principal;
import java.awt.event.ItemEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class Gestionar_Factura extends javax.swing.JInternalFrame {

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
    Anticipo_Factura_Controller AntfC = new Anticipo_Factura_Controller();
    Anticipo_Controller AntC = new Anticipo_Controller();
    suno_controller suno = new suno_controller();
    Revision_Controller RC = new Revision_Controller();
    Programacion_Controller ProgC = new Programacion_Controller();

    public Gestionar_Factura() {
        initComponents();
        render();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGgestion = new javax.swing.ButtonGroup();
        jcbanticipos = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        btnrechazar = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblempresa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblnfact = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblfechafact = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblfecharec = new javax.swing.JLabel();
        lblnit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblfechavenc = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblcorresp = new javax.swing.JLabel();
        lblproveedor = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblmoneda = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblncuenta = new javax.swing.JLabel();
        Tabpane = new javax.swing.JTabbedPane();
        panelgestion = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacomentario = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnfact = new javax.swing.JButton();
        jcbantMav = new javax.swing.JCheckBox();
        jcbanticipo = new javax.swing.JCheckBox();
        jcbantmv = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cmbdocCOMP = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtdocCOMP = new javax.swing.JTextField();
        btnokcomp = new javax.swing.JButton();
        btnvercomp = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtdocscompras = new javax.swing.JTable();
        btnaprobar1 = new javax.swing.JButton();
        btnlimpiarjcbs = new javax.swing.JButton();
        panelcontabilidad = new javax.swing.JPanel();
        btnRefrescar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnuptSC = new javax.swing.JButton();
        btnSC = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnDQ = new javax.swing.JButton();
        btnuptDQ = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnNP = new javax.swing.JButton();
        btnuptNP = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnNI = new javax.swing.JButton();
        btnuptNI = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnANT = new javax.swing.JButton();
        btnSU = new javax.swing.JButton();
        btnuptSU = new javax.swing.JButton();
        btndelAnt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tacomentario1 = new javax.swing.JTextArea();
        cmbRcont = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jpant = new javax.swing.JPanel();
        btnantupt = new javax.swing.JButton();
        jsant_pre = new javax.swing.JScrollPane();
        jtantprov = new javax.swing.JTable();
        lblnodata = new javax.swing.JLabel();
        paneltesoreria = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tacomentario2 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jrbOpc1 = new javax.swing.JRadioButton();
        jdcprogramar = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jrbOpc2 = new javax.swing.JRadioButton();
        btnarchivo = new javax.swing.JButton();
        txtcomprobante = new javax.swing.JTextField();
        btneliminarcp = new javax.swing.JButton();
        btnvercp = new javax.swing.JButton();
        btnmodificarcp = new javax.swing.JButton();
        btncancelarcp = new javax.swing.JButton();
        btncargarcp = new javax.swing.JButton();
        btnaceptarcp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbdocte = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtdocte = new javax.swing.JTextField();
        btnokte = new javax.swing.JButton();
        btnverte = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtdocsT = new javax.swing.JTable();
        panelrevision = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnSCdoc = new javax.swing.JButton();
        btnDQdoc = new javax.swing.JButton();
        btnNIdoc = new javax.swing.JButton();
        btnIMdoc = new javax.swing.JButton();
        btnNPdoc = new javax.swing.JButton();
        btnordencompra = new javax.swing.JButton();
        btnordenservicio = new javax.swing.JButton();
        btnrecepservicio = new javax.swing.JButton();
        btnrecepcompra = new javax.swing.JButton();
        btnSUdoc = new javax.swing.JButton();
        btnfactura = new javax.swing.JButton();
        btnTVdoc = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtdocumentos2 = new javax.swing.JTable();
        lblcoment3 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tacomentario3 = new javax.swing.JTextArea();
        jpdocs = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtdocumentos = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cmbtipodoc = new javax.swing.JComboBox<>();
        btnbuscarA = new javax.swing.JButton();
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
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jpseguimiento = new javax.swing.JPanel();
        jsseguimiento = new javax.swing.JScrollPane();
        jtseguimiento = new javax.swing.JTable();
        lblapr = new javax.swing.JLabel();
        btnaprobar = new javax.swing.JButton();
        jcbeliminar = new javax.swing.JCheckBox();
        btneliminar = new javax.swing.JButton();
        lblnombreu = new javax.swing.JLabel();
        lblant = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Gestion de la Factura");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(930, 450));
        setMinimumSize(new java.awt.Dimension(930, 450));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(930, 450));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(234, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel6.setLayout(null);

        btnrechazar.setBackground(new java.awt.Color(255, 198, 198));
        btnrechazar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnrechazar.setForeground(new java.awt.Color(153, 0, 0));
        btnrechazar.setText("Rechazar");
        btnrechazar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrechazar.setFocusPainted(false);
        btnrechazar.setRequestFocusEnabled(false);
        jPanel6.add(btnrechazar);
        btnrechazar.setBounds(20, 480, 83, 26);

        btnok.setBackground(new java.awt.Color(224, 240, 177));
        btnok.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnok.setForeground(new java.awt.Color(37, 112, 0));
        btnok.setText("Enviar a Contabilidad");
        btnok.setToolTipText("");
        btnok.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnok.setFocusPainted(false);
        btnok.setPreferredSize(new java.awt.Dimension(162, 26));
        btnok.setRequestFocusEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel6.add(btnok);
        btnok.setBounds(720, 480, 180, 26);

        jPanel1.setBackground(new java.awt.Color(255, 217, 142));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Información Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel1.setLayout(null);

        lblempresa.setBackground(new java.awt.Color(255, 255, 255));
        lblempresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblempresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblempresa.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblempresa.setOpaque(true);
        lblempresa.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblempresa);
        lblempresa.setBounds(285, 70, 80, 26);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Empresa:");
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(215, 70, 66, 26);

        lblvalor.setBackground(new java.awt.Color(255, 255, 255));
        lblvalor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblvalor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvalor.setAlignmentX(0.5F);
        lblvalor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblvalor.setOpaque(true);
        lblvalor.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblvalor);
        lblvalor.setBounds(325, 110, 125, 26);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 110, 41, 26);

        lblnfact.setBackground(new java.awt.Color(255, 255, 255));
        lblnfact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblnfact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnfact.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblnfact.setOpaque(true);
        lblnfact.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblnfact);
        lblnfact.setBounds(110, 110, 160, 26);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("No. Factura:");
        jLabel1.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 110, 85, 26);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proveedor:");
        jLabel2.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 30, 80, 26);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Generada:");
        jLabel3.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 70, 80, 26);

        lblfechafact.setBackground(new java.awt.Color(255, 255, 255));
        lblfechafact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblfechafact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfechafact.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblfechafact.setOpaque(true);
        lblfechafact.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfechafact);
        lblfechafact.setBounds(635, 70, 90, 26);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Recebida:");
        jLabel4.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(371, 70, 80, 26);

        lblfecharec.setBackground(new java.awt.Color(255, 255, 255));
        lblfecharec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblfecharec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecharec.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblfecharec.setOpaque(true);
        lblfecharec.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfecharec);
        lblfecharec.setBounds(455, 70, 90, 26);

        lblnit.setBackground(new java.awt.Color(255, 255, 255));
        lblnit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnit.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblnit.setOpaque(true);
        lblnit.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblnit);
        lblnit.setBounds(55, 70, 150, 26);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nit:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 70, 25, 26);

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Vence:");
        jLabel13.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(730, 70, 54, 26);

        lblfechavenc.setBackground(new java.awt.Color(255, 255, 255));
        lblfechavenc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblfechavenc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfechavenc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblfechavenc.setOpaque(true);
        lblfechavenc.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfechavenc);
        lblfechavenc.setBounds(790, 70, 90, 26);

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Radicado:");
        jLabel14.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(715, 110, 71, 26);

        lblcorresp.setBackground(new java.awt.Color(255, 255, 255));
        lblcorresp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcorresp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcorresp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblcorresp.setOpaque(true);
        lblcorresp.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblcorresp);
        lblcorresp.setBounds(790, 110, 90, 26);

        lblproveedor.setBackground(new java.awt.Color(255, 255, 255));
        lblproveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblproveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblproveedor.setOpaque(true);
        lblproveedor.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblproveedor);
        lblproveedor.setBounds(100, 30, 780, 26);

        lblid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblid.setOpaque(true);
        jPanel1.add(lblid);
        lblid.setBounds(820, 30, 52, 20);

        lblmoneda.setBackground(new java.awt.Color(255, 255, 255));
        lblmoneda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblmoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoneda.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblmoneda.setOpaque(true);
        lblmoneda.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblmoneda);
        lblmoneda.setBounds(455, 110, 70, 26);

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cuenta:");
        jLabel11.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(535, 110, 60, 26);

        lblncuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblncuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblncuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblncuenta.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        lblncuenta.setOpaque(true);
        lblncuenta.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblncuenta);
        lblncuenta.setBounds(600, 110, 100, 26);

        jPanel6.add(jPanel1);
        jPanel1.setBounds(10, 10, 900, 150);

        Tabpane.setBackground(new java.awt.Color(255, 229, 178));
        Tabpane.setForeground(new java.awt.Color(107, 70, 0));
        Tabpane.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Tabpane.setRequestFocusEnabled(false);
        Tabpane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabpaneStateChanged(evt);
            }
        });

        panelgestion.setBackground(new java.awt.Color(255, 255, 255));
        panelgestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        panelgestion.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Comentario");
        panelgestion.add(jLabel24);
        jLabel24.setBounds(10, 140, 110, 20);

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));

        tacomentario.setColumns(20);
        tacomentario.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tacomentario.setLineWrap(true);
        tacomentario.setRows(3);
        tacomentario.setWrapStyleWord(true);
        tacomentario.setBorder(null);
        tacomentario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tacomentario);

        panelgestion.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 470, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        btnfact.setBackground(new java.awt.Color(224, 240, 177));
        btnfact.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnfact.setForeground(new java.awt.Color(37, 112, 0));
        btnfact.setText("Factura");
        btnfact.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnfact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfact.setFocusPainted(false);
        btnfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactActionPerformed(evt);
            }
        });
        jPanel5.add(btnfact);
        btnfact.setBounds(15, 30, 110, 50);

        panelgestion.add(jPanel5);
        jPanel5.setBounds(20, 20, 140, 100);

        jcbantMav.setBackground(new java.awt.Color(255, 255, 255));
        jcbanticipos.add(jcbantMav);
        jcbantMav.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jcbantMav.setText("Factura con Anticipo de Mayor Valor");
        jcbantMav.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jcbantMav.setBorderPainted(true);
        jcbantMav.setEnabled(false);
        jcbantMav.setRequestFocusEnabled(false);
        panelgestion.add(jcbantMav);
        jcbantMav.setBounds(180, 88, 290, 30);

        jcbanticipo.setBackground(new java.awt.Color(255, 255, 255));
        jcbanticipos.add(jcbanticipo);
        jcbanticipo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jcbanticipo.setText("Factura con Anticipo Total");
        jcbanticipo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jcbanticipo.setBorderPainted(true);
        jcbanticipo.setRequestFocusEnabled(false);
        panelgestion.add(jcbanticipo);
        jcbanticipo.setBounds(180, 30, 290, 30);

        jcbantmv.setBackground(new java.awt.Color(255, 255, 255));
        jcbanticipos.add(jcbantmv);
        jcbantmv.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jcbantmv.setText("Factura con Anticipo de Menor Valor");
        jcbantmv.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jcbantmv.setBorderPainted(true);
        jcbantmv.setRequestFocusEnabled(false);
        panelgestion.add(jcbantmv);
        jcbantmv.setBounds(180, 59, 290, 30);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos Compras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel4.setEnabled(false);
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        cmbdocCOMP.setEditable(true);
        cmbdocCOMP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbdocCOMP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "OC", "OS", "EA", "ES" }));
        cmbdocCOMP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbdocCOMP.setEnabled(false);
        jPanel4.add(cmbdocCOMP);
        cmbdocCOMP.setBounds(20, 30, 60, 26);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("-");
        jLabel31.setEnabled(false);
        jPanel4.add(jLabel31);
        jLabel31.setBounds(80, 30, 20, 26);

        txtdocCOMP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdocCOMP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdocCOMP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtdocCOMP.setEnabled(false);
        jPanel4.add(txtdocCOMP);
        txtdocCOMP.setBounds(100, 30, 60, 26);

        btnokcomp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnokcomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png"))); // NOI18N
        btnokcomp.setBorder(null);
        btnokcomp.setBorderPainted(false);
        btnokcomp.setContentAreaFilled(false);
        btnokcomp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnokcomp.setDefaultCapable(false);
        btnokcomp.setEnabled(false);
        btnokcomp.setFocusPainted(false);
        btnokcomp.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(btnokcomp);
        btnokcomp.setBounds(170, 30, 19, 26);

        btnvercomp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnvercomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png"))); // NOI18N
        btnvercomp.setBorder(null);
        btnvercomp.setBorderPainted(false);
        btnvercomp.setContentAreaFilled(false);
        btnvercomp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvercomp.setDefaultCapable(false);
        btnvercomp.setEnabled(false);
        btnvercomp.setFocusPainted(false);
        btnvercomp.setFocusable(false);
        btnvercomp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvercomp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png"))); // NOI18N
        btnvercomp.setRequestFocusEnabled(false);
        btnvercomp.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(btnvercomp);
        btnvercomp.setBounds(200, 30, 40, 26);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane5.setEnabled(false);

        jtdocscompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtdocscompras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtdocscompras.setEnabled(false);
        jScrollPane5.setViewportView(jtdocscompras);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(10, 60, 350, 160);

        btnaprobar1.setBackground(new java.awt.Color(153, 204, 255));
        btnaprobar1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnaprobar1.setForeground(new java.awt.Color(0, 102, 204));
        btnaprobar1.setText("Limpiar");
        btnaprobar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaprobar1.setEnabled(false);
        btnaprobar1.setFocusPainted(false);
        btnaprobar1.setPreferredSize(new java.awt.Dimension(162, 26));
        jPanel4.add(btnaprobar1);
        btnaprobar1.setBounds(270, 30, 78, 26);

        panelgestion.add(jPanel4);
        jPanel4.setBounds(510, 20, 370, 230);

        btnlimpiarjcbs.setBackground(new java.awt.Color(153, 204, 255));
        btnlimpiarjcbs.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnlimpiarjcbs.setForeground(new java.awt.Color(0, 102, 204));
        btnlimpiarjcbs.setText("Limpiar");
        btnlimpiarjcbs.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnlimpiarjcbs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlimpiarjcbs.setFocusPainted(false);
        btnlimpiarjcbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarjcbsActionPerformed(evt);
            }
        });
        panelgestion.add(btnlimpiarjcbs);
        btnlimpiarjcbs.setBounds(287, 117, 78, 26);

        Tabpane.addTab("Areas", panelgestion);

        panelcontabilidad.setBackground(new java.awt.Color(255, 255, 255));
        panelcontabilidad.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        panelcontabilidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelcontabilidad.setLayout(null);

        btnRefrescar.setBackground(new java.awt.Color(153, 204, 255));
        btnRefrescar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRefrescar.setForeground(new java.awt.Color(0, 102, 204));
        btnRefrescar.setText("Actualizar");
        btnRefrescar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnRefrescar.setFocusPainted(false);
        btnRefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefrescar.setPreferredSize(new java.awt.Dimension(70, 26));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        panelcontabilidad.add(btnRefrescar);
        btnRefrescar.setBounds(325, 20, 88, 26);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Docs. Contabilidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("<html><p align=\"right\">Soporte de<br>Causación</p></html>");
        jLabel6.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(15, 30, 70, 40);

        btnuptSC.setBackground(new java.awt.Color(0, 102, 153));
        btnuptSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnuptSC.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnuptSC.setEnabled(false);
        btnuptSC.setFocusPainted(false);
        btnuptSC.setRequestFocusEnabled(false);
        btnuptSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuptSCActionPerformed(evt);
            }
        });
        jPanel2.add(btnuptSC);
        btnuptSC.setBounds(125, 35, 20, 20);

        btnSC.setBackground(new java.awt.Color(224, 240, 177));
        btnSC.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSC.setForeground(new java.awt.Color(37, 112, 0));
        btnSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnSC.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSC.setEnabled(false);
        btnSC.setFocusPainted(false);
        btnSC.setRequestFocusEnabled(false);
        btnSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCActionPerformed(evt);
            }
        });
        jPanel2.add(btnSC);
        btnSC.setBounds(90, 30, 30, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("<html><p align=\"right\">Documento<br>Equivalente</p></html>");
        jLabel9.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(160, 30, 80, 40);

        btnDQ.setBackground(new java.awt.Color(224, 240, 177));
        btnDQ.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnDQ.setForeground(new java.awt.Color(37, 112, 0));
        btnDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnDQ.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnDQ.setEnabled(false);
        btnDQ.setFocusPainted(false);
        btnDQ.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDQ.setRequestFocusEnabled(false);
        btnDQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDQActionPerformed(evt);
            }
        });
        jPanel2.add(btnDQ);
        btnDQ.setBounds(245, 30, 30, 40);

        btnuptDQ.setBackground(new java.awt.Color(0, 102, 153));
        btnuptDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnuptDQ.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnuptDQ.setEnabled(false);
        btnuptDQ.setFocusPainted(false);
        btnuptDQ.setRequestFocusEnabled(false);
        btnuptDQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuptDQActionPerformed(evt);
            }
        });
        jPanel2.add(btnuptDQ);
        btnuptDQ.setBounds(280, 35, 20, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("<html><p align=\"right\">Nota a<br>Proveedor</p></html>");
        jLabel17.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel17);
        jLabel17.setBounds(320, 30, 70, 40);

        btnNP.setBackground(new java.awt.Color(224, 240, 177));
        btnNP.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNP.setForeground(new java.awt.Color(37, 112, 0));
        btnNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnNP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNP.setEnabled(false);
        btnNP.setFocusPainted(false);
        btnNP.setRequestFocusEnabled(false);
        btnNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNPActionPerformed(evt);
            }
        });
        jPanel2.add(btnNP);
        btnNP.setBounds(395, 30, 30, 40);

        btnuptNP.setBackground(new java.awt.Color(0, 102, 153));
        btnuptNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnuptNP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnuptNP.setEnabled(false);
        btnuptNP.setFocusPainted(false);
        btnuptNP.setRequestFocusEnabled(false);
        btnuptNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuptNPActionPerformed(evt);
            }
        });
        jPanel2.add(btnuptNP);
        btnuptNP.setBounds(430, 35, 20, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("<html><p align=\"right\">Nota<br>Interna</p></html>");
        jLabel16.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel16);
        jLabel16.setBounds(15, 80, 70, 40);

        btnNI.setBackground(new java.awt.Color(224, 240, 177));
        btnNI.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNI.setForeground(new java.awt.Color(37, 112, 0));
        btnNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnNI.setToolTipText("");
        btnNI.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNI.setEnabled(false);
        btnNI.setFocusPainted(false);
        btnNI.setRequestFocusEnabled(false);
        btnNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNIActionPerformed(evt);
            }
        });
        jPanel2.add(btnNI);
        btnNI.setBounds(90, 80, 30, 40);

        btnuptNI.setBackground(new java.awt.Color(0, 102, 153));
        btnuptNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnuptNI.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnuptNI.setEnabled(false);
        btnuptNI.setFocusPainted(false);
        btnuptNI.setRequestFocusEnabled(false);
        btnuptNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuptNIActionPerformed(evt);
            }
        });
        jPanel2.add(btnuptNI);
        btnuptNI.setBounds(125, 85, 20, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("<html><p align=\"right\">Soporte<br>Anticipo</p></html>");
        jLabel10.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(320, 80, 70, 40);

        jLabel18.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("<html><p align=\"right\">Causación<br>Dolares</p></html>");
        jLabel18.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel2.add(jLabel18);
        jLabel18.setBounds(160, 80, 80, 40);

        btnANT.setBackground(new java.awt.Color(224, 240, 177));
        btnANT.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnANT.setForeground(new java.awt.Color(37, 112, 0));
        btnANT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnANT.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnANT.setEnabled(false);
        btnANT.setFocusPainted(false);
        btnANT.setRequestFocusEnabled(false);
        btnANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTActionPerformed(evt);
            }
        });
        jPanel2.add(btnANT);
        btnANT.setBounds(395, 80, 30, 40);

        btnSU.setBackground(new java.awt.Color(224, 240, 177));
        btnSU.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSU.setForeground(new java.awt.Color(37, 112, 0));
        btnSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        btnSU.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSU.setEnabled(false);
        btnSU.setFocusPainted(false);
        btnSU.setRequestFocusEnabled(false);
        btnSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUActionPerformed(evt);
            }
        });
        jPanel2.add(btnSU);
        btnSU.setBounds(245, 80, 30, 40);

        btnuptSU.setBackground(new java.awt.Color(0, 102, 153));
        btnuptSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnuptSU.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnuptSU.setEnabled(false);
        btnuptSU.setFocusPainted(false);
        btnuptSU.setRequestFocusEnabled(false);
        btnuptSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuptSUActionPerformed(evt);
            }
        });
        jPanel2.add(btnuptSU);
        btnuptSU.setBounds(280, 85, 20, 20);

        btndelAnt.setBackground(new java.awt.Color(255, 198, 198));
        btndelAnt.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btndelAnt.setForeground(new java.awt.Color(153, 0, 0));
        btndelAnt.setText("X");
        btndelAnt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btndelAnt.setEnabled(false);
        btndelAnt.setFocusPainted(false);
        btndelAnt.setRequestFocusEnabled(false);
        btndelAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelAntActionPerformed(evt);
            }
        });
        jPanel2.add(btndelAnt);
        btndelAnt.setBounds(430, 85, 20, 20);

        panelcontabilidad.add(jPanel2);
        jPanel2.setBounds(410, 10, 470, 135);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane3.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tacomentario1.setColumns(20);
        tacomentario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tacomentario1.setLineWrap(true);
        tacomentario1.setRows(2);
        tacomentario1.setWrapStyleWord(true);
        tacomentario1.setBorder(null);
        jScrollPane3.setViewportView(tacomentario1);

        panelcontabilidad.add(jScrollPane3);
        jScrollPane3.setBounds(410, 178, 470, 80);

        cmbRcont.setEditable(true);
        cmbRcont.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbRcont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbRcont.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        panelcontabilidad.add(cmbRcont);
        cmbRcont.setBounds(90, 20, 220, 27);

        jLabel23.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Revisa:");
        jLabel23.setPreferredSize(new java.awt.Dimension(74, 26));
        panelcontabilidad.add(jLabel23);
        jLabel23.setBounds(20, 20, 70, 26);

        jLabel30.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Comentario");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelcontabilidad.add(jLabel30);
        jLabel30.setBounds(410, 155, 90, 26);

        jpant.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null), "Anticipos Precargados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jpant.setOpaque(false);
        jpant.setLayout(null);

        btnantupt.setBackground(new java.awt.Color(0, 102, 153));
        btnantupt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnantupt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnantupt.setRequestFocusEnabled(false);
        btnantupt.setVerifyInputWhenFocusTarget(false);
        btnantupt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnantuptActionPerformed(evt);
            }
        });
        jpant.add(btnantupt);
        btnantupt.setBounds(11, 25, 20, 25);

        jsant_pre.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
        jsant_pre.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsant_pre.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtantprov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtantprov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtantprovMouseClicked(evt);
            }
        });
        jsant_pre.setViewportView(jtantprov);
        jtantprov.getAccessibleContext().setAccessibleParent(jpant);

        jpant.add(jsant_pre);
        jsant_pre.setBounds(30, 25, 360, 165);

        lblnodata.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblnodata.setForeground(new java.awt.Color(102, 102, 102));
        lblnodata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnodata.setText("<html><div align=\"center\">No existen Anticipos Precargados para este proveedor</div></html>");
        lblnodata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpant.add(lblnodata);
        lblnodata.setBounds(40, 50, 320, 80);

        panelcontabilidad.add(jpant);
        jpant.setBounds(10, 60, 400, 200);

        Tabpane.addTab("Contabilidad", panelcontabilidad);

        paneltesoreria.setBackground(new java.awt.Color(255, 255, 255));
        paneltesoreria.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        paneltesoreria.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Comentario");
        paneltesoreria.add(jLabel25);
        jLabel25.setBounds(10, 135, 120, 19);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane8.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tacomentario2.setColumns(20);
        tacomentario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tacomentario2.setLineWrap(true);
        tacomentario2.setRows(2);
        tacomentario2.setWrapStyleWord(true);
        tacomentario2.setBorder(null);
        tacomentario2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(tacomentario2);

        paneltesoreria.add(jScrollPane8);
        jScrollPane8.setBounds(10, 160, 580, 100);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Gestion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel15.setOpaque(false);
        jPanel15.setLayout(null);

        BGgestion.add(jrbOpc1);
        jrbOpc1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbOpc1.setText("Programar");
        jrbOpc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrbOpc1.setOpaque(false);
        jrbOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpc1ActionPerformed(evt);
            }
        });
        jPanel15.add(jrbOpc1);
        jrbOpc1.setBounds(20, 25, 110, 26);

        jdcprogramar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jdcprogramar.setDateFormatString("dd/MM/yyyy");
        jdcprogramar.setEnabled(false);
        jdcprogramar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcprogramar.setMaxSelectableDate(new java.util.Date(1577941199000L));
        jdcprogramar.setMinSelectableDate(new java.util.Date(1546318860000L));
        jPanel15.add(jdcprogramar);
        jdcprogramar.setBounds(10, 60, 148, 26);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel15.add(jSeparator3);
        jSeparator3.setBounds(170, 20, 30, 80);

        BGgestion.add(jrbOpc2);
        jrbOpc2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbOpc2.setText("Pagar");
        jrbOpc2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrbOpc2.setOpaque(false);
        jrbOpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpc2ActionPerformed(evt);
            }
        });
        jPanel15.add(jrbOpc2);
        jrbOpc2.setBounds(180, 30, 70, 26);

        btnarchivo.setBackground(new java.awt.Color(255, 229, 178));
        btnarchivo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnarchivo.setForeground(new java.awt.Color(107, 70, 0));
        btnarchivo.setText("Archivo");
        btnarchivo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnarchivo.setEnabled(false);
        btnarchivo.setFocusPainted(false);
        btnarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarchivoActionPerformed(evt);
            }
        });
        jPanel15.add(btnarchivo);
        btnarchivo.setBounds(490, 30, 77, 26);

        txtcomprobante.setEditable(false);
        txtcomprobante.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtcomprobante.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcomprobante.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel15.add(txtcomprobante);
        txtcomprobante.setBounds(250, 30, 241, 26);

        btneliminarcp.setBackground(new java.awt.Color(255, 153, 153));
        btneliminarcp.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btneliminarcp.setForeground(new java.awt.Color(153, 0, 0));
        btneliminarcp.setText("Eliminar");
        btneliminarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btneliminarcp.setEnabled(false);
        btneliminarcp.setFocusPainted(false);
        btneliminarcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarcpActionPerformed(evt);
            }
        });
        jPanel15.add(btneliminarcp);
        btneliminarcp.setBounds(310, 70, 77, 26);

        btnvercp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnvercp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png"))); // NOI18N
        btnvercp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnvercp.setBorderPainted(false);
        btnvercp.setContentAreaFilled(false);
        btnvercp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvercp.setEnabled(false);
        btnvercp.setFocusPainted(false);
        btnvercp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png"))); // NOI18N
        btnvercp.setRequestFocusEnabled(false);
        btnvercp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvercpActionPerformed(evt);
            }
        });
        jPanel15.add(btnvercp);
        btnvercp.setBounds(190, 70, 40, 24);

        btnmodificarcp.setBackground(new java.awt.Color(224, 240, 177));
        btnmodificarcp.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnmodificarcp.setForeground(new java.awt.Color(37, 112, 0));
        btnmodificarcp.setText("Modificar");
        btnmodificarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnmodificarcp.setEnabled(false);
        btnmodificarcp.setFocusPainted(false);
        btnmodificarcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarcpActionPerformed(evt);
            }
        });
        jPanel15.add(btnmodificarcp);
        btnmodificarcp.setBounds(400, 70, 77, 26);

        btncancelarcp.setBackground(new java.awt.Color(255, 153, 153));
        btncancelarcp.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncancelarcp.setForeground(new java.awt.Color(153, 0, 0));
        btncancelarcp.setText("Cancelar");
        btncancelarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelarcp.setFocusPainted(false);
        btncancelarcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarcpActionPerformed(evt);
            }
        });
        jPanel15.add(btncancelarcp);
        btncancelarcp.setBounds(400, 70, 77, 26);

        btncargarcp.setBackground(new java.awt.Color(224, 240, 177));
        btncargarcp.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btncargarcp.setForeground(new java.awt.Color(37, 112, 0));
        btncargarcp.setText("Cargar");
        btncargarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncargarcp.setEnabled(false);
        btncargarcp.setFocusPainted(false);
        btncargarcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarcpActionPerformed(evt);
            }
        });
        jPanel15.add(btncargarcp);
        btncargarcp.setBounds(490, 70, 77, 26);

        btnaceptarcp.setBackground(new java.awt.Color(224, 240, 177));
        btnaceptarcp.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnaceptarcp.setForeground(new java.awt.Color(37, 112, 0));
        btnaceptarcp.setText("Aceptar");
        btnaceptarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaceptarcp.setFocusPainted(false);
        btnaceptarcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarcpActionPerformed(evt);
            }
        });
        jPanel15.add(btnaceptarcp);
        btnaceptarcp.setBounds(490, 70, 77, 26);

        paneltesoreria.add(jPanel15);
        jPanel15.setBounds(10, 10, 580, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        cmbdocte.setEditable(true);
        cmbdocte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbdocte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "TV", "CE" }));
        cmbdocte.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel3.add(cmbdocte);
        cmbdocte.setBounds(30, 30, 60, 26);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("-");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(90, 30, 20, 26);

        txtdocte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdocte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdocte.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtdocte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdocteKeyReleased(evt);
            }
        });
        jPanel3.add(txtdocte);
        txtdocte.setBounds(110, 30, 60, 26);

        btnokte.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnokte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png"))); // NOI18N
        btnokte.setBorder(null);
        btnokte.setBorderPainted(false);
        btnokte.setContentAreaFilled(false);
        btnokte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnokte.setDefaultCapable(false);
        btnokte.setEnabled(false);
        btnokte.setFocusPainted(false);
        btnokte.setVerifyInputWhenFocusTarget(false);
        btnokte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokteActionPerformed(evt);
            }
        });
        jPanel3.add(btnokte);
        btnokte.setBounds(180, 30, 19, 26);

        btnverte.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnverte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png"))); // NOI18N
        btnverte.setBorder(null);
        btnverte.setBorderPainted(false);
        btnverte.setContentAreaFilled(false);
        btnverte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnverte.setDefaultCapable(false);
        btnverte.setEnabled(false);
        btnverte.setFocusPainted(false);
        btnverte.setFocusable(false);
        btnverte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnverte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png"))); // NOI18N
        btnverte.setRequestFocusEnabled(false);
        btnverte.setVerifyInputWhenFocusTarget(false);
        btnverte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverteActionPerformed(evt);
            }
        });
        jPanel3.add(btnverte);
        btnverte.setBounds(210, 30, 40, 26);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtdocsT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtdocsT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtdocsTMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtdocsT);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(12, 62, 250, 175);

        paneltesoreria.add(jPanel3);
        jPanel3.setBounds(600, 10, 280, 250);

        Tabpane.addTab("Tesoreria", paneltesoreria);

        panelrevision.setBackground(new java.awt.Color(255, 255, 255));
        panelrevision.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        panelrevision.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos Cargados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        btnSCdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnSCdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnSCdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnSCdoc.setText("<html><p align=\"center\">Soporte de<br>Causación</p></html>");
        btnSCdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSCdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSCdoc.setEnabled(false);
        btnSCdoc.setFocusPainted(false);
        btnSCdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnSCdoc);
        btnSCdoc.setBounds(270, 85, 120, 46);

        btnDQdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnDQdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnDQdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnDQdoc.setText("<html><p align=\"center\">Documento<br>Equivalente</p></html>");
        btnDQdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnDQdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDQdoc.setEnabled(false);
        btnDQdoc.setFocusPainted(false);
        btnDQdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDQdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnDQdoc);
        btnDQdoc.setBounds(10, 140, 120, 46);

        btnNIdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnNIdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnNIdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnNIdoc.setText("<html><p align=\"center\">Nota<br>Interna</p></html>");
        btnNIdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNIdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNIdoc.setEnabled(false);
        btnNIdoc.setFocusPainted(false);
        btnNIdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNIdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnNIdoc);
        btnNIdoc.setBounds(10, 195, 120, 46);

        btnIMdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnIMdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnIMdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnIMdoc.setText("<html><p align=\"center\">Impuestos</p></html>");
        btnIMdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnIMdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIMdoc.setEnabled(false);
        btnIMdoc.setFocusPainted(false);
        btnIMdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnIMdoc);
        btnIMdoc.setBounds(140, 140, 120, 46);

        btnNPdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnNPdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnNPdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnNPdoc.setText("<html><p align=\"center\">Nota<br>Proveedor</p></html>");
        btnNPdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNPdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNPdoc.setEnabled(false);
        btnNPdoc.setFocusPainted(false);
        btnNPdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNPdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnNPdoc);
        btnNPdoc.setBounds(270, 140, 120, 46);

        btnordencompra.setBackground(new java.awt.Color(224, 240, 177));
        btnordencompra.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnordencompra.setForeground(new java.awt.Color(37, 112, 0));
        btnordencompra.setText("<html><p align=\"center\">Orden de<br>Compra</p></html>");
        btnordencompra.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnordencompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnordencompra.setEnabled(false);
        btnordencompra.setFocusPainted(false);
        btnordencompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordencompraActionPerformed(evt);
            }
        });
        jPanel10.add(btnordencompra);
        btnordencompra.setBounds(140, 30, 120, 46);

        btnordenservicio.setBackground(new java.awt.Color(224, 240, 177));
        btnordenservicio.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnordenservicio.setForeground(new java.awt.Color(37, 112, 0));
        btnordenservicio.setText("<html><p align=\"center\">Orden de<br>Servicio</p></html>");
        btnordenservicio.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnordenservicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnordenservicio.setEnabled(false);
        btnordenservicio.setFocusPainted(false);
        btnordenservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenservicioActionPerformed(evt);
            }
        });
        jPanel10.add(btnordenservicio);
        btnordenservicio.setBounds(270, 30, 120, 46);

        btnrecepservicio.setBackground(new java.awt.Color(224, 240, 177));
        btnrecepservicio.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnrecepservicio.setForeground(new java.awt.Color(37, 112, 0));
        btnrecepservicio.setText("<html><p align=\"center\">Recepción<br>de Servicio</p></html>");
        btnrecepservicio.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrecepservicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnrecepservicio.setEnabled(false);
        btnrecepservicio.setFocusPainted(false);
        btnrecepservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecepservicioActionPerformed(evt);
            }
        });
        jPanel10.add(btnrecepservicio);
        btnrecepservicio.setBounds(10, 85, 120, 46);

        btnrecepcompra.setBackground(new java.awt.Color(224, 240, 177));
        btnrecepcompra.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnrecepcompra.setForeground(new java.awt.Color(37, 112, 0));
        btnrecepcompra.setText("<html><p align=\"center\">Recepción<br>por Compra</p></html>");
        btnrecepcompra.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrecepcompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnrecepcompra.setEnabled(false);
        btnrecepcompra.setFocusPainted(false);
        btnrecepcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecepcompraActionPerformed(evt);
            }
        });
        jPanel10.add(btnrecepcompra);
        btnrecepcompra.setBounds(140, 85, 120, 46);

        btnSUdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnSUdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnSUdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnSUdoc.setText("<html><p align=\"center\">Causacion<br>en Dolares</p></html>");
        btnSUdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSUdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSUdoc.setEnabled(false);
        btnSUdoc.setFocusPainted(false);
        btnSUdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnSUdoc);
        btnSUdoc.setBounds(140, 195, 120, 46);

        btnfactura.setBackground(new java.awt.Color(224, 240, 177));
        btnfactura.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnfactura.setForeground(new java.awt.Color(37, 112, 0));
        btnfactura.setText("<html><p align=\"center\">Factura</p></html>");
        btnfactura.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfactura.setEnabled(false);
        btnfactura.setFocusPainted(false);
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });
        jPanel10.add(btnfactura);
        btnfactura.setBounds(10, 30, 120, 46);

        btnTVdoc.setBackground(new java.awt.Color(224, 240, 177));
        btnTVdoc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnTVdoc.setForeground(new java.awt.Color(37, 112, 0));
        btnTVdoc.setText("<html><p align=\"center\">Soporte<br>Anticipo</p></html>");
        btnTVdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnTVdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTVdoc.setEnabled(false);
        btnTVdoc.setFocusPainted(false);
        btnTVdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVdocActionPerformed(evt);
            }
        });
        jPanel10.add(btnTVdoc);
        btnTVdoc.setBounds(270, 195, 120, 46);

        panelrevision.add(jPanel10);
        jPanel10.setBounds(10, 10, 400, 250);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(425, 30));
        jPanel12.setLayout(null);

        jScrollPane9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane9.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane9.setMaximumSize(new java.awt.Dimension(412, 127));
        jScrollPane9.setMinimumSize(new java.awt.Dimension(412, 127));
        jScrollPane9.setPreferredSize(new java.awt.Dimension(412, 127));

        jtdocumentos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtdocumentos2.setFillsViewportHeight(true);
        jtdocumentos2.setRequestFocusEnabled(false);
        jScrollPane9.setViewportView(jtdocumentos2);

        jPanel12.add(jScrollPane9);
        jScrollPane9.setBounds(10, 23, 430, 127);

        panelrevision.add(jPanel12);
        jPanel12.setBounds(430, 10, 450, 160);

        lblcoment3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblcoment3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblcoment3.setText("Comentario");
        panelrevision.add(lblcoment3);
        lblcoment3.setBounds(430, 170, 120, 22);

        jScrollPane10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane10.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tacomentario3.setColumns(20);
        tacomentario3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tacomentario3.setLineWrap(true);
        tacomentario3.setRows(2);
        tacomentario3.setWrapStyleWord(true);
        tacomentario3.setBorder(null);
        tacomentario3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(tacomentario3);

        panelrevision.add(jScrollPane10);
        jScrollPane10.setBounds(430, 190, 450, 70);

        Tabpane.addTab("Documentos Cargados", panelrevision);

        jpdocs.setBackground(new java.awt.Color(255, 255, 255));
        jpdocs.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
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
        jScrollPane6.setBounds(365, 8, 518, 250);

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

        btnbuscarA.setBackground(new java.awt.Color(255, 229, 178));
        btnbuscarA.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnbuscarA.setForeground(new java.awt.Color(107, 70, 0));
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

        txtubA.setEditable(false);
        txtubA.setBackground(new java.awt.Color(255, 255, 255));
        txtubA.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtubA.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtubA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtubA.setEnabled(false);
        txtubA.setPreferredSize(new java.awt.Dimension(6, 26));
        jpdocs.add(txtubA);
        txtubA.setBounds(119, 60, 241, 26);

        Nuevo_T_Documento.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo_T_Documento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Nuevo Documento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 16))); // NOI18N
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
        Nuevo_T_Documento.setBounds(10, 90, 350, 110);

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
        btnctdoc.setBounds(10, 230, 200, 26);

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

        Tabpane.addTab("Documentos", jpdocs);

        jpseguimiento.setBackground(new java.awt.Color(255, 255, 255));
        jpseguimiento.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpseguimiento.setForeground(new java.awt.Color(107, 70, 0));
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
        jtseguimiento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jsseguimiento.setViewportView(jtseguimiento);

        jpseguimiento.add(jsseguimiento);
        jsseguimiento.setBounds(5, 5, 880, 255);

        Tabpane.addTab("Seguimiento", jpseguimiento);

        jPanel6.add(Tabpane);
        Tabpane.setBounds(10, 170, 900, 300);
        Tabpane.getAccessibleContext().setAccessibleName("tab1");

        lblapr.setBackground(new java.awt.Color(255, 217, 142));
        lblapr.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblapr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblapr.setText("Aprobada por:");
        lblapr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblapr.setMaximumSize(new java.awt.Dimension(55, 26));
        lblapr.setMinimumSize(new java.awt.Dimension(55, 26));
        lblapr.setOpaque(true);
        lblapr.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel6.add(lblapr);
        lblapr.setBounds(290, 480, 110, 26);

        btnaprobar.setBackground(new java.awt.Color(153, 204, 255));
        btnaprobar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnaprobar.setForeground(new java.awt.Color(0, 102, 204));
        btnaprobar.setText("Aprobar");
        btnaprobar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaprobar.setFocusPainted(false);
        btnaprobar.setPreferredSize(new java.awt.Dimension(162, 26));
        btnaprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprobarActionPerformed(evt);
            }
        });
        jPanel6.add(btnaprobar);
        btnaprobar.setBounds(421, 480, 78, 26);

        jcbeliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbeliminar.setText("Retirar");
        jcbeliminar.setContentAreaFilled(false);
        jcbeliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jcbeliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jcbeliminar.setRequestFocusEnabled(false);
        jcbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbeliminarActionPerformed(evt);
            }
        });
        jPanel6.add(jcbeliminar);
        jcbeliminar.setBounds(400, 480, 80, 26);

        btneliminar.setBackground(new java.awt.Color(255, 198, 198));
        btneliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(153, 0, 0));
        btneliminar.setText("OK");
        btneliminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btneliminar.setEnabled(false);
        btneliminar.setPreferredSize(new java.awt.Dimension(45, 26));
        btneliminar.setRequestFocusEnabled(false);
        jPanel6.add(btneliminar);
        btneliminar.setBounds(490, 480, 30, 26);

        lblnombreu.setBackground(new java.awt.Color(255, 217, 142));
        lblnombreu.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblnombreu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombreu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblnombreu.setMaximumSize(new java.awt.Dimension(55, 26));
        lblnombreu.setMinimumSize(new java.awt.Dimension(55, 26));
        lblnombreu.setOpaque(true);
        lblnombreu.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel6.add(lblnombreu);
        lblnombreu.setBounds(400, 480, 220, 26);

        lblant.setBackground(new java.awt.Color(255, 255, 153));
        lblant.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblant.setForeground(new java.awt.Color(0, 51, 204));
        lblant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblant.setText("Con Anticipo");
        lblant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblant.setOpaque(true);
        jPanel6.add(lblant);
        lblant.setBounds(390, 480, 130, 26);

        getContentPane().add(jPanel6, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarjcbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarjcbsActionPerformed
        jcbanticipos.clearSelection();
    }//GEN-LAST:event_btnlimpiarjcbsActionPerformed

    private void btnaprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprobarActionPerformed
        aprobar_factura(1);
    }//GEN-LAST:event_btnaprobarActionPerformed

    private void btnfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactActionPerformed
        int id_factura = Integer.parseInt(lblid.getText());
        String documento = btnfact.getText();
        DC.ver_documento(documento, id_factura);
    }//GEN-LAST:event_btnfactActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        switch (UC.area_usuario(Principal.lbluser.getText())) {
            case "Administrativo":
                enviar_a_contabilidad();
                break;
            case "Capital Humano":
            case "Compras":
            case "Tecnología":
                enviar_a_aprobacion();
                break;
            case "Contabilidad":
                enviar_a_revision();
                break;
            case "Contabilidad_Rev":
                enviar_a_tesoreria();
                break;
            case "Tesoreria":
                programar_factura();
                break;
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void jcbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbeliminarActionPerformed
        if (jcbeliminar.isSelected()) {
            btneliminar.setEnabled(true);
        } else {
            btneliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jcbeliminarActionPerformed

    private void TabpaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabpaneStateChanged
        switch (Tabpane.getTitleAt(Tabpane.getSelectedIndex())) {
            case "Seguimiento":
                LT.Seguimiento(jtseguimiento, Integer.parseInt(lblid.getText()));
                break;
            case "Documentos":
                LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
                Nuevo_T_Documento.setVisible(false);
                btnactualizar.setVisible(false);
                btncancelar.setVisible(false);
                break;
            case "Documentos Cargados":
                buscar_docs();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TabpaneStateChanged

    private void btnctdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctdocActionPerformed
        Nuevo_T_Documento.setLocation(10, 90);
        Nuevo_T_Documento.setVisible(true);
    }//GEN-LAST:event_btnctdocActionPerformed

    private void btncancelartdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelartdActionPerformed
        Nuevo_T_Documento.setVisible(false);
    }//GEN-LAST:event_btncancelartdActionPerformed

    private void btncreartdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreartdActionPerformed
        crear_tipo_documento();
    }//GEN-LAST:event_btncreartdActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar_documento_factura();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        creacion_documento_factura();
    }//GEN-LAST:event_btncargarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btncancelar.setVisible(false);
        cmbtipodoc.setSelectedIndex(0);
        btncargar.setVisible(true);
        btnactualizar.setVisible(false);
        txtubA.setText("");
        LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnbuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarAActionPerformed
        CA.buscar_documento(txtubA, "ALL");
    }//GEN-LAST:event_btnbuscarAActionPerformed

    private void jtdocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtdocumentosMouseClicked
        gestion_documentos(evt);
    }//GEN-LAST:event_jtdocumentosMouseClicked

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        DC.ver_documento("Factura", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnfacturaActionPerformed

    private void btnordencompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordencompraActionPerformed
        DC.ver_documento("Orden de Compra", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnordencompraActionPerformed

    private void btnordenservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenservicioActionPerformed
        DC.ver_documento("Orden de Servicio", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnordenservicioActionPerformed

    private void btnrecepservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecepservicioActionPerformed
        DC.ver_documento("Recepción de Servicios", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnrecepservicioActionPerformed

    private void btnrecepcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecepcompraActionPerformed
        DC.ver_documento("Recepción por Compras", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnrecepcompraActionPerformed

    private void btnSCdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCdocActionPerformed
        DC.ver_documento("Soporte de Causacion", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSCdocActionPerformed

    private void btnDQdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDQdocActionPerformed
        DC.ver_documento("Documento Equivalente Virtual", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnDQdocActionPerformed

    private void btnIMdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMdocActionPerformed
//        DC.ver_documento("Factura", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnIMdocActionPerformed

    private void btnNPdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNPdocActionPerformed
        DC.ver_documento("Nota a Proveedor", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNPdocActionPerformed

    private void btnNIdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNIdocActionPerformed
        DC.ver_documento("Nota Interna", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNIdocActionPerformed

    private void btnSUdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUdocActionPerformed
        DC.ver_documento("Causacion en Dolares", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSUdocActionPerformed

    private void btnTVdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVdocActionPerformed
        DC.ver_documento("Transferencia Virtual", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnTVdocActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        docs_cont();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCActionPerformed
        DC.ver_documento("Soporte de Causacion", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSCActionPerformed

    private void btnuptSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuptSCActionPerformed
        btnRefrescar.setEnabled(false);
        btnSC.setEnabled(false);
        btnuptSC.setEnabled(false);
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar el 'Soporte de Causación'", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            actualizar_docs_cont(3, Integer.parseInt(lblid.getText()));
        } else {
            btnRefrescar.setEnabled(true);
            btnSC.setEnabled(true);
            btnuptSC.setEnabled(true);
        }
    }//GEN-LAST:event_btnuptSCActionPerformed

    private void btnDQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDQActionPerformed
        DC.ver_documento("Documento Equivalente Virtual", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnDQActionPerformed

    private void btnuptDQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuptDQActionPerformed
        btnRefrescar.setEnabled(false);
        btnDQ.setEnabled(false);
        btnuptDQ.setEnabled(false);
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar el 'Documento Equivalente'", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            actualizar_docs_cont(4, Integer.parseInt(lblid.getText()));
        } else {
            btnRefrescar.setEnabled(true);
            btnDQ.setEnabled(true);
            btnuptDQ.setEnabled(true);
        }
    }//GEN-LAST:event_btnuptDQActionPerformed

    private void btnNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNPActionPerformed
        DC.ver_documento("Nota a Proveedor", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNPActionPerformed

    private void btnuptNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuptNPActionPerformed
        btnRefrescar.setEnabled(false);
        btnNP.setEnabled(false);
        btnuptNP.setEnabled(false);
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar el 'Nota a Proveedor'", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            actualizar_docs_cont(7, Integer.parseInt(lblid.getText()));
        } else {
            btnRefrescar.setEnabled(true);
            btnNP.setEnabled(true);
            btnuptNP.setEnabled(true);
        }
    }//GEN-LAST:event_btnuptNPActionPerformed

    private void btnNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNIActionPerformed
        DC.ver_documento("Nota Interna", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNIActionPerformed

    private void btnuptNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuptNIActionPerformed
        btnRefrescar.setEnabled(false);
        btnNI.setEnabled(false);
        btnuptNI.setEnabled(false);
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar el 'Nota Interna'", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            actualizar_docs_cont(6, Integer.parseInt(lblid.getText()));
        } else {
            btnRefrescar.setEnabled(true);
            btnNI.setEnabled(true);
            btnuptNI.setEnabled(true);
        }
    }//GEN-LAST:event_btnuptNIActionPerformed

    private void btnSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUActionPerformed
        DC.ver_documento("Causacion en Dolares", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSUActionPerformed

    private void btnuptSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuptSUActionPerformed
        btnRefrescar.setEnabled(false);
        btnSU.setEnabled(false);
        btnuptSU.setEnabled(false);
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar la 'Causacion en Dolares'", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            actualizar_docs_cont(10, Integer.parseInt(lblid.getText()));
        } else {
            btnRefrescar.setEnabled(true);
            btnSU.setEnabled(true);
            btnuptSU.setEnabled(true);
        }
    }//GEN-LAST:event_btnuptSUActionPerformed

    private void btnANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTActionPerformed
        DC.ver_documento("Soporte Anticipo", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnANTActionPerformed

    private void btndelAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelAntActionPerformed
        int id_factura, id_proveedor, id_empresa;
        String ruta_doc;
        String consecutivo = DC.consecutivo_doc("Soporte Anticipo", Integer.parseInt(lblid.getText()));
        id_factura = Integer.parseInt(lblid.getText());
        id_proveedor = PC.id_proveedor(lblproveedor.getText());
        id_empresa = EMPC.id_empresa(lblempresa.getText());
        ruta_doc = DC.ubicacion_documento("Soporte Anticipo", id_factura);
        MD.eliminar_documento(ruta_doc);
        if (!DC.existe_documento("Soporte Anticipo", 16)) {
            AntC.anticipo_no_cargado(id_proveedor, id_empresa, consecutivo);
            DC.eliminar_documento(16, id_factura);
            LT.anticipos_proveedor(jtantprov, lblproveedor.getText(), lblempresa.getText());
            btnANT.setEnabled(false);
            btndelAnt.setEnabled(false);
            facturas_anticipadas(2);
        }
    }//GEN-LAST:event_btndelAntActionPerformed

    private void jtantprovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtantprovMouseClicked
        int column = jtantprov.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtantprov.getRowHeight();
        int id_factura, id_proveedor, id_empresa, id_tipo_doc;
        String cons, tipo_doc, ruta_doc, ruta_nueva;
        if (row < jtantprov.getRowCount() && row >= 0 && column < jtantprov.getColumnCount() && column >= 0) {
            Object value = jtantprov.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                id_factura = Integer.parseInt(lblid.getText());
                id_proveedor = PC.id_proveedor(lblproveedor.getText());
                id_empresa = EMPC.id_empresa(lblempresa.getText());
                tipo_doc = jtantprov.getValueAt(row, 0).toString();
                id_tipo_doc = TDC.id_tipo_doc_pref(tipo_doc);
                cons = jtantprov.getValueAt(row, 1).toString();
                ruta_doc = AntC.ubicacion_documento_anticipo(id_proveedor, id_empresa, id_tipo_doc, cons);
                ruta_nueva = DC.ubicacion_documento("Factura", id_factura);
                switch (boton.getName()) {
                    case "ver":
                        AntC.ver_documento_anticipo(id_proveedor, id_empresa, id_tipo_doc, cons);
                        break;
                    case "aceptar":
                        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio,
                                "Confirmar el Soporte del Anticipo?", "Soporte Anticipo", JOptionPane.YES_NO_OPTION);
                        if (opc == 0) {
                            if (MD.asociar_anticipo(ruta_doc, ruta_nueva, "Soporte Anticipo", 16, id_factura, cons)) {
                                AntC.anticipo_cargado(id_proveedor, id_empresa, id_tipo_doc, cons);
                                btnANT.setEnabled(true);
                                btndelAnt.setEnabled(true);
                            } else {
                                System.out.println("error");
                                btnANT.setEnabled(false);
                                btndelAnt.setEnabled(false);
                            }
                        }
                        LT.anticipos_proveedor(jtantprov, lblproveedor.getText(), lblempresa.getText());
                        facturas_anticipadas(2);
                        break;
                }
            }
        }
    }//GEN-LAST:event_jtantprovMouseClicked

    private void btnantuptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnantuptActionPerformed
        int id_proveedor = PC.id_proveedor(lblproveedor.getText());
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        int cant = AntC.registros_anticipos_proveedor(id_proveedor, id_empresa);
        System.err.println(cant);
    }//GEN-LAST:event_btnantuptActionPerformed

    private void jrbOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpc1ActionPerformed
        jdcprogramar.setEnabled(true);
        txtcomprobante.setText("");
        btnarchivo.setEnabled(false);
        btnvercp.setEnabled(false);
        btncargarcp.setEnabled(false);
        btneliminarcp.setEnabled(false);
        btnmodificarcp.setEnabled(false);
        btnok.setText("Programar");
    }//GEN-LAST:event_jrbOpc1ActionPerformed

    private void jrbOpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpc2ActionPerformed
        int id_factura = Integer.parseInt(lblid.getText());
        String fecha_prog = ProgC.fecha_programada(id_factura);
        if (!fecha_prog.equals("")) {
            jrbOpc1.setSelected(false);
            jdcprogramar.setEnabled(false);
            btnarchivo.setEnabled(true);
            btneliminarcp.setEnabled(false);
            btnmodificarcp.setEnabled(false);
            btncargarcp.setEnabled(true);
            btnaceptarcp.setVisible(false);
            btncancelarcp.setVisible(false);
            btnok.setText("Confirmar Pago");
        }

    }//GEN-LAST:event_jrbOpc2ActionPerformed

    private void btnarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarchivoActionPerformed
        CA.buscar_documento(txtcomprobante, "ALL");
    }//GEN-LAST:event_btnarchivoActionPerformed

    private void btncargarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarcpActionPerformed
        String ruta = txtcomprobante.getText();
        MD.Cargar_Documento(lblnfact.getText(), lblproveedor.getText(), lblempresa.getText(), "Comprobante de Pago", ruta, 17,
                "", PC.id_proveedor(lblproveedor.getText()), EMPC.id_empresa(lblempresa.getText()));
        estado_pago_factura();
    }//GEN-LAST:event_btncargarcpActionPerformed

    private void btneliminarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarcpActionPerformed
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea eliminar el Comprobante de pago?",
                "Eliminar Comprobante", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            int id_factura = Integer.parseInt(lblid.getText());
            String ruta_eliminar = DC.ubicacion_documento("Comprobante de Pago", id_factura);
            jdcprogramar.setEnabled(false);
            MD.eliminar_documento(ruta_eliminar);
            if (DC.eliminar_documento(17, id_factura)) {
                estado_pago_factura();
            }
        }
    }//GEN-LAST:event_btneliminarcpActionPerformed

    private void btnmodificarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarcpActionPerformed
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea actualizar el Comprobante de pago?",
                "Actualizar Comprobante", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            txtcomprobante.setText("");
            btnarchivo.setEnabled(true);
            btncargarcp.setVisible(false);
            btneliminarcp.setVisible(false);
            btnmodificarcp.setVisible(false);
            btnaceptarcp.setVisible(true);
            btncancelarcp.setVisible(true);
        }
    }//GEN-LAST:event_btnmodificarcpActionPerformed

    private void btncancelarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarcpActionPerformed
        estado_pago_factura();
    }//GEN-LAST:event_btncancelarcpActionPerformed

    private void btnaceptarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarcpActionPerformed
        int id_tipo_doc = 17;
        String ruta_ant = DC.ubicacion_documento("Comprobante de Pago", Integer.parseInt(lblid.getText()));
        String ruta_nueva = txtcomprobante.getText();
        if (!ruta_nueva.isEmpty()) {
            MD.actualizar_documento(ruta_nueva, ruta_ant, "Comprobante de Pago", id_tipo_doc, Integer.parseInt(lblid.getText()));
            estado_pago_factura();
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor seleccionar el nuevo Comprobante de Pago.");
        }
    }//GEN-LAST:event_btnaceptarcpActionPerformed

    private void btnvercpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvercpActionPerformed
        int id_factura = Integer.parseInt(lblid.getText());
        DC.ver_documento("Comprobante de Pago", id_factura);
    }//GEN-LAST:event_btnvercpActionPerformed

    private void txtdocteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocteKeyReleased
        documentos_tesoreria(3);
    }//GEN-LAST:event_txtdocteKeyReleased

    private void btnverteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverteActionPerformed
        documentos_tesoreria(2);
    }//GEN-LAST:event_btnverteActionPerformed

    private void btnokteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokteActionPerformed
        documentos_tesoreria(1);
    }//GEN-LAST:event_btnokteActionPerformed

    private void jtdocsTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtdocsTMouseClicked
        int column = jtdocsT.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtdocsT.getRowHeight();
        int id_factura = Integer.parseInt(lblid.getText());
        if (row < jtdocsT.getRowCount() && row >= 0 && column < jtdocsT.getColumnCount() && column >= 0) {
            Object value = jtdocsT.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                String doc = jtdocsT.getValueAt(row, 0).toString();
                String tipo_doc;
                switch (boton.getName()) {
                    case "ver":
                        if (doc.equals("TV")) {
                            DC.ver_documento("Transferencia Virtual", id_factura);
                        } else {
                            DC.ver_documento("Comprobante de Egreso", id_factura);
                        }
                        break;
                    case "borrar":
                        int id_tipo_doc = TDC.id_tipo_doc_pref(doc);
                        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea eliminar el documento?",
                                "Eliminar " + jtdocsT.getValueAt(row, 0).toString(), JOptionPane.YES_NO_OPTION);
                        if (opc == 0) {
                            if (doc.equals("TV")) {
                                tipo_doc = "Transferencia Virtual";
                            } else {
                                tipo_doc = "Comprobante de Egreso";
                            }
                            MD.eliminar_documento(DC.ubicacion_documento(tipo_doc, id_factura));
                            if (DC.eliminar_documento(id_tipo_doc, id_factura)) {
                                LT.docs_tesoreria(jtdocsT, id_factura);
                            } else {
                                System.out.println("El documento no pudo ser borrado");
                            }
                        }
                        break;
                }
            }
        }
    }//GEN-LAST:event_jtdocsTMouseClicked

    public void llenar_campos(String no_factura, String proveedor, String empresa, String area, String estado) {
        Factura F = FC.buscar(no_factura, proveedor, empresa);
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
        if (F != null) {
            try {
                lblproveedor.setText(PC.rs_proveedor(F.getId_proveedor()));
                lblnit.setText(PC.nit_proveedor(PC.rs_proveedor(F.getId_proveedor())));
                lblempresa.setText(EMPC.empresa(F.getId_empresa()));
                Date fecha = formatoDeFecha.parse(F.getFecha_recepcion());
                lblfecharec.setText(formatoDeFecha.format(fecha));
                Date fecha2 = formatoDeFecha.parse(F.getFecha_generada());
                lblfechafact.setText(formatoDeFecha.format(fecha2));
                if ("".equals(F.getFecha_venc())) {
                    lblfechavenc.setText("");
                } else {
                    Date fecha3 = formatoDeFecha.parse(F.getFecha_venc());
                    lblfechavenc.setText(formatoDeFecha.format(fecha3));
                }
                lblnfact.setText(F.getNo_factura());
                NumberFormat formatomoneda = NumberFormat.getCurrencyInstance();
                lblvalor.setText(formatomoneda.format(F.getValor()));
                lblmoneda.setText(F.getMoneda());
                lblncuenta.setText(F.getConvenio());
                lblcorresp.setText(F.getNo_radicado());
                lblid.setText(String.valueOf(F.getId()));
                lblid.setVisible(false);
                componentes_visibles(area, estado);
            } catch (ParseException ex) {
                Logger.getLogger(Gestionar_Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void aprobar_factura(int aprob) {
        int id_usuario = UC.id_usuario(Principal.lbluser.getText());
        int id_area_usuario = UC.id_area_usuario(Principal.lbluser.getText());
        int id_factura = Integer.parseInt(lblid.getText());
        if (aprob == 1) {
            if (ApC.aprobar(id_factura, id_area_usuario, id_usuario)) {
                String usuario = ApC.aprobado_por(Integer.parseInt(lblid.getText()), id_area_usuario);
                lblnombreu.setText(usuario);
                btnaprobar.setVisible(false);
                lblapr.setVisible(true);
                lblnombreu.setVisible(true);
                LC.crear_log(id_usuario, id_factura, 0, 3);
                TC.crear_tiempo(id_usuario, id_factura, 3, 3);
                btnok.setVisible(true);
                btnok.setText("Enviar para Aprobación.");
                NS.notificaciones("Aprobación Factura", "Factura " + lblnfact.getText() + " Aprobada.", "correcto");
            } else {
                NS.notificaciones("Aprobación Factura", "Factura " + lblnfact.getText() + " no aprobada.", "error");
                btnok.setVisible(false);
            }
        } else if (aprob == 2) {
            ApC.aprobar(id_factura, id_area_usuario, id_usuario);
            FC.factura_aprobada(id_factura);
        }

    }

    public void enviar_a_aprobacion() {
        if (lblnombreu.isVisible() && !btnaprobar.isVisible()) {
            String no_factura = lblnfact.getText();
            int id_usuario = UC.id_usuario(Principal.lbluser.getText());
            int id_proveedor = PC.id_proveedor(lblproveedor.getText());
            int id_empresa = EMPC.id_empresa(lblempresa.getText());
            int id_factura = Integer.parseInt(lblid.getText());
            if (FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, 2, 1)) {
                procedimiento_anticipo(id_factura);
                registro_procedimiento(no_factura, id_factura, id_usuario, 8, 2, tacomentario.getText(), 1, 0);
                ApC.crear_aprobacion(id_factura, 1);
                Principal.btnactualizar.doClick();
                NS.notificaciones("Gestión Factura", "La Factura " + lblnfact.getText() + " fue enviada para su respectiva aprobacion.", "correcto");
                this.doDefaultCloseAction();
            } else {
                NS.notificaciones("Gestión Factura", "La Factura " + lblnfact.getText() + " no  pudo ser enviara para aprobar.", "error");
            }
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "La factura no ha sido aprobada por el Jefe del Area");
        }
    }

    public void enviar_a_contabilidad() {
        String no_factura = lblnfact.getText();
        int id_usuario = UC.id_usuario(Principal.lbluser.getText());
        int id_proveedor = PC.id_proveedor(lblproveedor.getText());
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        int id_factura = Integer.parseInt(lblid.getText());
        if (FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, 4, 4)) {
            procedimiento_anticipo(id_factura);
            aprobar_factura(2);
            registro_procedimiento(no_factura, id_factura, id_usuario, 2, 4, tacomentario.getText(), 4, id_empresa);
            Principal.btnactualizar.doClick();
            NS.notificaciones("Aprobación Factura", "La Factura " + lblnfact.getText() + " fue enviada a Contabilidad.", "correcto");
            this.doDefaultCloseAction();
        } else {
            NS.notificaciones("Aprobación Factura", "La Factura " + lblnfact.getText() + " no se envio a Contabilidad.", "error");
        }
    }

    public void enviar_a_revision() {
        String no_factura = lblnfact.getText();
        int id_usuario = UC.id_usuario(Principal.lbluser.getText());
        int usuario_reviza = UC.id_usuario_rev(cmbRcont.getSelectedItem().toString());
        int id_proveedor = PC.id_proveedor(lblproveedor.getText());
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        int id_factura = Integer.parseInt(lblid.getText());
        if (FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, 13, 5)) {
            RC.crear_revision(id_factura, usuario_reviza);
            registro_procedimiento(no_factura, id_factura, id_usuario, 4, 13, tacomentario1.getText(), 5, id_empresa);
            Principal.btnactualizar.doClick();
            NS.notificaciones("Contabilización Factura", "La Factura " + lblnfact.getText() + " fue enviada a Revisión.", "correcto");
            this.doDefaultCloseAction();
        } else {
            NS.notificaciones("Contabilización Factura", "La Factura " + lblnfact.getText() + " no se envio a Revisión.", "error");
        }
    }

    public void enviar_a_tesoreria() {
        String no_factura = lblnfact.getText();
        int id_usuario = UC.id_usuario(Principal.lbluser.getText());
        int id_proveedor = PC.id_proveedor(lblproveedor.getText());
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        int id_factura = Integer.parseInt(lblid.getText());
        if (FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, 9, 9)) {
            FC.factura_revisada(id_factura);
            RC.revizar(id_factura, id_usuario);
            registro_procedimiento(no_factura, id_factura, id_usuario, 13, 9, tacomentario3.getText(), 9, id_empresa);
            Principal.btnactualizar.doClick();
            NS.notificaciones("Revisión Factura", "La Factura " + lblnfact.getText() + " fue enviada a Tesoreria.", "correcto");
            this.doDefaultCloseAction();
        } else {
            NS.notificaciones("Revisión Factura", "La Factura " + lblnfact.getText() + " no se envio a Tesoreria.", "error");
        }
    }

    public void programar_factura() {
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_prog = formatoDeFecha.format(jdcprogramar.getDate());
        int id_usuario = UC.id_usuario(Principal.lbluser.getText());
        int id_factura = Integer.parseInt(lblid.getText());
        if (ProgC.crear_programacion(id_factura, id_usuario, fecha_prog)) {
            System.out.println("Creada la Programacion");
        } else {
            System.out.println("error");
        }
    }

    public void registro_procedimiento(String no_factura, int id_factura, int id_usuario, int estado_prev, int estado_post, String comentario,
            int id_area_dest, int id_empresa) {
        String usuario = ApC.aprobado_por(Integer.parseInt(lblid.getText()), 8);
        if (!comentario.equals("")) {
            CC.crear_comentario(0, id_usuario, id_factura, estado_prev, comentario);
            int com = CC.id_comentario(id_factura, id_usuario, estado_prev, comentario);
            LC.crear_log(id_usuario, id_factura, com, estado_prev);
        } else {
            LC.crear_log(id_usuario, id_factura, 0, estado_prev);
        }
        TC.crear_tiempo(id_usuario, id_factura, estado_prev, estado_post);
        if (id_empresa == 0) {
            CorC.crear_correo(id_factura, UC.correos(id_area_dest, 0), "Factura para Aprobar", EC.plantilla_correo("Factura para Aprobar",
                    no_factura, lblempresa.getText(), lblnit.getText(), lblcorresp.getText(), lblproveedor.getText(),
                    lblvalor.getText(), lblfecharec.getText(), lblfechafact.getText(), lblfechavenc.getText(), usuario, ""));
        } else {
            CorC.crear_correo(id_factura, UC.correos(id_area_dest, id_empresa), "Factura para Aprobar", EC.plantilla_correo("Factura para Aprobar",
                    no_factura, lblempresa.getText(), lblnit.getText(), lblcorresp.getText(), lblproveedor.getText(),
                    lblvalor.getText(), lblfecharec.getText(), lblfechafact.getText(), lblfechavenc.getText(), usuario, ""));
        }
    }

    public void procedimiento_anticipo(int id_factura) {
        if (jcbanticipo.isSelected()) {
            if (!AntfC.existe_anticipo(id_factura)) {
                AntfC.crear_tipo_anticipo(id_factura, 1);
            } else {
                AntfC.actualizar_anticipo(id_factura, 1);
            }
        } else if (jcbantmv.isSelected()) {
            if (!AntfC.existe_anticipo(id_factura)) {
                AntfC.crear_tipo_anticipo(id_factura, 2);
            } else {
                AntfC.actualizar_anticipo(id_factura, 2);
            }
        } else if (jcbantMav.isSelected()) {
            if (!AntfC.existe_anticipo(id_factura)) {
                AntfC.crear_tipo_anticipo(id_factura, 3);
            } else {
                AntfC.actualizar_anticipo(id_factura, 3);
            }
        } else {
            AntfC.eliminar_anticipo(id_factura);
        }
    }

    public void render() {
        R.cmbcentrado(cmbdocCOMP);
        R.jdccentrado(jdcprogramar);

        cmbRcont.removeAllItems();
        cmbRcont.addItem("---");
        R.Revision(cmbRcont);
        cmbRcont.setSelectedIndex(0);

        cmbtipodoc.removeAllItems();
        cmbtipodoc.addItem("--Seleccione--");
        R.tipo_documento(cmbtipodoc);
        cmbtipodoc.setSelectedIndex(0);

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

    public void componentes_visibles(String area, String estado) {
        String usuarioapr = ApC.aprobado_por(Integer.parseInt(lblid.getText()), 8);
        int id_factura = Integer.parseInt(lblid.getText());
        switch (area) {
            case "Administrativo":
                Tabpane.remove(panelcontabilidad);
                Tabpane.remove(paneltesoreria);
                tacomentario3.setEnabled(false);
                lblcoment3.setEnabled(false);
                btnaprobar.setVisible(false);
                lblapr.setVisible(false);
                lblnombreu.setText("");
                lblnombreu.setVisible(false);
                jcbeliminar.setVisible(true);
                btneliminar.setVisible(true);
                lblant.setVisible(false);
                btnok.setText("Enviar a Contabilidad");
                facturas_anticipadas(1);
                break;
            case "Capital Humano":
            case "Compras":
            case "Tecnología":
                Tabpane.remove(panelcontabilidad);
                Tabpane.remove(paneltesoreria);
                tacomentario3.setEnabled(false);
                lblcoment3.setEnabled(false);
                lblnombreu.setVisible(false);
                jcbeliminar.setVisible(false);
                btneliminar.setVisible(false);
                lblant.setVisible(false);
                if (!usuarioapr.equals("")) {
                    lblnombreu.setText(usuarioapr);
                    btnaprobar.setVisible(false);
                    lblapr.setVisible(true);
                    lblnombreu.setVisible(true);
                    btnok.setVisible(true);
                    btnok.setText("Enviar para Aprobación");
                } else {
                    lblnombreu.setText("");
                    btnaprobar.setVisible(true);
                    lblapr.setVisible(false);
                    lblnombreu.setVisible(false);
                    btnok.setVisible(false);
                    if (UC.usuario_aprueba(Principal.lbluser.getText()) == 0) {
                        Gestionar_Factura.btnaprobar.setVisible(false);
                    } else {
                        Gestionar_Factura.btnaprobar.setVisible(true);
                    }
                }
                facturas_anticipadas(1);
                break;
            case "Contabilidad":
                Tabpane.remove(panelgestion);
                Tabpane.remove(paneltesoreria);
                tacomentario3.setEnabled(false);
                lblcoment3.setEnabled(false);
                btnaprobar.setVisible(false);
                lblapr.setVisible(false);
                lblnombreu.setText("");
                lblnombreu.setVisible(false);
                jcbeliminar.setVisible(false);
                btneliminar.setVisible(false);
                btnok.setText("Enviar a Revisión");
                facturas_anticipadas(2);
                docs_cont();
                LT.anticipos_proveedor(jtantprov, lblproveedor.getText(), lblempresa.getText());
                break;
            case "Contabilidad_Rev":
                Tabpane.remove(panelgestion);
                Tabpane.remove(panelcontabilidad);
                Tabpane.remove(paneltesoreria);
                Tabpane.setTitleAt(0, "Revision Contable");
                lblcoment3.setEnabled(true);
                tacomentario3.setEnabled(true);
                btnaprobar.setVisible(false);
                lblapr.setVisible(false);
                lblnombreu.setText("");
                lblnombreu.setVisible(false);
                jcbeliminar.setVisible(false);
                btneliminar.setVisible(false);
                facturas_anticipadas(2);
                btnok.setText("Enviar a Tesoreria");
                break;
            case "Tesoreria":
                Tabpane.remove(panelgestion);
                Tabpane.remove(panelcontabilidad);
                lblcoment3.setEnabled(false);
                tacomentario3.setEnabled(false);
                btnaprobar.setVisible(false);
                lblapr.setVisible(false);
                lblnombreu.setText("");
                lblnombreu.setVisible(false);
                jcbeliminar.setVisible(false);
                btneliminar.setVisible(false);
                facturas_anticipadas(2);
                estado_pago_factura();
                LT.docs_tesoreria(jtdocsT, id_factura);
                btnok.setText("Confirmar Pago");
                break;
        }
    }

    public void facturas_anticipadas(int opc) {
        int id_proveedor = PC.id_proveedor(lblproveedor.getText());
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        int cant = AntC.registros_anticipos_proveedor(id_proveedor, id_empresa);
        switch (opc) {
            case 1:
                switch (AntfC.tipo_anticipo(Integer.parseInt(lblid.getText()))) {
                    case 1:
                        jcbanticipo.setSelected(true);
                        break;
                    case 2:
                        jcbantmv.setSelected(true);
                        break;
                    case 3:
                        jcbantMav.setSelected(true);
                        break;
                    default:
                        jcbanticipo.setSelected(false);
                        jcbantmv.setSelected(false);
                        jcbantMav.setSelected(false);
                        break;
                }
                break;
            case 2:
                switch (AntfC.tipo_anticipo(Integer.parseInt(lblid.getText()))) {
                    case 1:
                        lblant.setVisible(true);
                        lblant.setText("Con Anticipo");
                        lblant.setBounds(380, 480, 130, 26);
                        if (cant == 0) {
                            lblnodata.setVisible(true);
                            jsant_pre.setVisible(false);
                            btnantupt.setVisible(false);
                        } else {
                            lblnodata.setVisible(false);
                            jsant_pre.setVisible(true);
                            btnantupt.setVisible(false);
                        }
                        break;
                    case 2:
                        lblant.setVisible(true);
                        lblant.setText("Con Anticipo de Menor Valor");
                        lblant.setBounds(310, 480, 270, 26);
                        jsant_pre.setVisible(true);
                        if (cant == 0) {
                            lblnodata.setVisible(true);
                            jsant_pre.setVisible(false);
                            btnantupt.setVisible(false);
                        } else {
                            lblnodata.setVisible(false);
                            jsant_pre.setVisible(true);
                            btnantupt.setVisible(false);
                        }
                        break;
                    case 3:
                        lblant.setVisible(true);
                        lblant.setText("Con Anticipo de Mayor Valor");
                        lblant.setBounds(310, 480, 270, 26);
                        jsant_pre.setVisible(true);
                        if (cant == 0) {
                            lblnodata.setVisible(true);
                            jsant_pre.setVisible(false);
                            btnantupt.setVisible(false);
                        } else {
                            lblnodata.setVisible(false);
                            jsant_pre.setVisible(true);
                            btnantupt.setVisible(false);
                        }
                        break;
                    default:
                        lblant.setVisible(false);
                        lblant.setText("");
                        lblant.setBounds(310, 480, 270, 26);
                        jsant_pre.setVisible(false);
                        break;
                }
                break;
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

    public void creacion_documento_factura() {
        String documento = cmbtipodoc.getSelectedItem().toString();
        String ruta = txtubA.getText();
        MD.Cargar_Documento(lblnfact.getText(), lblproveedor.getText(), lblempresa.getText(), documento, ruta, TDC.id_tipo_doc(documento),
                "", PC.id_proveedor(lblproveedor.getText()), EMPC.id_empresa(lblempresa.getText()));
        cmbtipodoc.setSelectedIndex(0);
        btncargar.setVisible(true);
        btnactualizar.setVisible(false);
        txtubA.setText("");
        LT.Documentos(jtdocumentos, Integer.parseInt(lblid.getText()));
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

    public void actualizar_docs_cont(int tipo_doc, int id_factura) {
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "¿Desea Actualizar el Documento", "Actualizar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            String nit = lblnit.getText();
            int id_empresa = EMPC.id_empresa(lblempresa.getText());
            String ubsuno = suno.ubicacion_documento(nit, id_empresa, tipo_doc);
            suno.eliminar_suno(nit, id_empresa, tipo_doc);
            DC.eliminar_documento(tipo_doc, id_factura);
            MD.eliminar_documento(ubsuno);
            try {
                Thread.sleep(10000);
                btnRefrescar.setEnabled(true);
                docs_cont();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gestionar_Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void docs_cont() {
        int id_factura = Integer.parseInt(lblid.getText());
        String nit = lblnit.getText();
        String no_factura = lblnfact.getText();
        String proveedor = lblproveedor.getText();
        String empresa = lblempresa.getText();
        int id_proveedor = PC.id_proveedor(proveedor);
        int id_empresa = EMPC.id_empresa(lblempresa.getText());
        for (int i = 0; i <= 6; i++) {
            switch (i) {
                case 1:
                    if (suno.existe_documento(nit, id_empresa, 3)) {
                        btnSC.setEnabled(true);
                        btnuptSC.setEnabled(true);
                        String consecutivo = suno.consecutivo_documento(nit, id_empresa, 3);
                        String ruta = suno.ubicacion_documento(nit, id_empresa, 3);
                        if (!DC.existe_documento("Soporte de Causacion", Integer.parseInt(lblid.getText()))) {
                            MD.Cargar_Documento(no_factura, proveedor, empresa, "Soporte de Causacion", ruta, 3, consecutivo,
                                    id_proveedor, id_empresa);
                        }
                    } else {
                        btnSC.setEnabled(false);
                        btnuptSC.setEnabled(false);
                    }
                    break;
                case 2:
                    if (suno.existe_documento(nit, id_empresa, 4)) {
                        btnDQ.setEnabled(true);
                        btnuptDQ.setEnabled(true);
                        String consecutivo = suno.consecutivo_documento(nit, id_empresa, 4);
                        String ruta = suno.ubicacion_documento(nit, id_empresa, 4);
                        if (!DC.existe_documento("Documento Equivalente", Integer.parseInt(lblid.getText()))) {
                            MD.Cargar_Documento(no_factura, proveedor, empresa, "Documento Equivalente", ruta, 4, consecutivo,
                                    id_proveedor, id_empresa);
                        }
                    } else {
                        btnDQ.setEnabled(false);
                        btnuptDQ.setEnabled(false);
                    }
                    break;
                case 3:
                    if (suno.existe_documento(nit, id_empresa, 7)) {
                        btnNP.setEnabled(true);
                        btnuptNP.setEnabled(true);
                    } else {
                        btnNP.setEnabled(false);
                        btnuptNP.setEnabled(false);
                    }
                    break;
                case 4:
                    if (suno.existe_documento(nit, id_empresa, 6)) {
                        btnNI.setEnabled(true);
                        btnuptNI.setEnabled(true);
                    } else {
                        btnNI.setEnabled(false);
                        btnuptNI.setEnabled(false);
                    }
                case 5:
                    if (DC.existe_documento("Soporte Anticipo", id_factura)) {
                        btnANT.setEnabled(true);
                        btndelAnt.setEnabled(true);
                    } else {
                        btnANT.setEnabled(false);
                        btndelAnt.setEnabled(false);
                    }
                    break;
            }
        }
    }
    
    public void buscar_docs() {
        int idfact = Integer.parseInt(lblid.getText());
        for (int i = 0; i <= 12; i++) {
            switch (i) {
                case 1:
                    if (DC.existe_documento("Factura", idfact)) {
                        btnfactura.setEnabled(true);
                    } else {
                        btnfactura.setEnabled(false);
                    }
                    break;
                case 2:
                    if (DC.existe_documento("Orden de Compra", idfact)) {
                        btnordencompra.setEnabled(true);
                    } else {
                        btnordencompra.setEnabled(false);
                    }
                    break;
                case 3:
                    if (DC.existe_documento("Orden de Servicio", idfact)) {
                        btnordenservicio.setEnabled(true);
                    } else {
                        btnordenservicio.setEnabled(false);
                    }
                    break;
                case 4:
                    if (DC.existe_documento("Recepción de Servicios", idfact)) {
                        btnrecepservicio.setEnabled(true);
                    } else {
                        btnrecepservicio.setEnabled(false);
                    }
                    break;
                case 5:
                    if (DC.existe_documento("Recepción por Compras", idfact)) {
                        btnrecepcompra.setEnabled(true);
                    } else {
                        btnrecepcompra.setEnabled(false);
                    }
                    break;
                case 6:
                    if (DC.existe_documento("Soporte de Causacion", idfact)) {
                        btnSCdoc.setEnabled(true);
                    } else {
                        btnSCdoc.setEnabled(false);
                    }
                    break;
                case 7:
                    if (DC.existe_documento("Documento Equivalente Virtual", idfact)) {
                        btnDQdoc.setEnabled(true);
                    } else {
                        btnDQdoc.setEnabled(false);
                    }
                    break;
                case 8:
                    if (DC.existe_documento("Impuestos", idfact)) {
                        btnIMdoc.setEnabled(true);
                    } else {
                        btnIMdoc.setEnabled(false);
                    }
                    break;
                case 9:
                    if (DC.existe_documento("Nota a Proveedor", idfact)) {
                        btnNPdoc.setEnabled(true);
                    } else {
                        btnNPdoc.setEnabled(false);
                    }
                    break;
                case 10:
                    if (DC.existe_documento("Nota Interna", idfact)) {
                        btnNIdoc.setEnabled(true);
                    } else {
                        btnNIdoc.setEnabled(false);
                    }
                    break;
                case 11:
                    if (DC.existe_documento("Causacion en Dolares", idfact)) {
                        btnSUdoc.setEnabled(true);
                    } else {
                        btnSUdoc.setEnabled(false);
                    }
                    break;
                case 12:
                    if (DC.existe_documento("Soporte Anticipo", idfact)) {
                        btnTVdoc.setEnabled(true);
                    } else {
                        btnTVdoc.setEnabled(false);
                    }
                    break;
            }
        }
    }

    public void estado_pago_factura() {
        try {
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            int id_factura = Integer.parseInt(lblid.getText());
            String fecha_prog = ProgC.fecha_programada(id_factura);
            if (DC.existe_documento("Comprobante de Pago", id_factura)) {
                String ruta_doc = DC.ubicacion_documento("Comprobante de Pago", id_factura);
                jrbOpc2.setSelected(true);
                txtcomprobante.setText(ruta_doc);
                btnarchivo.setEnabled(false);
                btncargarcp.setEnabled(false);
                btneliminarcp.setEnabled(true);
                btnmodificarcp.setEnabled(true);
                btncargarcp.setVisible(true);
                btneliminarcp.setVisible(true);
                btnmodificarcp.setVisible(true);
                btnvercp.setEnabled(true);
                btnaceptarcp.setVisible(false);
                btncancelarcp.setVisible(false);
            } else if (!fecha_prog.equals("")) {
                jrbOpc1.setSelected(true);
                txtcomprobante.setText("");
                btnarchivo.setEnabled(false);
                btncargarcp.setEnabled(false);
                btneliminarcp.setEnabled(false);
                btnmodificarcp.setEnabled(false);
                btncargarcp.setVisible(true);
                btneliminarcp.setVisible(true);
                btnmodificarcp.setVisible(true);
                btnvercp.setEnabled(false);
                btnaceptarcp.setVisible(false);
                btncancelarcp.setVisible(false);
                jdcprogramar.setEnabled(true);
                jdcprogramar.setDate(formatoDeFecha.parse(fecha_prog));
            } else {
                jrbOpc1.setSelected(false);
                jdcprogramar.setEnabled(false);
                jdcprogramar.setDate(null);
            }
        } catch (ParseException ex) {
            Logger.getLogger(Gestionar_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void documentos_tesoreria(int procedimiento) {
        int id_factura, id_proveedor, id_empresa, id_tipo_doc;
        String nit, cons, tipo_doc, ruta_doc, ruta_nueva;
        String proveedor = lblproveedor.getText();
        String empresa = lblempresa.getText();
        id_factura = Integer.parseInt(lblid.getText());
        id_proveedor = PC.id_proveedor(proveedor);
        id_empresa = EMPC.id_empresa(empresa);
        if (!txtdocte.getText().equals("")) {
            cons = String.format("%06d", Integer.parseInt(txtdocte.getText()));
        } else {
            cons = "";
        }
        nit = lblnit.getText();
        String no_factura = lblnfact.getText();
        id_tipo_doc = TDC.id_tipo_doc_pref(cmbdocte.getSelectedItem().toString());
        switch (procedimiento) {
            case 1:
                if (cmbdocte.getSelectedItem().toString().equals("TV")) {
                    tipo_doc = "Transferencia Virtual";
                } else {
                    tipo_doc = "Comprobante de Egreso";
                }
                id_tipo_doc = TDC.id_tipo_doc(tipo_doc);
                ruta_doc = suno.ubicacion_documento(nit, id_empresa, id_tipo_doc);
                ruta_nueva = DC.ubicacion_documento("Factura", id_factura);
                if (suno.existe_documento_suno(nit, id_empresa, id_tipo_doc, cons)) {
                    MD.Cargar_Documento(no_factura, proveedor, empresa, tipo_doc, ruta_doc, id_tipo_doc, cons, id_proveedor, id_empresa);
                    LT.docs_tesoreria(jtdocsT, id_factura);
                    cmbdocte.setSelectedIndex(0);
                    txtdocte.setText("");
                    btnverte.setEnabled(false);
                    btnokte.setEnabled(false);
                } else {
                    System.err.println("El documento no se cargara a la factura");
                }
                break;
            case 2:
                String ubicacion;
                nit = PC.nit_proveedor(lblproveedor.getText());
                ubicacion = suno.ubicacion_documento(nit, id_empresa, id_tipo_doc);
                suno.ver_documento(ubicacion);
                break;
            case 3:
                if (!txtdocte.getText().equals("")) {
                    String consecutivo;
                    boolean existe;
                    nit = PC.nit_proveedor(lblproveedor.getText());
                    consecutivo = txtdocte.getText();
                    existe = suno.existe_documento_suno(nit, id_empresa, id_tipo_doc, consecutivo);
                    if (existe) {
                        btnokte.setEnabled(true);
                        btnverte.setEnabled(true);
                    } else {
                        btnokte.setEnabled(false);
                        btnverte.setEnabled(false);
                    }
                }
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGgestion;
    private javax.swing.JPanel Nuevo_T_Documento;
    public static javax.swing.JTabbedPane Tabpane;
    private javax.swing.JButton btnANT;
    private javax.swing.JButton btnDQ;
    private javax.swing.JButton btnDQdoc;
    private javax.swing.JButton btnIMdoc;
    private javax.swing.JButton btnNI;
    private javax.swing.JButton btnNIdoc;
    private javax.swing.JButton btnNP;
    private javax.swing.JButton btnNPdoc;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnSC;
    private javax.swing.JButton btnSCdoc;
    private javax.swing.JButton btnSU;
    private javax.swing.JButton btnSUdoc;
    private javax.swing.JButton btnTVdoc;
    private javax.swing.JButton btnaceptarcp;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnantupt;
    public static javax.swing.JButton btnaprobar;
    public javax.swing.JButton btnaprobar1;
    private javax.swing.JButton btnarchivo;
    public javax.swing.JButton btnbuscarA;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncancelarcp;
    private javax.swing.JButton btncancelartd;
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btncargarcp;
    private javax.swing.JButton btncreartd;
    private javax.swing.JButton btnctdoc;
    private javax.swing.JButton btndelAnt;
    public static javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminarcp;
    public javax.swing.JButton btnfact;
    public javax.swing.JButton btnfactura;
    public javax.swing.JButton btnlimpiarjcbs;
    private javax.swing.JButton btnmodificarcp;
    public javax.swing.JButton btnok;
    private javax.swing.JButton btnokcomp;
    private javax.swing.JButton btnokte;
    public javax.swing.JButton btnordencompra;
    public javax.swing.JButton btnordenservicio;
    public javax.swing.JButton btnrecepcompra;
    public javax.swing.JButton btnrecepservicio;
    private javax.swing.JButton btnrechazar;
    private javax.swing.JButton btnuptDQ;
    private javax.swing.JButton btnuptNI;
    private javax.swing.JButton btnuptNP;
    private javax.swing.JButton btnuptSC;
    private javax.swing.JButton btnuptSU;
    private javax.swing.JButton btnvercomp;
    private javax.swing.JButton btnvercp;
    private javax.swing.JButton btnverte;
    private javax.swing.JComboBox<String> cmbRcont;
    private javax.swing.JComboBox<String> cmbdocCOMP;
    private javax.swing.JComboBox<String> cmbdocte;
    private javax.swing.JComboBox<String> cmbtipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox jcbantMav;
    private javax.swing.JCheckBox jcbanticipo;
    private javax.swing.ButtonGroup jcbanticipos;
    private javax.swing.JCheckBox jcbantmv;
    private javax.swing.JCheckBox jcbeliminar;
    private com.toedter.calendar.JDateChooser jdcprogramar;
    private javax.swing.JPanel jpant;
    public static javax.swing.JPanel jpdocs;
    public static javax.swing.JPanel jpseguimiento;
    private javax.swing.JRadioButton jrbOpc1;
    private javax.swing.JRadioButton jrbOpc2;
    private javax.swing.JScrollPane jsant_pre;
    private javax.swing.JScrollPane jsseguimiento;
    private javax.swing.JTable jtantprov;
    private javax.swing.JTable jtdocsT;
    private javax.swing.JTable jtdocscompras;
    private javax.swing.JTable jtdocumentos;
    private javax.swing.JTable jtdocumentos2;
    public static javax.swing.JTable jtseguimiento;
    private javax.swing.JLabel lblant;
    public static javax.swing.JLabel lblapr;
    public static javax.swing.JLabel lblcoment3;
    public static javax.swing.JLabel lblcorresp;
    public static javax.swing.JLabel lblempresa;
    public static javax.swing.JLabel lblfechafact;
    public static javax.swing.JLabel lblfecharec;
    public static javax.swing.JLabel lblfechavenc;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JLabel lblmoneda;
    public static javax.swing.JLabel lblncuenta;
    public static javax.swing.JLabel lblnfact;
    public static javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblnodata;
    public static javax.swing.JLabel lblnombreu;
    public static javax.swing.JLabel lblproveedor;
    public static javax.swing.JLabel lblvalor;
    public static javax.swing.JPanel panelcontabilidad;
    public static javax.swing.JPanel panelgestion;
    public static javax.swing.JPanel panelrevision;
    public static javax.swing.JPanel paneltesoreria;
    private javax.swing.JTextArea tacomentario;
    private javax.swing.JTextArea tacomentario1;
    private javax.swing.JTextArea tacomentario2;
    public static javax.swing.JTextArea tacomentario3;
    private javax.swing.JTextField txtcomprobante;
    private javax.swing.JTextField txtdocCOMP;
    private javax.swing.JTextField txtdocte;
    public javax.swing.JTextField txtnombretd;
    public javax.swing.JTextField txtnpreftd;
    public javax.swing.JTextField txtubA;
    // End of variables declaration//GEN-END:variables
}
