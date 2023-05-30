package e.dependency.inversion;

public class NotificationService {

    private MessageSender emailService;
    private MessageSender smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    /**
     * Send email and sms notification
     * @param recipient
     * @param message
     */
    public void sendNotification(String recipient, String message) {
        sendNotification(recipient, message,true);
        sendNotification(recipient, message,false);
    }

    public void sendNotification(String recipient, String message , boolean emailConfirmed) {

        if(emailConfirmed){
            emailService.sendMessage(recipient,message);
        }else {
            smsService.sendMessage(recipient,message);
        }

    }

}
