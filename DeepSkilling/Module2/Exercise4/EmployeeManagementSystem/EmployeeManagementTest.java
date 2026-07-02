// EmployeeManagementTest.java

public class EmployeeManagementTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Employee Management System");
        System.out.println("==========================================");

        // Create Employee Manager
        EmployeeManager manager = new EmployeeManager(5);

        // Add Employees
        System.out.println("\nAdding Employees...");
        manager.addEmployee(new Employee(101, "Rahul", "Manager", 65000));
        manager.addEmployee(new Employee(102, "Anjali", "Developer", 55000));
        manager.addEmployee(new Employee(103, "Kiran", "Tester", 45000));
        manager.addEmployee(new Employee(104, "Priya", "HR", 50000));

        // Display Employees
        manager.displayEmployees();

        // Search Employee
        System.out.println("\nSearching Employee...");
        manager.searchEmployee(102);

        // Delete Employee
        System.out.println("\nDeleting Employee...");
        manager.deleteEmployee(103);

        // Display Employees Again
        manager.displayEmployees();

        System.out.println("\n==========================================");
        System.out.println("Employee Management Completed Successfully.");
        System.out.println("==========================================");
    }
}