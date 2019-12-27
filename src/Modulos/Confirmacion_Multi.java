package Modulos;

import Clases.Controles_Adicionales;
import Clases.Manipuacion_Documentos;
import Controladores.*;
import Principal.Principal;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Confirmacion_Multi extends javax.swing.JInternalFrame {

    Factura_Controller FC = new Factura_Controller();
    Usuario_Controller UC = new Usuario_Controller();
    Empresa_Controller EMPC = new Empresa_Controller();
    Proveedor_Controller PC = new Proveedor_Controller();
    Notificaciones_Sistema NS = new Notificaciones_Sistema();
    Programacion_Controller ProgC = new Programacion_Controller();
    Manipuacion_Documentos MD = new Manipuacion_Documentos();
    Documento_Controller DC = new Documento_Controller();
    Controles_Adicionales CA = new Controles_Adicionales();
    Suno_controller2 suno = new Suno_controller2();
    TipoDoc_Controller TDC = new TipoDoc_Controller();
    Logs_Controller LC = new Logs_Controller();
    Tiempo_Controller TC = new Tiempo_Controller();
    Comentario_Controller CC = new Comentario_Controller();
    Correo_Controller CorC = new Correo_Controller();

    public Confirmacion_Multi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        btnok = new javax.swing.JButton();
        btnok1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(234, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Confirmación Multiple");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        setOpaque(true);
        getContentPane().setLayout(null);

        paneltesoreria.setBackground(new java.awt.Color(255, 255, 255));
        paneltesoreria.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        paneltesoreria.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Comentario");
        paneltesoreria.add(jLabel25);
        jLabel25.setBounds(250, 125, 120, 19);

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
        jScrollPane8.setBounds(250, 145, 340, 95);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Gestion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel15.setOpaque(false);
        jPanel15.setLayout(null);

        buttonGroup1.add(jrbOpc1);
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
        jdcprogramar.setMaxSelectableDate(new java.util.Date(1609477199000L));
        jdcprogramar.setMinSelectableDate(new java.util.Date(1546318860000L));
        jPanel15.add(jdcprogramar);
        jdcprogramar.setBounds(10, 60, 148, 26);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel15.add(jSeparator3);
        jSeparator3.setBounds(170, 20, 30, 80);

        buttonGroup1.add(jrbOpc2);
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
        cmbdocte.setBounds(10, 40, 60, 26);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("-");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(70, 40, 20, 26);

        txtdocte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdocte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdocte.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        txtdocte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdocteKeyReleased(evt);
            }
        });
        jPanel3.add(txtdocte);
        txtdocte.setBounds(90, 40, 60, 26);

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
        btnokte.setBounds(160, 40, 19, 26);

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
        btnverte.setBounds(185, 40, 40, 26);

        paneltesoreria.add(jPanel3);
        jPanel3.setBounds(10, 130, 235, 110);

        getContentPane().add(paneltesoreria);
        paneltesoreria.setBounds(10, 10, 600, 250);

        btnok.setBackground(new java.awt.Color(224, 240, 177));
        btnok.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnok.setForeground(new java.awt.Color(37, 112, 0));
        btnok.setText("Confirmar");
        btnok.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        getContentPane().add(btnok);
        btnok.setBounds(220, 270, 150, 26);

        btnok1.setBackground(new java.awt.Color(224, 240, 177));
        btnok1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnok1.setForeground(new java.awt.Color(37, 112, 0));
        btnok1.setText("Limpiar");
        btnok1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnok1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnok1);
        btnok1.setBounds(540, 270, 70, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        if (btnok.getText().equals("Confirmar Pago")) {
            gestion_facturas("Confirmar Pago");
        } else if (btnok.getText().equals("Programar")) {
            if (jdcprogramar.getDate() == null) {
                JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar la fecha de programación.");
            } else {
                gestion_facturas("Programar");
            }
        }
    }//GEN-LAST:event_btnokActionPerformed

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
        jrbOpc1.setSelected(false);
        jdcprogramar.setEnabled(false);
        btnarchivo.setEnabled(true);
        btneliminarcp.setEnabled(false);
        btnmodificarcp.setEnabled(false);
        btncargarcp.setEnabled(true);
        btnaceptarcp.setVisible(false);
        btncancelarcp.setVisible(false);
        btnok.setText("Confirmar Pago");
    }//GEN-LAST:event_jrbOpc2ActionPerformed

    private void btncargarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarcpActionPerformed
        if (txtcomprobante.getText().equals("")) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Faltan Datos", "Datos Incompletos", JOptionPane.ERROR_MESSAGE);
        } else {
            gestion_facturas("Cargar Comprobante");
        }
    }//GEN-LAST:event_btncargarcpActionPerformed

    private void btnarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarchivoActionPerformed
        CA.buscar_documento(txtcomprobante, "ALL");
    }//GEN-LAST:event_btnarchivoActionPerformed

    private void btnok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnok1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnok1ActionPerformed

    private void btneliminarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarcpActionPerformed
        gestion_facturas("Eliminar Comprobante");
    }//GEN-LAST:event_btneliminarcpActionPerformed

    private void btnmodificarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarcpActionPerformed
        txtcomprobante.setText("");
        btnarchivo.setEnabled(true);
        btncargarcp.setVisible(false);
        btneliminarcp.setVisible(false);
        btnmodificarcp.setVisible(false);
        btnaceptarcp.setVisible(true);
        btncancelarcp.setVisible(true);
    }//GEN-LAST:event_btnmodificarcpActionPerformed

    private void btnaceptarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarcpActionPerformed
        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea actualizar el Comprobante de pago de las facturas seleccionadas?",
                "Actualizar Comprobantes", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            gestion_facturas("Modificar Comprobante");
        }
    }//GEN-LAST:event_btnaceptarcpActionPerformed

    private void btncancelarcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarcpActionPerformed
        txtcomprobante.setText("");
        btnarchivo.setEnabled(false);
        btncargarcp.setEnabled(false);
        btncargarcp.setVisible(true);
        btneliminarcp.setVisible(true);
        btnmodificarcp.setVisible(true);
        btnaceptarcp.setVisible(false);
        btncancelarcp.setVisible(false);
    }//GEN-LAST:event_btncancelarcpActionPerformed

    private void btnokteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokteActionPerformed
        gestion_facturas("Cargar TV o CE");
    }//GEN-LAST:event_btnokteActionPerformed

    private void txtdocteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocteKeyReleased
        if (!txtdocte.getText().equals("")) {
            int id_tipo_doc = TDC.id_tipo_doc_pref(cmbdocte.getSelectedItem().toString());
            String empresa = Principal.jtfacturas.getValueAt(Principal.jtfacturas.getSelectedRowCount(), 9).toString();
            String cons = txtdocte.getText();
            boolean existe;
            existe = suno.existe_documento_suno_multi(EMPC.id_empresa(empresa), id_tipo_doc, cons);
            if (existe) {
                btnokte.setEnabled(true);
                btnverte.setEnabled(true);
            } else {
                btnokte.setEnabled(false);
                btnverte.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtdocteKeyReleased

    private void btnverteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverteActionPerformed
        String ubicacion;
        int id_tipo_doc = TDC.id_tipo_doc_pref(cmbdocte.getSelectedItem().toString());
        String cons = txtdocte.getText();
        String empresa = Principal.jtfacturas.getValueAt(Principal.jtfacturas.getSelectedRowCount(), 9).toString();
        ubicacion = suno.ubicacion_documento_multi(EMPC.id_empresa(empresa), id_tipo_doc, cons);
        suno.ver_documento(ubicacion);
    }//GEN-LAST:event_btnverteActionPerformed

    public void gestion_facturas(String procedimiento) {
        int Tes = JOptionPane.showConfirmDialog(Principal.Escritorio, "Continuar?", "Continuar",
                JOptionPane.YES_NO_OPTION);
        if (Tes == 0) {
            boolean prog = false;
            int[] selectedRows = Principal.jtfacturas.getSelectedRows();
            for (int i = 0; i < selectedRows.length; i++) {
                int id_factura;
                String no_factura, proveedor, nit, empresa;
                int row = selectedRows[i];
                no_factura = Principal.jtfacturas.getValueAt(row, 0).toString();
                proveedor = Principal.jtfacturas.getValueAt(row, 11).toString();
                nit = Principal.jtfacturas.getValueAt(row, 10).toString();
                empresa = Principal.jtfacturas.getValueAt(row, 9).toString();
                int id_usuario = UC.id_usuario(Principal.lbluser.getText());
                id_factura = FC.id_factura(no_factura, PC.id_proveedor(proveedor), EMPC.id_empresa(empresa));
                switch (procedimiento) {
                    case "Programar":
                        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
                        String fecha_prog = formatoDeFecha.format(jdcprogramar.getDate());
                        if (ProgC.existe_programacion(id_factura)) {
                            int rep = JOptionPane.showConfirmDialog(Principal.Escritorio, "La factura " + no_factura + " ya se encuentra programada\ndesea reprogramarla?",
                                    "Programacion", JOptionPane.YES_NO_OPTION);
                            if (rep == 0) {
                                if (ProgC.cambiar_est_prog(id_factura, id_usuario, ProgC.fecha_programada_sql(id_factura))) {
                                    if (ProgC.crear_programacion(id_factura, id_usuario, fecha_prog)) {
                                        if (FC.cambiar_estado_factura(no_factura, PC.id_proveedor(proveedor), EMPC.id_empresa(empresa), 10)) {
                                            prog = true;
                                        } else {
                                            prog = false;
                                            System.out.println("error");
                                            break;
                                        }
                                    } else {
                                        System.out.println("error");
                                        break;
                                    }
                                }
                            }
                        } else {
                            if (ProgC.crear_programacion(id_factura, id_usuario, fecha_prog)) {
                                if (FC.cambiar_estado_factura(no_factura, PC.id_proveedor(proveedor), EMPC.id_empresa(empresa), 10)) {
                                    prog = true;
                                } else {
                                    prog = false;
                                    System.out.println("error");
                                    break;
                                }
                            } else {
                                System.out.println("error");
                                break;
                            }
                        }
                        break;
                    case "Cargar Comprobante":
                        if (DC.existe_documento("Comprobante de Pago", id_factura)) {
                            int actd = JOptionPane.showConfirmDialog(Principal.Escritorio, "Desea Actualizar el comprobante de pago de la factura '" + no_factura + "'?",
                                    "Actualizar Comprobante",
                                    JOptionPane.YES_NO_OPTION);
                            if (actd == 0) {
                                MD.actualizar_documento(txtcomprobante.getText(), DC.ubicacion_documento("Comprobante de Pago", id_factura), "Comprobante de Pago", 17, id_factura);
                            }
                        } else {
                            MD.Cargar_Documento(no_factura, proveedor, empresa, "Comprobante de Pago", txtcomprobante.getText(), 17, "", PC.id_proveedor(proveedor), EMPC.id_empresa(empresa));
                        }
                        btneliminarcp.setEnabled(true);
                        btnmodificarcp.setEnabled(true);
                        btnvercp.setEnabled(true);
                        btncargarcp.setEnabled(false);
                        btnarchivo.setEnabled(false);
                        txtcomprobante.setText(DC.ubicacion_documento("Comprobante de Pago", id_factura));
                        break;
                    case "Modificar Comprobante":
                        int actd = JOptionPane.showConfirmDialog(Principal.Escritorio, "Desea Actualizar el comprobante de pago de la factura '" + no_factura + "'?",
                                "Actualizar Comprobante",
                                JOptionPane.YES_NO_OPTION);
                        if (actd == 0) {
                            MD.actualizar_documento(txtcomprobante.getText(), DC.ubicacion_documento("Comprobante de Pago", id_factura), "Comprobante de Pago", 17, id_factura);
                        }
                        break;
                    case "Eliminar Comprobante":
                        int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Confirma que desea eliminar el Comprobante de pago de las facturas?",
                                "Eliminar Comprobantes", JOptionPane.YES_NO_OPTION);
                        if (opc == 0) {
                            String ruta_eliminar = DC.ubicacion_documento("Comprobante de Pago", id_factura);
                            jdcprogramar.setEnabled(false);
                            MD.eliminar_documento(ruta_eliminar);
                            if (DC.eliminar_documento(17, id_factura)) {
                                if (i == selectedRows.length - 1) {
                                    JOptionPane.showMessageDialog(Principal.Escritorio, "Se eliminan los comprobantes de las facturas");
                                    btneliminarcp.setEnabled(false);
                                    btnmodificarcp.setEnabled(false);
                                    btnvercp.setEnabled(false);
                                    btncargarcp.setEnabled(true);
                                    btnarchivo.setEnabled(true);
                                    txtcomprobante.setText("");
                                }
                            }
                        }
                        break;
                    case "Cargar TV o CE":
                        String consecutivo = txtdocte.getText();
                        String tipo_doc;
                        if (cmbdocte.getSelectedItem().toString().equals("TV")) {
                            tipo_doc = "Transferencia Virtual";
                        } else {
                            tipo_doc = "Comprobante de Egreso";
                        }
                        int id_tipo_doc = TDC.id_tipo_doc_pref(cmbdocte.getSelectedItem().toString());
                        String ruta_doc = suno.ubicacion_documento_multi(EMPC.id_empresa(empresa), id_tipo_doc, consecutivo);
                        if (suno.existe_documento_suno_multi(EMPC.id_empresa(empresa), id_tipo_doc, consecutivo)) {
                            MD.Cargar_Documento(no_factura, proveedor, empresa, tipo_doc, ruta_doc, id_tipo_doc, consecutivo,
                                    PC.id_proveedor(proveedor), EMPC.id_empresa(empresa));
                        } else {
                            System.err.println("El documento no se cargara a la factura");
                        }
                        break;
                    case "Confirmar Pago":
                        if (DC.existe_documento("Comprobante de Pago", id_factura)) {
                            FC.cambiar_estado_factura(no_factura, PC.id_proveedor(proveedor), EMPC.id_empresa(empresa), 7);
                            if (!tacomentario2.getText().equals("")) {
                                CC.crear_comentario(0, id_usuario, id_factura, 7, tacomentario2.getText());
                                int com = CC.id_comentario(id_factura, id_usuario, 7, tacomentario2.getText());
                                LC.crear_log(id_usuario, id_factura, com, 7);
                            } else {
                                LC.crear_log(id_usuario, id_factura, 0, 7);
                            }
                            TC.crear_tiempo(id_usuario, id_factura, FC.id_estado_factura(id_factura), 7);
                            Principal.btnactualizar.doClick();
                            this.doDefaultCloseAction();
                            limpiar();
                        }else{
                            JOptionPane.showMessageDialog(Principal.Escritorio, "La factura '"+no_factura+"' no cuenta con un comprobante de pago cargado.");
                        }
                        break;
                }
            }
            if (jrbOpc1.isSelected() && prog) {
                NS.notificaciones("Programación Facturas", "Se ha realizado la programacion de las facturas.", "correcto");
                Principal.btnactualizar.doClick();
                this.doDefaultCloseAction();
                limpiar();
            }
        }
    }

    public void limpiar() {
        jdcprogramar.setEnabled(false);
        txtcomprobante.setText("");
        btnarchivo.setEnabled(false);
        btnvercp.setEnabled(false);
        btncargarcp.setEnabled(false);
        btneliminarcp.setEnabled(false);
        btnmodificarcp.setEnabled(false);
        jdcprogramar.setEnabled(false);
        btnarchivo.setEnabled(false);
        btneliminarcp.setEnabled(false);
        btnmodificarcp.setEnabled(false);
        btncargarcp.setEnabled(false);
        btnaceptarcp.setVisible(false);
        btncancelarcp.setVisible(false);
        txtdocte.setText("");
        cmbdocte.setSelectedIndex(0);
        btnokte.setEnabled(false);
        btnverte.setEnabled(false);
        tacomentario2.setText("");
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptarcp;
    private javax.swing.JButton btnarchivo;
    private javax.swing.JButton btncancelarcp;
    private javax.swing.JButton btncargarcp;
    private javax.swing.JButton btneliminarcp;
    private javax.swing.JButton btnmodificarcp;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnok1;
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
    public static javax.swing.JPanel paneltesoreria;
    private javax.swing.JTextArea tacomentario2;
    private javax.swing.JTextField txtcomprobante;
    private javax.swing.JTextField txtdocte;
    // End of variables declaration//GEN-END:variables
}
