
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book novel = new Novel("Don Quijote", "Miguel de Cervantes", 1605, "Aventura");
        Book university = new University("Cálculo", "James Stewart", 1991, "Matemáticas");
        Book children = new Children("Harry Potter", "J.K. Rowling", 1997, 9);

        library.addBook(novel);
        library.addBook(university);
        library.addBook(children);

        library.listAvailableBooks();

        library.lendBook(novel);

        library.returnBook(novel);
    }
}
