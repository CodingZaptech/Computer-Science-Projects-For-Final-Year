// Main entry point for Social Media Platform
public class Application {
    public static void main(String[] args) {
        SocialController social = new SocialController();

        // Sample posts
        social.addPost("Alice", "Hello world!");
        social.addPost("Bob", "Enjoying programming!");

        // Display all posts
        social.displayPosts();
    }
}
