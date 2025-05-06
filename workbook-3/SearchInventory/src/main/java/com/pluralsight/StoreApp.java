package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();

        listAllProducts(inventory);

    }

    public static List<Product> getInventory(){
        List<Product> inventory = new ArrayList<>();
        // We put our code here
//        inventory.add(new Product(1, "Shirt", 5.99));
//        inventory.add(new Product(2, "Pants", 7.99));
//        inventory.add(new Product(3, "Jacket", 15.99));
//        inventory.add(new Product(4, "Dress", 19.99));
//        inventory.add(new Product(5, "Shoes", 30.99));

        //Bonus 1

        String line;

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
                while ((line = bufferedReader.readLine()) != null) {
                    String [] parts = line.split("\\|");
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    inventory.add(new Product(id, name, price));
                }

            } catch (Exception e) {
                System.out.println("Error 404");
            }


        return inventory;
    }
    public static void listAllProducts(List<Product> productList) {
        System.out.println("We carry the following inventory: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
