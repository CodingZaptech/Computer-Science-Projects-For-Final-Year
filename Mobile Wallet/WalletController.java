import java.util.HashMap;
import java.util.Map;

// Controller to handle basic wallet operations
public class WalletController {

    private Map<String, Integer> userBalances;

    public WalletController() {
        userBalances = new HashMap<>();
    }

    // Add funds to a user's wallet
    public void addFunds(String user, int amount) {
        userBalances.put(user, userBalances.getOrDefault(user, 0) + amount);
        System.out.println(amount + " added to " + user + "'s wallet.");
    }

    // Make payment from a user's wallet
    public void makePayment(String user, int amount) {
        int balance = userBalances.getOrDefault(user, 0);
        if (balance >= amount) {
            userBalances.put(user, balance - amount);
            System.out.println(user + " paid " + amount + ". Remaining balance: " + (balance - amount));
        } else {
            System.out.println(user + " has insufficient balance!");
        }
    }

    // Display user's balance
    public void displayBalance(String user) {
        System.out.println(user + "'s current balance: " + userBalances.getOrDefault(user, 0));
    }
}
