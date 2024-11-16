
import java.util.Scanner;
public class Assignment1_15 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to generate its multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (up to which you want the table): ");
        int range = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + " up to " + range + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}


