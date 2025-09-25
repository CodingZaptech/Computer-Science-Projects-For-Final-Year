import java.util.HashMap;
import java.util.Map;

// Controller to handle auction operations
public class AuctionController {

    private Map<String, Integer> highestBids;

    public AuctionController() {
        highestBids = new HashMap<>();
    }

    // Place a bid for an item
    public void placeBid(String item, String bidder, int amount) {
        if (!highestBids.containsKey(item) || amount > highestBids.get(item)) {
            highestBids.put(item, amount);
            System.out.println(bidder + " placed highest bid of $" + amount + " on " + item);
        } else {
            System.out.println(bidder + "'s bid of $" + amount + " was too low for " + item);
        }
    }

    // Display all highest bids
    public void displayHighestBids() {
        System.out.println("Highest Bids:");
        for (Map.Entry<String, Integer> entry : highestBids.entrySet()) {
            System.out.println("- " + entry.getKey() + ": $" + entry.getValue());
        }
    }
}
