package a03;

public class Main {
    public static void main(String[] args) {
        String mensaje = "Mantenimiento urgente del servidor";

        Notificable nemail = new NotificacionEmail();
        Notificable nsms = new NotificacionSMS();
        Notificable npush = new NotificacionPush();

        Notificable[] notificaciones = {nemail,nsms,npush};

        for (Notificable notificable : notificaciones) {
            notificable.enviarNotificación(mensaje);
        }           
    }
}
