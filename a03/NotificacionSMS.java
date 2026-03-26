package a03;

public class NotificacionSMS implements Notificable {
    @Override
    public void enviarNotificación(String mensaje){
        System.out.println("Notificación SMS: " + mensaje);
    }
}