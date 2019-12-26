package Modulos;

import Clases.Controles_Adicionales;
import Clases.Envio_Correos;
import Clases.Renderizado;
import Controladores.*;
import static Modulos.Gestionar_Factura.*;
import Principal.Principal;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class Rechazo_Factura extends javax.swing.JInternalFrame {

    Renderizado R = new Renderizado();
    Controles_Adicionales CA = new Controles_Adicionales();
    Logs_Controller LC = new Logs_Controller();
    Tiempo_Controller TC = new Tiempo_Controller();
    Comentario_Controller CC = new Comentario_Controller();
    Correo_Controller CorC = new Correo_Controller();
    Factura_Controller FC = new Factura_Controller();
    Usuario_Controller UC = new Usuario_Controller();
    Aprobacion_Controller ApC = new Aprobacion_Controller();
    Revision_Controller RC = new Revision_Controller();
    Proceso_Controller ProcC = new Proceso_Controller();
    Notificaciones_Sistema NS = new Notificaciones_Sistema();
    Envio_Correos EC = new Envio_Correos();
    int id_usuario, id_factura, est_prev, est_post, id_proveedor, id_empresa;
    String no_factura;

    public void Rechazo_Factura(int id_usuario, int id_factura, int est_prev, int est_post, int id_proveedor, int id_empresa, String no_factura) {
        this.id_usuario = id_usuario;
        this.id_factura = id_factura;
        this.est_prev = est_prev;
        this.est_post = est_post;
        this.id_proveedor = id_proveedor;
        this.id_empresa = id_empresa;
        this.no_factura = no_factura;
    }

    public Rechazo_Factura() {
        initComponents();
        render();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbldetalle = new javax.swing.JLabel();
        cmbmotivo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jsdetalle = new javax.swing.JScrollPane();
        jtadetalle = new javax.swing.JTextArea();
        btnok = new javax.swing.JButton();
        btnrechazar = new javax.swing.JButton();
        lblarea = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Rechazo de la Factura");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(253, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        jPanel1.setLayout(null);

        lbldetalle.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        lbldetalle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldetalle.setText("Detalle:");
        lbldetalle.setEnabled(false);
        jPanel1.add(lbldetalle);
        lbldetalle.setBounds(20, 60, 57, 27);

        cmbmotivo.setEditable(true);
        cmbmotivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbmotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbmotivo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel1.add(cmbmotivo);
        cmbmotivo.setBounds(85, 20, 480, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Motivo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 57, 27);

        jsdetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));

        jtadetalle.setColumns(20);
        jtadetalle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtadetalle.setRows(4);
        jtadetalle.setTabSize(5);
        jtadetalle.setBorder(null);
        jtadetalle.setEnabled(false);
        jsdetalle.setViewportView(jtadetalle);

        jPanel1.add(jsdetalle);
        jsdetalle.setBounds(85, 60, 480, 90);

        btnok.setBackground(new java.awt.Color(255, 198, 198));
        btnok.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnok.setForeground(new java.awt.Color(153, 0, 0));
        btnok.setText("Rechazar");
        btnok.setToolTipText("");
        btnok.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnok.setFocusPainted(false);
        btnok.setPreferredSize(new java.awt.Dimension(162, 26));
        btnok.setRequestFocusEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok);
        btnok.setBounds(470, 200, 90, 26);

        btnrechazar.setBackground(new java.awt.Color(153, 204, 255));
        btnrechazar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnrechazar.setForeground(new java.awt.Color(0, 102, 204));
        btnrechazar.setText("Cancelar");
        btnrechazar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrechazar.setFocusPainted(false);
        btnrechazar.setRequestFocusEnabled(false);
        btnrechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrechazarActionPerformed(evt);
            }
        });
        jPanel1.add(btnrechazar);
        btnrechazar.setBounds(20, 200, 83, 26);

        lblarea.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        lblarea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblarea.setText("Area:");
        lblarea.setEnabled(false);
        jPanel1.add(lblarea);
        lblarea.setBounds(35, 160, 41, 27);

        cmbarea.setEditable(true);
        cmbarea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbarea.setEnabled(false);
        jPanel1.add(cmbarea);
        cmbarea.setBounds(85, 160, 480, 25);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        rechazar_factura();
    }//GEN-LAST:event_btnokActionPerformed

    private void btnrechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrechazarActionPerformed
        this.doDefaultCloseAction();
    }//GEN-LAST:event_btnrechazarActionPerformed

    private void render() {
        cmbmotivo.removeAllItems();
        cmbmotivo.addItem("---");
        cmbarea.removeAllItems();
        cmbarea.addItem("---");
        switch (UC.id_area_usuario(Principal.lbluser.getText())) {
            case 1:
                if (FC.id_estado_factura(Integer.parseInt(lblid.getText())) == 2) {
                    R.motivos_rechazo(cmbmotivo, "1,2");
                    R.proceso_rechazo(cmbarea, "1,2");
                } else if (FC.id_estado_factura(Integer.parseInt(lblid.getText())) == 8) {
                    R.motivos_rechazo(cmbmotivo, "1");
                    R.proceso_rechazo(cmbarea, "1");
                }
                break;
            case 2:
            case 3:
            case 8:
                R.motivos_rechazo(cmbmotivo, "1");
                R.proceso_rechazo(cmbarea, "1");
                break;
            case 4:
                R.motivos_rechazo(cmbmotivo, "1,2,3");
                R.proceso_rechazo(cmbarea, "1,2,3");
                break;
            case 5:
                R.motivos_rechazo(cmbmotivo, "1,2,3,4");
                R.proceso_rechazo(cmbarea, "1,2,3,4");
                break;
            case 9:
                R.motivos_rechazo(cmbmotivo, "1,2,3,4,5");
                R.proceso_rechazo(cmbarea, "1,2,3,4,5");
                break;
        }
        cmbmotivo.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cmbmotivo.getSelectedItem().toString().equals("Otro...")) {
                    lbldetalle.setEnabled(true);
                    lblarea.setEnabled(true);
                    jtadetalle.setEnabled(true);
                    cmbarea.setEnabled(true);
                } else {
                    lbldetalle.setEnabled(false);
                    lblarea.setEnabled(false);
                    jtadetalle.setEnabled(false);
                    cmbarea.setEnabled(false);
                    cmbarea.setToolTipText("");
                    cmbarea.setSelectedIndex(0);
                }
            }
        });
    }

    public void eliminar_aprob_rev() {
        int id_area = UC.id_area_usuario(Principal.lbluser.getText());
        switch (id_area) {
            case 1:
            case 2:
            case 3:
            case 8:
                ApC.eliminar_aprobacion(id_factura, id_area);
                break;
            case 5:
                RC.eliminar_revision(id_factura);
                break;
        }
    }

    public void rechazar_factura() {
        if (cmbmotivo.getSelectedItem().toString().equals("Otro...")) {
            if (validar_campos()) {
                String usuario = UC.nombre_rev(Principal.lbluser.getText());
                int id_gestion;
                String destinarario = "";
                switch (cmbarea.getSelectedIndex()) {
                    case 1:
                        id_gestion = LC.area_creacion_fact(id_factura, 6);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0);
                                break;
                        }
                        break;
                    case 2:
                        id_gestion = FC.id_area_factura(id_factura);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(id_gestion, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(id_gestion, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(id_gestion, 0);
                                break;
                        }
                        break;
                    case 3:
                        id_gestion = LC.area_creacion_fact(id_factura, 2);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(1, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(1, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(1, 0);
                                break;
                        }
                        break;
                    case 4:
                        id_gestion = LC.area_creacion_fact(id_factura, 4);
                        switch (est_prev) {
                            case 9:
                            case 10:
                                destinarario = UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(4, 0);
                                break;
                        }
                        break;
                    case 5:
                        id_gestion = LC.area_creacion_fact(id_factura, 5);
                        destinarario = UC.correos(5, 0);
                        break;
                    default:
                        id_gestion = 0;
                        break;
                }
                CC.crear_comentario(0, id_usuario, id_factura, est_post, jtadetalle.getText());
                int com = CC.id_comentario(id_factura, id_usuario, est_post, jtadetalle.getText());
                LC.crear_log(id_usuario, id_factura, com, est_post);
                FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, est_post, id_gestion);
                TC.crear_tiempo(id_usuario, id_factura, est_prev, est_post);
                eliminar_aprob_rev();
                CorC.crear_correo(id_factura, destinarario, "Factura Rechazada", EC.plantilla_correo("Factura Rechazada",
                        no_factura, lblempresa.getText(), lblnit.getText(), lblcorresp.getText(), lblproveedor.getText(),
                        lblvalor.getText(), lblfecharec.getText(), lblfechafact.getText(), lblfechavenc.getText(), usuario, ""));
                NS.notificaciones("Rechazo de la Factura", "Factura " + lblnfact.getText() + " Rechazada.", "correcto");
                Principal.btnactualizar.doClick();
                Gestionar_Factura.btncerrar.doClick();
                this.doDefaultCloseAction();
            } else {
                JOptionPane.showMessageDialog(Principal.Escritorio, "Completar los campos.");
            }
        } else {
            if (validar_campos()) {
                String usuario = UC.nombre_rev(Principal.lbluser.getText());
                int id_gestion = 0;
                String destinarario = "";
                int proceso = ProcC.id_area_proceso(cmbmotivo.getSelectedItem().toString());
                switch (proceso) {
                    case 1:
                        id_gestion = LC.area_creacion_fact(id_factura, 6);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(7, 0) + ", " + UC.correos(6, 0);
                                break;
                        }
                        break;
                    case 2:
                        id_gestion = FC.id_area_factura(id_factura);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(id_gestion, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(id_gestion, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(id_gestion, 0);
                                break;
                        }
                        break;
                    case 3:
                        id_gestion = LC.area_creacion_fact(id_factura, 2);
                        switch (est_prev) {
                            case 4:
                            case 5:
                                destinarario = UC.correos(1, 0) + ", " + UC.correos(4, id_empresa);
                                break;
                            case 9:
                            case 10:
                                destinarario = UC.correos(1, 0) + ", " + UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(1, 0);
                                break;
                        }
                        break;
                    case 4:
                        id_gestion = LC.area_creacion_fact(id_factura, 4);
                        switch (est_prev) {
                            case 9:
                            case 10:
                                destinarario = UC.correos(4, id_empresa) + ", " + UC.correos(5, 0);
                                break;
                            default:
                                destinarario = UC.correos(4, 0);
                                break;
                        }
                        break;
                    case 5:
                        id_gestion = LC.area_creacion_fact(id_factura, 5);
                        destinarario = UC.correos(5, 0);
                        break;
                }
                CC.crear_comentario(0, id_usuario, id_factura, est_post, cmbmotivo.getSelectedItem().toString());
                int com = CC.id_comentario(id_factura, id_usuario, est_post, cmbmotivo.getSelectedItem().toString());
                LC.crear_log(id_usuario, id_factura, com, est_post);
                FC.cambiar_asignacion_factura(no_factura, id_proveedor, id_empresa, est_post, id_gestion);
                TC.crear_tiempo(id_usuario, id_factura, est_prev, est_post);
                eliminar_aprob_rev();
                CorC.crear_correo(id_factura, destinarario, "Factura Rechazada", EC.plantilla_correo("Factura Rechazada",
                        no_factura, lblempresa.getText(), lblnit.getText(), lblcorresp.getText(), lblproveedor.getText(),
                        lblvalor.getText(), lblfecharec.getText(), lblfechafact.getText(), lblfechavenc.getText(), usuario, ""));
                NS.notificaciones("Rechazo de la Factura", "Factura " + lblnfact.getText() + " Rechazada.", "correcto");
                Principal.btnactualizar.doClick();
                Gestionar_Factura.btncerrar.doClick();
                this.doDefaultCloseAction();
            } else {
                JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor elegir el motivo.");
            }
        }
    }

    public boolean validar_campos() {
        if (cmbmotivo.getSelectedItem().toString().equals("Otro...")) {
            if (jtadetalle.getText().isEmpty()) {
                CA.Borde_Componente(jsdetalle, "rojo");
            } else {
                CA.Borde_Componente(jsdetalle, "");
            }
            if (cmbarea.getSelectedIndex() == 0) {
                CA.Borde_Componente(cmbarea, "rojo");
            } else {
                CA.Borde_Componente(cmbarea, "");
            }
            return !(jtadetalle.getText().equals("") || cmbarea.getSelectedIndex() == 0);
        } else {
            if (cmbmotivo.getSelectedIndex() == 0) {
                CA.Borde_Componente(cmbmotivo, "rojo");
            } else {
                CA.Borde_Componente(cmbmotivo, "");
            }
            return cmbmotivo.getSelectedIndex() != 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnok;
    private javax.swing.JButton btnrechazar;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JComboBox<String> cmbmotivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jsdetalle;
    private javax.swing.JTextArea jtadetalle;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel lbldetalle;
    // End of variables declaration//GEN-END:variables
}
