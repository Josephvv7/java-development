package MkPayroll;

import java.util.Scanner;
import java.util.ArrayList;

public class Mkpayroll {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();

    // Initialize the 2 fixed employees
    employees.add(new Employee("Garrett Thompson"));
    employees.add(new Employee("Alison Worland"));

    // The 3rd employee with fixed address
    Address fixedAddress = new Address("110 Fiddler Road", "Stratford", "CN", "06614");
    employees.add(new Employee("Ilya Gofman", fixedAddress));

    System.out.println("Payroll Application");
    System.out.println("-------------------");
    System.out.println("Enter hours worked and pay rate for each employee:");

    // Input hours and pay rate for each employee
    for (Employee emp : employees) {
        System.out.printf("\nEmployee: %s", emp.getName());
        if (emp.getAddress() != null) {
            System.out.printf("\nAddress: %s", emp.getAddress().getFormattedAddress());
        }

        System.out.print("\nEnter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter pay rate per hour: ");
        double payRate = scanner.nextDouble();

        // Clear the newline character
        scanner.nextLine();

        emp.setHoursWorked(hoursWorked);
        emp.setPayRate(payRate);
    }

    // Display payroll results
    System.out.println("\nPayroll Results:");
    System.out.println("----------------");

    for (Employee emp : employees) {
        System.out.printf("\nEmployee: %s\n", emp.getName());
        if (emp.getAddress() != null) {
            System.out.println("Mailing Address:");
            System.out.println(emp.getAddress().getFormattedAddress());
        }
        System.out.printf("Hours Worked: %.2f\n", emp.getHoursWorked());
        System.out.printf("Regular Pay: $%.2f\n", emp.calculateRegularPay());

        if (emp.getHoursWorked() > 40) {
            System.out.printf("Overtime Pay: $%.2f\n", emp.calculateOvertimePay());
        }

        System.out.printf("Gross Pay: $%.2f\n", emp.calculateGrossPay());
        System.out.println("----------------");
    }

    scanner.close();
}
}

class Employee {
    private String name;
    private double hoursWorked;
    private double payRate;
    private Address address;

    // Constructor without address
    public Employee(String name) {
        this.name = name;
        this.address = null;
    }

    // Constructor with address
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Setters
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public Address getAddress() {
        return address;
    }

    // Calculation methods
    public double calculateRegularPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay() {
        if (hoursWorked > 40) {
            return (hoursWorked - 40) * payRate * 1.5; // 1.5x for overtime
        }
        return 0;
    }

    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getFormattedAddress() {
        return String.format("%s, %s, %s %s", street, city, state, zipCode);
}
}
