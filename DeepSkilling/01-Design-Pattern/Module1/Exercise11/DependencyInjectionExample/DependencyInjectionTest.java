// DependencyInjectionTest.java

public class DependencyInjectionTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     Customer Management System");
        System.out.println("    Dependency Injection Demo");
        System.out.println("==========================================\n");

        // Create Repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Repository into Service
        CustomerService service = new CustomerService(repository);

        System.out.println("Searching Customer...\n");

        service.getCustomer(101);

        System.out.println("\n------------------------------------------");
        System.out.println("Dependency Injection implemented successfully.");
        System.out.println("------------------------------------------");
    }
}