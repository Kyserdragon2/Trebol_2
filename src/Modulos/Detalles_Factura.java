package Modulos;

public class Detalles_Factura extends javax.swing.JInternalFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Detalles_Factura() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcf = new javax.swing.JPanel();
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
        jLabel17 = new javax.swing.JLabel();
        lblfechavenc = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblcorresp = new javax.swing.JLabel();
        lblproveedor = new javax.swing.JLabel();
        lblmoneda = new javax.swing.JLabel();
        lblncuenta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblant = new javax.swing.JLabel();
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
        btnUS = new javax.swing.JButton();
        btnCP = new javax.swing.JButton();
        btnOC = new javax.swing.JButton();
        btnOS = new javax.swing.JButton();
        btnEA = new javax.swing.JButton();
        btnES = new javax.swing.JButton();
        btnTB = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtdocumentos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtgestion = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Detalles Factura");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/Trébol2.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(400, 150));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelcf.setBackground(new java.awt.Color(102, 204, 255));
        panelcf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelcf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        panelcf.setMinimumSize(new java.awt.Dimension(400, 150));
        panelcf.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 217, 142));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Información Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        lblempresa.setBackground(new java.awt.Color(255, 255, 255));
        lblempresa.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblempresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblempresa.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblempresa.setOpaque(true);
        lblempresa.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblempresa);
        lblempresa.setBounds(270, 70, 90, 26);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Empresa:");
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 70, 66, 26);

        lblvalor.setBackground(new java.awt.Color(255, 255, 255));
        lblvalor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblvalor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvalor.setAlignmentX(0.5F);
        lblvalor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblvalor.setOpaque(true);
        lblvalor.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblvalor);
        lblvalor.setBounds(320, 110, 125, 26);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 110, 38, 26);

        lblnfact.setBackground(new java.awt.Color(255, 255, 255));
        lblnfact.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblnfact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnfact.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblnfact.setOpaque(true);
        lblnfact.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblnfact);
        lblnfact.setBounds(115, 110, 150, 26);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("No. Factura:");
        jLabel1.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 110, 85, 26);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proveedor:");
        jLabel2.setPreferredSize(new java.awt.Dimension(66, 26));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 73, 26);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Generada:");
        jLabel3.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 70, 70, 26);

        lblfechafact.setBackground(new java.awt.Color(255, 255, 255));
        lblfechafact.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblfechafact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfechafact.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblfechafact.setOpaque(true);
        lblfechafact.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfechafact);
        lblfechafact.setBounds(625, 70, 90, 26);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Recepción:");
        jLabel4.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(375, 70, 71, 26);

        lblfecharec.setBackground(new java.awt.Color(255, 255, 255));
        lblfecharec.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblfecharec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecharec.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblfecharec.setOpaque(true);
        lblfecharec.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfecharec);
        lblfecharec.setBounds(450, 70, 90, 26);

        lblnit.setBackground(new java.awt.Color(255, 255, 255));
        lblnit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblnit.setOpaque(true);
        lblnit.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblnit);
        lblnit.setBounds(60, 70, 130, 26);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nit:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(25, 70, 30, 26);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Vence:");
        jLabel17.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(730, 70, 54, 26);

        lblfechavenc.setBackground(new java.awt.Color(255, 255, 255));
        lblfechavenc.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblfechavenc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfechavenc.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblfechavenc.setOpaque(true);
        lblfechavenc.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblfechavenc);
        lblfechavenc.setBounds(790, 70, 90, 26);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Radicado:");
        jLabel18.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(715, 110, 71, 26);

        lblcorresp.setBackground(new java.awt.Color(255, 255, 255));
        lblcorresp.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblcorresp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcorresp.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblcorresp.setOpaque(true);
        lblcorresp.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblcorresp);
        lblcorresp.setBounds(790, 110, 90, 26);

        lblproveedor.setBackground(new java.awt.Color(255, 255, 255));
        lblproveedor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblproveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblproveedor.setOpaque(true);
        lblproveedor.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel1.add(lblproveedor);
        lblproveedor.setBounds(110, 30, 770, 26);

        lblmoneda.setBackground(new java.awt.Color(255, 255, 255));
        lblmoneda.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblmoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoneda.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblmoneda.setOpaque(true);
        lblmoneda.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblmoneda);
        lblmoneda.setBounds(450, 110, 71, 26);

        lblncuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblncuenta.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblncuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblncuenta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        lblncuenta.setOpaque(true);
        lblncuenta.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel1.add(lblncuenta);
        lblncuenta.setBounds(595, 110, 110, 26);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cuenta:");
        jLabel11.setPreferredSize(new java.awt.Dimension(38, 26));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(540, 110, 50, 26);

        panelcf.add(jPanel1);
        jPanel1.setBounds(10, 10, 900, 150);

        lblant.setBackground(new java.awt.Color(255, 255, 153));
        lblant.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblant.setForeground(new java.awt.Color(0, 51, 204));
        lblant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblant.setOpaque(true);
        panelcf.add(lblant);
        lblant.setBounds(420, 510, 130, 26);

        Tabpane.setBackground(new java.awt.Color(0, 0, 0));
        Tabpane.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Tabpane.setForeground(new java.awt.Color(255, 255, 255));
        Tabpane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Tabpane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102))), "Documentos Cargados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel2.setLayout(null);

        btnfact.setBackground(new java.awt.Color(202, 230, 121));
        btnfact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnfact.setForeground(new java.awt.Color(72, 96, 0));
        btnfact.setText("<html><p align=\"center\">Factura</p></html>");
        btnfact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnfact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfact.setFocusPainted(false);
        btnfact.setFocusable(false);
        jPanel2.add(btnfact);
        btnfact.setBounds(20, 30, 110, 50);

        btnSC.setBackground(new java.awt.Color(255, 255, 255));
        btnSC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSC.setForeground(new java.awt.Color(72, 96, 0));
        btnSC.setText("<html><p align=\"center\">Soporte de<br>Causación</p></html>");
        btnSC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSC.setEnabled(false);
        btnSC.setFocusPainted(false);
        jPanel2.add(btnSC);
        btnSC.setBounds(140, 90, 110, 50);

        btnDQ.setBackground(new java.awt.Color(255, 255, 255));
        btnDQ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDQ.setForeground(new java.awt.Color(72, 96, 0));
        btnDQ.setText("<html><p align=\"center\">Documento<br>Equivalente</p></html>");
        btnDQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDQ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDQ.setEnabled(false);
        btnDQ.setFocusPainted(false);
        jPanel2.add(btnDQ);
        btnDQ.setBounds(260, 90, 110, 50);

        btnNI.setBackground(new java.awt.Color(255, 255, 255));
        btnNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNI.setForeground(new java.awt.Color(72, 96, 0));
        btnNI.setText("<html><p align=\"center\">Nota Interna</p></html>");
        btnNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNI.setEnabled(false);
        btnNI.setFocusPainted(false);
        jPanel2.add(btnNI);
        btnNI.setBounds(140, 150, 110, 50);

        btnIM.setBackground(new java.awt.Color(255, 255, 255));
        btnIM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIM.setForeground(new java.awt.Color(72, 96, 0));
        btnIM.setText("<html><p align=\"center\">Impuestos</p></html>");
        btnIM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIM.setEnabled(false);
        btnIM.setFocusPainted(false);
        jPanel2.add(btnIM);
        btnIM.setBounds(380, 90, 110, 50);

        btnNP.setBackground(new java.awt.Color(255, 255, 255));
        btnNP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNP.setForeground(new java.awt.Color(72, 96, 0));
        btnNP.setText("<html><p align=\"center\">Nota a<br>Proveedor</p></html>");
        btnNP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNP.setEnabled(false);
        btnNP.setFocusPainted(false);
        jPanel2.add(btnNP);
        btnNP.setBounds(20, 150, 110, 50);

        btnCE.setBackground(new java.awt.Color(255, 255, 255));
        btnCE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCE.setForeground(new java.awt.Color(72, 96, 0));
        btnCE.setText("<html><p align=\"center\">Comrpbante<br>de Egreso</p></html>");
        btnCE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCE.setEnabled(false);
        btnCE.setFocusPainted(false);
        jPanel2.add(btnCE);
        btnCE.setBounds(260, 150, 110, 50);

        btnTV.setBackground(new java.awt.Color(255, 255, 255));
        btnTV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTV.setForeground(new java.awt.Color(72, 96, 0));
        btnTV.setText("<html><p align=\"center\">Transferencia<br>Virtual</p></html>");
        btnTV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTV.setEnabled(false);
        btnTV.setFocusPainted(false);
        jPanel2.add(btnTV);
        btnTV.setBounds(380, 150, 110, 50);

        btnUS.setBackground(new java.awt.Color(255, 255, 255));
        btnUS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUS.setForeground(new java.awt.Color(72, 96, 0));
        btnUS.setText("<html><p align=\"center\">Causación<br>en Dólares</p></html>");
        btnUS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUS.setEnabled(false);
        btnUS.setFocusPainted(false);
        jPanel2.add(btnUS);
        btnUS.setBounds(200, 210, 110, 50);

        btnCP.setBackground(new java.awt.Color(255, 255, 255));
        btnCP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCP.setForeground(new java.awt.Color(72, 96, 0));
        btnCP.setText("<html><p align=\"center\">Comprobante<br>de Pago</p></html>");
        btnCP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCP.setEnabled(false);
        btnCP.setFocusPainted(false);
        jPanel2.add(btnCP);
        btnCP.setBounds(320, 210, 110, 50);

        btnOC.setBackground(new java.awt.Color(255, 255, 255));
        btnOC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOC.setForeground(new java.awt.Color(72, 96, 0));
        btnOC.setText("<html><p align=\"center\">Orden de<br>Compra</p></html>");
        btnOC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOC.setEnabled(false);
        btnOC.setFocusPainted(false);
        jPanel2.add(btnOC);
        btnOC.setBounds(140, 30, 110, 50);

        btnOS.setBackground(new java.awt.Color(255, 255, 255));
        btnOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOS.setForeground(new java.awt.Color(72, 96, 0));
        btnOS.setText("<html><p align=\"center\">Orden de<br>Servicio</p></html>");
        btnOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOS.setEnabled(false);
        btnOS.setFocusPainted(false);
        jPanel2.add(btnOS);
        btnOS.setBounds(260, 30, 110, 50);

        btnEA.setBackground(new java.awt.Color(255, 255, 255));
        btnEA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEA.setForeground(new java.awt.Color(72, 96, 0));
        btnEA.setText("<html><p align=\"center\">Recepción<br>por Compras</p></html>");
        btnEA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEA.setEnabled(false);
        btnEA.setFocusPainted(false);
        jPanel2.add(btnEA);
        btnEA.setBounds(380, 30, 110, 50);

        btnES.setBackground(new java.awt.Color(255, 255, 255));
        btnES.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnES.setForeground(new java.awt.Color(72, 96, 0));
        btnES.setText("<html><p align=\"center\">Recepción<br>de Servicios</p></html>");
        btnES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnES.setEnabled(false);
        btnES.setFocusPainted(false);
        jPanel2.add(btnES);
        btnES.setBounds(20, 90, 110, 50);

        btnTB.setBackground(new java.awt.Color(255, 255, 255));
        btnTB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTB.setForeground(new java.awt.Color(72, 96, 0));
        btnTB.setText("<html><p align=\"center\">Transferencia<br>Bancaria</p></html>");
        btnTB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTB.setEnabled(false);
        btnTB.setFocusPainted(false);
        jPanel2.add(btnTB);
        btnTB.setBounds(80, 210, 110, 50);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 10, 510, 280);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(425, 30));
        jPanel5.setLayout(null);

        jScrollPane5.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setPreferredSize(new java.awt.Dimension(509, 402));

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
        jScrollPane5.setViewportView(jtdocumentos);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(10, 24, 330, 245);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(530, 10, 350, 280);

        Tabpane.addTab("Documentación", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jtgestion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
        jScrollPane2.setBounds(10, 10, 870, 280);

        Tabpane.addTab("Seguimiento", jPanel4);

        panelcf.add(Tabpane);
        Tabpane.setBounds(10, 170, 900, 330);

        getContentPane().add(panelcf, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabpane;
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
    public javax.swing.JButton btnTB;
    public javax.swing.JButton btnTV;
    public javax.swing.JButton btnUS;
    public static javax.swing.JButton btnfact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    public static javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTable jtdocumentos;
    private javax.swing.JTable jtgestion;
    public static javax.swing.JLabel lblant;
    public static javax.swing.JLabel lblcorresp;
    public static javax.swing.JLabel lblempresa;
    public static javax.swing.JLabel lblfechafact;
    public static javax.swing.JLabel lblfecharec;
    public static javax.swing.JLabel lblfechavenc;
    public static javax.swing.JLabel lblmoneda;
    public static javax.swing.JLabel lblncuenta;
    public static javax.swing.JLabel lblnfact;
    public static javax.swing.JLabel lblnit;
    public static javax.swing.JLabel lblproveedor;
    public static javax.swing.JLabel lblvalor;
    private javax.swing.JPanel panelcf;
    // End of variables declaration//GEN-END:variables
}
