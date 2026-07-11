// AdapterPatternTest.java

public class AdapterPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       Payment Processing System");
        System.out.println("         Adapter Pattern Demo");
        System.out.println("==========================================\n");

        // Using different payment gateways through adapters
        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();
        PaymentProcessor razorpay = new RazorpayAdapter();

        System.out.println("Processing payments...\n");

        paypal.processPayment(1500);
        stripe.processPayment(2500);
        razorpay.processPayment(3500);

        System.out.println("\n------------------------------------------");
        System.out.println("All payments processed successfully.");
        System.out.println("Adapter Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}