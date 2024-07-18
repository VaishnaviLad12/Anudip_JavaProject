EmployeeDemo.java
import java.util.HashSet;

class Employee {
    private int employeeID;
    private String employeeName;

    // Constructor
    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return employeeID == other.employeeID;
    }

    // Getter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // toString method
    @Override
    public String toString() {
        return "EmployeeID: " + employeeID + ", EmployeeName: " + employeeName;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create three employee instances with different employeeID
        Employee employee1 = new Employee(101, "John");
        Employee employee2 = new Employee(102, "Alice");
        Employee employee3 = new Employee(103, "Bob");

        // Create a HashSet to store employees
        HashSet<Employee> employeeSet = new HashSet<>();

        // Add all three employees to the HashSet
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        // Create another employee with the same employeeID as the first employee
        Employee employee4 = new Employee(101, "Jane");

        // Add employee4 to the HashSet
        boolean added = employeeSet.add(employee4);

        // Print if the employee is added or not
        if (added) {
            System.out.println("Employee with ID " + employee4.getEmployeeID() + " is added to the HashSet.");
        } else {
            System.out.println("Employee with ID " + employee4.getEmployeeID() + " is not added to the HashSet.");
        }

        // Print all the employees in the HashSet
        System.out.println("\nEmployees in the HashSet:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}

Output
Employees in the HashSet:
EmployeeID: 101, EmployeeName: Jane
EmployeeID: 102, EmployeeName: Alice
EmployeeID: 103, EmployeeName: Bob
EmployeeID: 101, EmployeeName: John


