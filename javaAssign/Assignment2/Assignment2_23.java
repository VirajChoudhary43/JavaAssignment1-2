class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class Assignment2_23 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the temperature as a command-line argument.");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            
            if (temperature > 35) {
                throw new TooHot("The temperature is too hot! It's " + temperature + "°C.");
            }
            
            if (temperature < 5) {
                throw new TooCold("The temperature is too cold! It's " + temperature + "°C.");
            }
            
            System.out.println("The temperature is just right: " + temperature + "°C.");

        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number for the temperature.");
        }
    }
}
