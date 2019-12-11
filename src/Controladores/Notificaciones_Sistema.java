package Controladores;

import ds.desktop.notify.DesktopNotify;

public class Notificaciones_Sistema {

    public void notificaciones(String titulo, String mensaje, String tipo) {
        switch (tipo) {
            case "correcto":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.SUCCESS, 7000);
                break;
            case "advertencia":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.WARNING, 7000);
                break;
            case "error":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.ERROR, 7000);
                break;
            default:
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.INFORMATION, 7000);
                break;
        }
    }

}
