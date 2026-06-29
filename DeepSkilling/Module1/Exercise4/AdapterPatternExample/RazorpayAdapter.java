// RazorpayAdapter.java

// Adapter for Razorpay Gateway
public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter() {
        razorpayGateway = new RazorpayGateway();
    }

    @Override
    public void processPayment(double amount) {
        razorpayGateway.sendPayment(amount);
    }
}