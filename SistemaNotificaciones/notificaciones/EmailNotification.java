package notificaciones;

public class EmailNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando EMAIL a: " + recipient);
        System.out.println("Mensaje: " + message);
        System.out.println("Email enviado exitosamente");
        System.out.println("--------------------------------");
    }
}