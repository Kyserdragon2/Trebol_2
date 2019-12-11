package Objetos;

public class Tiempo {
    int id_usuario, id_factura, is_estado_prev, id_estado_post;

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

    public int getIs_estado_prev() {
        return is_estado_prev;
    }

    public void setIs_estado_prev(int is_estado_prev) {
        this.is_estado_prev = is_estado_prev;
    }

    public int getId_estado_post() {
        return id_estado_post;
    }

    public void setId_estado_post(int id_estado_post) {
        this.id_estado_post = id_estado_post;
    }

    public Tiempo() {
    }

    public Tiempo(int id_usuario, int id_factura, int is_estado_prev, int id_estado_post) {
        this.id_usuario = id_usuario;
        this.id_factura = id_factura;
        this.is_estado_prev = is_estado_prev;
        this.id_estado_post = id_estado_post;
    }
}
