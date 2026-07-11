// StrategyPatternTest.java

public class StrategyPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("         Payment System");
        System.out.println("        Strategy Pattern Demo");
        System.out.println("==========================================\n");

        PaymentContext paymentContext = new PaymentContext();

        // Credit Card Payment
        paymentContext.setPaymentStrategy(new CreditCardPayment());

        System.out.println("Payment Method Selected : Credit Card");
        paymentContext.makePayment(2500);

        System.out.println("\n------------------------------------------\n");

        // PayPal Payment
        paymentContext.setPaymentStrategy(new PayPalPayment());

        System.out.println("Payment Method Selected : PayPal");
        paymentContext.makePayment(4500);

        System.out.println("\n------------------------------------------");
        System.out.println("Payments completed successfully.");
        System.out.println("Strategy Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}