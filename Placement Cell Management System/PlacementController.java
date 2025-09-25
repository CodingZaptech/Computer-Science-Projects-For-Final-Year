import java.util.ArrayList;
import java.util.List;

// Controller to handle student placement operations
public class PlacementController {

    private List<String> students;

    public PlacementController() {
        students = new ArrayList<>();
    }

    // Register a student with name and department
    public void registerStudent(String name, String department) {
        students.add(name + " (" + department + ")");
        System.out.println("Student registered: " + name);
    }

    // Display all registered students
    public void displayStudents() {
        System.out.println("Registered Students:");
        for (String student : students) {
            System.out.println("- " + student);
        }
    }
}
