// ProxyPatternTest.java

public class ProxyPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Image Viewer Application");
        System.out.println("          Proxy Pattern Demo");
        System.out.println("==========================================\n");

        // Creating a proxy object
        Image image = new ProxyImage("Nature.jpg");

        System.out.println("First Request");
        image.display();

        System.out.println("\n------------------------------------------\n");

        System.out.println("Second Request");
        image.display();

        System.out.println("\n------------------------------------------");
        System.out.println("Image loaded only once and reused.");
        System.out.println("Proxy Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}