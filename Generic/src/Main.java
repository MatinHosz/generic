import products.*;
import inventory.*;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        Book book1 = new Book("Book A", 100.0, "Author A", "Pub A", "Fiction");
        Book book2 = new Book("Book B", 150.0, "Author B", "Pub B", "Non-fiction");
        bookInventory.addItems(book1);
        bookInventory.addItems(book2);

        Notebook nb1 = new Notebook("Notebook A", 50.0, 100, true);
        Notebook nb2 = new Notebook("Notebook B", 40.0, 80, false);
        notebookInventory.addItems(nb1);
        notebookInventory.addItems(nb2);

        Accessory acc1 = new Accessory("Pen", 10.0, "Black");
        Accessory acc2 = new Accessory("Eraser", 5.0, "White");
        accessoryInventory.addItems(acc1);
        accessoryInventory.addItems(acc2);

        notebookInventory.applyDiscount("Notebook A", 20);
        accessoryInventory.applyDiscount("Pen", 50);

        Product found1 = bookInventory.findItemsById("0001");
        if (found1 != null) {
            System.out.println("Found product: " + found1);
        }
        Product found2 = notebookInventory.findItemsById("2002");
        if (found2 != null) {
            System.out.println("Found product: " + found2);
        }

        System.out.println("\nAll Books:");
        bookInventory.displayAll();

        System.out.println("\nAll Notebooks:");
        notebookInventory.displayAll();

        System.out.println("\nAll Accessories:");
        accessoryInventory.displayAll();

        double total = calculateTotalPrice(bookInventory)
                + calculateTotalPrice(notebookInventory)
                + calculateTotalPrice(accessoryInventory);
        System.out.println("\nTotal Price of All Products: " + total);
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double sum = 0;
        for (Product p : inventory.getItems()) {
            sum += p.getPrice();
        }
        return sum;
    }
}
