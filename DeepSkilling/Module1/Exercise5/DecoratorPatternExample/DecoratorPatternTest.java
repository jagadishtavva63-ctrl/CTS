// DecoratorPatternTest.java

public class DecoratorPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       Notification Management System");
        System.out.println("         Decorator Pattern Demo");
        System.out.println("==========================================\n");

        // Basic Email Notification
        Notifier notifier = new EmailNotifier();

        // Add SMS functionality
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack functionality
        notifier = new SlackNotifierDecorator(notifier);

        System.out.println("Sending notification...\n");

        notifier.send("Your order has been placed successfully.");

        System.out.println("\n------------------------------------------");
        System.out.println("Notification sent through all channels.");
        System.out.println("Decorator Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}