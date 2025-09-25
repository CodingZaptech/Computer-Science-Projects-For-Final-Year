// Main entry point for To-Do List
public class Application {
    public static void main(String[] args) {
        TodoController todo = new TodoController();

        // Sample tasks
        todo.addTask("Buy groceries");
        todo.addTask("Finish project report");

        // Display all tasks
        todo.displayTasks();
    }
}
