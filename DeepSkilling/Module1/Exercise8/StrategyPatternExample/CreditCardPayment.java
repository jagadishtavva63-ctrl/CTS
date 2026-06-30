// CreditCardPayment.java

// Concrete Strategy - Credit Card Payment
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("💳 Credit Card Payment");
        System.out.println("Amount Paid : ₹" + amount);

    }
}