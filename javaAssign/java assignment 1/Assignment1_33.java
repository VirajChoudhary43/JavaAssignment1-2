import java.util.Scanner;

public class Assignment1_33 {
    
class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.10;
    }
}

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales value: ");
        double salesInput = scanner.nextDouble();

        if (salesInput < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(salesInput);

            double commission = commissionObj.commission();
            System.out.println("The commission for sales of " + salesInput + " is: " + commission);
        }

        scanner.close();
    }
}

}
