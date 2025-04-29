package products;

public class Book extends Product {
    private static int counter = 0;

    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    // Getters and setters...
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty())
            throw new IllegalArgumentException("Invalid input. author cannot be null or empty.");
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        if (publication == null || publication.isEmpty())
            throw new IllegalArgumentException("Invalid input. publication cannot be null or empty.");
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty())
            throw new IllegalArgumentException("Invalid input. genre cannot be null or empty.");
        this.genre = genre;
    }

    // Generate sequential ID starting with "1"
    @Override
    protected String generateId() {
        counter++;
        return String.format("1%03d", counter);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Author: " + author +
                ", Publication: " + publication +
                ", Genre: " + genre;
    }
}