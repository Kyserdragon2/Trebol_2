package Modulos;

public class Confirmacion_Multi extends javax.swing.JInternalFrame {


    public Confirmacion_Multi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnok = new javax.swing.JButton();
        paneltesoreria = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tacomentario2 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jrbOpc1 = new javax.swing.JRadioButton();
        jdcprogramar = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jrbOpc2 = new javax.swing.JRadioButton();
        txtcomprobante = new javax.swing.JTextField();
        btnarchivo = new javax.swing.JButton();
        btncargarcp = new javax.swing.JButton();
        btnaceptarcp = new javax.swing.JButton();
        btneliminarcp = new javax.swing.JButton();
        btnvercp = new javax.swing.JButton();
        btnmodificarcp = new javax.swing.JButton();
        btncancelarcp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbdocte = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtdocte = new javax.swing.JTextField();
        btnokte = new javax.swing.JButton();
        btnverte = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Confirmación Multiple");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/Trébol2.png"))); // NOI18N
        setOpaque(true);
        getContentPane().setLayout(null);

        btnok.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnok.setText("Confirmar");
        btnok.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        getContentPane().add(btnok);
        btnok.setBounds(240, 260, 150, 26);

        paneltesoreria.setBackground(new java.awt.Color(255, 255, 255));
        paneltesoreria.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        paneltesoreria.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Comentarios");
        paneltesoreria.add(jLabel25);
        jLabel25.setBounds(300, 125, 120, 22);

        jScrollPane8.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        tacomentario2.setColumns(20);
        tacomentario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tacomentario2.setLineWrap(true);
        tacomentario2.setRows(2);
        tacomentario2.setWrapStyleWord(true);
        tacomentario2.setBorder(null);
        tacomentario2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(tacomentario2);

        paneltesoreria.add(jScrollPane8);
        jScrollPane8.setBounds(300, 150, 290, 80);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Gestion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel15.setOpaque(false);
        jPanel15.setLayout(null);

        buttonGroup1.add(jrbOpc1);
        jrbOpc1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jrbOpc1.setText("Programar");
        jrbOpc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrbOpc1.setOpaque(false);
        jPanel15.add(jrbOpc1);
        jrbOpc1.setBounds(20, 20, 110, 26);

        jdcprogramar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, null, new java.awt.Color(102, 102, 102)));
        jdcprogramar.setDateFormatString("dd/MM/yyyy");
        jdcprogramar.setEnabled(false);
        jdcprogramar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcprogramar.setMaxSelectableDate(new java.util.Date(1577941199000L));
        jdcprogramar.setMinSelectableDate(new java.util.Date(1546318860000L));
        jPanel15.add(jdcprogramar);
        jdcprogramar.setBounds(10, 60, 148, 26);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel15.add(jSeparator3);
        jSeparator3.setBounds(170, 20, 2, 80);

        buttonGroup1.add(jrbOpc2);
        jrbOpc2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jrbOpc2.setText("Pagar");
        jrbOpc2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrbOpc2.setOpaque(false);
        jPanel15.add(jrbOpc2);
        jrbOpc2.setBounds(180, 30, 70, 26);

        txtcomprobante.setEditable(false);
        txtcomprobante.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtcomprobante.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcomprobante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, null, new java.awt.Color(102, 102, 102)));
        jPanel15.add(txtcomprobante);
        txtcomprobante.setBounds(250, 30, 240, 26);

        btnarchivo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnarchivo.setText("Archivo");
        btnarchivo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnarchivo.setFocusPainted(false);
        jPanel15.add(btnarchivo);
        btnarchivo.setBounds(490, 30, 77, 26);

        btncargarcp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btncargarcp.setText("Cargar");
        btncargarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncargarcp.setFocusPainted(false);
        jPanel15.add(btncargarcp);
        btncargarcp.setBounds(490, 70, 77, 26);

        btnaceptarcp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnaceptarcp.setText("Aceptar");
        btnaceptarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaceptarcp.setFocusPainted(false);
        jPanel15.add(btnaceptarcp);
        btnaceptarcp.setBounds(490, 70, 77, 26);

        btneliminarcp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btneliminarcp.setForeground(new java.awt.Color(204, 0, 0));
        btneliminarcp.setText("Eliminar");
        btneliminarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btneliminarcp.setEnabled(false);
        btneliminarcp.setFocusPainted(false);
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
        btnvercp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/ver3.png"))); // NOI18N
        btnvercp.setRequestFocusEnabled(false);
        jPanel15.add(btnvercp);
        btnvercp.setBounds(190, 70, 40, 24);

        btnmodificarcp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnmodificarcp.setText("Modificar");
        btnmodificarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnmodificarcp.setEnabled(false);
        btnmodificarcp.setFocusPainted(false);
        jPanel15.add(btnmodificarcp);
        btnmodificarcp.setBounds(400, 70, 77, 26);

        btncancelarcp.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btncancelarcp.setText("Cancelar");
        btncancelarcp.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelarcp.setFocusPainted(false);
        jPanel15.add(btncancelarcp);
        btncancelarcp.setBounds(400, 70, 77, 26);

        paneltesoreria.add(jPanel15);
        jPanel15.setBounds(10, 10, 580, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Documentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        cmbdocte.setEditable(true);
        cmbdocte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbdocte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "TV", "CE" }));
        cmbdocte.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel3.add(cmbdocte);
        cmbdocte.setBounds(30, 50, 60, 26);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("-");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(90, 50, 20, 26);

        txtdocte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdocte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdocte.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel3.add(txtdocte);
        txtdocte.setBounds(110, 50, 60, 26);

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
        jPanel3.add(btnokte);
        btnokte.setBounds(180, 50, 19, 26);

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
        btnverte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Imagenes/ver3.png"))); // NOI18N
        btnverte.setRequestFocusEnabled(false);
        btnverte.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(btnverte);
        btnverte.setBounds(210, 50, 40, 26);

        paneltesoreria.add(jPanel3);
        jPanel3.setBounds(10, 120, 280, 110);

        getContentPane().add(paneltesoreria);
        paneltesoreria.setBounds(10, 10, 600, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptarcp;
    private javax.swing.JButton btnarchivo;
    private javax.swing.JButton btncancelarcp;
    private javax.swing.JButton btncargarcp;
    private javax.swing.JButton btneliminarcp;
    private javax.swing.JButton btnmodificarcp;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnokte;
    private javax.swing.JButton btnvercp;
    private javax.swing.JButton btnverte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbdocte;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdcprogramar;
    private javax.swing.JRadioButton jrbOpc1;
    private javax.swing.JRadioButton jrbOpc2;
    private javax.swing.JPanel paneltesoreria;
    private javax.swing.JTextArea tacomentario2;
    private javax.swing.JTextField txtcomprobante;
    private javax.swing.JTextField txtdocte;
    // End of variables declaration//GEN-END:variables
}
