package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {

    private static Vehicle[] vehicles = new Vehicle[20];

    private static int numOfVehicles = 6;

    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 75000);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command:");

            int command = scanner.nextInt();

            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel(scanner);
                    break;
                case 3:
                    findVehiclesByPrice(scanner);
                    break;
                case 4:
                    findVehiclesByColor(scanner);
                    break;
                case 5:
                    addVehicle(scanner);
                    break;
                case 6:
                    System.out.println("GoodBye!");
                    return;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }

    public static void addVehicle(Scanner scanner) {

        if (numOfVehicles < 20) {

            System.out.println("Enter vehicle ID:");
            long id = scanner.nextLong();
            scanner.nextLine();

            System.out.println("Enter make and model: ");
            String makeModel = scanner.nextLine();

            System.out.println("Enter color: ");
            String color = scanner.nextLine();

            System.out.println("Enter odometer reading: ");
            int odometerReading = scanner.nextInt();

            System.out.println("Enter price: ");
            float price = scanner.nextFloat();

            Vehicle newVehicle = new Vehicle(id, makeModel, color, odometerReading, price);

            vehicles[numOfVehicles] = newVehicle;
            numOfVehicles++;

            System.out.println("Vehicle Added.");
        } else {
            System.out.println("Vehicle inventory is full.");
        }
    }

    public static void listAllVehicles() {
        System.out.println("Vehicle inventory:");

        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public static void findVehiclesByMakeModel(Scanner scanner) {
        System.out.println("Enter make and model: ");
        String makeModel = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println(vehicles[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found");
        }
    }

    public static void findVehiclesByPrice(Scanner scanner) {

        System.out.print("Enter minimum price: ");
        float minPrice = scanner.nextFloat();

        System.out.print("Enter maximum price: ");
        float maxPrice = scanner.nextFloat();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {

            if (vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {

                System.out.println(vehicles[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("No vehicles found");
    }

    public static void findVehiclesByColor(Scanner scanner) {
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {

                System.out.println(vehicles[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found");
        }
    }
}
