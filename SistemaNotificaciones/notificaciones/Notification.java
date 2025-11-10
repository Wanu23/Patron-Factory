package notificaciones;

public interface Notification {
    void send(String message, String recipient);
}