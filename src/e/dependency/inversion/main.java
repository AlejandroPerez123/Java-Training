package e.dependency.inversion;

public class main {
    public static void main (String[] args){

        NotificationService notificationService = new NotificationService();


        String recipient = "example@email.com";
        String message = "Hello";
        notificationService.sendNotification(recipient,message);


    }
}
