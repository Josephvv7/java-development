package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        /* int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("========================================");*/
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("========================================");*/
        //int sum = 0;
        //int i = 0;


//        while (i <= 10) {
//            sum += i;
//            i++;
//        }

//        do {
//            sum += i;
//            i++;
//        } while (i <= 10);
//
//        System.out.println(sum);

//        int x = 10;
//
//        if (x < 5 ) {
//
//            System.out.println("Low");
//
//        } else if (x < 15) {
//
//            System.out.println("Medium");
//
//        } else {
//
//            System.out.println("High");
//
//        }

//        String s1 = "hello world";
//
//        System.out.println(s1.toUpperCase());

//        String s1 = "hello";
//
//        String s2 = "HELLO";
//
//        System.out.println(s1.equals(s2));

//        for (int i = 0; i < 5; i++) {
//
//            if (i == 2) {
//
//                continue;
//
//            }
//
//            System.out.print(i + " ");
//        int x = 5;
//
//        int y = ++x;
//
//        System.out.println(x);
//        System.out.println(y);
//        String s1 = "Java";
//
//        String s2 = "Java";
//
//        String s3 = new String("Java");
//
//        System.out.println(s1 == s2);
//
//        System.out.println(s1 == s3);
//
//        System.out.println(s1.equals(s3));

//        int x = 9;
//
//        if (x++ < 10) {
//
//            System.out.println("Low");
//
//        } else {
//
//            System.out.println("High");

//        int x = 50;
//
//        if (x = 50) {
//
//            System.out.println("x is equal to 50");
//
//        } else {
//
//            System.out.println("x is not equal to 50");
//
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("potato.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            String numText;
//
//            for (int i = 1; i <= 10; i++) {
//                numText = String.format("Counting %d\n", i);
//
//                bufferedWriter.write(numText);
//            }
//
//            bufferedWriter.close();
//        } catch (Exception e) {
//            System.out.println("Error occurred");
//        }

        Person personRay = new Person();
        personRay.setFirstName("Joseph");
        personRay.setLastName("Valencia");
        personRay.setAge(25);

        Person person2 = new Person();

        Car newCar = new Car (0, "Yellow", "Potato Car");



    }
}

