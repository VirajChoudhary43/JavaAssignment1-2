class Employee {
    int emp_id;
    String emp_name;

    static int employeeCount = 0;

    Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;

        employeeCount++;
    }

    static void displayEmployeeCount() {
        System.out.println("Total number of employees: " + employeeCount);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
    }

    static {
        System.out.println("Static block: Employee class loaded.");
           }
}

public class Assignment2_16 {
    public static void main(String[] args) {
        Employee.displayEmployeeCount(); 
          Employee emp1 = new Employee(101, "John Doe");
        emp1.displayDetails();  
        Employee emp2 = new Employee(102, "Jane Smith");
        emp2.displayDetails(); 
        Employee emp3 = new Employee(103, "Alice Brown");
        emp3.displayDetails(); 
        Employee.displayEmployeeCount();  
    }
}
