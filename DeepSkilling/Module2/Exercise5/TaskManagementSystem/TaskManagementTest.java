// TaskManagementTest.java

public class TaskManagementTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Task Management System");
        System.out.println("==========================================");

        // Create Linked List
        TaskLinkedList taskList = new TaskLinkedList();

        // Add Tasks
        System.out.println("\nAdding Tasks...");

        taskList.addTask(new Task(101, "Design Database", "Pending"));
        taskList.addTask(new Task(102, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(103, "Create UI", "Pending"));
        taskList.addTask(new Task(104, "Testing", "Completed"));

        // Display Tasks
        taskList.displayTasks();

        // Search Task
        System.out.println("\nSearching Task...");
        taskList.searchTask(102);

        // Delete Task
        System.out.println("\nDeleting Task...");
        taskList.deleteTask(103);

        // Display Updated List
        taskList.displayTasks();

        System.out.println("\n==========================================");
        System.out.println("Task Management Completed Successfully.");
        System.out.println("==========================================");
    }
}