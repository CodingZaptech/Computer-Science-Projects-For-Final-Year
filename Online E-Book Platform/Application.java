// Main entry point for Online eBook Platform
public class Application {
    public static void main(String[] args) {
        EbookController platform = new EbookController();

        // Add sample books
        platform.addBook("Java Programming");
        platform.addBook("Python for Beginners");

        // Display available books
        platform.displayBooks();
    }
}
