// Logger.java

// Singleton class to ensure only one logger object exists
public class Logger {

    // Static reference of Logger
    private static Logger loggerInstance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger initialized successfully.\n");
    }

    // Method to return the single instance
    public static Logger getInstance() {

        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }

        return loggerInstance;
    }

    // Method to display log messages
    public void writeLog(String message) {
        System.out.println("[LOG] " + message);
    }
}