// Main entry point for Mobile Wallet
public class Application {
    public static void main(String[] args) {
        WalletController wallet = new WalletController();

        // Sample operations
        wallet.addFunds("Alice", 500);
        wallet.makePayment("Alice", 200);

        // Display balance
        wallet.displayBalance("Alice");
    }
}
