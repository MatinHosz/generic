package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(String id) {
        items.removeIf(product -> product.getId().equals(id));
    }

    public T findItemsById(String id) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("Invalid input. id cannot be null or empty.");
        if (id.length() != 4)
            throw new IllegalArgumentException("Invalid input. id length must be 4.");

        for (T product : items) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        return null;
    }

    public void applyDiscount(String productName, int discount) {
        if (productName == null || productName.isEmpty())
            throw new IllegalArgumentException("Invalid input. product name cannot be null or empty.");
        if (discount < 0)
            throw new IllegalArgumentException("Invalid input. discount must be positive number.");

        for (T product : items) {
            if (product.getTitle().equalsIgnoreCase(productName)) {
                double newPrice = product.getPrice() * (1 - discount / 100.0);
                product.setPrice(newPrice);
            }
        }
    }

    public void displayAll() {
        for (T product : items) {
            System.out.println(product.toString());
        }
    }
}