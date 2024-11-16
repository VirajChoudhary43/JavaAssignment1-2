 import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double median = findMedian(numbers);

        System.out.println("The median is: " + median);

        scanner.close();
    }

    public static double findMedian(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length;

        if (n % 2 != 0) {
            return numbers[n / 2];
        } else {
            return (numbers[(n - 1) / 2] + numbers[n / 2]) / 2.0;
        }
    }
}
 
    

