package Objetos;

public class Sistema_UNO {

    String nit, no_factura, consecutivo;
    int id_empresa, id_tipo_doc;
    double valor;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(String no_factura) {
        this.no_factura = no_factura;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_tipo_doc() {
        return id_tipo_doc;
    }

    public void setId_tipo_doc(int id_tipo_doc) {
        this.id_tipo_doc = id_tipo_doc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Sistema_UNO() {
    }

    public Sistema_UNO(String nit, String no_factura, String consecutivo, int id_empresa, int id_tipo_doc, double valor) {
        this.nit = nit;
        this.no_factura = no_factura;
        this.consecutivo = consecutivo;
        this.id_empresa = id_empresa;
        this.id_tipo_doc = id_tipo_doc;
        this.valor = valor;
    }

    public Sistema_UNO(String nit, String no_factura, int id_empresa, int id_tipo_doc) {
        this.nit = nit;
        this.no_factura = no_factura;
        this.id_empresa = id_empresa;
        this.id_tipo_doc = id_tipo_doc;
    }

    public Sistema_UNO(String nit, int id_empresa, int id_tipo_doc) {
        this.nit = nit;
        this.id_empresa = id_empresa;
        this.id_tipo_doc = id_tipo_doc;
    }
    

}
