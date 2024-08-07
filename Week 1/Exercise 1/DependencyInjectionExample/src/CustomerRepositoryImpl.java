// CustomerRepositoryImpl.java
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    // Simulating a database with a HashMap
    private Map<String, String> customerDatabase;

    public CustomerRepositoryImpl() {
        customerDatabase = new HashMap<>();
        customerDatabase.put("1", "Mimi");
        customerDatabase.put("2", "Ram");
        customerDatabase.put("3", "Shyam");
    }

    @Override
    public String findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}