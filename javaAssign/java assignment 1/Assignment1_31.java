    class Person {

        String name;
        int age;
    
        public Person() {
            name = "Unknown";
            age = 0;
        }
    
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    
    public class Assignment1_31 {
        public static void main(String[] args) {
            Person person1 = new Person();
    
            person1.display();
        }
    }
    

