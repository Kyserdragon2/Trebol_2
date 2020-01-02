package Objetos;

public class Usuario_obj {

    int id, id_area, id_empresa, sesiones, aprueba, retirado;
    String usuario, nombres, apellidos, correo, contraseña;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    public int getAprueba() {
        return aprueba;
    }

    public void setAprueba(int aprueba) {
        this.aprueba = aprueba;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRetirado() {
        return retirado;
    }

    public void setRetirado(int retirado) {
        this.retirado = retirado;
    }

    public Usuario_obj() {

    }

    public Usuario_obj(int id, int id_area, int id_empresa, int aprueba, int retirado, String usuario, String nombres, String apellidos, String correo, String contraseña) {
        this.id = id;
        this.id_area = id_area;
        this.id_empresa = id_empresa;
        this.aprueba = aprueba;
        this.retirado = retirado;
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario_obj(int id, int id_area, int id_empresa, int aprueba, String usuario, String nombres, String apellidos, String correo, String contraseña) {
        this.id = id;
        this.id_area = id_area;
        this.id_empresa = id_empresa;
        this.aprueba = aprueba;
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario_obj(int id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }
    
    public Usuario_obj(int sesiones) {
        this.sesiones = sesiones;
    }
    
}
