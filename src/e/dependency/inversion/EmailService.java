package e.dependency.inversion;

public class EmailService implements MessageSender{
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("EMAIL MESSAGE: "+recipient+" "+message);
    }
}
