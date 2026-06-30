// MobileApp.java

// Concrete Observer
public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println("📱 Mobile App");
        System.out.println("Notification : " + stockName +
                " price updated to ₹" + price);

    }
}