package a03;

public class NotificacionEmail implements Notificable {

    @Override
    public void enviarNotificación(String mensaje){
        System.out.println("Notificación email: " + mensaje);
    }
}