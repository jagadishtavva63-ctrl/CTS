// CustomerService.java

// Service Class
public class CustomerService {

    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Find Customer
    public void getCustomer(int id) {

        String customer = customerRepository.findCustomerById(id);
        System.out.println(customer);

    }
}