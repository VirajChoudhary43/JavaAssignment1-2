class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void greet() {
        System.out.println("Hello, " + name + "!");
        this.showMessage();  }

    void showMessage() {
        System.out.println("Welcome to the Java world!");
    }

    Person() {
        this("Unknown", 0);  
    }
}

public class Assignment2_15 {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        person1.displayDetails();  
        person1.greet();          

        System.out.println(); 
        Person person2 = new Person();
        person2.displayDetails();  
    }
}
