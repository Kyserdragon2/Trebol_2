package Objetos;

public class Aprobacion {
    int id_factura, id_usuario, id_area, aprobado;

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

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getAprobado() {
        return aprobado;
    }

    public void setAprobado(int aprobado) {
        this.aprobado = aprobado;
    }

    public Aprobacion() {
    }

    public Aprobacion(int id_factura, int id_area, int id_usuario) {
        this.id_factura = id_factura;
        this.id_usuario = id_usuario;
        this.id_area = id_area;
    }

    public Aprobacion(int id_factura, int id_area) {
        this.id_factura = id_factura;
        this.id_area = id_area;
    }
}
