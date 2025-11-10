package notificaciones;

public class SMSNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando SMS a: " + recipient);
        System.out.println("Mensaje: " + message);
        System.out.println("SMS enviado exitosamente");
        System.out.println("--------------------------------");
    }
}
