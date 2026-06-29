import java.util.HashMap;

public class InventoryManagementSystem {

    private HashMap<Integer, Product1> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product1 product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product1 product = inventory.get(id);

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }
    }

    // Display Inventory
    public void displayInventory() {

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");

        } else {

            System.out.println("\nInventory:");

            for (Product1 product : inventory.values()) {

                System.out.println(product);

            }
        }
    }

    public static void main(String[] args) {

        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addProduct(new Product1(101, "Laptop", 20, 65000));
        ims.addProduct(new Product1(102, "Mouse", 150, 600));
        ims.addProduct(new Product1(103, "Keyboard", 75, 1200));

        ims.displayInventory();

        ims.updateProduct(102, "Wireless Mouse", 130, 850);

        ims.displayInventory();

        ims.deleteProduct(103);

        ims.displayInventory();
    }
}


// Product Added Successfully.
// Product Added Successfully.
// Product Added Successfully.

// Inventory:
// Product ID: 101, Name: Laptop, Quantity: 20, Price: ₹65000.0
// Product ID: 102, Name: Mouse, Quantity: 150, Price: ₹600.0
// Product ID: 103, Name: Keyboard, Quantity: 75, Price: ₹1200.0

// Product Updated Successfully.

// Inventory:
// Product ID: 101, Name: Laptop, Quantity: 20, Price: ₹65000.0
// Product ID: 102, Name: Wireless Mouse, Quantity: 130, Price: ₹850.0
// Product ID: 103, Name: Keyboard, Quantity: 75, Price: ₹1200.0

// Product Deleted Successfully.

// Inventory:
// Product ID: 101, Name: Laptop, Quantity: 20, Price: ₹65000.0
// Product ID: 102, Name: Wireless Mouse, Quantity: 130, Price: ₹850.0