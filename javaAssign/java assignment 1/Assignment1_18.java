
import java.util.Scanner;
public class Assignment1_18 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);

            while (number > 0) {
                number = number / 10; 
                count++;  
            }
        }

        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}

    

