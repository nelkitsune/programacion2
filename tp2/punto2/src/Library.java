import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Métodos
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void listAvailableBooks() {
        for (Book book : this.books) {
            if (!book.borrowed) {
                System.out.println("Libro disponible: " + book.title);
            }
        }
    }

    public void lendBook(Book book) {
        book.lend();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}