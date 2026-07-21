// InventoryManagementTest.java

public class InventoryManagementTest {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     Inventory Management System");
        System.out.println("========================================");

        // Create Inventory
        Inventory inventory = new Inventory();

        // Create Products
        Product p1 = new Product(101, "Laptop", 15, 55000.00);
        Product p2 = new Product(102, "Keyboard", 50, 1200.00);
        Product p3 = new Product(103, "Mouse", 40, 800.00);

        // Add Products
        System.out.println("\nAdding Products...");
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display Inventory
        inventory.displayProducts();

        // Update Product
        System.out.println("\nUpdating Product...");
        inventory.updateProduct(102, 60, 1100.00);

        // Display Inventory
        inventory.displayProducts();

        // Delete Product
        System.out.println("\nDeleting Product...");
        inventory.deleteProduct(103);

        // Display Inventory
        inventory.displayProducts();

        System.out.println("\n========================================");
        System.out.println("Inventory Management Completed Successfully.");
        System.out.println("========================================");
    }
}