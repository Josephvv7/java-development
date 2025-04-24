package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String fileName = "employees.csv"; - This is what I had when I was working myself
        System.out.println("Enter name of the employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter name of the payroll file to process: ");
        String outputFileName = scanner.nextLine();

        try {
//        FileReader fileReader = new FileReader ("employees.csv");
//        BufferedReader bufferedReader = new BufferedReader (fileReader);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));
            String line;

            System.out.println("Employee Payroll");
            System.out.println("ID" + " | " + "Name" + " | " + "Gross Pay");

            while((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split("\\|"); // This is splitting each line using delimiter
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double hours = Double.parseDouble(parts[2]);
                    double rate = Double.parseDouble(parts[3]);

                    Employee employee = new Employee(id, name, hours, rate);
                    String outputLine = String.format("%d|%s|%.2f\n", employee.getEmployeeId(), employee.getEmployeeName(), employee.getGrossPay());
//                  System.out.printf("%d\t%s\t$%.2f%n", employee.getEmployeeId(), employee.getEmployeeName(), employee.getGrossPay()); // I looked up \t on Google
                    bufferedWriter.write(outputLine);
            }

                bufferedReader.close();
                bufferedWriter.close();
            } catch(Exception e){
                System.out.println("Something went wrong");
            }
        }
    }
