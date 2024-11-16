    class Person {

        String name;
        int age;
    
        public Person(String name, int age) {
            this.name = name;             this.age = age;
        }
    
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    
    public class Assignment1_32 {
        public static void main(String[] args) {
            Person person1 = new Person("Alice", 25);
            Person person2 = new Person("Bob", 30);
    
            person1.display();
            person2.display();
        }
    }
    

