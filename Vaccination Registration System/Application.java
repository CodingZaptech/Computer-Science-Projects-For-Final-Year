// Main entry point for Vaccination Registration System
public class Application {
    public static void main(String[] args) {
        VaccinationController vaccination = new VaccinationController();

        // Sample registrations
        vaccination.registerPerson("Alice", 30);
        vaccination.registerPerson("Bob", 45);

        // Display registered people
        vaccination.displayRegistrations();
    }
}
