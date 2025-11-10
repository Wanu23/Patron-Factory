package factory;

import notificaciones.EmailNotification;
import notificaciones.Notification;
import notificaciones.SMSNotification;
import notificaciones.WhatsAppNotification;

public class NotificationFactory {
    
    // Método factory que crea la notificación según el tipo
    public Notification createNotification(String type) {
        Notification notification = null;
        
        if (type.equals("email")) {
            notification = new EmailNotification();
        } else if (type.equals("sms")) {
            notification = new SMSNotification();
        } else if (type.equals("whatsapp")) {
            notification = new WhatsAppNotification();
        } else {
            System.out.println("Tipo de notificacion no valido: " + type);
        }
        
        return notification;
    }
}