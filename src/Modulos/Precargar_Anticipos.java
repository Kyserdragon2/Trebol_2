package Modulos;

import Clases.Controles_Adicionales;
import Clases.Envio_Correos;
import Clases.Llenar_Tablas;
import Clases.Manipuacion_Documentos;
import Clases.Renderizado;
import Controladores.*;
import Principal.Principal;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class Precargar_Anticipos extends javax.swing.JInternalFrame {

    Renderizado R = new Renderizado();
    Llenar_Tablas LT = new Llenar_Tablas();
    Envio_Correos EC = new Envio_Correos();
    Anticipo_Controller AntC = new Anticipo_Controller();
    Area_Controller AC = new Area_Controller();
    Logs_Controller LC = new Logs_Controller();
    Tiempo_Controller TC = new Tiempo_Controller();
    Correo_Controller CorC = new Correo_Controller();
    Usuario_Controller UC = new Usuario_Controller();
    Factura_Controller FC = new Factura_Controller();
    TipoDoc_Controller TDC = new TipoDoc_Controller();
    Empresa_Controller EMPC = new Empresa_Controller();
    Proveedor_Controller PC = new Proveedor_Controller();
    Convenio_Controller CCon = new Convenio_Controller();
    Documento_Controller DC = new Documento_Controller();
    Comentario_Controller CC = new Comentario_Controller();
    Controles_Adicionales CA = new Controles_Adicionales();
    Aprobacion_Controller ApC = new Aprobacion_Controller();
    Manipuacion_Documentos MD = new Manipuacion_Documentos();
    Notificaciones_Sistema NS = new Notificaciones_Sistema();
    TipoFactura_Controller TFC = new TipoFactura_Controller();
    Suno_controller2 suno = new Suno_controller2();

    public Precargar_Anticipos() {
        initComponents();
        render();
        LT.pre_anticipos(jtant, "", "", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnrefrescar = new javax.swing.JButton();
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
        btncargar = new javax.swing.JButton();
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

        btnrefrescar.setBackground(new java.awt.Color(0, 102, 153));
        btnrefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnrefrescar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrefrescar.setRequestFocusEnabled(false);
        btnrefrescar.setVerifyInputWhenFocusTarget(false);
        btnrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btnrefrescar);
        btnrefrescar.setBounds(739, 126, 17, 25);

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
        jtant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtantMouseClicked(evt);
            }
        });
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
        cmbdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "TV", "CE" }));
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
        txtdoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdocKeyReleased(evt);
            }
        });
        jPanel2.add(txtdoc);
        txtdoc.setBounds(480, 70, 60, 26);

        btncargar.setBackground(new java.awt.Color(202, 230, 121));
        btncargar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncargar.setForeground(new java.awt.Color(72, 96, 0));
        btncargar.setText("Cargar");
        btncargar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncargar.setFocusPainted(false);
        btncargar.setPreferredSize(new java.awt.Dimension(162, 26));
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        jPanel2.add(btncargar);
        btncargar.setBounds(620, 70, 78, 26);

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
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel2.add(btnver);
        btnver.setBounds(550, 70, 40, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 5, 720, 110);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        int id_empresa, id_tipo_doc, id_proveedor;
        String nit, proveedor, empresa, ubicacion, ub_documento, consecutivo;
        double valor;
        proveedor = cmbproveedor.getSelectedItem().toString();
        empresa = cmbempresa.getSelectedItem().toString();
        id_empresa = EMPC.id_empresa(cmbempresa.getSelectedItem().toString());
        id_proveedor = PC.id_proveedor(proveedor);
        id_tipo_doc = TDC.id_tipo_doc_pref(cmbdoc.getSelectedItem().toString());
        nit = PC.nit_proveedor(cmbproveedor.getSelectedItem().toString());
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
        consecutivo = String.format("%06d", Integer.parseInt(txtdoc.getText()));
        ubicacion = suno.ubicacion_documento("", nit, id_empresa, id_tipo_doc);
        ub_documento = MD.Cargar_Documento_Ant(proveedor, empresa, ubicacion);
        if (AntC.crear_anticipo(id_proveedor, id_empresa, id_tipo_doc, consecutivo, ub_documento, valor)) {
            LT.pre_anticipos(jtant, "", "", "");
            limpiar();
        } else {
            System.out.println("error");
        }
    }//GEN-LAST:event_btncargarActionPerformed

    private void txtdocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocKeyReleased
        if (!txtdoc.getText().equals("")) {
            int id_empresa, id_tipo_doc;
            String nit, consecutivo;
            boolean existe;
            id_empresa = EMPC.id_empresa(cmbempresa.getSelectedItem().toString());
            id_tipo_doc = TDC.id_tipo_doc_pref(cmbdoc.getSelectedItem().toString());
            nit = PC.nit_proveedor(cmbproveedor.getSelectedItem().toString());
            consecutivo = txtdoc.getText();
            existe = suno.existe_documento_suno(nit, id_empresa, id_tipo_doc, consecutivo);
            if (existe) {
                btnver.setEnabled(true);
            } else {
                btnver.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtdocKeyReleased

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        int id_empresa, id_tipo_doc;
        String nit, ubicacion;
        id_empresa = EMPC.id_empresa(cmbempresa.getSelectedItem().toString());
        id_tipo_doc = TDC.id_tipo_doc_pref(cmbdoc.getSelectedItem().toString());
        nit = PC.nit_proveedor(cmbproveedor.getSelectedItem().toString());
        ubicacion = suno.ubicacion_documento("", nit, id_empresa, id_tipo_doc);
        suno.ver_documento(ubicacion);
    }//GEN-LAST:event_btnverActionPerformed

    private void jtantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtantMouseClicked
        int column = jtant.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtant.getRowHeight();
        int id_proveedor, id_empresa, id_tipo_doc;
        String cons, tipo_doc;
        if (row < jtant.getRowCount() && row >= 0 && column < jtant.getColumnCount() && column >= 0) {
            Object value = jtant.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                id_proveedor = PC.id_proveedor(jtant.getValueAt(row, 0).toString());
                id_empresa = EMPC.id_empresa(jtant.getValueAt(row, 1).toString());
                tipo_doc = jtant.getValueAt(row, 2).toString().substring(0, 2);
                id_tipo_doc = TDC.id_tipo_doc_pref(tipo_doc);
                cons = jtant.getValueAt(row, 2).toString().substring(3, 9);
                switch (boton.getName()) {
                    case "ver":
                        JOptionPane.showMessageDialog(Principal.Escritorio, "Ver Documento");
                        AntC.ver_documento_anticipo(id_proveedor, id_empresa, id_tipo_doc, cons);
                        break;
                    case "borrar":
                        JOptionPane.showMessageDialog(Principal.Escritorio, "Borrar Documento");
                        AntC.anular_ant_prov(id_proveedor, id_empresa, id_tipo_doc, cons);
                        break;
                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_jtantMouseClicked

    private void btnrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefrescarActionPerformed
        LT.pre_anticipos(jtant, "", "", "");
    }//GEN-LAST:event_btnrefrescarActionPerformed

    public void render() {
        R.razon_social(cmbproveedor);
    }

    public void limpiar() {
        cmbdoc.setSelectedIndex(0);
        cmbempresa.setSelectedIndex(0);
        cmbproveedor.setSelectedIndex(0);
        txtdoc.setText("");
        txtvalor.setText("");
        btnver.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btncargar;
    private javax.swing.JButton btnrefrescar;
    public javax.swing.JButton btnver;
    private javax.swing.JComboBox<String> cmbdoc;
    public static javax.swing.JComboBox<String> cmbempresa;
    public static javax.swing.JComboBox<String> cmbproveedor;
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
