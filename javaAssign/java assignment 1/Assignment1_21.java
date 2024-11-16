
import java.util.Scanner;
public class Assignment1_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the conversion type:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binary = scanner.next();

            try {
                int decimal = binaryToDecimal(binary);
                System.out.println("Binary " + binary + " is Decimal " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary number!");
            }
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();

            if (decimal < 0) {
                System.out.println("Please enter a positive decimal number.");
            } else {
                String binary = decimalToBinary(decimal);
                System.out.println("Decimal " + decimal + " is Binary " + binary);
            }
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            } else if (bit != '0') {
                throw new NumberFormatException("Invalid binary character");
            }
            power++;
        }

        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            binary.insert(0, decimal % 2);  
            decimal = decimal / 2;  
        }

        return binary.toString();
    }
}


