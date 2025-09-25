import java.util.ArrayList;
import java.util.List;

// Controller for Social Media Platform operations
public class SocialController {

    private List<String> posts;

    public SocialController() {
        posts = new ArrayList<>();
    }

    // Add a post by user
    public void addPost(String user, String content) {
        posts.add(user + ": " + content);
        System.out.println("Post added by " + user);
    }

    // Display all posts
    public void displayPosts() {
        System.out.println("All Posts:");
        for (String post : posts) {
            System.out.println("- " + post);
        }
    }
}
