class ValidationError extends Exception {
    public ValidationError(String message) {
        super(message); 
    }
}

public class Assignment2_25 {
    
    public static void validateCredentials(String username, String password, String correctPassword) throws ValidationError {
        if (username.length() < 6) {
            throw new ValidationError("Username must be at least 6 characters.");
        }
        
        if (!password.equals(correctPassword)) {
            throw new ValidationError("Password does not match.");
        }
        
        System.out.println("Login successful!");
    }
    
    public static void main(String[] args) {
        String correctPassword = "SecurePassword123"; 
        
        String username = "user";  
        String password = "WrongPassword"; 

        try {
            validateCredentials(username, password, correctPassword);
        } catch (ValidationError e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
