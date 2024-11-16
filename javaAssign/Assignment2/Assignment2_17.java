import java.util.Scanner;

public class Assignment2_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String input = scanner.nextLine();
        
       int sum = 0;
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {
            int num = Integer.parseInt(input.substring(i, i + 2));
            
            sum += num;
            
            result.append(num).append("+");
        }
        
        result.delete(result.length() - 1, result.length());
        
        System.out.println(result + "=" + sum);
        
scanner.close();
    }
}
