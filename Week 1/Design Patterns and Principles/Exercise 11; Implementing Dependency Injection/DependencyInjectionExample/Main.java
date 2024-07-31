import java.util.*;

interface CustomerRepository {
    void findCustomerById(int id);
}

class Customer {
    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }   

    public void display() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println();
    }
}

class CustomerRepositoryImpl implements CustomerRepository {
    List<Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "John"));
        customers.add(new Customer(2, "Jane"));
    }

    public void findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.id == id) {
                customer.display();
                return;
            }
        }
        System.out.println("Customer with id " + id + " does not exist");
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        customerRepository.findCustomerById(1);
        customerRepository.findCustomerById(3); 
    }
}


/*

Output: 

Customer ID: 1
Customer Name: John

Customer with id 3 does not exist

*/