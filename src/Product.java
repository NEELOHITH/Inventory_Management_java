import java.util.*;
public class Product {
    String id, name;
    double price;
    ArrayList<Integer> stock = new ArrayList<>();

    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void addstock(int qty) {
        stock.add(qty);
    }

    int totalstock() {
        int total = 0;
        for (int s : stock) total += s;
        return total;
    }

    void display() {
        System.out.println("ID:" + id);
        System.out.println("NAME:" + name);
        System.out.println("price:" + price);
        System.out.println("Stock" + stock);
    }
}
