package Objetos;

public class Factura_Convenio {

    int id_factura, id_convenio, activo;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Factura_Convenio() {
    }

    public Factura_Convenio(int id_factura, int id_convenio, int activo) {
        this.id_factura = id_factura;
        this.id_convenio = id_convenio;
        this.activo = activo;
    }

    public Factura_Convenio(int id_factura, int id_convenio) {
        this.id_factura = id_factura;
        this.id_convenio = id_convenio;
    }
}
