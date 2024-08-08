
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee employee) {
        if (size < capacity) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Search employee by ID
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Not found
    }

    // Traverse employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeId() +
                               ", Name: " + employees[i].getName() +
                               ", Position: " + employees[i].getPosition() +
                               ", Salary: " + employees[i].getSalary());
        }
    }

    // Delete employee by ID
    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[size - 1]; // Replace with last element
                employees[size - 1] = null; // Clear last element
                size--;
                return true; // Successfully deleted
            }
        }
        return false; // Not found
    }
}