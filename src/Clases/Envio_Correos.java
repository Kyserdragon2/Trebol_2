package Clases;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Envio_Correos {

    private String from = "";
    private String password = "";
    private InternetAddress[] addressTo;
    public String NUs;
    private String Subject = "";
    private String MessageMail;

    Conexion cc = new Conexion();

    public void setFrom(String user) {
        this.from = "nr-avcvsn@aviomar.com.co";
    }

    public String getFrom() {
        return this.from;
    }

    public void setPassword(String value) {
        this.password = "Aviocol$19";
    }

    public String getPassword() {
        return this.password;
    }

    public void setTo(String mails) {
        String[] tmp = mails.split(",");
        addressTo = new InternetAddress[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try {
                addressTo[i] = new InternetAddress(tmp[i]);
            } catch (AddressException ex) {
                System.out.println(ex);
            }
        }
    }

    public InternetAddress[] getTo() {
        return this.addressTo;
    }

    public void setSubject(String value) {
        this.Subject = value;
    }

    public String getSubject() {
        return this.Subject;
    }

    public String getNUs() {
        return NUs;
    }

    public void setNUs(String NUs) {
        this.NUs = NUs;
    }

    @SuppressWarnings("SillyAssignment")
    public void setMessage(String value) {
        this.MessageMail = value;
    }

    public String getMessage() {
        return this.MessageMail;
    }

    public String plantilla_correo(String encabezado, String fact, String emp, String nit, String rad, String prov,
            String valor, String f_rec, String f_fact, String f_venc, String usuario, String coment) {
        String colorbg, colorfr;
        switch (encabezado) {
            case "Factura Nueva":
                colorbg = "#ffcc33";
                colorfr = "black";
                break;
            case "Factura Rechazada":
                colorbg = "#ff3333";
                colorfr = "white";
                break;
            case "Factura para Aprobar":
                colorbg = "#a04b20";
                colorfr = "white";
                break;
            case "Factura Corregida":
                colorbg = "#ffcc33";
                colorfr = "black";
                break;
            default:
                colorbg = "#2222ff";
                colorfr = "black";
                break;
        }
        String plantilla;
        if (!coment.equals("")) {
            plantilla = "<html>\n"
                    + "    <head>\n"
                    + "        <title>TODO supply a title</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <table style=\" width: 700px; text-align: center;table-layout:fixed; \" align=\"Center\">\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 25px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri;\" colspan=\"4\" align=\"center\">\n"
                    + "                        <strong>\n"
                    + encabezado
                    + "                        </strong></td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"width: 130px; font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Factura: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"width: 200px; font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + fact
                    + "                    </td>\n"
                    + "                    <td style=\"width: 170px; font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Empresa: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"width: 200px; font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + emp
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            NIT: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + nit
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Radicado: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + rad
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Proveedor: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td  colspan=\"3\" style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; background: #ffffff;\">\n"
                    + "                        <textarea name=\"proveedor\" rows=\"3\" cols=\"55\" readonly=\"readonly\" style=\"font-size: 20px; font-family: Calibri; background: none; text-align: left;\">\n"
                    + prov
                    + "                        </textarea>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Valor: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + valor
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Recepcion: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_rec
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Factura: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_fact
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Vencimiento: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_venc
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Creada por: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td colspan=\"3\" style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + usuario
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Comentario: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td  colspan=\"3\" style=\"font-size: 16px; font-family: Calibri; border: 3px outset " + colorbg + "; background: #ffffff;text-align: left;\">\n"
                    + "                        <textarea name=\"proveedor\" rows=\"3\" cols=\"60\" readonly=\"readonly\" style=\"background: none; font-size: 16px; font-family: Calibri;  text-align: left;\">\n"
                    + coment
                    + "                        </textarea>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; background: #ffffff;\"  colspan=\"4\" align=\"Center\">\n"
                    + "                        <img style=\"margin-right: 10px; margin-left: 10px; opacity: 0.6;\" src=\"http://186.29.91.156/Imagenes%20Publicas/Empresa.png\"/>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "        </table>\n"
                    + "    </body>\n"
                    + "</html>";
        } else {
            plantilla = "<html>\n"
                    + "    <head>\n"
                    + "        <title>TODO supply a title</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <table style=\" width: 700px; text-align: center;table-layout:fixed; \" align=\"Center\">\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 25px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri;\" colspan=\"4\" align=\"center\">\n"
                    + "                        <strong>\n"
                    + encabezado
                    + "                        </strong></td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"width: 130px; font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Factura: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"width: 200px; font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + fact
                    + "                    </td>\n"
                    + "                    <td style=\"width: 170px; font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Empresa: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"width: 200px; font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + emp
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            NIT: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + nit
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Radicado: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + rad
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Proveedor: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td  colspan=\"3\" style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; background: #ffffff;\">\n"
                    + "                        <textarea name=\"proveedor\" rows=\"3\" cols=\"55\" readonly=\"readonly\" style=\"font-size: 20px; font-family: Calibri; background: none; text-align: left;\">\n"
                    + prov
                    + "                        </textarea>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Valor: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + valor
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Recepcion: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_rec
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Factura: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_fact
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Fecha Vencimiento: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + f_venc
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; background: " + colorbg + "; border: 3px outset " + colorbg + "; color:" + colorfr + "; font-family: Calibri; text-align: right;\">\n"
                    + "                        <strong>\n"
                    + "                            Creada por: \n"
                    + "                        </strong>\n"
                    + "                    </td>\n"
                    + "                    <td colspan=\"3\" style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; text-align: center; background: #ffffff;\">\n"
                    + usuario
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"font-size: 20px; font-family: Calibri; border: 3px outset " + colorbg + "; background: #ffffff;\"  colspan=\"4\" align=\"Center\">\n"
                    + "                        <img style=\"margin-right: 10px; margin-left: 10px; opacity: 0.6;\" src=\"http://186.29.91.156/Imagenes%20Publicas/Empresa.png\"/>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "        </table>\n"
                    + "    </body>\n"
                    + "</html>";
        }
        return plantilla;
    }
}
