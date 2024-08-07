
public class test {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        
        // Find a customer by ID
        String customerName = customerService.getCustomerName("1");
        System.out.println("Customer found: " + customerName);
        
        // Find another customer by ID
        customerName = customerService.getCustomerName("2");
        System.out.println("Customer found: " + customerName);

        //  find a non-existing customer
        customerName = customerService.getCustomerName("4");
        System.out.println("Customer found: " + (customerName != null ? customerName : "No customer found"));
    }
}
