package Objetos;

public class Programacion {
    int id_factura, id_usuario, activo;
    String fecha_prog;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getFecha_prog() {
        return fecha_prog;
    }

    public void setFecha_prog(String fecha_prog) {
        this.fecha_prog = fecha_prog;
    }

    public Programacion() {
    }

    public Programacion(int id_factura, int id_usuario, int activo, String fecha_prog) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
        this.activo = activo;
        this.fecha_prog = fecha_prog;
    }

    public Programacion(int id_factura, int id_usuario, String fecha_prog) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
        this.fecha_prog = fecha_prog;
    }
    
}
