// Main entry point for Real Estate Management System
public class Application {
    public static void main(String[] args) {
        RealEstateController controller = new RealEstateController();

        // Sample property addition
        controller.addProperty("Apartment", "Downtown", 150000);
        controller.addProperty("Villa", "Suburb", 300000);

        // Display all properties
        controller.displayProperties();
    }
}
