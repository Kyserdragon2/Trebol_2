
package Objetos;

public class Anticipo {
    int id_proveedor, id_empresa, id_tipo_doc;
    String consecutivo, ub_documento;
    double valor;

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getUb_documento() {
        return ub_documento;
    }

    public void setUb_documento(String ub_documento) {
        this.ub_documento = ub_documento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Anticipo() {
    }

    public Anticipo(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo, String ub_documento, double valor) {
        this.id_proveedor = id_proveedor;
        this.id_empresa = id_empresa;
        this.id_tipo_doc = id_tipo_doc;
        this.consecutivo = consecutivo;
        this.ub_documento = ub_documento;
        this.valor = valor;
    }

    public Anticipo(int id_proveedor, int id_empresa, int id_tipo_doc, String consecutivo) {
        this.id_proveedor = id_proveedor;
        this.id_empresa = id_empresa;
        this.id_tipo_doc = id_tipo_doc;
        this.consecutivo = consecutivo;
    }

    public Anticipo(int id_proveedor, int id_empresa, String consecutivo) {
        this.id_proveedor = id_proveedor;
        this.id_empresa = id_empresa;
        this.consecutivo = consecutivo;
    }
    
}
