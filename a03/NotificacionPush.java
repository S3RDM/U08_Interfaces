package a03;

public class NotificacionPush implements Notificable{
    @Override
    public void enviarNotificación(String mensaje){
        System.out.println("Notificación push: " + mensaje);
    }
}