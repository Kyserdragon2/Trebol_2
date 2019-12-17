package Objetos;

public class Revision {
    int id_factura, id_usuario, aprobado;

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

    public int getAprobado() {
        return aprobado;
    }

    public void setAprobado(int aprobado) {
        this.aprobado = aprobado;
    }

    public Revision() {
    }

    public Revision(int id_factura, int id_usuario) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
    }
    
}
