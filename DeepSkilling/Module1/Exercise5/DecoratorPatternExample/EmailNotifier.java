// EmailNotifier.java

// Sends notification through Email
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {

        System.out.println("📧 Email Notification");
        System.out.println("Message : " + message);

    }
}