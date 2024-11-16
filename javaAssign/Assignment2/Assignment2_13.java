class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
                this.doors = doors;
    }

    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Number of doors: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int doors, int batteryCapacity) {
        super(brand, doors); 
        this.batteryCapacity = batteryCapacity;
    }

    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

public class Assignment2_13 {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla", 4, 75);

        myElectricCar.displayInfo();
    }
}
