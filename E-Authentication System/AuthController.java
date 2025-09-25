import java.util.HashMap;
import java.util.Map;

// Controller to handle authentication logic
public class AuthController {

    private Map<String, String> users;

    public AuthController() {
        // Initialize an empty user database
        users = new HashMap<>();
    }

    // Register a new user with username and password
    public void register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists: " + username);
        } else {
            users.put(username, password);
            System.out.println("User registered successfully: " + username);
        }
    }

    // Authenticate a user login
    public void login(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful for user: " + username);
        } else {
            System.out.println("Login failed for user: " + username);
        }
    }
}
