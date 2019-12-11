package Objetos;

public class Log {
    int id_usuario, id_factura, id_comentario, id_estado;

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

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public Log() {
    }

    public Log(int id_usuario, int id_factura, int id_comentario, int id_estado) {
        this.id_usuario = id_usuario;
        this.id_factura = id_factura;
        this.id_comentario = id_comentario;
        this.id_estado = id_estado;
    }
}
