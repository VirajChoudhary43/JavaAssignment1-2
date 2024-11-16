import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class Assignment2_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate's age: ");
        int age = 0;
        
        try {
            age = Integer.parseInt(scanner.nextLine());

            if (age > 45) {
                throw new TooOlder("Candidate is too old! Age: " + age);
            }

            if (age < 20) {
                throw new TooYounger("Candidate is too young! Age: " + age);
            }

            System.out.println("Eligible: " + name);

        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric age.");
        } finally {
            scanner.close();
        }
    }
}
