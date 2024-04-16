public class University extends Book {
    String subject;

    public University(String title, String author, int publicationYear, String subject) {
        super(title, author, publicationYear);
        this.subject = subject;
    }
}
