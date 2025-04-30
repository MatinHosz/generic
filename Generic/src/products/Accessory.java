package products;

public class Accessory extends Product {
    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
        setId(generateId());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty())
            throw new IllegalArgumentException("Invalid input. color cannot be null or empty.");
        this.color = color;
    }

    @Override
    protected String generateId() {
        return String.format("3%03d", idCounter++);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Color: " + color;
    }
}
