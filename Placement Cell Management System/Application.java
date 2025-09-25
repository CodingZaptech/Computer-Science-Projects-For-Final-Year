// Main entry point for Placement Cell Management System
public class Application {
    public static void main(String[] args) {
        PlacementController placement = new PlacementController();

        // Sample student registrations
        placement.registerStudent("Alice", "Computer Science");
        placement.registerStudent("Bob", "Electrical Engineering");

        // Display all registered students
        placement.displayStudents();
    }
}
