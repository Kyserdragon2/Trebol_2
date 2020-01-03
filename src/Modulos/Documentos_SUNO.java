package Modulos;

import Clases.Controles_Adicionales;
import Clases.Llenar_Tablas;
import Clases.Renderizado;
import Controladores.Suno_controller2;
import java.awt.event.ItemEvent;
import javax.swing.JButton;

public final class Documentos_SUNO extends javax.swing.JInternalFrame {

    Llenar_Tablas LT = new Llenar_Tablas();
    Renderizado R = new Renderizado();
    Controles_Adicionales CA = new Controles_Adicionales();
    Suno_controller2 suno = new Suno_controller2();

    public Documentos_SUNO() {
        initComponents();
        render();
        LT.docs_suno(jtproveedores, "", "");
//        lista_documentos_suno();
        llenar_cmb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnrestbusc = new javax.swing.JButton();
        cmbdocumento = new javax.swing.JComboBox<>();
        btnactualizartabla = new javax.swing.JButton();
        jsproveedor = new javax.swing.JScrollPane();
        jtproveedores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Documentos Sistema UNO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(234, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        btnrestbusc.setBackground(new java.awt.Color(255, 153, 153));
        btnrestbusc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnrestbusc.setForeground(new java.awt.Color(153, 0, 0));
        btnrestbusc.setText("Restablecer");
        btnrestbusc.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrestbusc.setFocusPainted(false);
        btnrestbusc.setPreferredSize(new java.awt.Dimension(100, 52));
        btnrestbusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestbuscActionPerformed(evt);
            }
        });
        jPanel4.add(btnrestbusc);
        btnrestbusc.setBounds(880, 20, 110, 26);

        cmbdocumento.setEditable(true);
        cmbdocumento.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbdocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbdocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel4.add(cmbdocumento);
        cmbdocumento.setBounds(150, 20, 220, 26);

        btnactualizartabla.setBackground(new java.awt.Color(0, 102, 255));
        btnactualizartabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnactualizartabla.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnactualizartabla.setFocusPainted(false);
        btnactualizartabla.setRolloverEnabled(false);
        btnactualizartabla.setVerifyInputWhenFocusTarget(false);
        btnactualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizartablaActionPerformed(evt);
            }
        });
        jPanel4.add(btnactualizartabla);
        btnactualizartabla.setBounds(1000, 20, 25, 26);

        jsproveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        jsproveedor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsproveedor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsproveedor.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtproveedores.setAutoCreateRowSorter(true);
        jtproveedores.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jtproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtproveedores.setFillsViewportHeight(true);
        jtproveedores.setShowHorizontalLines(false);
        jtproveedores.setShowVerticalLines(false);
        jtproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtproveedoresMouseClicked(evt);
            }
        });
        jsproveedor.setViewportView(jtproveedores);

        jPanel4.add(jsproveedor);
        jsproveedor.setBounds(10, 60, 1028, 400);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo Documento:");
        jLabel7.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 20, 120, 26);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Empresa:");
        jLabel8.setPreferredSize(new java.awt.Dimension(55, 26));
        jPanel4.add(jLabel8);
        jLabel8.setBounds(400, 20, 80, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Aviomar", "Colvan", "Snider" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel4.add(cmbempresa);
        cmbempresa.setBounds(485, 20, 150, 26);

        getContentPane().add(jPanel4, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizartablaActionPerformed
        filtros();
    }//GEN-LAST:event_btnactualizartablaActionPerformed

    private void btnrestbuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestbuscActionPerformed
        restablecer_filtros();
    }//GEN-LAST:event_btnrestbuscActionPerformed

    private void jtproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproveedoresMouseClicked
        ver_documento(evt);
    }//GEN-LAST:event_jtproveedoresMouseClicked

    public void lista_documentos_suno() {
        cmbdocumento.removeAllItems();
        cmbdocumento.addItem("--Seleccione--");
        R.tipo_documento_suno(cmbdocumento);
        cmbdocumento.setSelectedIndex(0);
    }

    public void llenar_cmb() {
        String docs = cmbdocumento.getSelectedItem().toString();
        if (cmbdocumento.getItemCount() == 1) {
            CA.llenar_cmb_tabla(cmbdocumento, jtproveedores, 2);
            cmbdocumento.setSelectedItem(docs);
        }
    }

    public void filtros() {
        String empresa, documento;
        if (cmbdocumento.getSelectedItem().toString().equals("---")) {
            documento = "";
        } else {
            documento = cmbdocumento.getSelectedItem().toString();
        }
        if (cmbempresa.getSelectedItem().toString().equals("---")) {
            empresa = "";
        } else {
            empresa = cmbempresa.getSelectedItem().toString();
        }
        LT.docs_suno(jtproveedores, documento, empresa);
    }

    public void restablecer_filtros() {
        cmbdocumento.setSelectedIndex(0);
        cmbempresa.setSelectedIndex(0);
        filtros();
    }

    public void render() {
        cmbdocumento.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtros();
            }
        });
        cmbempresa.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtros();
            }
        });
    }

    public void ver_documento(java.awt.event.MouseEvent evt) {
        int column = jtproveedores.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtproveedores.getRowHeight();
        if (row < jtproveedores.getRowCount() && row >= 0 && column < jtproveedores.getColumnCount() && column >= 0) {
            Object value = jtproveedores.getValueAt(row, column);
            String consecutivo = jtproveedores.getValueAt(row, 3).toString();
            String empresa = jtproveedores.getValueAt(row, 4).toString();
            String nit = jtproveedores.getValueAt(row, 1).toString();
            String doc = jtproveedores.getValueAt(row, 2).toString();
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                switch (boton.getName()) {
                    case "ver":
                        suno.ver_documento(suno.ubicacion_documento_suno(consecutivo, nit, empresa, doc));
                        break;
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizartabla;
    public static javax.swing.JButton btnrestbusc;
    private javax.swing.JComboBox<String> cmbdocumento;
    private javax.swing.JComboBox<String> cmbempresa;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jsproveedor;
    private javax.swing.JTable jtproveedores;
    // End of variables declaration//GEN-END:variables
}
