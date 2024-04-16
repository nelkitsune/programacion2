public class Children extends Book {
    int recommendedAge;

    // Constructor
    public Children(String title, String author, int publicationYear, int recommendedAge) {
        super(title, author, publicationYear);
        this.recommendedAge = recommendedAge;
    }
}
