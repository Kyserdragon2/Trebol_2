package Objetos;

public class Documento {

    int id_tipo_doc, id_factura;
    String consecutivo, ubicacion;

    public int getId_tipo_doc() {
        return id_tipo_doc;
    }

    public void setId_tipo_doc(int id_tipo_doc) {
        this.id_tipo_doc = id_tipo_doc;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Documento() {
    }

    public Documento(int id_tipo_doc, int id_factura) {
        this.id_tipo_doc = id_tipo_doc;
        this.id_factura = id_factura;
    }

    public Documento(int id_tipo_doc, int id_factura, String ubicacion) {
        this.id_tipo_doc = id_tipo_doc;
        this.id_factura = id_factura;
        this.ubicacion = ubicacion;
    }

    public Documento(int id_tipo_doc, int id_factura, String consecutivo, String ubicacion) {
        this.id_tipo_doc = id_tipo_doc;
        this.id_factura = id_factura;
        this.consecutivo = consecutivo;
        this.ubicacion = ubicacion;
    }

    public Documento(int id_factura, String ubicacion) {
        this.id_factura = id_factura;
        this.ubicacion = ubicacion;
    }

}
