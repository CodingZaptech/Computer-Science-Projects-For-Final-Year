// Main entry point for Online Auction System
public class Application {
    public static void main(String[] args) {
        AuctionController auction = new AuctionController();

        // Sample bids
        auction.placeBid("Laptop", "Alice", 500);
        auction.placeBid("Laptop", "Bob", 700);

        // Display highest bid
        auction.displayHighestBids();
    }
}
