// MVCPatternTest.java

public class MVCPatternTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Student Management System");
        System.out.println("          MVC Pattern Demo");
        System.out.println("==========================================");

        // Create Model
        Student student = new Student("Jagadish", 101, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        System.out.println("\nInitial Student Details");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("Jagadish Tavva");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Details");
        controller.updateView();

        System.out.println("\n------------------------------------------");
        System.out.println("MVC Pattern implemented successfully.");
        System.out.println("------------------------------------------");
    }
}