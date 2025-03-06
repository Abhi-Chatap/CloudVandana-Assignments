import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Main Class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating a List to store Employees
        List<Employee> employees = new ArrayList<>();

        // Adding Employees to the List
        employees.add(new Employee(101, "Abhijeet Chatap", 50000));
        employees.add(new Employee(102, "Rahul Sharma", 60000));
        employees.add(new Employee(103, "Vishal Neharkar", 55000));

        // Displaying Employee Details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
