package Modulos;

public class Lotes_Pago extends javax.swing.JInternalFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Lotes_Pago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupolotes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabpane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbproveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtnfb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scrollfact = new javax.swing.JScrollPane();
        jtfacturasL = new javax.swing.JTable();
        btnbuscarA3 = new javax.swing.JButton();
        btnbuscarA2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNlote = new javax.swing.JTextField();
        scrollfact1 = new javax.swing.JScrollPane();
        jtfacturasLote = new javax.swing.JTable();
        cmbbancos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnbuscarA4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtlotes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtlotes1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtnfb1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbempresa2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbempresaL = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jdcfecha1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        cmbestado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbgeneral = new javax.swing.JRadioButton();
        jrbpendiente = new javax.swing.JRadioButton();
        jrbcompletado = new javax.swing.JRadioButton();
        btnbuscarA5 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Lote de pago");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setLayout(null);

        tabpane.setBackground(new java.awt.Color(255, 255, 255));
        tabpane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabpane.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Filtrar por", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor:");
        jLabel3.setMaximumSize(new java.awt.Dimension(79, 26));
        jLabel3.setMinimumSize(new java.awt.Dimension(79, 26));
        jLabel3.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel5.add(jLabel3);
        jLabel3.setBounds(20, 30, 90, 26);

        cmbproveedor.setEditable(true);
        cmbproveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbproveedor.setFocusable(false);
        cmbproveedor.setMaximumSize(new java.awt.Dimension(680, 26));
        cmbproveedor.setMinimumSize(new java.awt.Dimension(680, 26));
        cmbproveedor.setPreferredSize(new java.awt.Dimension(680, 26));
        jPanel5.add(cmbproveedor);
        cmbproveedor.setBounds(120, 30, 670, 26);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("No. Factura:");
        jLabel7.setMaximumSize(new java.awt.Dimension(84, 26));
        jLabel7.setMinimumSize(new java.awt.Dimension(84, 26));
        jLabel7.setPreferredSize(new java.awt.Dimension(84, 26));
        jPanel5.add(jLabel7);
        jLabel7.setBounds(20, 70, 90, 26);

        txtnfb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnfb.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtnfb.setMaximumSize(new java.awt.Dimension(216, 26));
        txtnfb.setMinimumSize(new java.awt.Dimension(216, 26));
        txtnfb.setName(""); // NOI18N
        txtnfb.setPreferredSize(new java.awt.Dimension(216, 26));
        jPanel5.add(txtnfb);
        txtnfb.setBounds(120, 70, 210, 26);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Empresa:");
        jLabel8.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel8.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel8.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel8);
        jLabel8.setBounds(360, 70, 70, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresa.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbempresa.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbempresa.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel5.add(cmbempresa);
        cmbempresa.setBounds(430, 70, 150, 26);

        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setText("Restablecer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton1);
        jButton1.setBounds(680, 70, 105, 27);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 51));
        jLabel19.setText("*");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(583, 70, 10, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(30, 10, 810, 110);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FACTURAS");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 130, 400, 30);

        scrollfact.setBackground(new java.awt.Color(102, 102, 102));
        scrollfact.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        scrollfact.setToolTipText("");

        jtfacturasL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfacturasL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtfacturasL.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtfacturasL.setFillsViewportHeight(true);
        jtfacturasL.setGridColor(new java.awt.Color(255, 255, 255));
        jtfacturasL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtfacturasL.setUpdateSelectionOnSort(false);
        scrollfact.setViewportView(jtfacturasL);

        jPanel2.add(scrollfact);
        scrollfact.setBounds(30, 160, 400, 170);

        btnbuscarA3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnbuscarA3.setText(">>");
        btnbuscarA3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscarA3.setFocusPainted(false);
        btnbuscarA3.setFocusable(false);
        btnbuscarA3.setPreferredSize(new java.awt.Dimension(83, 26));
        jPanel2.add(btnbuscarA3);
        btnbuscarA3.setBounds(440, 190, 30, 30);

        btnbuscarA2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnbuscarA2.setText("<<");
        btnbuscarA2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscarA2.setFocusPainted(false);
        btnbuscarA2.setFocusable(false);
        btnbuscarA2.setPreferredSize(new java.awt.Dimension(83, 26));
        jPanel2.add(btnbuscarA2);
        btnbuscarA2.setBounds(440, 230, 30, 30);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOTE DE PAGO");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(480, 130, 300, 30);

        txtNlote.setBackground(new java.awt.Color(153, 153, 153));
        txtNlote.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNlote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNlote.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        txtNlote.setMaximumSize(new java.awt.Dimension(216, 26));
        txtNlote.setMinimumSize(new java.awt.Dimension(216, 26));
        txtNlote.setName(""); // NOI18N
        txtNlote.setOpaque(false);
        txtNlote.setPreferredSize(new java.awt.Dimension(216, 26));
        jPanel2.add(txtNlote);
        txtNlote.setBounds(780, 130, 60, 30);

        scrollfact1.setBackground(new java.awt.Color(102, 102, 102));
        scrollfact1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        scrollfact1.setToolTipText("");

        jtfacturasLote.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfacturasLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtfacturasLote.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtfacturasLote.setFillsViewportHeight(true);
        jtfacturasLote.setGridColor(new java.awt.Color(255, 255, 255));
        jtfacturasLote.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtfacturasLote.setUpdateSelectionOnSort(false);
        scrollfact1.setViewportView(jtfacturasLote);

        jPanel2.add(scrollfact1);
        scrollfact1.setBounds(480, 160, 360, 170);

        cmbbancos.setEditable(true);
        cmbbancos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbbancos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbbancos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbbancos.setFocusable(false);
        cmbbancos.setMaximumSize(new java.awt.Dimension(680, 26));
        cmbbancos.setMinimumSize(new java.awt.Dimension(680, 26));
        cmbbancos.setPreferredSize(new java.awt.Dimension(680, 26));
        jPanel2.add(cmbbancos);
        cmbbancos.setBounds(90, 350, 310, 26);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total:");
        jLabel6.setMaximumSize(new java.awt.Dimension(79, 26));
        jLabel6.setMinimumSize(new java.awt.Dimension(79, 26));
        jLabel6.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(660, 350, 50, 26);

        btnbuscarA4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnbuscarA4.setText("Crear Lote");
        btnbuscarA4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscarA4.setFocusPainted(false);
        btnbuscarA4.setFocusable(false);
        btnbuscarA4.setPreferredSize(new java.awt.Dimension(83, 26));
        jPanel2.add(btnbuscarA4);
        btnbuscarA4.setBounds(370, 395, 120, 26);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Banco:");
        jLabel9.setMaximumSize(new java.awt.Dimension(79, 26));
        jLabel9.setMinimumSize(new java.awt.Dimension(79, 26));
        jLabel9.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 350, 50, 26);

        jdcfecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, null, new java.awt.Color(102, 102, 102)));
        jdcfecha.setDateFormatString("dd/MM/yyyy");
        jdcfecha.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcfecha.setMaxSelectableDate(new java.util.Date(1577941199000L));
        jdcfecha.setMinSelectableDate(new java.util.Date(1546318860000L));
        jPanel2.add(jdcfecha);
        jdcfecha.setBounds(480, 350, 140, 26);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Fecha");
        jLabel10.setMaximumSize(new java.awt.Dimension(79, 26));
        jLabel10.setMinimumSize(new java.awt.Dimension(79, 26));
        jLabel10.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(430, 350, 50, 26);

        txtvalor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtvalor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtvalor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtvalor.setMaximumSize(new java.awt.Dimension(216, 26));
        txtvalor.setMinimumSize(new java.awt.Dimension(216, 26));
        txtvalor.setName(""); // NOI18N
        txtvalor.setPreferredSize(new java.awt.Dimension(216, 26));
        jPanel2.add(txtvalor);
        txtvalor.setBounds(720, 350, 120, 26);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 51));
        jLabel16.setText("*");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(623, 350, 10, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("*");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(843, 130, 10, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 51));
        jLabel18.setText("*");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(403, 350, 10, 20);

        tabpane.addTab("Crear", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel3.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jtlotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtlotes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtlotes.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jtlotes);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 502, 190);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jtlotes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtlotes1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtlotes1.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jtlotes1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(530, 160, 355, 190);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Filtrar por", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        txtnfb1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnfb1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtnfb1.setMaximumSize(new java.awt.Dimension(216, 26));
        txtnfb1.setMinimumSize(new java.awt.Dimension(216, 26));
        txtnfb1.setName(""); // NOI18N
        txtnfb1.setPreferredSize(new java.awt.Dimension(216, 26));
        jPanel6.add(txtnfb1);
        txtnfb1.setBounds(80, 30, 150, 26);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Lote:");
        jLabel11.setMaximumSize(new java.awt.Dimension(84, 26));
        jLabel11.setMinimumSize(new java.awt.Dimension(84, 26));
        jLabel11.setPreferredSize(new java.awt.Dimension(84, 26));
        jPanel6.add(jLabel11);
        jLabel11.setBounds(30, 30, 40, 26);

        cmbempresa2.setEditable(true);
        cmbempresa2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresa2.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbempresa2.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbempresa2.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel6.add(cmbempresa2);
        cmbempresa2.setBounds(80, 70, 370, 26);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Banco:");
        jLabel13.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel13.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel13.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel6.add(jLabel13);
        jLabel13.setBounds(20, 70, 50, 26);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Empresa:");
        jLabel14.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel14.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel14.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel6.add(jLabel14);
        jLabel14.setBounds(260, 30, 70, 26);

        cmbempresaL.setEditable(true);
        cmbempresaL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresaL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresaL.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresaL.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbempresaL.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbempresaL.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel6.add(cmbempresaL);
        cmbempresaL.setBounds(340, 30, 150, 26);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Fecha:");
        jLabel12.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel12.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel12.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel6.add(jLabel12);
        jLabel12.setBounds(520, 30, 50, 26);

        jdcfecha1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, null, new java.awt.Color(102, 102, 102)));
        jdcfecha1.setDateFormatString("dd/MM/yyyy");
        jdcfecha1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcfecha1.setMaxSelectableDate(new java.util.Date(1577941199000L));
        jdcfecha1.setMinSelectableDate(new java.util.Date(1546318860000L));
        jPanel6.add(jdcfecha1);
        jdcfecha1.setBounds(580, 30, 140, 26);

        jButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2.setText("Restablecer");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jButton2);
        jButton2.setBounds(750, 70, 105, 27);

        cmbestado.setEditable(true);
        cmbestado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbestado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbestado.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbestado.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbestado.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel6.add(cmbestado);
        cmbestado.setBounds(530, 70, 143, 26);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Estado:");
        jLabel15.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel15.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel15.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel6.add(jLabel15);
        jLabel15.setBounds(470, 70, 60, 26);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(20, 10, 867, 110);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Facturas Asociadas al Lote");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(530, 130, 355, 30);

        grupolotes.add(jrbgeneral);
        jrbgeneral.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbgeneral.setText("General");
        jrbgeneral.setOpaque(false);
        jPanel3.add(jrbgeneral);
        jrbgeneral.setBounds(230, 130, 93, 25);

        grupolotes.add(jrbpendiente);
        jrbpendiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbpendiente.setText("Pendientes");
        jrbpendiente.setOpaque(false);
        jPanel3.add(jrbpendiente);
        jrbpendiente.setBounds(30, 130, 120, 25);

        grupolotes.add(jrbcompletado);
        jrbcompletado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbcompletado.setText("Completados");
        jrbcompletado.setOpaque(false);
        jPanel3.add(jrbcompletado);
        jrbcompletado.setBounds(400, 130, 130, 25);

        btnbuscarA5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnbuscarA5.setText("No pagar");
        btnbuscarA5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscarA5.setFocusPainted(false);
        btnbuscarA5.setFocusable(false);
        btnbuscarA5.setPreferredSize(new java.awt.Dimension(83, 26));
        jPanel3.add(btnbuscarA5);
        btnbuscarA5.setBounds(810, 360, 70, 30);

        tabpane.addTab("Lotes", jPanel3);

        jPanel1.add(tabpane);
        tabpane.setBounds(10, 10, 970, 440);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarA2;
    private javax.swing.JButton btnbuscarA3;
    private javax.swing.JButton btnbuscarA4;
    private javax.swing.JButton btnbuscarA5;
    private javax.swing.JComboBox<String> cmbbancos;
    private javax.swing.JComboBox<String> cmbempresa;
    private javax.swing.JComboBox<String> cmbempresa2;
    private javax.swing.JComboBox<String> cmbempresaL;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbproveedor;
    private javax.swing.ButtonGroup grupolotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcfecha;
    private com.toedter.calendar.JDateChooser jdcfecha1;
    private javax.swing.JRadioButton jrbcompletado;
    private javax.swing.JRadioButton jrbgeneral;
    private javax.swing.JRadioButton jrbpendiente;
    private javax.swing.JTable jtfacturasL;
    private javax.swing.JTable jtfacturasLote;
    private javax.swing.JTable jtlotes;
    private javax.swing.JTable jtlotes1;
    private javax.swing.JScrollPane scrollfact;
    private javax.swing.JScrollPane scrollfact1;
    private javax.swing.JTabbedPane tabpane;
    public static javax.swing.JTextField txtNlote;
    public static javax.swing.JTextField txtnfb;
    public static javax.swing.JTextField txtnfb1;
    public static javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
