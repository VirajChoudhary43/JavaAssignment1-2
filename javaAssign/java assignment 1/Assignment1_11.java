
import java.util.Scanner;
public class Assignment1_11 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        
        // Close the scanner object
        scanner.close();
    }
}


