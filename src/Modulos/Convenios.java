package Modulos;


public final class Convenios extends javax.swing.JInternalFrame {

    public Convenios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmodificar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtconvenios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbproveedor1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbempresa1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtncuenta1 = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        cmbcant = new javax.swing.JComboBox<>();
        btnNconvenio = new javax.swing.JButton();
        btnNconvenio1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbproveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtncuenta = new javax.swing.JTextField();
        btnrest = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        jmodificar.setText("Modificar");
        jPopupMenu1.add(jmodificar);
        jPopupMenu1.add(jSeparator1);

        jEliminar.setText("Eliminar");
        jPopupMenu1.add(jEliminar);

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Convenios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jtconvenios.setAutoCreateRowSorter(true);
        jtconvenios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtconvenios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtconvenios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtconvenios.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jtconvenios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 125, 780, 170);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Crear Convenio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 30, 80, 26);

        cmbproveedor1.setEditable(true);
        cmbproveedor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbproveedor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbproveedor1.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel3.add(cmbproveedor1);
        cmbproveedor1.setBounds(100, 30, 450, 26);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Cantidad");
        jLabel12.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(460, 70, 70, 26);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Empresa");
        jLabel8.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel3.add(jLabel8);
        jLabel8.setBounds(560, 30, 70, 26);

        cmbempresa1.setEditable(true);
        cmbempresa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresa1.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbempresa1.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel3.add(cmbempresa1);
        cmbempresa1.setBounds(640, 30, 130, 26);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("No. Cuenta");
        jLabel14.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 70, 80, 26);

        txtncuenta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtncuenta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncuenta1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtncuenta1.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanel3.add(txtncuenta1);
        txtncuenta1.setBounds(100, 70, 130, 26);

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(153, 0, 0));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelar.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel3.add(btncancelar);
        btncancelar.setBounds(600, 70, 80, 26);

        btncrear.setBackground(new java.awt.Color(204, 255, 153));
        btncrear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncrear.setText("Crear");
        btncrear.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncrear.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel3.add(btncrear);
        btncrear.setBounds(690, 70, 80, 26);

        cmbcant.setEditable(true);
        cmbcant.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbcant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbcant.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbcant.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbcant.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel3.add(cmbcant);
        cmbcant.setBounds(535, 70, 50, 26);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 300, 780, 110);

        btnNconvenio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNconvenio.setText("Nuevo Convenio");
        btnNconvenio.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNconvenio.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel1.add(btnNconvenio);
        btnNconvenio.setBounds(15, 20, 130, 26);

        btnNconvenio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNconvenio1.setText("Buscar Convenio");
        btnNconvenio1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnNconvenio1.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel1.add(btnNconvenio1);
        btnNconvenio1.setBounds(660, 20, 130, 26);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Filtrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proveedor");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 80, 26);

        cmbproveedor.setEditable(true);
        cmbproveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbproveedor.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel2.add(cmbproveedor);
        cmbproveedor.setBounds(110, 30, 510, 26);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Empresa");
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 70, 80, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresa.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbempresa.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel2.add(cmbempresa);
        cmbempresa.setBounds(110, 70, 150, 26);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("No. Cuenta");
        jLabel11.setPreferredSize(new java.awt.Dimension(74, 26));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(290, 70, 80, 26);

        txtncuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtncuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncuenta.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtncuenta.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanel2.add(txtncuenta);
        txtncuenta.setBounds(380, 70, 160, 26);

        btnrest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnrest.setText("Restablecer");
        btnrest.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrest.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel2.add(btnrest);
        btnrest.setBounds(660, 70, 100, 26);

        btnbuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscar.setPreferredSize(new java.awt.Dimension(45, 26));
        jPanel2.add(btnbuscar);
        btnbuscar.setBounds(680, 30, 80, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 780, 110);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnNconvenio;
    public static javax.swing.JButton btnNconvenio1;
    public static javax.swing.JButton btnbuscar;
    public static javax.swing.JButton btncancelar;
    public static javax.swing.JButton btncrear;
    public static javax.swing.JButton btnrest;
    public static javax.swing.JComboBox<String> cmbcant;
    public static javax.swing.JComboBox<String> cmbempresa;
    public static javax.swing.JComboBox<String> cmbempresa1;
    public static javax.swing.JComboBox<String> cmbproveedor;
    public static javax.swing.JComboBox<String> cmbproveedor1;
    private javax.swing.JMenuItem jEliminar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmodificar;
    private javax.swing.JTable jtconvenios;
    public static javax.swing.JTextField txtncuenta;
    public static javax.swing.JTextField txtncuenta1;
    // End of variables declaration//GEN-END:variables
}
