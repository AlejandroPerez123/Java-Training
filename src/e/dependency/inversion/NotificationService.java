package e.dependency.inversion;

public class NotificationService {

    private MessageSender emailService;
    private MessageSender smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendNotification(String recipient, String message) {
        emailService.sendMessage(recipient, message);
        smsService.sendMessage(recipient, message);
    }

}
