
class MyClass {
    String message;

    public MyClass() {
        message = "Hello, this is a default constructor!";
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

public class Assignment2_2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.displayMessage();
    }
}
