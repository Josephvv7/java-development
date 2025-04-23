package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStoriesApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Available bedtime stories:");
        System.out.println("- goldilocks.txt");
        System.out.println("- hansel_and_gretel.txt");
        System.out.println("- mary_had_a_little_lamb.txt");
        System.out.println("\nEnter the name of the story you want to read: ");

        String fileName = userInput.nextLine().trim();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);

            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            System.out.println("\n This is the End of the Story!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + fileName + " was not found.");
            System.out.println("Enter correct file name please");


        } userInput.close();


    }
}
