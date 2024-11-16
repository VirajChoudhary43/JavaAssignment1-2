class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Assignment2_19 {

    public static void methodWithThrows() throws CustomException {
        System.out.println("Inside methodWithThrows.");
        throw new CustomException("This is a custom exception thrown by the method.");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Start of try block.");
            
            methodWithThrows();
            
            System.out.println("End of try block.");
            
        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        
        try {
            System.out.println("Throwing an exception manually.");
            throw new ArithmeticException("Arithmetic exception thrown manually.");
        } catch (ArithmeticException e) {
            System.out.println("Caught the manually thrown exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block for manual throw executed.");
        }
        
        try {
            System.out.println("Calling methodWithThrows.");
            methodWithThrows();
        } catch (CustomException e) {
            System.out.println("Caught exception from methodWithThrows: " + e.getMessage());
        }
    }
}
