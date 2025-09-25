import java.util.HashMap;
import java.util.Map;

// Controller to handle simple search engine operations
public class SearchController {

    private Map<String, String> documents;

    public SearchController() {
        documents = new HashMap<>();
    }

    // Add a document with ID and content
    public void addDocument(String id, String content) {
        documents.put(id, content);
        System.out.println("Document added: " + content);
    }

    // Search for documents containing a keyword
    public void search(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Map.Entry<String, String> entry : documents.entrySet()) {
            if (entry.getValue().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("- " + entry.getValue());
            }
        }
    }
}
