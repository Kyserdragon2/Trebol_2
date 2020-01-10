package Controladores;

import Clases.Conexion;
import Objetos.Usuario_obj;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario_Controller {

    Conexion cc = new Conexion();

    public boolean crear_usuario(int id_area, int id_empresa, int aprueba, String usuario, String nombres, String apellidos,
            String correo, String contraseña) {
        Usuario_obj U = new Usuario_obj(0, id_area, id_empresa, aprueba, usuario, nombres, apellidos, correo, contraseña);
        String sql = "INSERT INTO trebol_usuario (usuario, nombres, apellidos, correo, contraseña, id_area, id_empresa, aprueba)\n"
                + "VALUES ('" + U.getUsuario() + "','" + U.getNombres() + "','" + U.getApellidos() + "', '" + U.getCorreo() + "', '"
                + U.getContraseña() + "'," + U.getId_area() + "," + U.getId_empresa() + "," + U.getAprueba() + ");";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
            return false;
        }
    }

    public Usuario_obj buscar(String usuario) {
        Usuario_obj U = new Usuario_obj();
        U.setUsuario(usuario);
        String sql = "SELECT * FROM trebol_usuario WHERE usuario LIKE '" + U.getUsuario() + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                U.setId(rs.getInt("id"));
                U.setUsuario(rs.getString("usuario"));
                U.setNombres(rs.getString("nombres"));
                U.setApellidos(rs.getString("apellidos"));
                U.setCorreo(rs.getString("correo"));
                U.setContraseña(rs.getString("contraseña"));
                U.setId_area(rs.getInt("id_area"));
                U.setId_empresa(rs.getInt("id_empresa"));
                U.setAprueba(rs.getInt("aprueba"));
                U.setRetirado(rs.getInt("retirado"));
            }
            return U;
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean modificar_usuario(int id, int id_area, int id_empresa, int aprueba, int retirado, String usuario, String nombres,
            String apellidos, String correo, String contraseña) {
        Usuario_obj U = new Usuario_obj(id, id_area, id_empresa, aprueba, retirado, usuario, nombres, apellidos, correo, contraseña);
        String sql = "UPDATE trebol_usuario "
                + "SET usuario='" + U.getUsuario() + "', "
                + "nombres='" + U.getNombres() + "', "
                + "apellidos='" + U.getApellidos() + "', "
                + "correo='" + U.getCorreo() + "', "
                + "contraseña='" + U.getContraseña() + "', "
                + "id_area=" + U.getId_area() + ", "
                + "id_empresa=" + U.getId_empresa() + ", "
                + "aprueba=" + U.getAprueba() + ", "
                + "retirado=" + U.getRetirado() + "\n"
                + "WHERE id =" + U.getId() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean cambiar_contraseña(int id, String contraseña) {
        Usuario_obj U = new Usuario_obj(id, contraseña);
        String sql = "UPDATE trebol_usuario "
                + "SET contraseña='" + U.getContraseña() + "'\n"
                + "WHERE id =" + U.getId() + ";";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String correos(int id_area, int id_empresa) {
        String correos = "";
        String sql;
        if (id_empresa == 0) {
            sql = "SELECT GROUP_CONCAT(IF(correo ='N/A',NULL,correo)) AS 'Correos'\n"
                    + "FROM trebol_usuario\n"
                    + "WHERE id_area = " + id_area + "\n"
                    + "GROUP BY id_area;";
        } else {
            sql = "SELECT GROUP_CONCAT(IF(correo ='N/A',NULL,correo)) AS 'Correos'\n"
                    + "FROM trebol_usuario\n"
                    + "WHERE id_area = " + id_area + " AND id_empresa =" + id_empresa + "\n"
                    + "GROUP BY id_area;";
        }
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                correos = rs.getString("Correos");
            }
            return correos;
        } catch (SQLException e) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, e);
            return correos;
        }
    }

    public int id_usuario(String nombre) {
        int id = 0;
        String sql = "SELECT tu.id\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }

    public int id_usuario_rev(String nombre) {
        int id = 0;
        String sql = "SELECT tu.id\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`)='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }

    public String nombre_rev(String nombre) {
        String nom = "";
        String sql = "SELECT CONCAT(tu.nombres,' ',tu.apellidos) AS 'Nombre'\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                nom = rs.getString("Nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            nom = "";
        }
        return nom;
    }

    public String nombre_usuario(String nombre) {
        String nom = "";
        String sql = "SELECT tu.usuario\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                nom = rs.getString("tu.usuario");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            nom = "";
        }
        return nom;
    }

    public String contraseña_usuario(String nombre) {
        String nom = "";
        String sql = "SELECT tu.contraseña\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                nom = rs.getString("tu.contraseña");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            nom = "";
        }
        return nom;
    }

    public int id_area_usuario(String nombre) {
        int id = 0;
        String sql = "SELECT tu.id_area\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                id = rs.getInt("id_area");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }

    public int usuario_aprueba(String nombre) {
        int aprueba = 0;
        String sql = "SELECT tu.aprueba\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                aprueba = rs.getInt("aprueba");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            aprueba = 0;
        }
        return aprueba;
    }

    public String area_usuario(String nombre) {
        String area = "";
        String sql = "SELECT ta.nombre_area\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                area = rs.getString("ta.nombre_area");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
//            area = "";
        }
        return area;
    }

    public String empresa_usuario(String nombre) {
        String empresa = "";
        String sql = "SELECT temp.nom_empresa\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "JOIN trebol_empresa AS temp ON tu.id_empresa=temp.id\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                empresa = rs.getString("temp.nom_empresa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
//            area = "";
        }
        return empresa;
    }

    public boolean existe_usuario(String usuario) {
        boolean existe_u = false;
        String sql = "SELECT tu.id, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'NombreC', tu.usuario, tu.contraseña,\n"
                + "ta.`nombre_area`, tempr.`nom_empresa`,tu.aprueba,tu.sesion_activa\n"
                + "FROM trebol_usuario AS tu\n"
                + "INNER JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                + "INNER JOIN trebol_empresa AS tempr ON tu.`id_empresa`=tempr.`id`\n"
                + "WHERE tu.`usuario` LIKE '" + usuario + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                existe_u = true;
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            existe_u = false;
        }
        return existe_u;
    }

    public boolean sesion_activa(String usuario) {
        boolean sesion = false;
        String sql = "SELECT tu.id, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'NombreC', tu.usuario, tu.contraseña,\n"
                + "ta.`nombre_area`, tempr.`nom_empresa`, tu.aprueba, tu.sesion_activa\n"
                + "FROM trebol_usuario AS tu\n"
                + "INNER JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                + "INNER JOIN trebol_empresa AS tempr ON tu.`id_empresa`=tempr.`id`\n"
                + "WHERE tu.`usuario` LIKE '" + usuario + "'\n"
                + "AND tu.sesion_activa=1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                sesion = true;
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            sesion = false;
        }
        return sesion;
    }

    public boolean comprobar_contraseña(String usuario, String pass) {
        boolean val_pass = false;
        String sql = "SELECT tu.id, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'NombreC', tu.usuario, tu.contraseña,\n"
                + "ta.`nombre_area`, tempr.`nom_empresa`, tu.aprueba, tu.sesion_activa\n"
                + "FROM trebol_usuario AS tu\n"
                + "INNER JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                + "INNER JOIN trebol_empresa AS tempr ON tu.`id_empresa`=tempr.`id`\n"
                + "WHERE tu.`usuario` LIKE '" + usuario + "'\n"
                + "AND tu.contraseña LIKE '" + pass + "';";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                val_pass = true;
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            val_pass = false;
        }
        return val_pass;
    }

    public String sesion(String usuario, String contraseña) {
        String sesion = "";
        if (existe_usuario(usuario)) {
            if (!sesion_activa(usuario)) {
                if (comprobar_contraseña(usuario, contraseña)) {
                    String sql = "SELECT CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')') AS 'NombreC'\n"
                            + "FROM trebol_usuario AS tu\n"
                            + "JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                            + "WHERE usuario LIKE '" + usuario + "';";
                    try (Connection cn = cc.Conexion();
                            Statement st = cn.createStatement();
                            ResultSet rs = st.executeQuery(sql)) {
                        if (rs.next()) {
                            sesion = rs.getString("NombreC");
                        }
                    } catch (SQLException ex) {
//                        Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
                        sesion = "";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya cuenta con una sesion activa.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado en el sistema.");
        }
        return sesion;
    }

    public boolean estado_sesion(int sesion, String usuario) {
        String sql = "UPDATE trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                + "SET sesion_activa=" + sesion + "\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')  LIKE '" + usuario + "';";
        try {
            return cc.sentenciaSQL(sql);
        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean desbloquear_sesion(String usuario, String contraseña) {
        boolean sesion = false;
        if (existe_usuario(usuario)) {
            if (sesion_activa(usuario)) {
                if (comprobar_contraseña(usuario, contraseña)) {
                    String sql = "SELECT CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')') AS 'NombreC'\n"
                            + "FROM trebol_usuario AS tu\n"
                            + "JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                            + "WHERE usuario LIKE '" + usuario + "';";
                    try (Connection cn = cc.Conexion();
                            Statement st = cn.createStatement();
                            ResultSet rs = st.executeQuery(sql)) {
                        while (rs.next()) {
                            sesion = estado_sesion(0, rs.getString("NombreC"));
                        }
                    } catch (SQLException ex) {
//                        Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
                        sesion = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya cuenta con una sesion activa.");
            }
        }
        return sesion;
    }

    public int id_usuario_rechazo(int id_factura) {
        int aprueba = 0;
        String sql = "SELECT tt.id_usuario\n"
                + "FROM trebol_tiempos AS tt\n"
                + "JOIN trebol_usuario AS tu ON tt.`id_usuario`=tu.`id`\n"
                + "WHERE tt.`id_estado_post`=11\n"
                + "AND tt.`id_factura` = " + id_factura + "\n"
                + "ORDER BY tt.creacion DESC\n"
                + "LIMIT 1;";
        try (Connection cn = cc.Conexion();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                aprueba = rs.getInt("tt.id_usuario");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            aprueba = 0;
        }
        return aprueba;
    }
}
