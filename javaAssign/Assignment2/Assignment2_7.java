class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Assignment2_7 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();   
        Animal myDog = new Dog();         
        Animal myCat = new Cat();         

        myAnimal.sound();  
        myDog.sound
             
        myCat.sound();     
    }
    
}

