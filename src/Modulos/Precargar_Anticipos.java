package Modulos;

import Clases.Llenar_Tablas;
import Clases.Renderizado;

public class Precargar_Anticipos extends javax.swing.JInternalFrame {

    Renderizado R = new Renderizado();
    Llenar_Tablas LT = new Llenar_Tablas();

    public Precargar_Anticipos() {
        initComponents();
        render();
        LT.pre_anticipos(jtant, "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtant = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbproveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        cmbdoc = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtdoc = new javax.swing.JTextField();
        btnaprobar = new javax.swing.JButton();
        btnver = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Precargar Anticipos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(739, 126, 17, 25);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtant.setFillsViewportHeight(true);
        jtant.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtant);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 122, 750, 360);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Precargar Anticipo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Proveedor");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 75, 26);

        cmbproveedor.setEditable(true);
        cmbproveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbproveedor.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel2.add(cmbproveedor);
        cmbproveedor.setBounds(90, 30, 610, 26);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Empresa");
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(15, 70, 70, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Aviomar", "Colvan", "Snider" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cmbempresa.setMinimumSize(new java.awt.Dimension(146, 30));
        cmbempresa.setPreferredSize(new java.awt.Dimension(138, 26));
        jPanel2.add(cmbempresa);
        cmbempresa.setBounds(90, 70, 110, 26);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Valor");
        jLabel23.setPreferredSize(new java.awt.Dimension(35, 26));
        jPanel2.add(jLabel23);
        jLabel23.setBounds(215, 70, 40, 26);

        txtvalor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvalor.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtvalor.setMinimumSize(new java.awt.Dimension(6, 26));
        txtvalor.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanel2.add(txtvalor);
        txtvalor.setBounds(260, 70, 120, 26);

        cmbdoc.setEditable(true);
        cmbdoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "TB", "CE" }));
        cmbdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(cmbdoc);
        cmbdoc.setBounds(400, 70, 60, 26);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("-");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(460, 70, 20, 26);

        txtdoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdoc.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(txtdoc);
        txtdoc.setBounds(480, 70, 60, 26);

        btnaprobar.setBackground(new java.awt.Color(202, 230, 121));
        btnaprobar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaprobar.setForeground(new java.awt.Color(72, 96, 0));
        btnaprobar.setText("Cargar");
        btnaprobar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaprobar.setFocusPainted(false);
        btnaprobar.setPreferredSize(new java.awt.Dimension(162, 26));
        btnaprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprobarActionPerformed(evt);
            }
        });
        jPanel2.add(btnaprobar);
        btnaprobar.setBounds(620, 70, 78, 26);

        btnver.setBackground(new java.awt.Color(202, 230, 121));
        btnver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnver.setForeground(new java.awt.Color(72, 96, 0));
        btnver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png"))); // NOI18N
        btnver.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnver.setBorderPainted(false);
        btnver.setContentAreaFilled(false);
        btnver.setEnabled(false);
        btnver.setFocusPainted(false);
        btnver.setPreferredSize(new java.awt.Dimension(162, 26));
        jPanel2.add(btnver);
        btnver.setBounds(550, 70, 40, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 5, 720, 110);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaprobarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void render() {
        R.razon_social(cmbproveedor);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnaprobar;
    public javax.swing.JButton btnver;
    private javax.swing.JComboBox<String> cmbdoc;
    public static javax.swing.JComboBox<String> cmbempresa;
    public static javax.swing.JComboBox<String> cmbproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtant;
    private javax.swing.JTextField txtdoc;
    public static javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
