package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone jojoPhone = new CellPhone(0, " ", " ", " ", " ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        jojoPhone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        jojoPhone.setModel(model);

        System.out.println("What is the carrier ");
        String carrier = scanner.nextLine();
        jojoPhone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        jojoPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        jojoPhone.setOwner(owner);

        scanner.close();
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + jojoPhone.getSerialNumber());
        System.out.println("Model: " + jojoPhone.getModel());
        System.out.println("Carrier: " + jojoPhone.getCarrier());
        System.out.println("Phone Number: " + jojoPhone.getPhoneNumber());
        System.out.println("Owner: " + jojoPhone.getOwner());
    }
}
