package Objetos;

public class Correo {

    int id, id_factura, enviado;
    String fecha_enviado, destinatario, asunto, mensaje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getEnviado() {
        return enviado;
    }

    public void setEnviado(int enviado) {
        this.enviado = enviado;
    }

    public String getFecha_enviado() {
        return fecha_enviado;
    }

    public void setFecha_enviado(String fecha_enviado) {
        this.fecha_enviado = fecha_enviado;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Correo() {
    }

    public Correo(int id, int id_factura, int enviado, String fecha_enviado, String destinatario, String asunto, String mensaje) {
        this.id = id;
        this.id_factura = id_factura;
        this.enviado = enviado;
        this.fecha_enviado = fecha_enviado;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Correo(int id_factura, String destinatario, String asunto, String mensaje) {
        this.id_factura = id_factura;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
}
