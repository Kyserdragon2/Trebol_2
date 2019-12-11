package Objetos;

public class Proveedor {

    int id, id_tipo_factura, id_area;
    String nit, razon_social, correo, direccion, telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo_factura() {
        return id_tipo_factura;
    }

    public void setId_tipo_factura(int id_tipo_factura) {
        this.id_tipo_factura = id_tipo_factura;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Proveedor() {
    }

    public Proveedor(int id, int id_tipo_factura, int id_area, String nit, String razon_social, String correo, String direccion, String telefono) {
        this.id = id;
        this.id_tipo_factura = id_tipo_factura;
        this.id_area = id_area;
        this.nit = nit;
        this.razon_social = razon_social;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Proveedor(int id) {
        this.id = id;
    }
    
    
}
