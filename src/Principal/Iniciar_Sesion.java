package Principal;

import Controladores.Usuario_Controller;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.commons.codec.digest.DigestUtils;

public class Iniciar_Sesion extends javax.swing.JFrame {

    Usuario_Controller UC = new Usuario_Controller();
    Principal P;
    Cambiar_contraseña CC;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Iniciar_Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btningreso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btndesbloquear = new javax.swing.JButton();
        jtxtpass1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtuser1 = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion - Trébol v2.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(325, 345));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 122, 183));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 315));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(239, 255, 239));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Empresa.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 12, 300, 160);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 35, 70, 26);

        jtxtuser.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jtxtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtuser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jtxtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jtxtuser);
        jtxtuser.setBounds(115, 35, 170, 25);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 70, 99, 26);

        jtxtpass.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jtxtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtpass.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jtxtpass.setNextFocusableComponent(btningreso);
        jtxtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpassKeyPressed(evt);
            }
        });
        jPanel2.add(jtxtpass);
        jtxtpass.setBounds(115, 70, 170, 25);

        jButton1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Usuario Bloqueado");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 115, 120, 21);

        btningreso.setBackground(new java.awt.Color(0, 102, 153));
        btningreso.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btningreso.setForeground(new java.awt.Color(255, 255, 255));
        btningreso.setText("Ingresar");
        btningreso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btningreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningreso.setFocusPainted(false);
        btningreso.setPreferredSize(new java.awt.Dimension(104, 31));
        btningreso.setRolloverEnabled(false);
        btningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresoActionPerformed(evt);
            }
        });
        jPanel2.add(btningreso);
        btningreso.setBounds(195, 110, 90, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 155, 300, 150);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel3.setLayout(null);

        btndesbloquear.setBackground(new java.awt.Color(0, 102, 153));
        btndesbloquear.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btndesbloquear.setForeground(new java.awt.Color(255, 255, 255));
        btndesbloquear.setText("Desbloquear");
        btndesbloquear.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btndesbloquear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndesbloquear.setOpaque(false);
        btndesbloquear.setPreferredSize(new java.awt.Dimension(104, 31));
        btndesbloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesbloquearActionPerformed(evt);
            }
        });
        jPanel3.add(btndesbloquear);
        btndesbloquear.setBounds(165, 110, 120, 26);

        jtxtpass1.setBackground(new java.awt.Color(153, 153, 153));
        jtxtpass1.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jtxtpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtpass1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jtxtpass1.setNextFocusableComponent(btndesbloquear);
        jtxtpass1.setOpaque(false);
        jPanel3.add(jtxtpass1);
        jtxtpass1.setBounds(115, 70, 170, 25);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 70, 99, 26);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 35, 70, 26);

        jtxtuser1.setBackground(new java.awt.Color(153, 153, 153));
        jtxtuser1.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        jtxtuser1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtuser1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jtxtuser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtuser1.setOpaque(false);
        jPanel3.add(jtxtuser1);
        jtxtuser1.setBounds(115, 35, 170, 25);

        btncancelar.setBackground(new java.awt.Color(0, 102, 153));
        btncancelar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.setOpaque(false);
        btncancelar.setPreferredSize(new java.awt.Dimension(104, 31));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btncancelar);
        btncancelar.setBounds(20, 110, 90, 26);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 155, 300, 150);

        getContentPane().add(jPanel1, "card2");

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresoActionPerformed
        char[] arrayC = jtxtpass.getPassword();
        String passw = (String.valueOf(arrayC));
        String encriptMD5 = DigestUtils.md5Hex(passw);
        validarusuario(jtxtuser.getText(), encriptMD5);
    }//GEN-LAST:event_btningresoActionPerformed

    private void btndesbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesbloquearActionPerformed
        char[] arrayC = jtxtpass1.getPassword();
        String passw = (String.valueOf(arrayC));
        String encriptMD5 = DigestUtils.md5Hex(passw);
        desbloquear_usuario(jtxtuser1.getText(), encriptMD5);
    }//GEN-LAST:event_btndesbloquearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jtxtuser1.requestFocus();
        jtxtuser.setText("");
        jtxtpass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jtxtuser.requestFocus();
        jtxtuser1.setText("");
        jtxtpass1.setText("");
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jtxtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpassKeyPressed
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btningreso.doClick();
        }
    }//GEN-LAST:event_jtxtpassKeyPressed

    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme("Green-Large-Font");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Trébol2.png"));
        return retValue;
    }

    void validarusuario(String user, String pass) {
        char[] arrayC = jtxtpass.getPassword();
        String passw = (String.valueOf(arrayC));
        if (jtxtuser.getText().equals("") && passw.length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar Usuario y Contraseña");
            jtxtuser.requestFocus();
        } else if (!jtxtuser.getText().equals("") && passw.length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar la contraseña");
            jtxtpass.requestFocus();
        } else if (jtxtuser.getText().equals("") && passw.length() != 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar un usuario");
            jtxtuser.requestFocus();
        } else {
            if (!UC.sesion(user, pass).equals("")) {
                    P = new Principal();
                    P.setVisible(true);
                    P.datousuario(UC.sesion(user, pass));
                    UC.estado_sesion(1, UC.sesion(user, pass));
                    dispose();
            }
        }
    }

    void desbloquear_usuario(String user, String pass) {
        char[] arrayC = jtxtpass1.getPassword();
        String passw = (String.valueOf(arrayC));
        if (jtxtuser1.getText().equals("") && passw.length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar Usuario y Contraseña");
            jtxtuser1.requestFocus();
        } else if (!jtxtuser1.getText().equals("") && passw.length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar la contraseña");
            jtxtpass1.requestFocus();
        } else if (jtxtuser1.getText().equals("") && passw.length() != 0) {
            JOptionPane.showMessageDialog(this, "Por Favor ingresar un usuario");
            jtxtuser1.requestFocus();
        } else {
            int confirm = JOptionPane.showConfirmDialog(Principal.Escritorio, "Al desbloquear el usuario cerrara la\nsesión activa en otro dispositivo",
                    "Desbloquear Usuario", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                if (UC.desbloquear_sesion(user, pass)) {
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(false);
                    jtxtuser.requestFocus();
                    jtxtuser1.setText("");
                    jtxtpass1.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrectos");
                    jtxtpass1.setText("");
                    jtxtpass1.requestFocus();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndesbloquear;
    private javax.swing.JButton btningreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JPasswordField jtxtpass1;
    private javax.swing.JTextField jtxtuser;
    private javax.swing.JTextField jtxtuser1;
    // End of variables declaration//GEN-END:variables
}
