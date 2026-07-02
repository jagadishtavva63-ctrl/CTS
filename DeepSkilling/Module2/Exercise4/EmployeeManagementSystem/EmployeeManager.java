// EmployeeManager.java

public class EmployeeManager {

    private Employee[] employees;
    private int count;

    // Constructor
    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");

        }
    }

    // Search Employee
    public void searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {

                System.out.println("\nEmployee Found");
                System.out.println("----------------------------");
                System.out.println(employees[i]);
                return;

            }

        }

        System.out.println("Employee Not Found.");

    }

    // Traverse Employees
    public void displayEmployees() {

        System.out.println("\nEmployee Records");
        System.out.println("----------------------------");

        if (count == 0) {

            System.out.println("No Employees Available.");
            return;

        }

        for (int i = 0; i < count; i++) {

            System.out.println(employees[i]);
            System.out.println("----------------------------");

        }

    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {

                for (int j = i; j < count - 1; j++) {

                    employees[j] = employees[j + 1];

                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;

            }

        }

        System.out.println("Employee Not Found.");

    }

}