package products;

public class Notebook extends Product {
    private static int counter = 0;

    private int pages;
    private String size;
    private String type;

    public Notebook(String title, Double price, int pages, String size, String type) {
        super(title, price);
        setPages(pages);
        setSize(size);
        setType(type);
    }

    // Getters
    public int getPages() {
        return pages;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setPages(int pages) {
        if (pages < 0)
            throw new IllegalArgumentException("Invalid input. pages must be positive number.");
        this.pages = pages;
    }

    public void setSize(String size) {
        if (size == null || size.isEmpty())
            throw new IllegalArgumentException("Invalid input. size cannot be null or empty.");
        this.size = size;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty())
            throw new IllegalArgumentException("Invalid input. type cannot be null or empty.");
        this.type = type;
    }

    // Generate ID starting with "2" and then sequential number like "2001", "2002", etc.
    @Override
    protected String generateId() {
        counter++;
        return String.format("2%03d", counter);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Pages: " + pages +
                ", Size: " + size +
                ", Type: " + type;
    }
}
