import java.util.*;

public class Inventory {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. View All");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1 -> addProduct();
                case 2 -> updateStock();
                case 3 -> viewAll();
                case 4 -> deleteProduct();
                case 5 -> searchProduct();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addProduct() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble(); sc.nextLine();

        Product p = new Product(id, name, price);
        inventory.put(id, p);
        System.out.println("Product added.");
    }

    static void updateStock() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        Product p = inventory.get(id);
        if (p != null) {
            System.out.print("Enter quantity (+/-): ");
            int qty = sc.nextInt(); sc.nextLine();
            p.addstock(qty);
            System.out.println("Stock updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    static void viewAll() {
        for (Product p : inventory.values()) p.display();
    }

    static void deleteProduct() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        if (inventory.remove(id) != null) System.out.println("Deleted.");
        else System.out.println("Product not found.");
    }

    static void searchProduct() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        Product p = inventory.get(id);
        if (p != null) p.display();
        else System.out.println("Not found.");
    }
}
