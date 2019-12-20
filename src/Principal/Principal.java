package Principal;

import Clases.*;
import Modulos.*;
import java.util.*;
import javax.swing.*;
import Controladores.*;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import javax.swing.table.TableRowSorter;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos, ampm;                                           //crea las variables hora, minutos, segundos y ampm como caracteres
    Calendar calendario;                                                            //crea la variable calendario con las propiedades de la libreria Calendar 
    Thread h1;
    Grabar_Factura GF;
    Gestionar_Factura GestF;
    Detalles_Factura DetFact;
    Renderizado R = new Renderizado();
    Llenar_Tablas LT = new Llenar_Tablas();
    Envio_Correos EC = new Envio_Correos();
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
    Precargar_Anticipos PANT;
    Factura_Convenio_Controller FCC = new Factura_Convenio_Controller();

    @SuppressWarnings({"CallToThreadStartDuringObjectConstruction", "OverridableMethodCallInConstructor"})
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date fecha = new Date();                                                    //Crea una nueva estancia de Date con la variable fecha
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("EEEE',' dd 'de' MMMM 'de' yyyy");     //Se especifica el formato que sera usado para la fecha
        lblfecha.setText(formatoDeFecha.format(fecha));                             //Envia la informacion de la fecha al label fecha en la interfaz
        h1 = new Thread(this);                                                      //Crea una nueva estancia de la variable h1
        h1.start();
        R.Revision(cmbfunrev);
        R.empresa(cmbempresa);
        btnactualizar.setVisible(false);
        jrbPropias.setSelected(true);
        render();
        filtros();
        llenar_cmb();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Trébol2.png"));
        return retValue;
    }

    @SuppressWarnings("SleepWhileInLoop")
    @Override
    public void run() {                                                             //Funcion run() para cargar la hora del sistema en el aplicativo
        try {
            Thread ct = Thread.currentThread();                                         //Prodiedad de flujo de control interno
            while (ct == h1) {                                                          //Inicio del ciclo mientras que la nueva estancia de Trhead ct sea igual a la de h1)
                calcula();
                lblhora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);    //Envio de informacion al label hora con el formato especificado
                try {                                                                   //inicio del comando try, validacion de posibles errores
                    Thread.sleep(1000);                                                  //Poner en pausa el thread en ejecucion
                } catch (InterruptedException e) {                                      //Inicio del comando catch, se encarga de procesar el error
                    JOptionPane.showMessageDialog(Principal.Escritorio, e);                             //Mensaje mostrado debido al error encontrado en el tiempo de ejecucion
                }                                                                       //fin del catch                                                                       //fin del catch                                                                       //fin del catch                                                                       //fin del catch
            }
        } catch (HeadlessException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void calcula() {                                                         //Inicio de Funcion Calcula()
        Calendar calendar = new GregorianCalendar();                                //Crea una nueva estancia de la libreria Calendar
        Date fechaHoraActual = new Date();                                          //Crea una nueva estancia de la libreria Date
        calendar.setTime(fechaHoraActual);                                          //Carga la Hora actual al calendario
        ampm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "a.m." : "p.m.";           //Envia a la variable ampm el estado de la hora
        if (ampm.equals("p.m.")) {                                                    //valida si la variable ampm es igual a PM
            int h = calendar.get(Calendar.HOUR_OF_DAY) - 12;                        //inicializa una variable h que toma el valor de la hora del dia y le resta 12
            if (h == 00) {                                                          //Valida si la hora del dia es igual a 00
                int ha = 12;                                                        //Si es verdadero aloja en la variable ha el numero 12
                hora = ha > 9 ? "" + ha : "0" + ha;                                 //la variable hora es igual a(si ha es mayor a 9, de ser verdadero toma el 12 si no toma el 0 + la hora)
            } else {                                                                //El sino se ejecuta al ser falso el Si    
                hora = h > 9 ? "" + h : "0" + h;                                    //la variable hora es igual a(s ha es mayor a 9, de ser verdadero toma el 0+ la hora)
            }                                                                       //Termina la sensentia else
        } else if (ampm.equals("a.m.")) {                                             //valida si la variable ampm es igual a AM
            int h = calendar.get(Calendar.HOUR_OF_DAY);                             //inicializa una variable h que toma el valor de la hora del dia
            if (h == 00) {                                                          //Valida si la hora del dia es igual a 00
                int ha = 12;                                                        //Si es verdadero aloja en la variable ha el numero 12
                hora = ha > 9 ? "" + ha : "0" + ha;                                 //la variable hora es igual a(si ha es mayor a 9, de ser verdadero toma el 12 si no toma el 0)
            } else {                                                                //El sino se ejecuta al ser falso el Si  
                hora = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" //La variable hora toma la imformacion de (Valida si la hora del dia es mayor a 9
                        + "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" //Si es verdadero la hora es 0 + la hora actual
                        + "" + calendar.get(Calendar.HOUR_OF_DAY);                  //Si es falso la hora toma la hora actual)
            }                                                                       //Termina la sensentia else
        }                                                                           //Termina la sensentia else if
        minutos = calendar.get(Calendar.MINUTE) > 9 ? "" //La variable minutos toma el valor del minuto del calentario y valida si es mayor a 9
                + "" + calendar.get(Calendar.MINUTE) : "0" //si es verdadero toma el valor en 0 seguido del minuto actual    
                + "" + calendar.get(Calendar.MINUTE);                               //si es falso toma el minuto actual
        segundos = calendar.get(Calendar.SECOND) > 9 ? "" //La variable segundos toma el valor del segundo del calendario y valida si es mayor a 9
                + "" + calendar.get(Calendar.SECOND) : "0" //si es verdadero toma el valor en 0 seguido del segundo actual    
                + "" + calendar.get(Calendar.SECOND);                               //si es falso toma el segundo actual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtrofechas = new javax.swing.ButtonGroup();
        btgestados = new javax.swing.ButtonGroup();
        Menu = new javax.swing.JPopupMenu();
        cpass = new javax.swing.JMenuItem();
        jpmfactura = new javax.swing.JPopupMenu();
        abrirub = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbproveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtnfb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbempresa = new javax.swing.JComboBox<>();
        btnrest = new javax.swing.JButton();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbestado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbasignado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbfunrev = new javax.swing.JComboBox<>();
        jrbcargada = new javax.swing.JRadioButton();
        jrbprogramada = new javax.swing.JRadioButton();
        jrbvencimiento = new javax.swing.JRadioButton();
        jdcdesde = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jdchasta = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        btnaplicar = new javax.swing.JButton();
        scrollfact = new javax.swing.JScrollPane();
        jtfacturas = new javax.swing.JTable();
        jrbFinalizadas = new javax.swing.JRadioButton();
        jrbtodas = new javax.swing.JRadioButton();
        jrbPropias = new javax.swing.JRadioButton();
        lblNdatos = new javax.swing.JLabel();
        lbldatos = new javax.swing.JLabel();
        jrbretiradas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpmenu = new javax.swing.JPanel();
        btngf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btncpro = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnlotep = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btngestmult = new javax.swing.JButton();
        btnconv = new javax.swing.JButton();
        btnpreant = new javax.swing.JButton();
        btnusuarios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblfecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblhora = new javax.swing.JLabel();

        cpass.setText("Cambiar Contraseña");
        Menu.add(cpass);

        jpmfactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        abrirub.setText("Abrir Ubicación");
        abrirub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirubActionPerformed(evt);
            }
        });
        jpmfactura.add(abrirub);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Trébol v2.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 674));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 674));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 674));
        jPanel1.setLayout(null);

        Escritorio.setBackground(new java.awt.Color(234, 255, 255));
        Escritorio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Escritorio.setToolTipText("");
        Escritorio.setAlignmentX(0.0F);
        Escritorio.setAlignmentY(0.0F);
        Escritorio.setMaximumSize(new java.awt.Dimension(1220, 650));
        Escritorio.setMinimumSize(new java.awt.Dimension(1220, 650));
        Escritorio.setName("Trebol 1.0"); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 217, 142));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), "Filtrar por", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor:");
        jLabel3.setMaximumSize(new java.awt.Dimension(79, 26));
        jLabel3.setMinimumSize(new java.awt.Dimension(79, 26));
        jLabel3.setPreferredSize(new java.awt.Dimension(79, 26));
        jPanel5.add(jLabel3);
        jLabel3.setBounds(20, 30, 90, 26);

        cmbproveedor.setEditable(true);
        cmbproveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbproveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbproveedor.setMaximumSize(new java.awt.Dimension(680, 26));
        cmbproveedor.setMinimumSize(new java.awt.Dimension(680, 26));
        cmbproveedor.setPreferredSize(new java.awt.Dimension(680, 26));
        cmbproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbproveedorActionPerformed(evt);
            }
        });
        jPanel5.add(cmbproveedor);
        cmbproveedor.setBounds(120, 30, 460, 26);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("No. Factura:");
        jLabel7.setMaximumSize(new java.awt.Dimension(84, 26));
        jLabel7.setMinimumSize(new java.awt.Dimension(84, 26));
        jLabel7.setPreferredSize(new java.awt.Dimension(84, 26));
        jPanel5.add(jLabel7);
        jLabel7.setBounds(20, 70, 90, 26);

        txtnfb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnfb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        txtnfb.setMaximumSize(new java.awt.Dimension(216, 26));
        txtnfb.setMinimumSize(new java.awt.Dimension(216, 26));
        txtnfb.setName(""); // NOI18N
        txtnfb.setPreferredSize(new java.awt.Dimension(216, 26));
        jPanel5.add(txtnfb);
        txtnfb.setBounds(120, 70, 270, 26);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Empresa:");
        jLabel8.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel8.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel8.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel8);
        jLabel8.setBounds(610, 30, 70, 26);

        cmbempresa.setEditable(true);
        cmbempresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbempresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbempresa.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbempresa.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbempresa.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel5.add(cmbempresa);
        cmbempresa.setBounds(680, 30, 110, 26);

        btnrest.setBackground(new java.awt.Color(0, 102, 153));
        btnrest.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnrest.setForeground(new java.awt.Color(255, 255, 255));
        btnrest.setText("Restablecer");
        btnrest.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnrest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrest.setRequestFocusEnabled(false);
        btnrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestActionPerformed(evt);
            }
        });
        jPanel5.add(btnrest);
        btnrest.setBounds(1080, 110, 105, 26);

        cmbMes.setEditable(true);
        cmbMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbMes.setPreferredSize(new java.awt.Dimension(132, 23));
        jPanel5.add(cmbMes);
        cmbMes.setBounds(1070, 30, 110, 26);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Mes:");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(1030, 30, 31, 26);

        cmbestado.setEditable(true);
        cmbestado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbestado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbestado.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbestado.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbestado.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel5.add(cmbestado);
        cmbestado.setBounds(870, 30, 143, 26);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Estado:");
        jLabel10.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel10.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel10.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel10);
        jLabel10.setBounds(810, 30, 60, 26);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("Funcionario:");
        jLabel11.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel11.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel11.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel11);
        jLabel11.setBounds(790, 70, 100, 26);

        cmbasignado.setEditable(true);
        cmbasignado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbasignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbasignado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbasignado.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbasignado.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbasignado.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel5.add(cmbasignado);
        cmbasignado.setBounds(490, 70, 270, 26);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Por Fecha:");
        jLabel12.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel12.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel12.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel12);
        jLabel12.setBounds(20, 110, 90, 26);

        cmbfunrev.setEditable(true);
        cmbfunrev.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbfunrev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cmbfunrev.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        cmbfunrev.setMaximumSize(new java.awt.Dimension(143, 26));
        cmbfunrev.setMinimumSize(new java.awt.Dimension(143, 26));
        cmbfunrev.setPreferredSize(new java.awt.Dimension(143, 26));
        jPanel5.add(cmbfunrev);
        cmbfunrev.setBounds(890, 70, 250, 26);

        jrbcargada.setBackground(new java.awt.Color(255, 255, 255));
        filtrofechas.add(jrbcargada);
        jrbcargada.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbcargada.setText("Cargada");
        jrbcargada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbcargada.setBorderPainted(true);
        jrbcargada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbcargada.setOpaque(false);
        jrbcargada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbcargadaActionPerformed(evt);
            }
        });
        jPanel5.add(jrbcargada);
        jrbcargada.setBounds(120, 110, 90, 26);

        jrbprogramada.setBackground(new java.awt.Color(255, 255, 255));
        filtrofechas.add(jrbprogramada);
        jrbprogramada.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbprogramada.setText("Programada");
        jrbprogramada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbprogramada.setBorderPainted(true);
        jrbprogramada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbprogramada.setOpaque(false);
        jrbprogramada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbprogramadaActionPerformed(evt);
            }
        });
        jPanel5.add(jrbprogramada);
        jrbprogramada.setBounds(290, 110, 120, 26);

        jrbvencimiento.setBackground(new java.awt.Color(255, 255, 255));
        filtrofechas.add(jrbvencimiento);
        jrbvencimiento.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbvencimiento.setText("Vence");
        jrbvencimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrbvencimiento.setBorderPainted(true);
        jrbvencimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbvencimiento.setOpaque(false);
        jrbvencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbvencimientoActionPerformed(evt);
            }
        });
        jPanel5.add(jrbvencimiento);
        jrbvencimiento.setBounds(210, 110, 80, 26);

        jdcdesde.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jdcdesde.setFocusable(false);
        jdcdesde.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jdcdesde.setMaximumSize(new java.awt.Dimension(140, 29));
        jdcdesde.setMinSelectableDate(new java.util.Date(1546322515000L));
        jdcdesde.setMinimumSize(new java.awt.Dimension(140, 29));
        jdcdesde.setPreferredSize(new java.awt.Dimension(140, 29));
        jdcdesde.setRequestFocusEnabled(false);
        jdcdesde.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(jdcdesde);
        jdcdesde.setBounds(490, 110, 120, 26);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Asignado a:");
        jLabel13.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel13.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel13.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel13);
        jLabel13.setBounds(400, 70, 90, 26);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Hasta:");
        jLabel14.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel14.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel14.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel14);
        jLabel14.setBounds(620, 110, 50, 26);

        jdchasta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black));
        jdchasta.setFocusable(false);
        jdchasta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jdchasta.setMaximumSize(new java.awt.Dimension(140, 29));
        jdchasta.setMinSelectableDate(new java.util.Date(1546322515000L));
        jdchasta.setMinimumSize(new java.awt.Dimension(140, 29));
        jdchasta.setPreferredSize(new java.awt.Dimension(140, 29));
        jdchasta.setRequestFocusEnabled(false);
        jdchasta.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(jdchasta);
        jdchasta.setBounds(670, 110, 120, 26);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("Desde:");
        jLabel15.setMaximumSize(new java.awt.Dimension(61, 26));
        jLabel15.setMinimumSize(new java.awt.Dimension(61, 26));
        jLabel15.setPreferredSize(new java.awt.Dimension(61, 26));
        jPanel5.add(jLabel15);
        jLabel15.setBounds(430, 110, 50, 26);

        btnaplicar.setBackground(new java.awt.Color(0, 102, 153));
        btnaplicar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnaplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnaplicar.setText("Aplicar");
        btnaplicar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnaplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnaplicar.setRequestFocusEnabled(false);
        btnaplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplicarActionPerformed(evt);
            }
        });
        jPanel5.add(btnaplicar);
        btnaplicar.setBounds(800, 110, 80, 26);

        Escritorio.add(jPanel5);
        jPanel5.setBounds(10, 10, 1200, 150);

        scrollfact.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.black));
        scrollfact.setToolTipText("");
        scrollfact.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollfact.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jtfacturas.setAutoCreateRowSorter(true);
        jtfacturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtfacturas.setFillsViewportHeight(true);
        jtfacturas.setRequestFocusEnabled(false);
        jtfacturas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jtfacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtfacturasMouseReleased(evt);
            }
        });
        scrollfact.setViewportView(jtfacturas);

        Escritorio.add(scrollfact);
        scrollfact.setBounds(10, 200, 1200, 400);

        btgestados.add(jrbFinalizadas);
        jrbFinalizadas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbFinalizadas.setText("Finalizadas");
        jrbFinalizadas.setOpaque(false);
        jrbFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFinalizadasActionPerformed(evt);
            }
        });
        Escritorio.add(jrbFinalizadas);
        jrbFinalizadas.setBounds(780, 170, 110, 25);

        btgestados.add(jrbtodas);
        jrbtodas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbtodas.setText("En Proceso");
        jrbtodas.setOpaque(false);
        jrbtodas.setPreferredSize(new java.awt.Dimension(160, 26));
        jrbtodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtodasActionPerformed(evt);
            }
        });
        Escritorio.add(jrbtodas);
        jrbtodas.setBounds(410, 170, 110, 26);

        btgestados.add(jrbPropias);
        jrbPropias.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbPropias.setText("Mis Facturas");
        jrbPropias.setOpaque(false);
        jrbPropias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPropiasActionPerformed(evt);
            }
        });
        Escritorio.add(jrbPropias);
        jrbPropias.setBounds(20, 170, 120, 25);

        lblNdatos.setBackground(new java.awt.Color(255, 255, 204));
        lblNdatos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblNdatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNdatos.setToolTipText("");
        lblNdatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblNdatos.setMaximumSize(new java.awt.Dimension(84, 26));
        lblNdatos.setMinimumSize(new java.awt.Dimension(84, 26));
        lblNdatos.setOpaque(true);
        lblNdatos.setPreferredSize(new java.awt.Dimension(84, 26));
        Escritorio.add(lblNdatos);
        lblNdatos.setBounds(1120, 610, 70, 26);

        lbldatos.setBackground(new java.awt.Color(0, 0, 0));
        lbldatos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbldatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldatos.setText("Registros:");
        lbldatos.setMaximumSize(new java.awt.Dimension(84, 26));
        lbldatos.setMinimumSize(new java.awt.Dimension(84, 26));
        lbldatos.setPreferredSize(new java.awt.Dimension(84, 26));
        Escritorio.add(lbldatos);
        lbldatos.setBounds(1040, 610, 80, 26);

        btgestados.add(jrbretiradas);
        jrbretiradas.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jrbretiradas.setText("Retiradas");
        jrbretiradas.setOpaque(false);
        jrbretiradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbretiradasActionPerformed(evt);
            }
        });
        Escritorio.add(jrbretiradas);
        jrbretiradas.setBounds(1090, 170, 110, 25);

        jLabel2.setBackground(new java.awt.Color(255, 220, 117));
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabel2.setOpaque(true);
        Escritorio.add(jLabel2);
        jLabel2.setBounds(670, 615, 50, 20);

        jLabel16.setBackground(new java.awt.Color(255, 193, 193));
        jLabel16.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabel16.setOpaque(true);
        Escritorio.add(jLabel16);
        jLabel16.setBounds(430, 615, 50, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel17.setText("Color de Toda la Fila:");
        Escritorio.add(jLabel17);
        jLabel17.setBounds(275, 615, 150, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel18.setText("Fecha de Pago Vencido");
        Escritorio.add(jLabel18);
        jLabel18.setBounds(490, 615, 170, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel19.setText("Fecha de Pago por Vencerse");
        Escritorio.add(jLabel19);
        jLabel19.setBounds(730, 615, 200, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Escritorio.add(jSeparator1);
        jSeparator1.setBounds(660, 615, 10, 20);

        jPanel1.add(Escritorio);
        Escritorio.setBounds(128, 0, 1220, 650);

        jpmenu.setBackground(new java.awt.Color(234, 255, 255));
        jpmenu.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jpmenu.setPreferredSize(new java.awt.Dimension(134, 600));
        jpmenu.setLayout(null);

        btngf.setBackground(new java.awt.Color(0, 102, 153));
        btngf.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btngf.setForeground(new java.awt.Color(255, 255, 255));
        btngf.setText("<html><div align='center'>Grabar<br>Factura</div></html>");
        btngf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btngf.setDoubleBuffered(true);
        btngf.setFocusPainted(false);
        btngf.setPreferredSize(new java.awt.Dimension(100, 52));
        btngf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngfActionPerformed(evt);
            }
        });
        jpmenu.add(btngf);
        btngf.setBounds(12, 135, 110, 45);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Empresa2.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(153, 153, 153)));
        jLabel4.setMaximumSize(new java.awt.Dimension(114, 86));
        jLabel4.setMinimumSize(new java.awt.Dimension(114, 86));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(114, 86));
        jpmenu.add(jLabel4);
        jLabel4.setBounds(6, 7, 120, 120);

        btncpro.setBackground(new java.awt.Color(0, 102, 153));
        btncpro.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btncpro.setForeground(new java.awt.Color(255, 255, 255));
        btncpro.setText("Proveedores");
        btncpro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btncpro.setDoubleBuffered(true);
        btncpro.setFocusPainted(false);
        btncpro.setPreferredSize(new java.awt.Dimension(100, 52));
        btncpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncproActionPerformed(evt);
            }
        });
        jpmenu.add(btncpro);
        btncpro.setBounds(12, 600, 110, 40);
        jpmenu.add(jSeparator3);
        jSeparator3.setBounds(8, 547, 120, 10);

        btnlotep.setBackground(new java.awt.Color(0, 102, 153));
        btnlotep.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnlotep.setForeground(new java.awt.Color(255, 255, 255));
        btnlotep.setText("<html><p align='center'>Lotes<br>de Pago</p></html>");
        btnlotep.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnlotep.setDoubleBuffered(true);
        btnlotep.setEnabled(false);
        btnlotep.setFocusPainted(false);
        btnlotep.setPreferredSize(new java.awt.Dimension(100, 52));
        jpmenu.add(btnlotep);
        btnlotep.setBounds(12, 495, 110, 45);

        btnactualizar.setBackground(new java.awt.Color(0, 102, 153));
        btnactualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnactualizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnactualizar.setFocusPainted(false);
        btnactualizar.setPreferredSize(new java.awt.Dimension(100, 52));
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jpmenu.add(btnactualizar);
        btnactualizar.setBounds(40, 610, 52, 22);

        btngestmult.setBackground(new java.awt.Color(0, 102, 153));
        btngestmult.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btngestmult.setForeground(new java.awt.Color(255, 255, 255));
        btngestmult.setText("<html><div align='center'>Gestión<br>Multiple</div></html>");
        btngestmult.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btngestmult.setDoubleBuffered(true);
        btngestmult.setEnabled(false);
        btngestmult.setFocusPainted(false);
        btngestmult.setPreferredSize(new java.awt.Dimension(100, 52));
        jpmenu.add(btngestmult);
        btngestmult.setBounds(12, 185, 110, 45);

        btnconv.setBackground(new java.awt.Color(0, 102, 153));
        btnconv.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnconv.setForeground(new java.awt.Color(255, 255, 255));
        btnconv.setText("Convenios");
        btnconv.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnconv.setDoubleBuffered(true);
        btnconv.setEnabled(false);
        btnconv.setFocusPainted(false);
        btnconv.setPreferredSize(new java.awt.Dimension(100, 52));
        btnconv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvActionPerformed(evt);
            }
        });
        jpmenu.add(btnconv);
        btnconv.setBounds(12, 450, 110, 40);

        btnpreant.setBackground(new java.awt.Color(0, 102, 153));
        btnpreant.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnpreant.setForeground(new java.awt.Color(255, 255, 255));
        btnpreant.setText("<html><p align='center'>Precargar<br>Anticipo</p></html>");
        btnpreant.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnpreant.setDoubleBuffered(true);
        btnpreant.setFocusPainted(false);
        btnpreant.setPreferredSize(new java.awt.Dimension(100, 52));
        btnpreant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreantActionPerformed(evt);
            }
        });
        jpmenu.add(btnpreant);
        btnpreant.setBounds(12, 235, 110, 45);

        btnusuarios.setBackground(new java.awt.Color(0, 102, 153));
        btnusuarios.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnusuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnusuarios.setText("<html><p align='center'>Usuarios</p></html>");
        btnusuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnusuarios.setDoubleBuffered(true);
        btnusuarios.setFocusPainted(false);
        btnusuarios.setPreferredSize(new java.awt.Dimension(100, 52));
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });
        jpmenu.add(btnusuarios);
        btnusuarios.setBounds(12, 555, 110, 40);

        jPanel1.add(jpmenu);
        jpmenu.setBounds(0, 0, 132, 650);

        jPanel2.setBackground(new java.awt.Color(75, 156, 109));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Usuario: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 81, 24);

        lbluser.setBackground(new java.awt.Color(255, 255, 255));
        lbluser.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("null");
        lbluser.setComponentPopupMenu(Menu);
        jPanel2.add(lbluser);
        lbluser.setBounds(90, 0, 480, 24);

        jButton2.setBackground(new java.awt.Color(255, 217, 142));
        jButton2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton2.setText("CERRAR SESIÓN");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(102, 19));
        jButton2.setMinimumSize(new java.awt.Dimension(102, 19));
        jButton2.setPreferredSize(new java.awt.Dimension(102, 19));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(668, 2, 130, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 650, 800, 24);

        jPanel3.setBackground(new java.awt.Color(75, 156, 109));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        lblfecha.setBackground(new java.awt.Color(255, 255, 255));
        lblfecha.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("date");
        jPanel3.add(lblfecha);
        lblfecha.setBounds(10, 0, 320, 24);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(800, 650, 337, 24);

        jPanel4.setBackground(new java.awt.Color(75, 156, 109));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        lblhora.setBackground(new java.awt.Color(255, 255, 255));
        lblhora.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhora.setText("hour");
        lblhora.setMaximumSize(new java.awt.Dimension(130, 18));
        lblhora.setMinimumSize(new java.awt.Dimension(130, 18));
        lblhora.setPreferredSize(new java.awt.Dimension(130, 18));
        lblhora.setRequestFocusEnabled(false);
        jPanel4.add(lblhora);
        lblhora.setBounds(10, 0, 190, 24);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(1138, 650, 210, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuariosActionPerformed
        Usuarios CU = new Usuarios();
        Principal.Escritorio.add(CU);
        CU.setBounds(67, 100, 1075, 435);
        CU.setVisible(true);
    }//GEN-LAST:event_btnusuariosActionPerformed

    private void btncproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncproActionPerformed
        Proveedores PR = new Proveedores();
        Principal.Escritorio.add(PR);
        PR.setBounds(45, 50, 1125, 500);
        PR.setVisible(true);
    }//GEN-LAST:event_btncproActionPerformed

    private void btngfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngfActionPerformed
        if (GF == null) {
            GF = new Grabar_Factura();
            Principal.Escritorio.add(GF);
        }
        Principal.Escritorio.setSelectedFrame(GF);
        try {
            if (GF.isIcon()) {
                GF.setIcon(false);
            } else if (GF.isShowing()) {
                GF.toFront();
            } else {
                GF.setBounds(155, 100, 945, 345);
                Grabar_Factura.jpgf.setBounds(10, 10, 920, 300);
                Grabar_Factura.jtabedpane.setVisible(false);
                Grabar_Factura.btncrear.setVisible(true);
                Grabar_Factura.btnmodificar.setVisible(false);
                Grabar_Factura.btnlimpiar.setVisible(true);
                Grabar_Factura.jcbanexo.setVisible(true);
                Grabar_Factura.txtanexo.setVisible(true);
                Grabar_Factura.btnanexo.setVisible(true);
                Grabar_Factura.txtruta.setVisible(true);
                Grabar_Factura.btnfile.setVisible(true);
                Grabar_Factura.lblrequerido10.setVisible(true);
                Grabar_Factura.lbldocfactura.setVisible(true);
                GF.setVisible(true);
            }
        } catch (PropertyVetoException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btngfActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        filtros();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestActionPerformed
        limpiar_filtros();
    }//GEN-LAST:event_btnrestActionPerformed

    private void jrbPropiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPropiasActionPerformed
        limpiar_filtros();
        filtros();
        llenar_cmb();
    }//GEN-LAST:event_jrbPropiasActionPerformed

    private void jrbtodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtodasActionPerformed
        limpiar_filtros();
    }//GEN-LAST:event_jrbtodasActionPerformed

    private void jrbFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFinalizadasActionPerformed
        limpiar_filtros();
        filtros();
        llenar_cmb();
    }//GEN-LAST:event_jrbFinalizadasActionPerformed

    private void jrbretiradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbretiradasActionPerformed
        limpiar_filtros();
        filtros();
        llenar_cmb();
    }//GEN-LAST:event_jrbretiradasActionPerformed

    private void btnaplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarActionPerformed
        if (jdcdesde.getDate() == null && jdchasta.getDate() == null) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor indicar la(s) fecha(s).");
        } else if (!jrbcargada.isSelected() && !jrbvencimiento.isSelected() && !jrbprogramada.isSelected()) {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor elegir que tipo de fecha desea conocer.");
        } else {
            filtarporfecha();
        }
    }//GEN-LAST:event_btnaplicarActionPerformed

    private void jrbcargadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbcargadaActionPerformed
        filtarporfecha();
    }//GEN-LAST:event_jrbcargadaActionPerformed

    private void jrbvencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbvencimientoActionPerformed
        filtarporfecha();
    }//GEN-LAST:event_jrbvencimientoActionPerformed

    private void jrbprogramadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbprogramadaActionPerformed
        filtarporfecha();
    }//GEN-LAST:event_jrbprogramadaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Iniciar_Sesion IS = new Iniciar_Sesion();
            int opc = JOptionPane.showConfirmDialog(Principal.Escritorio, "Cerrar Sesión?", "Cerrando Sesión", JOptionPane.YES_NO_OPTION);
            if (opc == 0) {
                IS.setVisible(true);
                UC.estado_sesion(0, lbluser.getText());
                dispose();
            }
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int close = JOptionPane.showConfirmDialog(this, "Confirma que desea cerrar la aplicación?", "Cerrar Trébol", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (close == 0) {
            if (UC.estado_sesion(0, lbluser.getText())) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnpreantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreantActionPerformed
        if (PANT == null) {
            PANT = new Precargar_Anticipos();
            Principal.Escritorio.add(PANT);
        }
        Principal.Escritorio.setSelectedFrame(PANT);
        try {
            if (PANT.isIcon()) {
                PANT.setIcon(false);
            } else if (PANT.isShowing()) {
                PANT.toFront();
            } else {
                PANT.setBounds(222, 40, 775, 520);
                PANT.setVisible(true);
            }
        } catch (PropertyVetoException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnpreantActionPerformed

    private void cmbproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbproveedorActionPerformed

    private void btnconvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconvActionPerformed

    private void jtfacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfacturasMouseReleased
        if (SwingUtilities.isRightMouseButton(evt)) {
            int rowNumber = jtfacturas.rowAtPoint(evt.getPoint());
            if (rowNumber >= 0 && rowNumber < jtfacturas.getRowCount()) {
                jtfacturas.getSelectionModel().setSelectionInterval(rowNumber, rowNumber);
                jpmfactura.show(evt.getComponent(), evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_jtfacturasMouseReleased

    private void abrirubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirubActionPerformed
        int fila = jtfacturas.getSelectedRow();
        if (fila >= 0) {
            Path directorio = Paths.get("\\\\10.0.2.6\\Aviomar-R\\APLICACIONES\\Treból\\Facturas\\"
                    + jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 9) + "\\"
                    + jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 11) + "\\"
                    + jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 0));
            showfolder(directorio);
        } else {
            JOptionPane.showMessageDialog(Principal.Escritorio, "Por favor seleccionar una factura");
        }
    }//GEN-LAST:event_abrirubActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme("Green-Large-Font");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void showfolder(Path path) {
        if (!Files.exists(path)) {
            System.out.printf("La carpeta < %s > no existe", path.toString());
        } else {
            try {
                Desktop.getDesktop().open(path.toFile());
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void render() {
        cmbempresa.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtrar(cmbempresa);
            }
        });
        cmbproveedor.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtrar(cmbproveedor);
            }
        });
        cmbasignado.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtrar(cmbasignado);
            }
        });
        cmbMes.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtrar(cmbestado);
            }
        });
        cmbestado.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtros();
            }
        });
        cmbfunrev.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                filtros();
            }
        });
        jtfacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jtfacturas.rowAtPoint(evt.getPoint()) >= 0) {
                    if (evt.getClickCount() == 2) {
                        String no_factura, proveedor, empresa, estado, asignado;
                        no_factura = String.valueOf(jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 0));
                        proveedor = String.valueOf(jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 11));
                        empresa = String.valueOf(jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 9));
                        estado = String.valueOf(jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 8));
                        asignado = String.valueOf(jtfacturas.getValueAt(jtfacturas.getSelectedRow(), 7));
                        if (jrbPropias.isSelected()) {
                            String usuario = lbluser.getText();
                            switch (UC.area_usuario(usuario)) {
                                case "Administrativo":
                                    gestionar_factura(no_factura, proveedor, empresa, estado);
                                    break;
                                case "Recepción":
                                    modificacion_factura(no_factura, proveedor, empresa, estado);
                                    break;
                                case "Capital Humano":
                                case "Compras":
                                case "Tecnología":
                                case "Contabilidad":
                                case "Contabilidad_Rev":
                                case "Tesoreria":
                                    gestionar_factura(no_factura, proveedor, empresa, estado);
                                    break;
                            }
                        } else {
                            detalle_factura(no_factura, proveedor, empresa, estado);
                        }
                    }
                }
            }
        });
    }

    public void modificacion_factura(String no_factura, String proveedor, String empresa, String estado) {
        if (GF == null) {
            GF = new Grabar_Factura();
            Principal.Escritorio.add(GF);
        }
        Principal.Escritorio.setSelectedFrame(GF);
        if (GF.isIcon()) {
            try {
                GF.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (GF.isShowing()) {
            GF.toFront();
        } else {
            GF.setBounds(155, 25, 945, 590);
            Grabar_Factura.jpgf.setBounds(10, 10, 920, 540);
            Grabar_Factura.jtabedpane.setVisible(true);
            Grabar_Factura.btncrear.setVisible(false);
            Grabar_Factura.btnmodificar.setVisible(true);
            Grabar_Factura.btnlimpiar.setVisible(false);
            Grabar_Factura.jcbanexo.setEnabled(true);
            Grabar_Factura.jcbanexo.setVisible(false);
            Grabar_Factura.txtanexo.setVisible(false);
            Grabar_Factura.btnanexo.setVisible(false);
            Grabar_Factura.txtruta.setVisible(false);
            Grabar_Factura.btnfile.setVisible(false);
            Grabar_Factura.lblrequerido10.setVisible(false);
            Grabar_Factura.lbldocfactura.setVisible(false);
            Grabar_Factura.jtabedpane.setSelectedIndex(0);
            GF.llenar_campos(no_factura, proveedor, empresa);
            GF.setVisible(true);
        }
    }

    public void detalle_factura(String no_factura, String proveedor, String empresa, String estado) {
        if (DetFact == null) {
            DetFact = new Detalles_Factura();
            Principal.Escritorio.add(DetFact);
        }
        Principal.Escritorio.setSelectedFrame(DetFact);
        if (DetFact.isIcon()) {
            try {
                DetFact.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (DetFact.isShowing()) {
            DetFact.toFront();
        } else {
            String usuario = lbluser.getText();
            String area = UC.area_usuario(usuario);
            DetFact.llenar_campos(no_factura, proveedor, empresa, area, estado);
            DetFact.setBounds(145, 56, 930, 535);
            DetFact.setVisible(true);
        }
    }

    public void gestionar_factura(String no_factura, String proveedor, String empresa, String estado) {
        if (GestF == null) {
            GestF = new Gestionar_Factura();
            Principal.Escritorio.add(GestF);
        }
        Principal.Escritorio.setSelectedFrame(GestF);
        if (GestF.isIcon()) {
            try {
                GestF.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (GestF.isShowing()) {
            GestF.toFront();
        } else {
            String usuario = lbluser.getText();
            String area = UC.area_usuario(usuario);
            Gestionar_Factura.Tabpane.setSelectedIndex(0);
            GestF.llenar_campos(no_factura, proveedor, empresa, area, estado);
            GestF.setBounds(138, 28, 925, 545);
            GestF.setVisible(true);
        }
    }

    public void filtros() {
        String empresa, proveedor, factura, estado, mes, asignado, frev;
        if (cmbproveedor.getSelectedItem().toString().equals("---")) {
            proveedor = "";
        } else {
            proveedor = cmbproveedor.getSelectedItem().toString();
        }
        if (cmbempresa.getSelectedItem().toString().equals("---")) {
            empresa = "";
        } else {
            empresa = cmbempresa.getSelectedItem().toString();
        }
        if (cmbasignado.getSelectedItem().toString().equals("---")) {
            asignado = "";
        } else {
            asignado = cmbasignado.getSelectedItem().toString();
        }
        if (cmbestado.getSelectedItem().toString().equals("---")) {
            estado = "";
        } else {
            estado = cmbestado.getSelectedItem().toString();
        }
        if (cmbMes.getSelectedIndex() == 0) {
            mes = "";
        } else {
            mes = "" + cmbMes.getSelectedIndex();
        }
        if (txtnfb.getText().equals("")) {
            factura = "";
        } else {
            factura = txtnfb.getText();
        }
        if (cmbfunrev.getSelectedItem().toString().equals("---")) {
            frev = "";
        } else {
            int usuario = UC.id_usuario_rev(cmbfunrev.getSelectedItem().toString());
            frev = String.valueOf(usuario);
        }
        if (jrbPropias.isSelected()) {
            LT.Facturas(jtfacturas, 1, proveedor, empresa, estado, asignado, frev);
            lblNdatos.setText(String.valueOf(jtfacturas.getRowCount()));
            if (!lbluser.getText().equals("null")) {
                datousuario(lbluser.getText());
            }
        } else if (jrbtodas.isSelected()) {
            LT.Facturas(jtfacturas, 2, proveedor, empresa, estado, asignado, frev);
            lblNdatos.setText(String.valueOf(jtfacturas.getRowCount()));
            cmbasignado.setEnabled(true);
            cmbasignado.setSelectedIndex(0);
            cmbfunrev.setSelectedIndex(0);
        } else if (jrbFinalizadas.isSelected()) {
            LT.Facturas(jtfacturas, 3, proveedor, empresa, estado, asignado, frev);
            lblNdatos.setText(String.valueOf(jtfacturas.getRowCount()));
            cmbasignado.setEnabled(true);
            cmbasignado.setSelectedIndex(0);
            cmbfunrev.setSelectedIndex(0);
        } else if (jrbretiradas.isSelected()) {
            LT.Facturas(jtfacturas, 4, proveedor, empresa, estado, asignado, frev);
            lblNdatos.setText(String.valueOf(jtfacturas.getRowCount()));
            cmbasignado.setEnabled(true);
            cmbasignado.setSelectedIndex(0);
            cmbfunrev.setSelectedIndex(0);
        }
        if (jtfacturas.getRowCount() > 0) {
            filtarporfecha();
        }
    }

    public void datousuario(String usuario) {
        if (lbluser.getText().equals("null")) {
            lbluser.setText(usuario);
        }
        cmbasignado.setSelectedItem(UC.area_usuario(usuario));
        cmbasignado.setEnabled(false);
        btnpreant.setEnabled(false);
        btnusuarios.setEnabled(false);
        btngf.setEnabled(false);
        switch (UC.area_usuario(usuario)) {
            case "Administrativo":
                cmbfunrev.setSelectedIndex(0);
                cmbfunrev.setEnabled(false);
                cmbempresa.setEnabled(true);
                cmbempresa.setSelectedIndex(0);
                break;
            case "Capital Humano":
            case "Compras":
            case "Tecnología":
                cmbfunrev.setSelectedIndex(0);
                cmbfunrev.setEnabled(false);
                cmbempresa.setEnabled(true);
                cmbempresa.setSelectedIndex(0);
                break;
            case "Recepción":
        btngf.setEnabled(true);
                cmbfunrev.setSelectedIndex(0);
                cmbfunrev.setEnabled(false);
                cmbempresa.setEnabled(true);
                cmbempresa.setSelectedIndex(0);
                break;
            case "Contabilidad":
                cmbempresa.setSelectedItem(UC.empresa_usuario(lbluser.getText()));
                cmbempresa.setEnabled(false);
                cmbfunrev.setSelectedIndex(0);
                cmbfunrev.setEnabled(false);
                break;
            case "Contabilidad_Rev":
                if (cmbfunrev.getSelectedIndex() == 0) {
                    cmbfunrev.setSelectedItem(UC.nombre_rev(lbluser.getText()));
                }
                break;
            case "Tesoreria":
                cmbfunrev.setSelectedIndex(0);
                cmbfunrev.setEnabled(false);
                cmbempresa.setEnabled(true);
                cmbempresa.setSelectedIndex(0);
                btnpreant.setEnabled(true);
                break;
            case "AdminTrebol":
                btnpreant.setEnabled(true);
                btnusuarios.setEnabled(true);
                break;
        }
    }

    public void limpiar_filtros() {
        cmbproveedor.setSelectedIndex(0);
        cmbestado.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        txtnfb.setText("");
        cmbempresa.setSelectedIndex(0);
        filtrofechas.clearSelection();
        jdcdesde.setDate(null);
        jdchasta.setDate(null);
        filtros();
        llenar_cmb();
        if (cmbfunrev.getSelectedIndex() != 0 && UC.area_usuario(lbluser.getText()).equals("Contabilidad_Rev")) {
            cmbfunrev.setSelectedItem(UC.nombre_rev(lbluser.getText()));
        }
    }

    public void filtarporfecha() {
        TableRowSorter sorter = new TableRowSorter(jtfacturas.getModel());
        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        if (jdcdesde.getDate() == null && jdchasta.getDate() != null) {
            if (jrbcargada.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 2));
            } else if (jrbvencimiento.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 4));
            } else if (jrbprogramada.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 5));
            }
            jtfacturas.setRowSorter(sorter);
        } else if (jdcdesde.getDate() != null && jdchasta.getDate() == null) {
            Calendar startCal = Calendar.getInstance();
            startCal.setTime(jdcdesde.getDate());
            startCal.add(Calendar.DAY_OF_MONTH, -1);
            if (jrbcargada.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 2));
            } else if (jrbvencimiento.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 4));
            } else if (jrbprogramada.isSelected()) {
                sorter.setRowFilter(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 5));
            }
            jtfacturas.setRowSorter(sorter);
        } else if (jdcdesde.getDate() != null && jdchasta.getDate() != null) {
            Calendar startCal = Calendar.getInstance();
            startCal.setTime(jdcdesde.getDate());
            startCal.add(Calendar.DAY_OF_MONTH, 0);
            if (jrbcargada.isSelected()) {
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 2));
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 2));
            } else if (jrbvencimiento.isSelected()) {
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 4));
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 4));
            } else if (jrbprogramada.isSelected()) {
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startCal.getTime(), 5));
                filters.add(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, jdchasta.getDate(), 5));
            }
            jtfacturas.setRowSorter(sorter);
            RowFilter<Object, Object> rf = RowFilter.andFilter(filters);
            sorter.setRowFilter(rf);
        }
        lblNdatos.setText(String.valueOf(jtfacturas.getRowCount()));
    }

    public void llenar_cmb() {
        String rs = cmbproveedor.getSelectedItem().toString();
        String emp = cmbempresa.getSelectedItem().toString();
        String est = cmbestado.getSelectedItem().toString();
        String asg = cmbasignado.getSelectedItem().toString();
        if (cmbproveedor.getItemCount() == 1) {
            CA.llenar_cmb_tabla(cmbproveedor, jtfacturas, 11);
            cmbproveedor.setSelectedItem(rs);
        } else {
            CA.llenar_cmb_tabla(cmbasignado, jtfacturas, 7);
            CA.llenar_cmb_tabla(cmbestado, jtfacturas, 8);
//            CA.llenar_cmb_tabla(cmbempresa, jtfacturas, 9);
            cmbempresa.setSelectedItem(emp);
            cmbestado.setSelectedItem(est);
        }

        if (cmbempresa.getItemCount() == 1) {
            CA.llenar_cmb_tabla(cmbempresa, jtfacturas, 9);
            cmbempresa.setSelectedItem(emp);
        } else {
            CA.llenar_cmb_tabla(cmbasignado, jtfacturas, 7);
            CA.llenar_cmb_tabla(cmbestado, jtfacturas, 8);
            CA.llenar_cmb_tabla(cmbproveedor, jtfacturas, 11);
            cmbproveedor.setSelectedItem(rs);
            cmbestado.setSelectedItem(est);
        }

        if (cmbasignado.getItemCount() == 1) {
            CA.llenar_cmb_tabla(cmbasignado, jtfacturas, 7);
            cmbasignado.setSelectedItem(asg);
        } else {
            CA.llenar_cmb_tabla(cmbestado, jtfacturas, 8);
//            CA.llenar_cmb_tabla(cmbempresa, jtfacturas, 9);
            CA.llenar_cmb_tabla(cmbproveedor, jtfacturas, 11);
            cmbproveedor.setSelectedItem(rs);
            cmbempresa.setSelectedItem(emp);
        }

        if (cmbestado.getItemCount() == 1) {
            CA.llenar_cmb_tabla(cmbestado, jtfacturas, 8);
            cmbestado.setSelectedItem(est);
        } else {
//            CA.llenar_cmb_tabla(cmbempresa, jtfacturas, 9);
            CA.llenar_cmb_tabla(cmbproveedor, jtfacturas, 11);
            cmbproveedor.setSelectedItem(rs);
            cmbempresa.setSelectedItem(emp);
        }
    }

    public void filtrar(JComboBox cmb) {
        if (jtfacturas.getRowCount() >= 1) {
            filtros();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuItem abrirub;
    private javax.swing.ButtonGroup btgestados;
    public static javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnaplicar;
    public static javax.swing.JButton btnconv;
    public static javax.swing.JButton btncpro;
    public static javax.swing.JButton btngestmult;
    public static javax.swing.JButton btngf;
    public static javax.swing.JButton btnlotep;
    public static javax.swing.JButton btnpreant;
    private javax.swing.JButton btnrest;
    public static javax.swing.JButton btnusuarios;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbasignado;
    private javax.swing.JComboBox<String> cmbempresa;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbfunrev;
    private javax.swing.JComboBox<String> cmbproveedor;
    private javax.swing.JMenuItem cpass;
    private javax.swing.ButtonGroup filtrofechas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public static com.toedter.calendar.JDateChooser jdcdesde;
    public static com.toedter.calendar.JDateChooser jdchasta;
    public javax.swing.JPanel jpmenu;
    private javax.swing.JPopupMenu jpmfactura;
    private javax.swing.JRadioButton jrbFinalizadas;
    private javax.swing.JRadioButton jrbPropias;
    private javax.swing.JRadioButton jrbcargada;
    private javax.swing.JRadioButton jrbprogramada;
    private javax.swing.JRadioButton jrbretiradas;
    private javax.swing.JRadioButton jrbtodas;
    private javax.swing.JRadioButton jrbvencimiento;
    public static javax.swing.JTable jtfacturas;
    private javax.swing.JLabel lblNdatos;
    private javax.swing.JLabel lbldatos;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    public static javax.swing.JLabel lbluser;
    private javax.swing.JScrollPane scrollfact;
    public static javax.swing.JTextField txtnfb;
    // End of variables declaration//GEN-END:variables
}
