class Num {
    int number;

    Num(int num) {
        number = num;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    HexNum(int num) {
        super(num);
    }

    void shownum() {
        super.shownum();

        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Assignment2_11 {
    public static void main(String[] args) {
        HexNum hexNumber = new HexNum(255);

        hexNumber.shownum();
    }
}
