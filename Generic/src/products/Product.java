 package products;

public abstract class Product {
    protected static int idCounter = 1;

    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        setId(generateId());
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

    public void setId(String id) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("Invalid input. id cannot be null or empty.");
        if (id.length() != 4)
            throw new IllegalArgumentException("Invalid input. id length must be 4.");

        this.id = id;
    }

    protected abstract String generateId();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Price: " + price;
    }
}
