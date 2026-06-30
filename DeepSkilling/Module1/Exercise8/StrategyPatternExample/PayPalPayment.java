// PayPalPayment.java

// Concrete Strategy - PayPal Payment
public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("🅿️ PayPal Payment");
        System.out.println("Amount Paid : ₹" + amount);

    }
}