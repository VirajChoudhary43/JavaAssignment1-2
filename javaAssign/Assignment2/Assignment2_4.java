
class MyClass {
    String message;
    int number;

    public MyClass() {
        message = "Default Message";
        number = 0;
    }

    public MyClass(String msg) {
        message = msg;
        number = 0;  
    }

    public MyClass(String msg, int num) {
        message = msg;
        number = num;
    }

    public void display() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }
}

public class Assignment2_4{
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass("Hello, Constructor Overloading!");
        MyClass obj3 = new MyClass("Overloaded Constructor with Two Arguments", 100);

        obj1.display();
        System.out.println();
        obj2.display();
        System.out.println();
        obj3.display();
    }
}

