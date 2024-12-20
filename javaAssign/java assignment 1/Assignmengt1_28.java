
import java.util.Scanner;
public class Assignmengt1_28 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();  
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = sumOfOddNumbers(numbers);

        System.out.println("The sum of all odd numbers in the array is: " + sum);

        scanner.close();
    }

    public static int sumOfOddNumbers(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }
}


