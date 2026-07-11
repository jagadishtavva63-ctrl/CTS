// RealImage.java

// Real object that loads the image from a remote server
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    // Simulates loading an image
    private void loadFromServer() {
        System.out.println("Loading image from remote server : " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : " + fileName);
    }
}