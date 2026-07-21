// CustomerRepositoryImpl.java

// Concrete Repository Implementation
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        return "Customer ID : " + id +
               "\nCustomer Name : Jagadish Tavva";

    }
}