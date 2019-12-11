package Objetos;

public class Comentario {
    int id, id_usuario, id_factura, id_estado;
    String detalle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Comentario() {
    }

    public Comentario(int id, int id_usuario, int id_factura, int id_estado, String detalle) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_factura = id_factura;
        this.id_estado = id_estado;
        this.detalle = detalle;
    }
    
}
