import java.util.ArrayList;
import java.util.List;

// Controller for Real Estate Management operations
public class RealEstateController {

    private List<String> properties;

    public RealEstateController() {
        properties = new ArrayList<>();
    }

    // Add property with type, location, and price
    public void addProperty(String type, String location, int price) {
        properties.add(type + " | " + location + " | $" + price);
        System.out.println("Property added: " + type + " in " + location);
    }

    // Display all available properties
    public void displayProperties() {
        System.out.println("Available Properties:");
        for (String property : properties) {
            System.out.println("- " + property);
        }
    }
}
