
public class Assignment2_20 {
    public static void main(String[] args) {
        
        try {
            int size = -5;
            int[] arr = new int[size];  
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
        
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
