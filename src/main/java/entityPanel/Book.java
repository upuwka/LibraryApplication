package entityPanel;
public class Book {

    private String author;
    private String title;
    private int yearOfPublish;
    private String genre;
    private int quantity;

    public Book(String author, String title, int yearOfPublish, String genre, int i) {
        this.author = author;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.genre = genre;
        this.quantity = i;
    }

    public Book(){

    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public String getGenre() {
        return genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }
}
