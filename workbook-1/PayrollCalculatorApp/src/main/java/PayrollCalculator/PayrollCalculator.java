package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first and last name: ");
        String name = input.nextLine();
        System.out.println("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.println("Enter pay rate: ");
        double rate = input.nextDouble();

        // Show overtime pay and show gross pay with or without overtime included.
        double grossPay = hours * rate;
        double overTime = (1.5 * rate);

        if (hours > 40) {
            System.out.println("Overtime pay: $" + String.format("%.2f", overTime));
            grossPay = (40 * rate) + ((hours - 40) * overTime);
            System.out.println("Pay with overtime: $" + String.format("%.2f", grossPay));
        } else {
            System.out.println("Pay: " + grossPay);
        }
       System.out.println("----------------------------------------------");

        // Display employee's name and gross pay
        System.out.println("Name: " + name);
        System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));


    }
}
