// FinancialForecastTest.java

public class FinancialForecastTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       Financial Forecasting Tool");
        System.out.println("==========================================");

        double currentValue = 10000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(
                currentValue,
                growthRate,
                years
        );

        System.out.println("\nCurrent Value : ₹" + currentValue);
        System.out.println("Growth Rate  : " + (growthRate * 100) + "%");
        System.out.println("Years        : " + years);

        System.out.printf("\nPredicted Future Value : ₹%.2f%n", futureValue);

        System.out.println("\n==========================================");
        System.out.println("Forecast Generated Successfully.");
        System.out.println("==========================================");

    }

}