// Main entry point for E Authentication System
public class Application {
    public static void main(String[] args) {
        AuthController auth = new AuthController();

        // Sample registration
        auth.register("user1", "password123");

        // Sample login attempts
        auth.login("user1", "password123"); // Successful
        auth.login("user1", "wrongpassword"); // Failed
    }
}
