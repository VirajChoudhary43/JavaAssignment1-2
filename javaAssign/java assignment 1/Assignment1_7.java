import java.util.Scanner;

public class Assignment1_7 {
    

    public static char getGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B'; 
        } else if (percentage >= 70) {
            return 'C'; 
        } else if (percentage >= 60) {
            return 'D'; 
        } else if (percentage >= 40) {
            return 'E'; 
        } else {
            return 'F'; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        char grade = getGrade(percentage);

        System.out.println("The grade for " + percentage + "% is: " + grade);

        scanner.close();
    }
}

    

