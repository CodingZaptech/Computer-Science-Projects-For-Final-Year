import java.util.ArrayList;
import java.util.List;

// Controller to handle vaccination registrations
public class VaccinationController {

    private List<String> registrations;

    public VaccinationController() {
        registrations = new ArrayList<>();
    }

    // Register a person with name and age
    public void registerPerson(String name, int age) {
        registrations.add(name + " (Age: " + age + ")");
        System.out.println("Registered: " + name);
    }

    // Display all registered people
    public void displayRegistrations() {
        System.out.println("Vaccination Registrations:");
        for (String person : registrations) {
            System.out.println("- " + person);
        }
    }
}
