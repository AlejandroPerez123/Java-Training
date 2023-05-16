package e.dependency.inversion;

public class SMSService implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("TEXT MESSAGE: "+recipient+" "+message);
    }
}