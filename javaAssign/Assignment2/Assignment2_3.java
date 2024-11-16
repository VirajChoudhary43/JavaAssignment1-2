
class MyClass {
    String message;
    int number;

    public MyClass(String msg, int num) {
        message = msg;  
        number = num;   
    }

    public void display() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }
}

public class Assignment2_3 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Hello, this is a parameterized constructor!", 42);
        MyClass obj2 = new MyClass("Another message!", 100);

        obj1.display();
        obj2.display();
    }
}


