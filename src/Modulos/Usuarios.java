package Modulos;

import Clases.Llenar_Tablas;
import Clases.Renderizado;
import Controladores.Usuario_Controller;
import Objetos.Usuario_obj;
import Principal.Principal;
import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.apache.commons.codec.digest.DigestUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Usuarios extends javax.swing.JInternalFrame {

    Llenar_Tablas LT = new Llenar_Tablas();
    Renderizado R;

    public Usuarios() {
        initComponents();
        LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
        jpcrearusuario.setVisible(false);
        jscusuarios.setBounds(10, 40, 1050, 350);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmMenuUsuario = new javax.swing.JPopupMenu();
        jmModificar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmrestcont = new javax.swing.JMenuItem();
        btgactivo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btncrearUsuario = new javax.swing.JButton();
        btnactualizartabla = new javax.swing.JButton();
        jscusuarios = new javax.swing.JScrollPane();
        jtusuarios = new javax.swing.JTable();
        jpcrearusuario = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        lblarea = new javax.swing.JLabel();
        lblempresa = new javax.swing.JLabel();
        lblaprobar = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<>();
        cmbempresa = new javax.swing.JComboBox<>();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jpfcontraseña = new javax.swing.JPasswordField();
        jcbaprueba = new javax.swing.JCheckBox();
        btncrearusuario = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        lblactivo = new javax.swing.JLabel();
        jrbSI = new javax.swing.JRadioButton();
        jrbNO = new javax.swing.JRadioButton();
        btnmodificarusuario = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblNid = new javax.swing.JLabel();
        btnbuscarUsuario = new javax.swing.JButton();
        txtbuscarusuario = new javax.swing.JTextField();
        btnbuscarUsuario1 = new javax.swing.JButton();

        jpmMenuUsuario.setBackground(new java.awt.Color(153, 153, 153));
        jpmMenuUsuario.setToolTipText("Opciones");
        jpmMenuUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpmMenuUsuario.setLabel("Opciones");

        jmModificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jmModificar.setText("Modificar Usuario");
        jmModificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmModificar.setBorderPainted(true);
        jmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarActionPerformed(evt);
            }
        });
        jpmMenuUsuario.add(jmModificar);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jpmMenuUsuario.add(jSeparator1);

        jmrestcont.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jmrestcont.setText("Restablecer Contraseña");
        jmrestcont.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jmrestcont.setBorderPainted(true);
        jpmMenuUsuario.add(jmrestcont);

        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        setClosable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trébol2.png"))); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        btncrearUsuario.setBackground(new java.awt.Color(204, 255, 153));
        btncrearUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncrearUsuario.setForeground(new java.awt.Color(37, 112, 0));
        btncrearUsuario.setText("Crear Usuario");
        btncrearUsuario.setToolTipText("");
        btncrearUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncrearUsuario.setFocusPainted(false);
        btncrearUsuario.setPreferredSize(new java.awt.Dimension(100, 52));
        btncrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btncrearUsuario);
        btncrearUsuario.setBounds(30, 8, 120, 26);

        btnactualizartabla.setBackground(new java.awt.Color(0, 102, 255));
        btnactualizartabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargar2.png"))); // NOI18N
        btnactualizartabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnactualizartabla.setFocusPainted(false);
        btnactualizartabla.setRolloverEnabled(false);
        btnactualizartabla.setVerifyInputWhenFocusTarget(false);
        btnactualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizartablaActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizartabla);
        btnactualizartabla.setBounds(1039, 42, 19, 25);

        jscusuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
        jscusuarios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jscusuarios.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jscusuarios.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtusuarios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jtusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtusuarios.setFillsViewportHeight(true);
        jtusuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtusuarios.setShowVerticalLines(false);
        jtusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtusuariosMouseReleased(evt);
            }
        });
        jscusuarios.setViewportView(jtusuarios);

        jPanel1.add(jscusuarios);
        jscusuarios.setBounds(10, 40, 1050, 160);

        jpcrearusuario.setBackground(new java.awt.Color(255, 255, 255));
        jpcrearusuario.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jpcrearusuario.setLayout(null);

        lblusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusuario.setText("Usuario:");
        lblusuario.setToolTipText("");
        jpcrearusuario.add(lblusuario);
        lblusuario.setBounds(20, 20, 60, 23);

        txtusuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(txtusuario);
        txtusuario.setBounds(90, 20, 170, 21);

        lblnombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblnombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnombres.setText("Nombres:");
        lblnombres.setToolTipText("");
        jpcrearusuario.add(lblnombres);
        lblnombres.setBounds(10, 60, 70, 23);

        lblapellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblapellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblapellidos.setText("Apellidos:");
        lblapellidos.setToolTipText("");
        jpcrearusuario.add(lblapellidos);
        lblapellidos.setBounds(430, 60, 70, 23);

        lblcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcorreo.setText("Correo:");
        lblcorreo.setToolTipText("");
        jpcrearusuario.add(lblcorreo);
        lblcorreo.setBounds(20, 100, 60, 23);

        lblcontraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcontraseña.setText("Contraseña:");
        lblcontraseña.setToolTipText("");
        jpcrearusuario.add(lblcontraseña);
        lblcontraseña.setBounds(430, 100, 85, 23);

        lblarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblarea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblarea.setText("Area:");
        lblarea.setToolTipText("");
        jpcrearusuario.add(lblarea);
        lblarea.setBounds(280, 20, 50, 23);

        lblempresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblempresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblempresa.setText("Empresa:");
        lblempresa.setToolTipText("");
        jpcrearusuario.add(lblempresa);
        lblempresa.setBounds(520, 20, 70, 23);

        lblaprobar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblaprobar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblaprobar.setText("Aprueba:");
        lblaprobar.setToolTipText("");
        jpcrearusuario.add(lblaprobar);
        lblaprobar.setBounds(740, 20, 70, 23);

        cmbarea.setEditable(true);
        cmbarea.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(cmbarea);
        cmbarea.setBounds(340, 20, 150, 23);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(cmbempresa);
        cmbempresa.setBounds(600, 20, 120, 23);

        txtnombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(txtnombres);
        txtnombres.setBounds(90, 60, 310, 23);

        txtapellidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtapellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(txtapellidos);
        txtapellidos.setBounds(510, 60, 320, 23);

        txtcorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(txtcorreo);
        txtcorreo.setBounds(90, 100, 310, 23);

        jpfcontraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpfcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpfcontraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jpcrearusuario.add(jpfcontraseña);
        jpfcontraseña.setBounds(520, 100, 310, 23);

        jcbaprueba.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbaprueba.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jcbaprueba.setOpaque(false);
        jpcrearusuario.add(jcbaprueba);
        jcbaprueba.setBounds(810, 20, 30, 23);

        btncrearusuario.setBackground(new java.awt.Color(204, 255, 153));
        btncrearusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncrearusuario.setForeground(new java.awt.Color(37, 112, 0));
        btncrearusuario.setText("Crear Usuario");
        btncrearusuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncrearusuario.setRolloverEnabled(false);
        btncrearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearusuarioActionPerformed(evt);
            }
        });
        jpcrearusuario.add(btncrearusuario);
        btncrearusuario.setBounds(720, 140, 110, 26);

        btnlimpiar.setBackground(new java.awt.Color(153, 204, 255));
        btnlimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jpcrearusuario.add(btnlimpiar);
        btnlimpiar.setBounds(630, 140, 70, 26);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*");
        jpcrearusuario.add(jLabel2);
        jLabel2.setBounds(263, 20, 10, 20);

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("*");
        jpcrearusuario.add(jLabel3);
        jLabel3.setBounds(403, 60, 10, 20);

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("*");
        jpcrearusuario.add(jLabel4);
        jLabel4.setBounds(493, 20, 10, 20);

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("*");
        jpcrearusuario.add(jLabel5);
        jLabel5.setBounds(723, 20, 10, 20);

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("*");
        jpcrearusuario.add(jLabel6);
        jLabel6.setBounds(833, 60, 10, 20);

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("*");
        jpcrearusuario.add(jLabel7);
        jLabel7.setBounds(403, 100, 10, 20);

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("*");
        jpcrearusuario.add(jLabel8);
        jLabel8.setBounds(835, 100, 10, 20);

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(153, 0, 0));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jpcrearusuario.add(btncancelar);
        btncancelar.setBounds(20, 140, 80, 26);

        lblactivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblactivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblactivo.setText("Activo:");
        lblactivo.setToolTipText("");
        jpcrearusuario.add(lblactivo);
        lblactivo.setBounds(270, 140, 60, 26);

        jrbSI.setBackground(new java.awt.Color(37, 112, 0));
        btgactivo.add(jrbSI);
        jrbSI.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbSI.setForeground(new java.awt.Color(255, 255, 255));
        jrbSI.setText("SI ");
        jrbSI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbSI.setBorderPainted(true);
        jrbSI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrbSI.setRequestFocusEnabled(false);
        jpcrearusuario.add(jrbSI);
        jrbSI.setBounds(335, 140, 60, 26);

        jrbNO.setBackground(new java.awt.Color(153, 0, 0));
        btgactivo.add(jrbNO);
        jrbNO.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbNO.setForeground(new java.awt.Color(255, 255, 255));
        jrbNO.setText("NO ");
        jrbNO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbNO.setBorderPainted(true);
        jrbNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrbNO.setRequestFocusEnabled(false);
        jpcrearusuario.add(jrbNO);
        jrbNO.setBounds(400, 140, 60, 26);

        btnmodificarusuario.setBackground(new java.awt.Color(204, 255, 153));
        btnmodificarusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmodificarusuario.setForeground(new java.awt.Color(37, 112, 0));
        btnmodificarusuario.setText("Modificar Usuario");
        btnmodificarusuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmodificarusuario.setRolloverEnabled(false);
        btnmodificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarusuarioActionPerformed(evt);
            }
        });
        jpcrearusuario.add(btnmodificarusuario);
        btnmodificarusuario.setBounds(710, 140, 130, 26);

        lblID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID:");
        lblID.setToolTipText("");
        jpcrearusuario.add(lblID);
        lblID.setBounds(515, 140, 30, 26);

        lblNid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNid.setToolTipText("");
        lblNid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpcrearusuario.add(lblNid);
        lblNid.setBounds(550, 140, 30, 26);

        jPanel1.add(jpcrearusuario);
        jpcrearusuario.setBounds(120, 210, 860, 180);

        btnbuscarUsuario.setBackground(new java.awt.Color(255, 217, 142));
        btnbuscarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnbuscarUsuario.setForeground(new java.awt.Color(142, 94, 0));
        btnbuscarUsuario.setText("Buscar");
        btnbuscarUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscarUsuario.setFocusPainted(false);
        btnbuscarUsuario.setPreferredSize(new java.awt.Dimension(100, 52));
        btnbuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarUsuario);
        btnbuscarUsuario.setBounds(840, 8, 80, 26);

        txtbuscarusuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtbuscarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscarusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jPanel1.add(txtbuscarusuario);
        txtbuscarusuario.setBounds(660, 8, 170, 26);

        btnbuscarUsuario1.setBackground(new java.awt.Color(255, 153, 153));
        btnbuscarUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnbuscarUsuario1.setForeground(new java.awt.Color(153, 0, 0));
        btnbuscarUsuario1.setText("Restablecer");
        btnbuscarUsuario1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnbuscarUsuario1.setFocusPainted(false);
        btnbuscarUsuario1.setPreferredSize(new java.awt.Dimension(100, 52));
        btnbuscarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarUsuario1);
        btnbuscarUsuario1.setBounds(930, 8, 110, 26);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearUsuarioActionPerformed
        formulario();
    }//GEN-LAST:event_btncrearUsuarioActionPerformed

    private void btncrearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearusuarioActionPerformed
        validar_campos();
    }//GEN-LAST:event_btncrearusuarioActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnactualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizartablaActionPerformed
        refrescar_tabla();
    }//GEN-LAST:event_btnactualizartablaActionPerformed

    private void jtusuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtusuariosMouseReleased
        menu_tabla(evt);
    }//GEN-LAST:event_jtusuariosMouseReleased

    private void jmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarActionPerformed
        llenar_campos();
    }//GEN-LAST:event_jmModificarActionPerformed

    private void btnmodificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarusuarioActionPerformed
        modificar();
    }//GEN-LAST:event_btnmodificarusuarioActionPerformed

    private void btnbuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarUsuarioActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarUsuarioActionPerformed

    private void btnbuscarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarUsuario1ActionPerformed
        restablecer();
    }//GEN-LAST:event_btnbuscarUsuario1ActionPerformed

    /**
     *
     */
    public void crear() {
        Usuario_Controller UC = new Usuario_Controller();
        String usuario, nombres, apellidos, correo, contraseña;
        int id_area, id_empresa, aprueba;
        usuario = txtusuario.getText();
        nombres = txtnombres.getText();
        apellidos = txtapellidos.getText();
        correo = txtcorreo.getText();
        char[] arrayC = jpfcontraseña.getPassword();
        String passw = (String.valueOf(arrayC));
        String encriptMD5 = DigestUtils.md5Hex(passw);
        contraseña = encriptMD5;
        id_area = cmbarea.getSelectedIndex();
        id_empresa = cmbempresa.getSelectedIndex();
        if (jcbaprueba.isSelected()) {
            aprueba = 1;
        } else {
            aprueba = 0;
        }
        if (UC.crear_usuario(id_area, id_empresa, aprueba, usuario, nombres, apellidos, correo, contraseña)) {
            DesktopNotify.showDesktopMessage("Usuario Creado", "El Usuario " + usuario + " ha sido creado con exito.",
                    DesktopNotify.SUCCESS, 7000);
            limpiar();
            jpcrearusuario.setVisible(false);
            jscusuarios.setBounds(10, 40, 1050, 350);
            LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
        } else {
            DesktopNotify.showDesktopMessage("Usuario no creado", "El Usuario " + usuario + " ya existe.",
                    DesktopNotify.ERROR, 7000);
        }
    }

    /**
     *
     */
    public void modificar() {
        Usuario_Controller UC = new Usuario_Controller();
        String usuario, nombres, apellidos, correo, contraseña;
        int id, id_area, id_empresa, aprueba, retirado;
        id = Integer.parseInt(lblNid.getText());
        usuario = txtusuario.getText();
        nombres = txtnombres.getText();
        apellidos = txtapellidos.getText();
        correo = txtcorreo.getText();
        char[] arrayC = jpfcontraseña.getPassword();
        String passw = (String.valueOf(arrayC));
        contraseña = passw;
        id_area = cmbarea.getSelectedIndex();
        id_empresa = cmbempresa.getSelectedIndex();
        if (jcbaprueba.isSelected()) {
            aprueba = 1;
        } else {
            aprueba = 0;
        }
        if (jrbSI.isSelected()) {
            retirado = 0;
        } else if (jrbNO.isSelected()) {
            retirado = 1;
        } else {
            retirado = 0;
        }
        if (UC.modificar_usuario(id, id_area, id_empresa, aprueba, retirado, usuario, nombres, apellidos, correo, contraseña)) {
            DesktopNotify.showDesktopMessage("Modificación de Usuario", "El Usuario " + usuario + " ha sido modificado con exito.",
                    DesktopNotify.SUCCESS);
            limpiar();
            jpcrearusuario.setVisible(false);
            jscusuarios.setBounds(10, 40, 1050, 350);
            LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
        } else {
            DesktopNotify.showDesktopMessage("Modificación de Usuario", "El Usuario " + usuario + " no pudo ser modificado.",
                    DesktopNotify.ERROR);
        }
    }

    public void buscar() {
        if (txtbuscarusuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar el usuario a buscar");
        } else {
            LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
        }
    }

    public void restablecer() {
        txtbuscarusuario.setText("");
        LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
    }

    public void formulario() {
        jscusuarios.setBounds(10, 40, 1050, 160);
        render();
        btnmodificarusuario.setVisible(false);
        btncrearusuario.setVisible(true);
        btnlimpiar.setVisible(true);
        lblactivo.setVisible(false);
        lblID.setVisible(false);
        lblNid.setVisible(false);
        jrbSI.setVisible(false);
        jrbNO.setVisible(false);
        jpcrearusuario.setVisible(true);
        txtusuario.requestFocus();
    }

    public void refrescar_tabla() {
//        int row = jtusuarios.getSelectedRow();
        LT.Usuarios(jtusuarios, txtbuscarusuario.getText());
//        jtusuarios.getSelectionModel().setSelectionInterval(row, row);
    }

    public void menu_tabla(java.awt.event.MouseEvent evt) {
        if (SwingUtilities.isRightMouseButton(evt)) {
            int rowNumber = jtusuarios.rowAtPoint(evt.getPoint());
            if (rowNumber >= 0 && rowNumber < jtusuarios.getRowCount()) {
                jtusuarios.getSelectionModel().setSelectionInterval(rowNumber, rowNumber);
                jpmMenuUsuario.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }

    public void llenar_campos() {
        String usuario = jtusuarios.getValueAt(jtusuarios.getSelectedRow(), 0).toString();
        Usuario_Controller UC = new Usuario_Controller();
        Usuario_obj U = UC.buscar(usuario);
        if (U != null) {
            jscusuarios.setBounds(10, 40, 1050, 160);
            render();
            btnmodificarusuario.setVisible(true);
            btncrearusuario.setVisible(false);
            btnlimpiar.setVisible(false);
            lblNid.setText(String.valueOf(U.getId()));
            txtusuario.setText(usuario);
            txtnombres.setText(U.getNombres());
            txtapellidos.setText(U.getApellidos());
            txtcorreo.setText(U.getCorreo());
            jpfcontraseña.setText(U.getContraseña());
            cmbarea.setSelectedIndex(U.getId_area());
            cmbempresa.setSelectedIndex(U.getId_empresa());
            if (U.getAprueba() == 1) {
                jcbaprueba.setSelected(true);
            } else {
                jcbaprueba.setSelected(false);
            }
            if (U.getRetirado() == 1) {
                jrbNO.setSelected(true);
            } else {
                jrbSI.setSelected(true);
            }
            lblactivo.setVisible(true);
            lblID.setVisible(true);
            lblNid.setVisible(true);
            jrbSI.setVisible(true);
            jrbNO.setVisible(true);
            jpcrearusuario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "El Usuario no existe");
        }
    }

    /**
     *
     */
    public void cancelar() {
        if (jpcrearusuario.isVisible()) {
            txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtnombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtapellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            jpfcontraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                    java.awt.Color.lightGray, java.awt.Color.black));
            limpiar();
            jpcrearusuario.setVisible(false);
            jscusuarios.setBounds(10, 40, 1050, 350);
        }
    }

    /**
     *
     */
    public void validar_campos() {
        if (txtusuario.getText().isEmpty() || txtnombres.getText().isEmpty() || txtapellidos.getText().isEmpty() || txtcorreo.getText().isEmpty()
                || jpfcontraseña.getPassword().equals("") || cmbarea.getSelectedIndex() == 0 || cmbempresa.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "<html><div style='font-size: 14px;'>Los campos con"
                    + "<Strong style='color: #CC0033; font-size: 22px;'> * </Strong> son obligatorios</div></html>",
                    "Campos Obligatorios", JOptionPane.ERROR_MESSAGE);
            if (txtusuario.getText().isEmpty()) {
                txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtnombres.getText().isEmpty()) {
                txtnombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtnombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtapellidos.getText().isEmpty()) {
                txtapellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtapellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (txtcorreo.getText().isEmpty()) {
                txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (jpfcontraseña.getText().isEmpty()) {
                jpfcontraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                jpfcontraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (cmbarea.getSelectedIndex() == 0) {
                cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                cmbarea.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
            if (cmbempresa.getSelectedIndex() == 0) {
                cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        null, new Color(153, 0, 0)));
            } else {
                cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
                        java.awt.Color.lightGray, java.awt.Color.black));
            }
        } else {
            crear();
        }
    }

    /**
     *
     */
    public void limpiar() {
        txtusuario.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtcorreo.setText("");
        jpfcontraseña.setText("");
        cmbarea.setSelectedIndex(0);
        cmbempresa.setSelectedIndex(0);
        jcbaprueba.setSelected(false);
    }

    /**
     *
     */
    public void render() {
        if (R == null) {
            R = new Renderizado();
        }
        cmbempresa.removeAllItems();
        cmbempresa.addItem("--Seleccione--");
        R.empresa(cmbempresa);
        cmbempresa.setSelectedIndex(0);
        cmbarea.removeAllItems();
        cmbarea.addItem("--Seleccione--");
        R.area(cmbarea);
        cmbarea.setSelectedIndex(0);
        AutoCompleteDecorator.decorate(cmbarea);
        AutoCompleteDecorator.decorate(cmbempresa);
        R.cmbcentrado(cmbarea);
        R.cmbcentrado(cmbempresa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgactivo;
    private javax.swing.JButton btnactualizartabla;
    public static javax.swing.JButton btnbuscarUsuario;
    public static javax.swing.JButton btnbuscarUsuario1;
    private javax.swing.JButton btncancelar;
    public static javax.swing.JButton btncrearUsuario;
    private javax.swing.JButton btncrearusuario;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificarusuario;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JComboBox<String> cmbempresa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JCheckBox jcbaprueba;
    private javax.swing.JMenuItem jmModificar;
    private javax.swing.JMenuItem jmrestcont;
    private javax.swing.JPanel jpcrearusuario;
    private javax.swing.JPasswordField jpfcontraseña;
    private javax.swing.JPopupMenu jpmMenuUsuario;
    private javax.swing.JRadioButton jrbNO;
    private javax.swing.JRadioButton jrbSI;
    private javax.swing.JScrollPane jscusuarios;
    private javax.swing.JTable jtusuarios;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNid;
    private javax.swing.JLabel lblactivo;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblaprobar;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscarusuario;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
