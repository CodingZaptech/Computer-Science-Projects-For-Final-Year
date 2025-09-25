// Main entry point for Search Engine Development
public class Application {
    public static void main(String[] args) {
        SearchController searchEngine = new SearchController();

        // Sample data indexing
        searchEngine.addDocument("1", "Java Programming Basics");
        searchEngine.addDocument("2", "Introduction to Data Structures");
        searchEngine.addDocument("3", "Machine Learning Overview");

        // Search query
        searchEngine.search("Java");
    }
}
