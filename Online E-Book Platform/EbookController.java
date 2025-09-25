import java.util.ArrayList;
import java.util.List;

// Controller to handle eBook platform operations
public class EbookController {

    private List<String> books;

    public EbookController() {
        books = new ArrayList<>();
    }

    // Add a book to the platform
    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("Book added: " + bookName);
    }

    // Display all available books
    public void displayBooks() {
        System.out.println("Available eBooks:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
