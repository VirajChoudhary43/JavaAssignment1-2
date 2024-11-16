class Vehicle {
    protected String regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, double speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}
class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, double speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    
    public void showData() {
        super.showData();
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Manufacturer: " + manufacturerName);
    }
}

public class Assignmengt2_10 {
    public static void main(String[] args) {
        Bus bus = new Bus("MH12AB1234", 60.0, "Yellow", "City Transport", 101);
        Car car = new Car("MH12CD5678", 120.0, "Red", "John Doe", "Toyota");

        System.out.println("\nBus Details:");
        bus.showData();

        System.out.println("\nCar Details:");
        car.showData();
    }
}

