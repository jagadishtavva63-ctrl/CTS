// Stock.java

// Subject Interface
public interface Stock {

    // Register a new observer
    void registerObserver(Observer observer);

    // Remove an existing observer
    void removeObserver(Observer observer);

    // Notify all registered observers
    void notifyObservers();

}