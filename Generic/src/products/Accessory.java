package products;

public class Accessory extends Product {
    private static int counter = 0;

    private String brand;
    private String color;
    private String type;

    public Accessory(String title, Double price, String brand, String color, String type) {
        super(title, price);
        setBrand(brand);
        setColor(color);
        setType(type);
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty())
            throw new IllegalArgumentException("Invalid input. brand cannot be null or empty.");
        this.brand = brand;
    }

    public void setColor(String color) {
        if (brand == null || brand.isEmpty())
            throw new IllegalArgumentException("Invalid input. color cannot be null or empty.");
        this.color = color;
    }

    public void setType(String type) {
        if (brand == null || brand.isEmpty())
            throw new IllegalArgumentException("Invalid input. type cannot be null or empty.");
        this.type = type;
    }

    @Override
    protected String generateId() {
        counter++;
        return String.format("3%03d", counter);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Brand: " + brand +
                ", Color: " + color +
                ", Type: " + type;
    }
}
