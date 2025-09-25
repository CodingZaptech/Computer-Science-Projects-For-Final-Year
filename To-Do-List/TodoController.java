import java.util.ArrayList;
import java.util.List;

// Controller to handle To-Do List operations
public class TodoController {

    private List<String> tasks;

    public TodoController() {
        tasks = new ArrayList<>();
    }

    // Add a new task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Display all tasks
    public void displayTasks() {
        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
