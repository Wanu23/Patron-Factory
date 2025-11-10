package servicio;

import factory.NotificationFactory;
import notificaciones.Notification;

public class NotificationService {
    private NotificationFactory factory;
    
    public NotificationService() {
        this.factory = new NotificationFactory();
    }
    
    public void sendNotification(String type, String message, String recipient) {
        // Usamos la factory para crear la notificación
        Notification notification = factory.createNotification(type);
        
        if (notification != null) {
            notification.send(message, recipient);
        }
    }
}