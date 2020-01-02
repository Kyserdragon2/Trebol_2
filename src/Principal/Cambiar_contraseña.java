package Principal;

import Clases.Conexion;
import Controladores.Usuario_Controller;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.JOptionPane;

public class Cambiar_contraseña extends javax.swing.JInternalFrame {

    Conexion cc = new Conexion();
    Usuario_Controller UC = new Usuario_Controller();

    public Cambiar_contraseña() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpactual = new javax.swing.JPasswordField();
        jpnueva = new javax.swing.JPasswordField();
        jpcnueva = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Cambio de Contraseña");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cambio de Contraseña");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(73, 14, 199, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Actual");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 50, 36, 23);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nueva");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 80, 35, 23);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Confirmar Nueva");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 110, 95, 23);

        jpactual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpactual.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jpactual);
        jpactual.setBounds(130, 50, 186, 23);

        jpnueva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpnueva.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jpnueva);
        jpnueva.setBounds(130, 80, 186, 23);

        jpcnueva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpcnueva.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jpcnueva);
        jpcnueva.setBounds(130, 110, 186, 23);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Cambiar");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(130, 150, 92, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(5, 5, 341, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] arrayA = jpactual.getPassword();
        String passwA = (String.valueOf(arrayA));
        String encriptMD5A = DigestUtils.md5Hex(passwA);

        char[] arrayN = jpnueva.getPassword();
        String passwN = (String.valueOf(arrayN));
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        if (!passwN.matches(pattern)) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "La contraseña no cumple los requisitos minimos");
            jpcnueva.setText("");
            jpnueva.setText("");
            jpnueva.requestFocus();
        } else {
            String encriptMD5N = DigestUtils.md5Hex(passwN);

            char[] arrayCN = jpcnueva.getPassword();
            String passwCN = (String.valueOf(arrayCN));
            String encriptMD5CN = DigestUtils.md5Hex(passwCN);

            String Actual = encriptMD5A;
            String Nueva = encriptMD5N;
            String CNueva = encriptMD5CN;
            if (Actual.equals(UC.contraseña_usuario(Principal.lbluser.getText()))) {
                if (Nueva.equals(CNueva)) {
                    if (UC.cambiar_contraseña(UC.id_usuario(Principal.lbluser.getText()), Nueva)) {
                        JOptionPane.showMessageDialog(Principal.Escritorio, "Contraseña Actualizada");
                        Principal.Escritorio.remove(this);
                    } else {
                        JOptionPane.showMessageDialog(Principal.Escritorio, "La contraseña no pudo ser actualizada");
                    }
                } else {
                    JOptionPane.showMessageDialog(Principal.Escritorio, "Las contraseñas ingresadas no coinciden");
                    jpcnueva.setText("");
                    jpnueva.setText("");
                    jpnueva.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(Principal.Escritorio, "La contraseña ingresada no es la actual");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpactual;
    private javax.swing.JPasswordField jpcnueva;
    private javax.swing.JPasswordField jpnueva;
    // End of variables declaration//GEN-END:variables
}
