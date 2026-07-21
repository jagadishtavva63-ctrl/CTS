// ObserverPatternTest.java

public class ObserverPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Stock Market Monitoring System");
        System.out.println("          Observer Pattern Demo");
        System.out.println("==========================================");

        // Create Stock Market
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock prices
        stockMarket.setStock("TCS", 3580.50);

        System.out.println();

        stockMarket.setStock("Infosys", 1625.75);

        System.out.println("\n------------------------------------------");
        System.out.println("All observers notified successfully.");
        System.out.println("Observer Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}