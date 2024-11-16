class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); 
        this.breed = breed;
    }

    public void sound() {
        System.out.println(name + " barks.");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class Assignment2_5{
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo(); 
        animal.sound();       

        System.out.println();

        Dog dog = new Dog("Rex", 3, "Golden Retriever");
        dog.displayInfo();  
        dog.displayBreed(); 
                dog.sound();      
    }
}
