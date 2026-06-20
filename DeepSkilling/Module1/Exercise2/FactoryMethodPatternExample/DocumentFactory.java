// Abstract factory class

public abstract class DocumentFactory {

    // Factory method
    public abstract Document createDocument();

    // Common operation
    public void createAndOpenDocument() {
        Document document = createDocument();
        document.open();
    }
}