// Main entry point for Restaurant Seat Booking
public class Application {
    public static void main(String[] args) {
        RestaurantController restaurant = new RestaurantController(10); // 10 seats

        // Sample bookings
        restaurant.bookSeat("Alice");
        restaurant.bookSeat("Bob");

        // Display available seats
        restaurant.displayAvailableSeats();
    }
}
