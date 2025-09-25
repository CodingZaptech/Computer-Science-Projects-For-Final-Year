import java.util.ArrayList;
import java.util.List;

// Controller to handle hospital operations
public class HospitalController {

    private List<String> patients;

    public HospitalController() {
        // Initialize with some sample patients
        patients = new ArrayList<>();
        patients.add("John Doe");
        patients.add("Alice Smith");
        patients.add("Bob Johnson");
    }

    // Display all registered patients
    public void displayPatients() {
        System.out.println("Registered Patients:");
        for (String patient : patients) {
            System.out.println("- " + patient);
        }
    }
}
