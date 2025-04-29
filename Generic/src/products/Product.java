 package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    // Setters
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException("Invalid input. title cannot be null or empty.");
        this.title = title;
    }

    public void setPrice(Double price) {
        if (price < 0)
            throw new IllegalArgumentException("Invalid input. price must be positive number.");
        this.price = price;
    }

    protected abstract String generateId();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Price: " + price;
    }
}
