// Main entry point for Railway Reservation System
public class Application {
    public static void main(String[] args) {
        RailwayController railway = new RailwayController(5); // 5 seats

        // Sample bookings
        railway.bookTicket("Alice");
        railway.bookTicket("Bob");

        // Display available seats
        railway.displayAvailableSeats();
    }
}
