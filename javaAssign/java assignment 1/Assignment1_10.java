import java.util.Scanner;

public class Assignment1_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        int first = 0, second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }

        scanner.close();
    }
}
