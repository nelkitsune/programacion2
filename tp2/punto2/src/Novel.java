public class Novel extends Book {
    String genre;

    // Constructor
    public Novel(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }
}
