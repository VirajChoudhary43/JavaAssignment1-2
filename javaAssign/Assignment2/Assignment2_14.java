import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    
    Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }
    
    void displayGrossSalary() {
        double hra = 0.10 * basic_salary; 
        double da = 0.05 * basic_salary;  
        double ta = 0.08 * basic_salary;  

        double gross_salary = basic_salary + hra + da + ta;

        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Assignment2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();
        
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();
        
        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        employee.displayGrossSalary(); // Display gross salary and other details
        
        scanner.close();
    }
}
