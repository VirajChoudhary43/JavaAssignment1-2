class Distance {
    double distanceInMiles;

    Distance(double distance) {
        distanceInMiles = distance;
    }

    void travelTime() {
        double speedInMph = 60; 
        double timeInHours = distanceInMiles / speedInMph; 
        System.out.println("Time to travel " + distanceInMiles + " miles at " + speedInMph + " mph: " + timeInHours + " hours.");
    }
}

class DistanceMKS extends Distance {

    DistanceMKS(double distanceInMiles) {
        super(distanceInMiles);
    }

    void travelTime() {
        double distanceInKilometers = distanceInMiles * 1.60934; 
        double speedInKms = 100; 
        double timeInSeconds = distanceInKilometers / speedInKms; 

        System.out.println("Time to travel " + distanceInKilometers + " kilometers at " + speedInKms + " km/s: " + timeInSeconds + " seconds.");
    }
}

public class Assignment2_12{
    public static void main(String[] args) {
        Distance distanceInMiles = new Distance(120); 
        distanceInMiles.travelTime(); 

        DistanceMKS distanceInKilometers = new DistanceMKS(120); 
        distanceInKilometers.travelTime(); 
    }
}
