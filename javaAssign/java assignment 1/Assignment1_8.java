
import java.util.Scanner;
public class Assignment1_8 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check divisibility: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor + ".");
            } else {
                System.out.println(number + " is not divisible by " + divisor + ".");
            }
        }

        scanner.close();
    }
}

