// WebApp.java

// Concrete Observer
public class WebApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println("💻 Web App");
        System.out.println("Notification : " + stockName +
                " price updated to ₹" + price);

    }
}