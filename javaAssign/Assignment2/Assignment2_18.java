interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();  
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete class method.");
    }
}

class MyClass extends ConcreteClass implements CombinedInterface {
    public void method1() {
        System.out.println("Interface1 - method1");
    }

    public void method2() {
        System.out.println("Interface1 - method2");
    }

    public void method3() {
        System.out.println("Interface2 - method3");
    }

    public void method4() {
        System.out.println("Interface2 - method4");
    }

    public void method5() {
        System.out.println("Interface3 - method5");
    }

    public void method6() {
        System.out.println("Interface3 - method6");
    }

    public void method7() {
        System.out.println("CombinedInterface - method7");
    }
}

public class Assignment2_18 {
    static void handleInterface1(Interface1 i1) {
        i1.method1();
        i1.method2();
    }

    static void handleInterface2(Interface2 i2) {
        i2.method3();
        i2.method4();
    }

    static void handleInterface3(Interface3 i3) {
        i3.method5();
        i3.method6();
    }

    static void handleCombinedInterface(CombinedInterface ci) {
        ci.method1();
        ci.method2();
        ci.method3();
        ci.method4();
        ci.method5();
        ci.method6();
        ci.method7();
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        handleInterface1(myObject);
        handleInterface2(myObject);
        handleInterface3(myObject);
        handleCombinedInterface(myObject);
    }
}
