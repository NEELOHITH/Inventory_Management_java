# Inventory Management System (Java)

A simple Java-based Inventory Management System built using object-oriented programming principles. The application supports basic operations such as adding products, updating stock, deleting products, and viewing all products.

---

## 🚀 Features

- Add new products with ID, name, and price
- Delete existing products by ID
- Update stock quantity or product price
- View all products in the inventory
- Prevent duplicate product IDs

---

## 🧱 Product Structure

Each product is represented by a class with the following fields:

```java
class Product {
    String id;
    String name;
    double price;
    int quantity;
}
