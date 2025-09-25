import java.util.ArrayList;
import java.util.List;

// Controller to handle restaurant seat bookings
public class RestaurantController {

    private int totalSeats;
    private List<String> bookedSeats;

    public RestaurantController(int totalSeats) {
        this.totalSeats = totalSeats;
        bookedSeats = new ArrayList<>();
    }

    // Book a seat for a customer
    public void bookSeat(String customerName) {
        if (bookedSeats.size() < totalSeats) {
            bookedSeats.add(customerName);
            System.out.println("Seat booked for: " + customerName);
        } else {
            System.out.println("No seats available for " + customerName);
        }
    }

    // Display number of available seats
    public void displayAvailableSeats() {
        System.out.println("Available seats: " + (totalSeats - bookedSeats.size()));
    }
}
