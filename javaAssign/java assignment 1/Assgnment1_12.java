 import java.util.Scanner;

public class Assgnment1_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter marks for student " + i + ":");

            System.out.print("Marks in Mathematics: ");
            int mathMarks = scanner.nextInt();
            
            System.out.print("Marks in Physics: ");
            int physicsMarks = scanner.nextInt();
            
            System.out.print("Marks in Chemistry: ");
            int chemistryMarks = scanner.nextInt();

            int totalMarks = mathMarks + physicsMarks + chemistryMarks;
            int mathAndPhysicsTotal = mathMarks + physicsMarks;

            if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200)
                || (mathAndPhysicsTotal >= 150)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is NOT eligible for admission.");
            }
        }

        scanner.close();
    }
}
 
    

