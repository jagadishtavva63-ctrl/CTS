// TaskLinkedList.java

public class TaskLinkedList {

    private TaskNode head;

    // Add Task
    public void addTask(Task task) {

        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
            return;
        }

        TaskNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int taskId) {

        TaskNode current = head;

        while (current != null) {

            if (current.task.getTaskId() == taskId) {

                System.out.println("\nTask Found");
                System.out.println("----------------------------");
                System.out.println(current.task);
                return;
            }

            current = current.next;
        }

        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    public void displayTasks() {

        TaskNode current = head;

        System.out.println("\nTask List");
        System.out.println("----------------------------");

        if (head == null) {

            System.out.println("No Tasks Available.");
            return;
        }

        while (current != null) {

            System.out.println(current.task);
            System.out.println("----------------------------");

            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {

            System.out.println("Task List is Empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {

            head = head.next;

            System.out.println("Task Deleted Successfully.");
            return;
        }

        TaskNode current = head;

        while (current.next != null &&
               current.next.task.getTaskId() != taskId) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println("Task Not Found.");
            return;
        }

        current.next = current.next.next;

        System.out.println("Task Deleted Successfully.");
    }
}