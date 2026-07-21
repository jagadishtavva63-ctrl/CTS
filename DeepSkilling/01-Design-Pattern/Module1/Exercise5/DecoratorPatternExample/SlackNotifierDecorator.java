// SlackNotifierDecorator.java

// Adds Slack notification functionality
public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {

        super.send(message);

        System.out.println("\n💬 Slack Notification");
        System.out.println("Message : " + message);
    }
}