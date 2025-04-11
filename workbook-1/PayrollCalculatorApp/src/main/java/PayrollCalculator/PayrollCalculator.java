package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter first and last name: ");
        String name = myScanner.nextLine();

        System.out.println("Hours worked are ");
        float hoursWorked = myScanner.nextFloat();

        System.out.println("Payrate in dollars is ");
        float payRate = myScanner.nextFloat();

        float grossPay = payRate * hoursWorked;
        System.out.println("This is how much you made " + grossPay);








    }
}
