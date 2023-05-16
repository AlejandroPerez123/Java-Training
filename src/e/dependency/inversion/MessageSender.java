package e.dependency.inversion;

public interface MessageSender {
    void sendMessage(String recipient, String message);
}
