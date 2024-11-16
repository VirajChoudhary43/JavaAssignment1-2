import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }
}

class Box extends ThreeDObject {
    double length, width, height;

   public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }

    

class Cylinder extends ThreeDObject {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}

public class Assignment2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, width, and height of the Box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.print("Enter the side of the Cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.print("Enter radius and height of the Cylinder: ");
        double radius = sc.nextDouble();
        height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.print("Enter radius and height of the Cone: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        
        System.out.println("Cone Volume: " + cone.volume());
        sc.close();

    }
}
}




