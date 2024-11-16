import java.util.Scanner;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Assignment2_22 {

    public static double evaluateExpression(String expression) throws CustomArithmeticException {
        String[] tokens = expression.split(" ");
        
        if (tokens.length != 3) {
            throw new CustomArithmeticException("Invalid expression format. Expected: operand1 operator operand2");
        }
        
        double operand1 = 0;
        double operand2 = 0;
        String operator = tokens[1];

        try {
            operand1 = Double.parseDouble(tokens[0]);
            operand2 = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException e) {
            throw new CustomArithmeticException("Invalid number format. Please enter valid numbers.");
        }

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new CustomArithmeticException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                throw new CustomArithmeticException("Unsupported operator. Please use +, -, *, or /.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an arithmetic expression (e.g., 5 + 3): ");
        String inputExpression = scanner.nextLine();

        try {
            double result = evaluateExpression(inputExpression);
            System.out.println("The result is: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
