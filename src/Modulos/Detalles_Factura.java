package Modulos;

import Clases.Llenar_Tablas;
import Controladores.Anticipo_Factura_Controller;
import Controladores.Documento_Controller;
import Controladores.Empresa_Controller;
import Controladores.Factura_Controller;
import Controladores.Proveedor_Controller;
import Objetos.Factura;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class Detalles_Factura extends javax.swing.JInternalFrame {

    Anticipo_Factura_Controller AntfC = new Anticipo_Factura_Controller();
    Proveedor_Controller PC = new Proveedor_Controller();
    Documento_Controller DC = new Documento_Controller();
    Empresa_Controller EMPC = new Empresa_Controller();
    Factura_Controller FC = new Factura_Controller();
    Llenar_Tablas LT = new Llenar_Tablas();

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Detalles_Factura() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcf = new javax.swing.JPanel();
        Tabpane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnfact = new javax.swing.JButton();
        btnSC = new javax.swing.JButton();
        btnDQ = new javax.swing.JButton();
        btnNI = new javax.swing.JButton();
        btnIM = new javax.swing.JButton();
        btnNP = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnTV = new javax.swing.JButton();
        btnSU = new javax.swing.JButton();
        btnCP = new javax.swing.JButton();
        btnOC = new javax.swing.JButton();
        btnOS = new javax.swing.JButton();
        btnEA = new javax.swing.JButton();
        btnES = new javax.swing.JButton();
        btnTB = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jsdocs = new javax.swing.JScrollPane();
        jtdocumentos = new javax.swing.JTable();
        lblant = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtgestion = new javax.swing.JTable();
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

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Detalles Factura");
        setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(400, 150));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelcf.setBackground(new java.awt.Color(234, 255, 255));
        panelcf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelcf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        panelcf.setMinimumSize(new java.awt.Dimension(400, 150));
        panelcf.setLayout(null);

        Tabpane.setBackground(new java.awt.Color(255, 229, 178));
        Tabpane.setForeground(new java.awt.Color(107, 70, 0));
        Tabpane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Tabpane.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Tabpane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabpaneStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102))), "Documentos Cargados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel2.setLayout(null);

        btnfact.setBackground(new java.awt.Color(224, 240, 177));
        btnfact.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnfact.setForeground(new java.awt.Color(37, 112, 0));
        btnfact.setText("<html><p align=\"center\">Factura</p></html>");
        btnfact.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnfact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfact.setEnabled(false);
        btnfact.setFocusPainted(false);
        btnfact.setFocusable(false);
        btnfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactActionPerformed(evt);
            }
        });
        jPanel2.add(btnfact);
        btnfact.setBounds(20, 30, 110, 50);

        btnSC.setBackground(new java.awt.Color(224, 240, 177));
        btnSC.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnSC.setForeground(new java.awt.Color(37, 112, 0));
        btnSC.setText("<html><p align=\"center\">Soporte de<br>Causación</p></html>");
        btnSC.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSC.setEnabled(false);
        btnSC.setFocusPainted(false);
        btnSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCActionPerformed(evt);
            }
        });
        jPanel2.add(btnSC);
        btnSC.setBounds(140, 90, 110, 50);

        btnDQ.setBackground(new java.awt.Color(224, 240, 177));
        btnDQ.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnDQ.setForeground(new java.awt.Color(37, 112, 0));
        btnDQ.setText("<html><p align=\"center\">Documento<br>Equivalente</p></html>");
        btnDQ.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnDQ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDQ.setEnabled(false);
        btnDQ.setFocusPainted(false);
        btnDQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDQActionPerformed(evt);
            }
        });
        jPanel2.add(btnDQ);
        btnDQ.setBounds(260, 90, 110, 50);

        btnNI.setBackground(new java.awt.Color(224, 240, 177));
        btnNI.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnNI.setForeground(new java.awt.Color(37, 112, 0));
        btnNI.setText("<html><p align=\"center\">Nota Interna</p></html>");
        btnNI.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNI.setEnabled(false);
        btnNI.setFocusPainted(false);
        btnNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNIActionPerformed(evt);
            }
        });
        jPanel2.add(btnNI);
        btnNI.setBounds(140, 150, 110, 50);

        btnIM.setBackground(new java.awt.Color(224, 240, 177));
        btnIM.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnIM.setForeground(new java.awt.Color(37, 112, 0));
        btnIM.setText("<html><p align=\"center\">Impuestos</p></html>");
        btnIM.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnIM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIM.setEnabled(false);
        btnIM.setFocusPainted(false);
        btnIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMActionPerformed(evt);
            }
        });
        jPanel2.add(btnIM);
        btnIM.setBounds(380, 90, 110, 50);

        btnNP.setBackground(new java.awt.Color(224, 240, 177));
        btnNP.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnNP.setForeground(new java.awt.Color(37, 112, 0));
        btnNP.setText("<html><p align=\"center\">Nota a<br>Proveedor</p></html>");
        btnNP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNP.setEnabled(false);
        btnNP.setFocusPainted(false);
        btnNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNPActionPerformed(evt);
            }
        });
        jPanel2.add(btnNP);
        btnNP.setBounds(20, 150, 110, 50);

        btnCE.setBackground(new java.awt.Color(224, 240, 177));
        btnCE.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnCE.setForeground(new java.awt.Color(37, 112, 0));
        btnCE.setText("<html><p align=\"center\">Comrpbante<br>de Egreso</p></html>");
        btnCE.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnCE.setEnabled(false);
        btnCE.setFocusPainted(false);
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel2.add(btnCE);
        btnCE.setBounds(260, 150, 110, 50);

        btnTV.setBackground(new java.awt.Color(224, 240, 177));
        btnTV.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnTV.setForeground(new java.awt.Color(37, 112, 0));
        btnTV.setText("<html><p align=\"center\">Transferencia<br>Virtual</p></html>");
        btnTV.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnTV.setEnabled(false);
        btnTV.setFocusPainted(false);
        btnTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVActionPerformed(evt);
            }
        });
        jPanel2.add(btnTV);
        btnTV.setBounds(380, 150, 110, 50);

        btnSU.setBackground(new java.awt.Color(224, 240, 177));
        btnSU.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnSU.setForeground(new java.awt.Color(37, 112, 0));
        btnSU.setText("<html><p align=\"center\">Causación<br>en Dólares</p></html>");
        btnSU.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnSU.setEnabled(false);
        btnSU.setFocusPainted(false);
        btnSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUActionPerformed(evt);
            }
        });
        jPanel2.add(btnSU);
        btnSU.setBounds(200, 210, 110, 50);

        btnCP.setBackground(new java.awt.Color(224, 240, 177));
        btnCP.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnCP.setForeground(new java.awt.Color(37, 112, 0));
        btnCP.setText("<html><p align=\"center\">Comprobante<br>de Pago</p></html>");
        btnCP.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnCP.setEnabled(false);
        btnCP.setFocusPainted(false);
        btnCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPActionPerformed(evt);
            }
        });
        jPanel2.add(btnCP);
        btnCP.setBounds(320, 210, 110, 50);

        btnOC.setBackground(new java.awt.Color(224, 240, 177));
        btnOC.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnOC.setForeground(new java.awt.Color(37, 112, 0));
        btnOC.setText("<html><p align=\"center\">Orden de<br>Compra</p></html>");
        btnOC.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnOC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOC.setEnabled(false);
        btnOC.setFocusPainted(false);
        btnOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOCActionPerformed(evt);
            }
        });
        jPanel2.add(btnOC);
        btnOC.setBounds(140, 30, 110, 50);

        btnOS.setBackground(new java.awt.Color(224, 240, 177));
        btnOS.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnOS.setForeground(new java.awt.Color(37, 112, 0));
        btnOS.setText("<html><p align=\"center\">Orden de<br>Servicio</p></html>");
        btnOS.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOS.setEnabled(false);
        btnOS.setFocusPainted(false);
        btnOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOSActionPerformed(evt);
            }
        });
        jPanel2.add(btnOS);
        btnOS.setBounds(260, 30, 110, 50);

        btnEA.setBackground(new java.awt.Color(224, 240, 177));
        btnEA.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnEA.setForeground(new java.awt.Color(37, 112, 0));
        btnEA.setText("<html><p align=\"center\">Recepción<br>por Compras</p></html>");
        btnEA.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnEA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEA.setEnabled(false);
        btnEA.setFocusPainted(false);
        btnEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEAActionPerformed(evt);
            }
        });
        jPanel2.add(btnEA);
        btnEA.setBounds(380, 30, 110, 50);

        btnES.setBackground(new java.awt.Color(224, 240, 177));
        btnES.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnES.setForeground(new java.awt.Color(37, 112, 0));
        btnES.setText("<html><p align=\"center\">Recepción<br>de Servicios</p></html>");
        btnES.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnES.setEnabled(false);
        btnES.setFocusPainted(false);
        btnES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnESActionPerformed(evt);
            }
        });
        jPanel2.add(btnES);
        btnES.setBounds(20, 90, 110, 50);

        btnTB.setBackground(new java.awt.Color(224, 240, 177));
        btnTB.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnTB.setForeground(new java.awt.Color(37, 112, 0));
        btnTB.setText("<html><p align=\"center\">Transferencia<br>Bancaria</p></html>");
        btnTB.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnTB.setEnabled(false);
        btnTB.setFocusPainted(false);
        btnTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTBActionPerformed(evt);
            }
        });
        jPanel2.add(btnTB);
        btnTB.setBounds(80, 210, 110, 50);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 10, 510, 280);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(425, 30));
        jPanel5.setLayout(null);

        jsdocs.setBackground(new java.awt.Color(102, 102, 102));
        jsdocs.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jsdocs.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsdocs.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsdocs.setPreferredSize(new java.awt.Dimension(509, 402));

        jtdocumentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        jtdocumentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtdocumentos.setFillsViewportHeight(true);
        jtdocumentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtdocumentosMouseClicked(evt);
            }
        });
        jsdocs.setViewportView(jtdocumentos);

        jPanel5.add(jsdocs);
        jsdocs.setBounds(10, 24, 330, 210);

        lblant.setBackground(new java.awt.Color(255, 217, 142));
        lblant.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblant.setForeground(new java.awt.Color(0, 102, 153));
        lblant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblant.setOpaque(true);
        jPanel5.add(lblant);
        lblant.setBounds(115, 240, 130, 26);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(530, 10, 350, 280);

        Tabpane.addTab("Documentación", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel4.setLayout(null);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtgestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtgestion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtgestion.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jtgestion);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(5, 5, 882, 285);

        Tabpane.addTab("Seguimiento", jPanel4);

        panelcf.add(Tabpane);
        Tabpane.setBounds(10, 170, 900, 330);

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
        jLabel4.setText("Recibida:");
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

        panelcf.add(jPanel1);
        jPanel1.setBounds(10, 10, 900, 150);

        getContentPane().add(panelcf, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabpaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabpaneStateChanged
        switch (Tabpane.getTitleAt(Tabpane.getSelectedIndex())) {
            case "Seguimiento":
                LT.Seguimiento(jtgestion, Integer.parseInt(lblid.getText()));
                break;
        }
    }//GEN-LAST:event_TabpaneStateChanged

    private void btnfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactActionPerformed
        DC.ver_documento("Factura", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnfactActionPerformed

    private void btnOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOCActionPerformed
        DC.ver_documento("Orden de Compra", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnOCActionPerformed

    private void btnOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOSActionPerformed
        DC.ver_documento("Orden de Servicio", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnOSActionPerformed

    private void btnEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEAActionPerformed
        DC.ver_documento("Recepción por Compras", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnEAActionPerformed

    private void btnESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnESActionPerformed
        DC.ver_documento("Recepción de Servicios", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnESActionPerformed

    private void btnSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCActionPerformed
        DC.ver_documento("Soporte de Causacion", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSCActionPerformed

    private void btnDQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDQActionPerformed
        DC.ver_documento("Documento Equivalente", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnDQActionPerformed

    private void btnIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMActionPerformed
        DC.ver_documento("Factura", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnIMActionPerformed

    private void btnNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNPActionPerformed
        DC.ver_documento("Nota a Proveedor", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNPActionPerformed

    private void btnNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNIActionPerformed
        DC.ver_documento("Nota Interna", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnNIActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        DC.ver_documento("Comprobante de Egreso", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVActionPerformed
        DC.ver_documento("Transferencia Virtual", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnTVActionPerformed

    private void btnTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTBActionPerformed
        DC.ver_documento("Transferencia Bancaria", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnTBActionPerformed

    private void btnSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUActionPerformed
        DC.ver_documento("Causacion en Dolares", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnSUActionPerformed

    private void btnCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPActionPerformed
        DC.ver_documento("Comprobante de Pago", Integer.parseInt(lblid.getText()));
    }//GEN-LAST:event_btnCPActionPerformed

    private void jtdocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtdocumentosMouseClicked
        int column = jtdocumentos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtdocumentos.getRowHeight();
        if (row < jtdocumentos.getRowCount() && row >= 0 && column < jtdocumentos.getColumnCount() && column >= 0) {
            Object value = jtdocumentos.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                switch (boton.getName()) {
                    case "ver":
                        int idfact = Integer.parseInt(lblid.getText());
                        DC.ver_documento(jtdocumentos.getValueAt(jtdocumentos.getSelectedRow(), 0).toString(), idfact);
                        break;
                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_jtdocumentosMouseClicked

    public void llenar_campos(String no_factura, String proveedor, String empresa, String area, String estado) {
        Factura F = FC.buscar(no_factura, proveedor, empresa);
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
        if (F != null) {
            try {
                lblproveedor.setText(PC.rs_proveedor(F.getId_proveedor()));
                lblnit.setText(PC.nit_proveedor(PC.rs_proveedor(F.getId_proveedor())));
                lblempresa.setText(EMPC.empresa(F.getId_empresa()));
                if ("".equals(F.getFecha_recepcion())) {
                    lblfecharec.setText("");
                } else {
                    Date fecha = formatoDeFecha.parse(F.getFecha_recepcion());
                    lblfecharec.setText(formatoDeFecha.format(fecha));
                }
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
                facturas_anticipadas();
                buscar_docs();
                LT.Documentos_Factura(jtdocumentos, Integer.parseInt(lblid.getText()), 2);
            } catch (ParseException ex) {
                Logger.getLogger(Detalles_Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void buscar_docs() {
        int idfact = Integer.parseInt(lblid.getText());
        for (int i = 0; i <= 12; i++) {
            switch (i) {
                case 1:
                    if (DC.existe_documento("Factura", idfact)) {
                        btnfact.setEnabled(true);
                    } else {
                        btnfact.setEnabled(false);
                    }
                    break;
                case 2:
                    if (DC.existe_documento("Orden de Compra", idfact)) {
                        btnOC.setEnabled(true);
                    } else {
                        btnOC.setEnabled(false);
                    }
                    break;
                case 3:
                    if (DC.existe_documento("Orden de Servicio", idfact)) {
                        btnOS.setEnabled(true);
                    } else {
                        btnOS.setEnabled(false);
                    }
                    break;
                case 4:
                    if (DC.existe_documento("Recepción de Servicios", idfact)) {
                        btnES.setEnabled(true);
                    } else {
                        btnES.setEnabled(false);
                    }
                    break;
                case 5:
                    if (DC.existe_documento("Recepción por Compras", idfact)) {
                        btnEA.setEnabled(true);
                    } else {
                        btnEA.setEnabled(false);
                    }
                    break;
                case 6:
                    if (DC.existe_documento("Soporte de Causacion", idfact)) {
                        btnSC.setEnabled(true);
                    } else {
                        btnSC.setEnabled(false);
                    }
                    break;
                case 7:
                    if (DC.existe_documento("Documento Equivalente", idfact)) {
                        btnDQ.setEnabled(true);
                    } else {
                        btnDQ.setEnabled(false);
                    }
                    break;
                case 8:
                    if (DC.existe_documento("Impuestos", idfact)) {
                        btnIM.setEnabled(true);
                    } else {
                        btnIM.setEnabled(false);
                    }
                    break;
                case 9:
                    if (DC.existe_documento("Nota a Proveedor", idfact)) {
                        btnNP.setEnabled(true);
                    } else {
                        btnNP.setEnabled(false);
                    }
                    break;
                case 10:
                    if (DC.existe_documento("Nota Interna", idfact)) {
                        btnNI.setEnabled(true);
                    } else {
                        btnNI.setEnabled(false);
                    }
                    break;
                case 11:
                    if (DC.existe_documento("Comprobante de Egreso", idfact)) {
                        btnCE.setEnabled(true);
                    } else {
                        btnCE.setEnabled(false);
                    }
                    break;
                case 12:
                    if (DC.existe_documento("Transferencia Virtual", idfact)) {
                        btnTV.setEnabled(true);
                    } else {
                        btnTV.setEnabled(false);
                    }
                case 13:
                    if (DC.existe_documento("Transferencia Bancaria", idfact)) {
                        btnTB.setEnabled(true);
                    } else {
                        btnTB.setEnabled(false);
                    }
                case 14:
                    if (DC.existe_documento("Causacion en Dolares", idfact)) {
                        btnSU.setEnabled(true);
                    } else {
                        btnSU.setEnabled(false);
                    }
                case 15:
                    if (DC.existe_documento("Comprobante de Pago", idfact)) {
                        btnCP.setEnabled(true);
                    } else {
                        btnCP.setEnabled(false);
                    }
                    break;
            }
        }
    }

    public void facturas_anticipadas() {
        switch (AntfC.tipo_anticipo(Integer.parseInt(lblid.getText()))) {
            case 1:
                lblant.setVisible(true);
                lblant.setText("Con Anticipo");
                lblant.setBounds(115, 240, 130, 26);
                jsdocs.setSize(330, 210);
                break;
            case 2:
                lblant.setVisible(true);
                lblant.setText("Con Anticipo de Menor Valor");
                lblant.setBounds(40, 240, 270, 26);
                jsdocs.setSize(330, 210);
                break;
            case 3:
                lblant.setVisible(true);
                lblant.setText("Con Anticipo de Mayor Valor");
                lblant.setBounds(40, 240, 270, 26);
                jsdocs.setSize(330, 210);
                break;
            default:
                lblant.setVisible(false);
                lblant.setText("");
                lblant.setBounds(40, 240, 270, 26);
                jsdocs.setSize(330, 245);
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Tabpane;
    public javax.swing.JButton btnCE;
    public javax.swing.JButton btnCP;
    public javax.swing.JButton btnDQ;
    public javax.swing.JButton btnEA;
    public javax.swing.JButton btnES;
    public javax.swing.JButton btnIM;
    public javax.swing.JButton btnNI;
    public javax.swing.JButton btnNP;
    public javax.swing.JButton btnOC;
    public javax.swing.JButton btnOS;
    public javax.swing.JButton btnSC;
    public javax.swing.JButton btnSU;
    public javax.swing.JButton btnTB;
    public javax.swing.JButton btnTV;
    public static javax.swing.JButton btnfact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jsdocs;
    public static javax.swing.JTable jtdocumentos;
    private javax.swing.JTable jtgestion;
    public static javax.swing.JLabel lblant;
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
    public static javax.swing.JLabel lblproveedor;
    public static javax.swing.JLabel lblvalor;
    private javax.swing.JPanel panelcf;
    // End of variables declaration//GEN-END:variables
}
