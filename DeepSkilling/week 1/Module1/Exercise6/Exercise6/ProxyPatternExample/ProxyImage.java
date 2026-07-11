// ProxyImage.java

// Proxy class that controls access to RealImage
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        // Lazy initialization
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        // Display the image
        realImage.display();
    }
}