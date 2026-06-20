// TestSingleton.java

public class TestSingleton {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      Singleton Pattern Demonstration");
        System.out.println("========================================\n");

        // Requesting Logger instance for the first time
        Logger logger1 = Logger.getInstance();
        logger1.writeLog("Application started.");

        // Requesting Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.writeLog("Logging service is active.");

        System.out.println();

        // Checking whether both objects are the same
        if (logger1 == logger2) {
            System.out.println("Result : Only one Logger object is created.");
        } else {
            System.out.println("Result : Multiple Logger objects are created.");
        }

        System.out.println();
        System.out.println("Logger Object Details");
        System.out.println("---------------------");
        System.out.println("Logger 1 HashCode : " + logger1.hashCode());
        System.out.println("Logger 2 HashCode : " + logger2.hashCode());

        System.out.println("\nSingleton Pattern implemented successfully.");
    }
}