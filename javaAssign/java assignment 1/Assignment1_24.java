 import java.util.Scanner;

public class Assignment1_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateSum(numbers);
        double average = calculateAverage(sum, n);

        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        scanner.close();
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int sum, int n) {
        if (n == 0) {
            return 0;  
        }
        return (double) sum / n;
    }
}
 
    

