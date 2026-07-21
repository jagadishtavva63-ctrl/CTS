// SearchTest.java

public class SearchTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      E-Commerce Search System");
        System.out.println("==========================================");

        // Products (Sorted by Product ID)
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Accessories"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        int searchId = 104;

        // Linear Search
        System.out.println("\nLinear Search");
        System.out.println("---------------------------");

        Product linearResult =
                SearchAlgorithms.linearSearch(products, searchId);

        if (linearResult != null) {

            System.out.println("Product Found");
            System.out.println(linearResult);

        } else {

            System.out.println("Product Not Found");

        }

        // Binary Search
        System.out.println("\nBinary Search");
        System.out.println("---------------------------");

        Product binaryResult =
                SearchAlgorithms.binarySearch(products, searchId);

        if (binaryResult != null) {

            System.out.println("Product Found");
            System.out.println(binaryResult);

        } else {

            System.out.println("Product Not Found");

        }

        System.out.println("\n==========================================");
        System.out.println("Search Completed Successfully.");
        System.out.println("==========================================");

    }

}