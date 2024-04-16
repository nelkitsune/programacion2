public class Book implements Lendable {
    String title;
    String author;
    int publicationYear;
    boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }
    public void lend() {
        this.borrowed = true;
    }

    public void returnBook() {
        this.borrowed = false;
    }
}
