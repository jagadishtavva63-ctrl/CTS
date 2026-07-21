// Inventory.java

import java.util.HashMap;

// Inventory Class
public class Inventory {

    // HashMap to store products
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        inventory.put(product.getProductId(), product);

        System.out.println("Product Added Successfully.");

    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {

        Product product = inventory.get(productId);

        if (product != null) {

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Display Products
    public void displayProducts() {

        System.out.println("\nInventory Details");
        System.out.println("----------------------------");

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");

            return;
        }

        for (Product product : inventory.values()) {

            System.out.println(product);
            System.out.println("----------------------------");

        }

    }
}