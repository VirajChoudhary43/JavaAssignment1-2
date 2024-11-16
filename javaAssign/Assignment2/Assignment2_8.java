class Superclass {
    static void display() {
        System.out.println("Superclass display method");
    }
}

class Subclass extends Superclass {
    static void display() {
        System.out.println("Subclass display method");
    }
}

public class Assignment2_8 {
    public static void main(String[] args) {
        Superclass obj1 = new Superclass();
        Superclass obj2 = new Subclass();
        Subclass obj3 = new Subclass();

        obj1.display();  
        obj2.display(); 
        obj3.display(); 
    }
}

