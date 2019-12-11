package Modulos;

import Clases.Llenar_Tablas;
import Clases.Renderizado;
import Controladores.Proveedor_Controller;
import Objetos.Proveedor;
import Principal.Principal;
import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class Proveedores extends javax.swing.JInternalFrame {

    Llenar_Tablas LT = new Llenar_Tablas();
    Renderizado R = new Renderizado();

    public Proveedores() {
        initComponents();
        jsproveedor.setBounds(10, 40, 1100, 420);
        jpcrearp.setVisible(false);
        lista_proveedor();
        LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPopupMenu();
        jmModificar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmEliminar = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jpcrearp = new javax.swing.JPanel();
        lbltelefono = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        btncrearp = new javax.swing.JButton();
        txtnit = new javax.swing.JTextField();
        txtrs = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        lblnit = new javax.swing.JLabel();
        lblrazonsocial = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblcondpago = new javax.swing.JLabel();
        cmbcp = new javax.swing.JComboBox<>();
        btncancelar = new javax.swing.JButton();
        lbltipofactura = new javax.swing.JLabel();
        cmbtipofact = new javax.swing.JComboBox<>();
        lblarea = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<>();
        btnmodp = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnnuevop = new javax.swing.JButton();
        btnrestbusc = new javax.swing.JButton();
        btnbuscarprov = new javax.swing.JButton();
        cmbbuscarprov = new javax.swing.JComboBox<>();
        btnactualizartabla = new javax.swing.JButton();
        jsproveedor = new javax.swing.JScrollPane();
        jtproveedores = new javax.swing.JTable();

        Menu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jmModificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jmModificar.setText("Modificar");
        jmModificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarActionPerformed(evt);
            }
        });
        Menu.add(jmModificar);
        Menu.add(jSeparator1);

        jmEliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jmEliminar.setText("Eliminar");
        jmEliminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarActionPerformed(evt);
            }
        });
        Menu.add(jmEliminar);

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Proveedores");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(234, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jpcrearp.setBackground(new java.awt.Color(255, 255, 255));
        jpcrearp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Crear/Modificar Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jpcrearp.setLayout(null);

        lbltelefono.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbltelefono.setText("Teléfono");
        jpcrearp.add(lbltelefono);
        lbltelefono.setBounds(890, 70, 56, 26);

        lblcorreo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblcorreo.setText("Correo");
        jpcrearp.add(lblcorreo);
        lblcorreo.setBounds(10, 70, 43, 26);

        btncrearp.setBackground(new java.awt.Color(204, 255, 153));
        btncrearp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncrearp.setForeground(new java.awt.Color(37, 112, 0));
        btncrearp.setText("Crear Proveedor");
        btncrearp.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncrearp.setFocusPainted(false);
        btncrearp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearpActionPerformed(evt);
            }
        });
        jpcrearp.add(btncrearp);
        btncrearp.setBounds(920, 110, 150, 26);

        txtnit.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(txtnit);
        txtnit.setBounds(60, 30, 150, 26);

        txtrs.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtrs.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(txtrs);
        txtrs.setBounds(310, 30, 580, 26);

        txtdir.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtdir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(txtdir);
        txtdir.setBounds(550, 70, 320, 26);

        txttel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txttel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(txttel);
        txttel.setBounds(950, 70, 130, 26);

        txtcorreo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtcorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(txtcorreo);
        txtcorreo.setBounds(60, 70, 400, 26);

        lblnit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblnit.setText("NIT");
        jpcrearp.add(lblnit);
        lblnit.setBounds(30, 30, 21, 26);

        lblrazonsocial.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblrazonsocial.setText("Razón Social");
        jpcrearp.add(lblrazonsocial);
        lblrazonsocial.setBounds(220, 30, 84, 26);

        lbldireccion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbldireccion.setText("Dirección");
        jpcrearp.add(lbldireccion);
        lbldireccion.setBounds(480, 70, 60, 26);

        lblcondpago.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblcondpago.setText("Cond. Pago");
        lblcondpago.setEnabled(false);
        jpcrearp.add(lblcondpago);
        lblcondpago.setBounds(910, 30, 80, 26);

        cmbcp.setEditable(true);
        cmbcp.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbcp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "30", "60", "90" }));
        cmbcp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbcp.setEnabled(false);
        jpcrearp.add(cmbcp);
        cmbcp.setBounds(990, 30, 90, 26);

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(153, 0, 0));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelar.setFocusPainted(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jpcrearp.add(btncancelar);
        btncancelar.setBounds(700, 110, 80, 26);

        lbltipofactura.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbltipofactura.setText("Tipo Factura");
        jpcrearp.add(lbltipofactura);
        lbltipofactura.setBounds(300, 110, 80, 26);

        cmbtipofact.setEditable(true);
        cmbtipofact.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbtipofact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Anticipo", "Anticipo Menor Valor", "Anticipo Mayor Valor", "Afiliacion", "Alianza", "Alquiler RadioFrecuencias", "Arriendo", "Asesoria", "Asesoria Intercambiaria", "Asesoria Legal", "BIenestar", "Capacitaciónn", "Combustibles", "Licenciamiento", "Mantenimiento", "Monitoreo", "Proceso Selecciónn", "Reposición", "Seguros", "Serv. Asesoria", "Serv. Consultoria", "Serv. de Aseo", "Serv. de Comunicaciones", "Serv. de Software", "Serv. Hosting", "Serv. Impresión", "Serv. Mensajeria", "Serv. Publico", "Serv. Seguridad", "Serv. Vigilancia", "Soporte" }));
        cmbtipofact.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(cmbtipofact);
        cmbtipofact.setBounds(390, 110, 220, 26);

        lblarea.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblarea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblarea.setText("Area");
        jpcrearp.add(lblarea);
        lblarea.setBounds(10, 110, 40, 26);

        cmbarea.setEditable(true);
        cmbarea.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Administrador", "Capital Humano", "Compras", "Contabilidad", "Contabilidad_Rev", "Correspondencia", "Recepción", "Tecnología", "Tesoreria", "AdminTrebol", "Sin Area" }));
        cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(cmbarea);
        cmbarea.setBounds(60, 110, 220, 26);

        btnmodp.setBackground(new java.awt.Color(204, 255, 153));
        btnmodp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmodp.setForeground(new java.awt.Color(37, 112, 0));
        btnmodp.setText("Modificar Proveedor");
        btnmodp.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnmodp.setFocusPainted(false);
        btnmodp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodpActionPerformed(evt);
            }
        });
        jpcrearp.add(btnmodp);
        btnmodp.setBounds(910, 110, 170, 26);

        lblid.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearp.add(lblid);
        lblid.setBounds(630, 110, 40, 26);

        btnlimpiar.setBackground(new java.awt.Color(153, 204, 255));
        btnlimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnlimpiar.setFocusPainted(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jpcrearp.add(btnlimpiar);
        btnlimpiar.setBounds(820, 110, 80, 26);

        jPanel4.add(jpcrearp);
        jpcrearp.setBounds(10, 310, 1100, 150);

        btnnuevop.setBackground(new java.awt.Color(204, 255, 153));
        btnnuevop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnnuevop.setForeground(new java.awt.Color(37, 112, 0));
        btnnuevop.setText("Nuevo Proveedor");
        btnnuevop.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnnuevop.setFocusPainted(false);
        btnnuevop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevopActionPerformed(evt);
            }
        });
        jPanel4.add(btnnuevop);
        btnnuevop.setBounds(20, 8, 140, 26);

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
        btnrestbusc.setBounds(970, 8, 110, 26);

        btnbuscarprov.setBackground(new java.awt.Color(255, 217, 142));
        btnbuscarprov.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnbuscarprov.setForeground(new java.awt.Color(142, 94, 0));
        btnbuscarprov.setText("Buscar");
        btnbuscarprov.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscarprov.setFocusPainted(false);
        btnbuscarprov.setPreferredSize(new java.awt.Dimension(100, 52));
        btnbuscarprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarprovActionPerformed(evt);
            }
        });
        jPanel4.add(btnbuscarprov);
        btnbuscarprov.setBounds(880, 8, 80, 26);

        cmbbuscarprov.setEditable(true);
        cmbbuscarprov.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbbuscarprov.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel4.add(cmbbuscarprov);
        cmbbuscarprov.setBounds(410, 8, 460, 26);

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
        btnactualizartabla.setBounds(1085, 8, 25, 26);

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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtproveedoresMouseReleased(evt);
            }
        });
        jsproveedor.setViewportView(jtproveedores);

        jPanel4.add(jsproveedor);
        jsproveedor.setBounds(10, 40, 1100, 260);

        getContentPane().add(jPanel4, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtproveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproveedoresMouseReleased
        if (SwingUtilities.isRightMouseButton(evt)) {
            int rowNumber = jtproveedores.rowAtPoint(evt.getPoint());
            if (rowNumber >= 0 && rowNumber < jtproveedores.getRowCount()) {
                jtproveedores.getSelectionModel().setSelectionInterval(rowNumber, rowNumber);
                Menu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jtproveedoresMouseReleased

    private void btnnuevopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevopActionPerformed
        formulario();
    }//GEN-LAST:event_btnnuevopActionPerformed

    private void btncrearpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearpActionPerformed
        validar_campos();
    }//GEN-LAST:event_btncrearpActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarActionPerformed
        llenar_campos();
    }//GEN-LAST:event_jmModificarActionPerformed

    private void btnmodpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodpActionPerformed
        modificar();
    }//GEN-LAST:event_btnmodpActionPerformed

    private void btnactualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizartablaActionPerformed
        refrescar_tabla();
    }//GEN-LAST:event_btnactualizartablaActionPerformed

    private void jmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jmEliminarActionPerformed

    private void btnbuscarprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprovActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarprovActionPerformed

    private void btnrestbuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestbuscActionPerformed
        restablecer();
    }//GEN-LAST:event_btnrestbuscActionPerformed

    /**
     *
     */
    public void crear() {
        Proveedor_Controller PC = new Proveedor_Controller();
        String nit, razon_social, correo, direccion, telefono;
        int id_area, id_tipo_factura;
        nit = txtnit.getText();
        razon_social = txtrs.getText();
        correo = txtcorreo.getText();
        direccion = txtdir.getText();
        telefono = txttel.getText();
        id_area = cmbarea.getSelectedIndex();
        id_tipo_factura = cmbtipofact.getSelectedIndex();
        if (PC.crear_proveedor(id_tipo_factura, id_area, nit, razon_social, correo, direccion, telefono)) {
            DesktopNotify.showDesktopMessage("Proveedor Creado", "El Proveedor " + razon_social + " ha sido creado con exito.",
                    DesktopNotify.SUCCESS);
            limpiar();
            jsproveedor.setBounds(10, 40, 1100, 420);
            jpcrearp.setVisible(false);
            lista_proveedor();
            LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
        } else {
            DesktopNotify.showDesktopMessage("Proveedor no creado", "El Proveedor " + razon_social + " ya existe.",
                    DesktopNotify.ERROR);
        }
    }

    /**
     *
     */
    public void modificar() {
        Proveedor_Controller PC = new Proveedor_Controller();
        String nit, razon_social, correo, direccion, telefono;
        int id, id_area, id_tipo_factura;
        id = Integer.parseInt(lblid.getText());
        nit = txtnit.getText();
        razon_social = txtrs.getText();
        correo = txtcorreo.getText();
        direccion = txtdir.getText();
        telefono = txttel.getText();
        id_area = cmbarea.getSelectedIndex();
        id_tipo_factura = cmbtipofact.getSelectedIndex();
        if (PC.modificar_proveedor(id, id_tipo_factura, id_area, nit, razon_social, correo, direccion, telefono)) {
            DesktopNotify.showDesktopMessage("Proveedor Creado", "El Proveedor " + razon_social + " ha sido modificado con exito.",
                    DesktopNotify.SUCCESS);
            limpiar();
            jsproveedor.setBounds(10, 40, 1100, 420);
            jpcrearp.setVisible(false);
            LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
        } else {
            DesktopNotify.showDesktopMessage("Proveedor no creado", "El Proveedor " + razon_social + " no ha podido ser modificado.",
                    DesktopNotify.ERROR);
        }
    }

    public void eliminar() {
        String razon_social = jtproveedores.getValueAt(jtproveedores.getSelectedRow(), 1).toString();
        Proveedor_Controller PC = new Proveedor_Controller();
        Proveedor P = PC.buscar(razon_social);
        if (PC.eliminar_proveedor(P.getId())) {
            DesktopNotify.showDesktopMessage("Proveedor Eliminar", "El Proveedor " + razon_social + " ha sido eliminado con exito.",
                    DesktopNotify.SUCCESS);
            LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
        } else {
            DesktopNotify.showDesktopMessage("Proveedor no Eliminado", "El Proveedor " + razon_social + " no ha podido ser eliminado.",
                    DesktopNotify.ERROR);
        }
    }

    public void buscar() {
        if (cmbbuscarprov.getSelectedItem().toString().equals("--Seleccione--")) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar el proveedor a buscar");
            LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
        } else {
            LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
        }
    }

    public void restablecer() {
        cmbbuscarprov.setSelectedIndex(0);
        LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
    }

    public void llenar_campos() {
        String razon_social = jtproveedores.getValueAt(jtproveedores.getSelectedRow(), 1).toString();
        Proveedor_Controller PC = new Proveedor_Controller();
        Proveedor P = PC.buscar(razon_social);
        if (P != null) {
            jsproveedor.setBounds(10, 40, 1100, 260);
            render();
            btnmodp.setVisible(true);
            btncrearp.setVisible(false);
            btnlimpiar.setVisible(false);
            lblid.setText(String.valueOf(P.getId()));
            txtnit.setText(P.getNit());
            txtrs.setText(razon_social);
            txtcorreo.setText(P.getCorreo());
            txtdir.setText(P.getDireccion());
            txttel.setText(P.getTelefono());
            cmbarea.setSelectedIndex(P.getId_area());
            cmbtipofact.setSelectedIndex(P.getId_tipo_factura()-3);
            jpcrearp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "El Proveedor no existe");
        }
    }

    /**
     *
     */
    public void validar_campos() {
        if (txtnit.getText().isEmpty() || txtrs.getText().isEmpty() || txtcorreo.getText().isEmpty() || txtdir.getText().isEmpty()
                || txttel.getText().isEmpty() || cmbarea.getSelectedIndex() == 0 || cmbtipofact.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "<html><div style='font-size: 14px;'>Los campos con"
                    + "<Strong style='color: #CC0033; font-size: 22px;'> * </Strong> son obligatorios</div></html>",
                    "Campos Obligatorios", JOptionPane.ERROR_MESSAGE);
            if (txtnit.getText().isEmpty()) {
                txtnit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtnit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtrs.getText().isEmpty()) {
                txtrs.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtrs.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtcorreo.getText().isEmpty()) {
                txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtdir.getText().isEmpty()) {
                txtdir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtdir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txttel.getText().isEmpty()) {
                txttel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txttel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (cmbarea.getSelectedIndex() == 0) {
                cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (cmbtipofact.getSelectedIndex() == 0) {
                cmbtipofact.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                cmbtipofact.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
        } else {
            crear();
        }
    }

    public void lista_proveedor() {
        cmbbuscarprov.removeAllItems();
        cmbbuscarprov.addItem("--Seleccione--");
        R.razon_social(cmbbuscarprov);
        cmbbuscarprov.setSelectedIndex(0);
    }

    public void cancelar() {
        if (jpcrearp.isVisible()) {
            txtnit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtrs.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtdir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txttel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            cmbtipofact.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            limpiar();
            jpcrearp.setVisible(false);
            jsproveedor.setBounds(10, 40, 1100, 420);
        }
    }

    public void formulario() {
        jsproveedor.setBounds(10, 40, 1100, 260);
        jpcrearp.setVisible(true);
        btnmodp.setVisible(false);
        render();
        btnlimpiar.setVisible(true);
        lblid.setVisible(false);
        jpcrearp.setVisible(true);
        txtnit.requestFocus();
    }

    public void limpiar() {
        txtnit.setText("");
        txtrs.setText("");
        txtcorreo.setText("");
        txtdir.setText("");
        txttel.setText("");
        cmbarea.setSelectedIndex(0);
        cmbtipofact.setSelectedIndex(0);
        cmbcp.setSelectedIndex(0);
    }

    public void render() {
        cmbarea.removeAllItems();
        cmbarea.addItem("--Seleccione--");
        R.area(cmbarea);
        cmbarea.setSelectedIndex(0);
        cmbtipofact.removeAllItems();
        cmbtipofact.addItem("--Seleccione--");
        R.tipo_factura(cmbtipofact);
        cmbtipofact.setSelectedIndex(0);
        AutoCompleteDecorator.decorate(cmbarea);
        AutoCompleteDecorator.decorate(cmbtipofact);
        R.cmbcentrado(cmbarea);
        R.cmbcentrado(cmbtipofact);
    }

    public void refrescar_tabla() {
//        int row = jtusuarios.getSelectedRow();
        LT.Proveedor(jtproveedores, cmbbuscarprov.getSelectedItem().toString());
//        jtusuarios.getSelectionModel().setSelectionInterval(row, row);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JButton btnactualizartabla;
    public static javax.swing.JButton btnbuscarprov;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncrearp;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodp;
    private javax.swing.JButton btnnuevop;
    public static javax.swing.JButton btnrestbusc;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JComboBox<String> cmbbuscarprov;
    private javax.swing.JComboBox<String> cmbcp;
    private javax.swing.JComboBox<String> cmbtipofact;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmEliminar;
    private javax.swing.JMenuItem jmModificar;
    private javax.swing.JPanel jpcrearp;
    private javax.swing.JScrollPane jsproveedor;
    private javax.swing.JTable jtproveedores;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel lblcondpago;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblrazonsocial;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltipofactura;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtrs;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
