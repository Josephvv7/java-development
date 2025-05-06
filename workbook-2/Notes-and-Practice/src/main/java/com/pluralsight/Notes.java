package com.pluralsight;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

//import java.util.Scanner;


//        String stringNumber = "111";
//
//        System.out.println(stringNumber + 1);
//
//        int parsedNumber = Integer.parseInt(stringNumber);
//
//        int result = parsedNumber + 1;
//        System.out.println(result);

//        String userInput = "2002-10-17"; // YYYY-DD-MM
//
//        LocalDate birthDay = LocalDate.parse(userInput);
//        System.out.println(birthDay);
//
//        System.out.println("=====================================================");
//        System.out.println("Please enter the date that you want(d MMM yyyy):");
//        String dateInputFromUser = scanner.nextLine();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
//
//        LocalDate userDate = LocalDate.parse(dateInputFromUser, formatter);
//
//        System.out.println(userDate);
//        Scanner scanner = new Scanner(System.in);
//        Person firstPerson = new Person("Joseph", 25);
//        Person secondPerson = new Person("Makayla", 25);
//
//        System.out.println(firstPerson.getName());
//       firstPerson.setName("JoJo");
//
//        System.out.println(firstPerson.getEnergy());
//        System.out.println(firstPerson.getEnergy());
//
//        firstPerson.work(5);
//
//        System.out.println(firstPerson.getEnergy());
//
//        firstPerson.eat();
//
//        System.out.println(firstPerson.getEnergy());
//
//        firstPerson.greet();

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Notes {
    public static void main(String[] args) {
//    // How we were making a list
//        String [] names = new String[5];
//        names [0] = "Jojo";
//        names [1] = "Kayla";
//
// /*       for (int i =0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }*/
//
//    // Initializing "List<>" as an Array List
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//
//        List<Vehicle> cars = new ArrayList<>();
//        cars.add(new Vehicle("ford", 2020, "red"));
//
//        List<String> kids = new ArrayList<>();
//        kids.add("Natalie");
//        kids.add("Brittany");
//        kids.add("Zachery");
//
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println((i + 1) + " : " + kids.get(i));
//        }
//
//        System.out.println("=============================================");
//        kids.remove(1);
//
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println((i + 1) + " : " + kids.get(i));
//        }
//
//        System.out.println("=============================================");
//        kids.add("Britany");
//
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println((i + 1) + " : " + kids.get(i));
//        }
//
//        System.out.println("=============================================");
//        Collections.sort(kids, Collections.reverseOrder());
//
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println((i + 1) + " : " + kids.get(i));
//        }
//
//        System.out.println("=============================================");
//            .set = Updating a value i.e. "Zachery" to "Zach"
//        kids.set(2, "Zach");
//
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println((i + 1) + " : " + kids.get(i));
//        }
//
//        System.out.println("=============================================");
//        kids.clear();

        // Methods have signatures



    }
}

//        LocalDate today = LocalDate.now();
//        System.out.println("Today is: " + today);
//        System.out.println("Day of Week: " + today.getDayOfWeek());
//        System.out.println("Day of Month: " + today.getDayOfMonth());
//        System.out.println("Day of Year: " + today.getDayOfYear());
//        System.out.println("Month Name: " + today.getMonth());
//        System.out.println("Year: " + today.getYear());
//
//        System.out.println("================================");
//
//        LocalTime currentTime = LocalTime.now();
//        System.out.println("The current time is: " + currentTime);
//        System.out.println("Hour: " + currentTime.getHour());
//        System.out.println("Minute: " + currentTime.getMinute());
//        System.out.println("Second: " + currentTime.getSecond());
//        System.out.println("Nanosecond: " + currentTime.getNano());
//
//        System.out.println("=================================");
//
//        LocalDateTime rightNow = LocalDateTime.now();
//        System.out.println("Right now, it is: " + rightNow);
//
//        System.out.println("==================================");
//
//        String userInput = "10/17/2022";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate newDate = LocalDate.parse(userInput, dateTimeFormatter);
//        System.out.println(newDate);
//
//        System.out.println("====================================");
//
//        LocalDate currentDate = LocalDate.now();
//        System.out.println("Today is: " + currentDate);
//
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MM, dd, yyyy HH:mm:ss");
//        String formattedDateTime = currentDateTime.format(formatter);
//        System.out.println("Today is: " + formattedDateTime);
//
//        // Ways to get GMT
//            // Way 1.
//        Date date = new Date();
//        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM, d, yyyy HH:mm 'in GMT'");
//        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//        String getTime = requiredFormat.format(date);
//        System.out.println(getTime);
//            // Way 2.
//        ZonedDateTime newDate2 = ZonedDateTime.now(ZoneId.of("GMT"));
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.ENGLISH);
//        String formatted = newDate2.format(formatter2);
//        System.out.println(formatted + " in GMT");


//        try {
//            FileWriter writer = new FileWriter( "potato.txt");
//
//            writer.write("Hello Everyone\n");
//            writer.write("My name is Potato, and I am your instructor!\n");
//            writer.write("Welcome to the Java Bootcamp!");
//
//            FileInputStream fis = new FileInputStream("poem.txt");
//            Scanner scanner = new Scanner(fis);
//
//            String line;
//
//            while(scanner.hasNextLine()) {
//                line = scanner.nextLine();
//                System.out.println(line);
//                }
//            scanner.close();
//
//            writer.close();
//
//        } catch (Exception e) {
//            System.out.println("Something went wrong!");
//    }
//}
