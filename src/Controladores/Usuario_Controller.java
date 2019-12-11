package Controladores;

import Clases.Conexion;
import Objetos.Usuario_obj;
import java.sql.ResultSet;
import java.sql.SQLException;
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
//            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Usuario_obj buscar(String usuario) {
        Usuario_obj U = new Usuario_obj();
        U.setUsuario(usuario);
        String sql = "SELECT * FROM trebol_usuario WHERE usuario LIKE '" + U.getUsuario() + "';";
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                U.setId(datos.getInt("id"));
                U.setUsuario(datos.getString("usuario"));
                U.setNombres(datos.getString("nombres"));
                U.setApellidos(datos.getString("apellidos"));
                U.setCorreo(datos.getString("correo"));
                U.setContraseña(datos.getString("contraseña"));
                U.setId_area(datos.getInt("id_area"));
                U.setId_empresa(datos.getInt("id_empresa"));
                U.setAprueba(datos.getInt("aprueba"));
                U.setRetirado(datos.getInt("retirado"));
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

    public String correos(int id_area, int id_empresa) {
        String correos = "";
        String consulta;
        if (id_empresa == 0) {
            consulta = "SELECT GROUP_CONCAT(IF(correo ='N/A',NULL,correo)) AS 'Correos'\n"
                    + "FROM trebol_usuario\n"
                    + "WHERE id_area = " + id_area + "\n"
                    + "GROUP BY id_area;";
        } else {
            consulta = "SELECT GROUP_CONCAT(IF(correo ='N/A',NULL,correo)) AS 'Correos'\n"
                    + "FROM trebol_usuario\n"
                    + "WHERE id_area = " + id_area + " AND id_empresa =" + id_empresa + "\n"
                    + "GROUP BY id_area;";
        }
        ResultSet datos = cc.consultas(consulta);
        try {
            if (datos.next()) {
                correos = datos.getString("Correos");
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
        ResultSet datos = cc.consultas(sql);
        try {
            while (datos.next()) {
                id = datos.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
            id = 0;
        }
        return id;
    }

    public String area_usuario(String nombre) {
        String area = "";
        String sql = "SELECT ta.nombre_area\n"
                + "FROM trebol_usuario AS tu\n"
                + "JOIN trebol_areas AS ta ON tu.`id_area`=ta.`id`\n"
                + "WHERE CONCAT(tu.`nombres`,' ',tu.`apellidos`,' (',ta.`nombre_area`,')')='" + nombre + "';";
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
                area = datos.getString("ta.nombre_area");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Controller.class.getName()).log(Level.SEVERE, null, ex);
//            area = "";
        }
        return area;
    }

    public boolean existe_usuario(String usuario) {
        boolean existe_u = false;
        String sql = "SELECT tu.id, CONCAT(tu.`nombres`,' ',tu.`apellidos`) AS 'NombreC', tu.usuario, tu.contraseña,\n"
                + "ta.`nombre_area`, tempr.`nom_empresa`,tu.aprueba,tu.sesion_activa\n"
                + "FROM trebol_usuario AS tu\n"
                + "INNER JOIN trebol_areas AS ta ON tu.id_area=ta.id\n"
                + "INNER JOIN trebol_empresa AS tempr ON tu.`id_empresa`=tempr.`id`\n"
                + "WHERE tu.`usuario` LIKE '" + usuario + "';";
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
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
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
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
        ResultSet datos = cc.consultas(sql);
        try {
            if (datos.next()) {
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
                    ResultSet datos = cc.consultas(sql);
                    try {
                        if (datos.next()) {
                            sesion = datos.getString("NombreC");
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
                    ResultSet datos = cc.consultas(sql);
                    try {
                        while (datos.next()) {
                            sesion = estado_sesion(0, datos.getString("NombreC"));
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
}
