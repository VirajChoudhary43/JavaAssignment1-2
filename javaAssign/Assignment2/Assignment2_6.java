class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }
}

public class Assignment2_6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);          
                int sum2 = calc.add(10, 20, 30);       
        double sum3 = calc.add(10.5, 20.5);    
        double sum4 = calc.add(10, 20.5);      

        System.out.println("Sum of 10 and 20: " + sum1);
        System.out.println("Sum of 10, 20, and 30: " + sum2);
        System.out.println("Sum of 10.5 and 20.5: " + sum3);
        System.out.println("Sum of 10 and 20.5: " + sum4);
    }
}

