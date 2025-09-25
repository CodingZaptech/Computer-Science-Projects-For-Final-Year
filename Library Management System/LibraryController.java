import java.util.ArrayList;
import java.util.List;

// Controller to handle library operations
public class LibraryController {

    private List<String> books;

    public LibraryController() {
        // Initialize with some sample books
        books = new ArrayList<>();
        books.add("Introduction to Java");
        books.add("Data Structures in C++");
        books.add("Database Systems");
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Available Books in Library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
