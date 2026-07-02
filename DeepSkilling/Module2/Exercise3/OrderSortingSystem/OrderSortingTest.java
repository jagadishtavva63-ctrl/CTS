// OrderSortingTest.java

public class OrderSortingTest {

    // Display Orders
    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {

            System.out.println(order);
            System.out.println("----------------------------");

        }

    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       Customer Order Sorting System");
        System.out.println("==========================================");

        // Original Orders
        Order[] bubbleOrders = {
                new Order(101, "Rahul", 4500.00),
                new Order(102, "Anjali", 1200.00),
                new Order(103, "Kiran", 7800.00),
                new Order(104, "Priya", 3200.00),
                new Order(105, "Arjun", 5600.00)
        };

        System.out.println("\nOriginal Orders");
        System.out.println("----------------------------");
        displayOrders(bubbleOrders);

        // Bubble Sort
        SortAlgorithms.bubbleSort(bubbleOrders);

        System.out.println("\nOrders After Bubble Sort");
        System.out.println("----------------------------");
        displayOrders(bubbleOrders);

        // Create another array for Quick Sort
        Order[] quickOrders = {
                new Order(101, "Rahul", 4500.00),
                new Order(102, "Anjali", 1200.00),
                new Order(103, "Kiran", 7800.00),
                new Order(104, "Priya", 3200.00),
                new Order(105, "Arjun", 5600.00)
        };

        // Quick Sort
        SortAlgorithms.quickSort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\nOrders After Quick Sort");
        System.out.println("----------------------------");
        displayOrders(quickOrders);

        System.out.println("==========================================");
        System.out.println("Sorting Completed Successfully.");
        System.out.println("==========================================");

    }

}