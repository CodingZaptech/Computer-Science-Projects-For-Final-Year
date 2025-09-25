import java.util.ArrayList;
import java.util.List;

// Controller for Railway Reservation operations
public class RailwayController {

    private int totalSeats;
    private List<String> bookedSeats;

    public RailwayController(int totalSeats) {
        this.totalSeats = totalSeats;
        bookedSeats = new ArrayList<>();
    }

    // Book a ticket for a passenger
    public void bookTicket(String passengerName) {
        if (bookedSeats.size() < totalSeats) {
            bookedSeats.add(passengerName);
            System.out.println("Ticket booked for: " + passengerName);
        } else {
            System.out.println("No seats available for " + passengerName);
        }
    }

    // Display number of available seats
    public void displayAvailableSeats() {
        System.out.println("Available seats: " + (totalSeats - bookedSeats.size()));
    }
}
