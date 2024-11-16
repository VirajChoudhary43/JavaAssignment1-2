
import java.util.Scanner;
public class Asssignment1_14 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                scanner.close();


}
        }
    }
}


