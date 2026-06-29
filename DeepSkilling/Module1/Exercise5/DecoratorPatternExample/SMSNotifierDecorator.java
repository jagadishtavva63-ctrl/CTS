// SMSNotifierDecorator.java

// Adds SMS notification functionality
public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {

        super.send(message);

        System.out.println("\n📱 SMS Notification");
        System.out.println("Message : " + message);
    }
}