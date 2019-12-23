package Objetos;

public class Factura {

    int id, aprobada, revisada, id_proveedor, id_tipo_factura, id_gestion, id_area, id_empresa, id_estado;
    String no_factura, moneda, fecha_recepcion, fecha_generada, fecha_venc, no_radicado, ubicacion, convenio;
    double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAprobada() {
        return aprobada;
    }

    public void setAprobada(int aprobada) {
        this.aprobada = aprobada;
    }

    public int getRevisada() {
        return revisada;
    }

    public void setRevisada(int revisada) {
        this.revisada = revisada;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_tipo_factura() {
        return id_tipo_factura;
    }

    public void setId_tipo_factura(int id_tipo_factura) {
        this.id_tipo_factura = id_tipo_factura;
    }

    public int getId_gestion() {
        return id_gestion;
    }

    public void setId_gestion(int id_gestion) {
        this.id_gestion = id_gestion;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(String no_factura) {
        this.no_factura = no_factura;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getFecha_generada() {
        return fecha_generada;
    }

    public void setFecha_generada(String fecha_generada) {
        this.fecha_generada = fecha_generada;
    }

    public String getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(String fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getNo_radicado() {
        return no_radicado;
    }

    public void setNo_radicado(String no_radicado) {
        this.no_radicado = no_radicado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Factura() {
    }

    public Factura(int id, int id_proveedor, int id_tipo_factura, int id_gestion, int id_area, int id_empresa, String no_factura,
            String moneda, String fecha_generada, String fecha_venc, String no_radicado, double valor) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.id_tipo_factura = id_tipo_factura;
        this.id_gestion = id_gestion;
        this.id_area = id_area;
        this.id_empresa = id_empresa;
        this.no_factura = no_factura;
        this.moneda = moneda;
        this.fecha_generada = fecha_generada;
        this.fecha_venc = fecha_venc;
        this.no_radicado = no_radicado;
        this.valor = valor;
    }

    public Factura(int id, int id_proveedor, int id_tipo_factura, int id_gestion, int id_area, int id_empresa, String no_factura, 
            String moneda, String fecha_recepcion, String fecha_generada, String fecha_venc, String no_radicado, double valor) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.id_tipo_factura = id_tipo_factura;
        this.id_gestion = id_gestion;
        this.id_area = id_area;
        this.id_empresa = id_empresa;
        this.no_factura = no_factura;
        this.moneda = moneda;
        this.fecha_recepcion = fecha_recepcion;
        this.fecha_generada = fecha_generada;
        this.fecha_venc = fecha_venc;
        this.no_radicado = no_radicado;
        this.valor = valor;
    }
    
    

    public Factura(int id) {
        this.id = id;
    }

}
