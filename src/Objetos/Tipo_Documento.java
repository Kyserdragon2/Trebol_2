package Objetos;

public class Tipo_Documento {
    int id;
    String tipo_doc, nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_Documento() {
    }

    public Tipo_Documento(String tipo_doc, String nombre) {
        this.tipo_doc = tipo_doc;
        this.nombre = nombre;
    }
}
