package SandwichShop;

import javax.swing.*;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double basePrice = 0;
        double small = 5.45;
        double large = 8.95;
        double total = 0;

        // User selects sandwich size and lets them know the price of each sandwich
        System.out.println(" A small sandwich is $5.45 and a large is $8.95 ");
        System.out.println(" Select sandwich size (1 for regular, 2 for large) ");
        int sandwichSize = input.nextInt();

        if (sandwichSize == 1) {
            basePrice = 5.45;
            System.out.printf(String.format("$%.2f", small));
        } else if (sandwichSize == 2) {
            basePrice = 8.95;
            System.out.printf(String.format("$%.2f", large));

        }
        // User Inputs their age to determine if they get a discount
        System.out.println(" What is your age ");
        int age = input.nextInt();

        if (age <= 17) {
            total = basePrice - (basePrice * 0.1);
            System.out.printf("Total is: " + String.format("$%.2f", total));
        } else if (age >= 65) {
                total = basePrice - (basePrice * 0.65);
                System.out.printf("Total is: " + String.format("$%.2f", total));
        }
            }
        }