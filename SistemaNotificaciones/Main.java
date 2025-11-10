import servicio.NotificationService;

public class Main {
    public static void main(String[] args) {
        // Creamos el servicio de notificaciones
        NotificationService service = new NotificationService();
        
        System.out.println("/// Sistema De Notificaciones ///");
        System.out.println();
        
        // Enviamos diferentes tipos de notificaciones
        service.sendNotification("email", 
            "Tu pedido ha sido confirmado", 
            "usuario@ejemplo.com");
        
        service.sendNotification("sms", 
            "Tu codigo de verificacion es: 1234", 
            "+57 300 123 4567");
        
        service.sendNotification("whatsapp", 
            "Recordatorio: Tienes una cita manana a las 3 PM", 
            "+57 311 987 6543");
        
        // Intentamos un tipo invalido
        service.sendNotification("telegram", 
            "Este mensaje no se enviara", 
            "usuario123");
    }
}