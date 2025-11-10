package notificaciones;

public class WhatsAppNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando WHATSAPP a: " + recipient);
        System.out.println("Mensaje: " + message);
        System.out.println("WhatsApp enviado exitosamente");
        System.out.println("--------------------------------");
    }
}