import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class Assignment2_21 {
    
    private static final Map<String, String> countryCapitalMap = new HashMap<>();
    
    static {
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Australia", "Canberra");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Brazil", "Brasília");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the country name: ");
        String country = scanner.nextLine().trim();
        
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getCapital(String country) throws NoMatchFoundException {
        String capital = countryCapitalMap.get(country);
        
        if (capital == null) {
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
        
        return capital;
    }
}
