package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    private static int idCounter = 1;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setHardCover(isHardCover);
        setId(generateId());
    }

    // Setters
    public void setPageCount(int pageCount) {
        if (pageCount < 0)
            throw new IllegalArgumentException("Invalid input. page count must be positive number.");
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }

    // Getters
    public int getPageCount() {
        return pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return "Notebook [ID=" + getId() +
                ", Title=" + getTitle() +
                ", Price=" + getPrice() +
                ", Page Count=" + pageCount +
                ", Hardcover=" + (isHardCover ? "Yes" : "No") + "]";
    }

    @Override
    protected String generateId() {
        return String.format("2%03d", idCounter++);
    }
}