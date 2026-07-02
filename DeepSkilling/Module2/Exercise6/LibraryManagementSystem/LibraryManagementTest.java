// LibraryManagementTest.java

public class LibraryManagementTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Library Management System");
        System.out.println("==========================================");

        // Books (Sorted by Title)
        Book[] books = {
                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Data Structures", "Seymour Lipschutz"),
                new Book(104, "Java Programming", "Herbert Schildt"),
                new Book(105, "Operating Systems", "Abraham Silberschatz")
        };

        String searchTitle = "Java Programming";

        // Linear Search
        System.out.println("\nLinear Search");
        System.out.println("----------------------------");

        Book linearResult = SearchLibrary.linearSearch(books, searchTitle);

        if (linearResult != null) {

            System.out.println("Book Found");
            System.out.println(linearResult);

        } else {

            System.out.println("Book Not Found");

        }

        // Binary Search
        System.out.println("\nBinary Search");
        System.out.println("----------------------------");

        Book binaryResult = SearchLibrary.binarySearch(books, searchTitle);

        if (binaryResult != null) {

            System.out.println("Book Found");
            System.out.println(binaryResult);

        } else {

            System.out.println("Book Not Found");

        }

        System.out.println("\n==========================================");
        System.out.println("Library Search Completed Successfully.");
        System.out.println("==========================================");
    }
}