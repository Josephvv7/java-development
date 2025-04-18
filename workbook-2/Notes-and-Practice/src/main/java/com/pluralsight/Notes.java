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
public class Notes {
    public static void main(String[] args) {
        Person firstPerson = new Person("Joseph", 25);
        Person secondPerson = new Person("Makayla", 25);

        System.out.println(firstPerson.getName());
//        firstPerson.setName("JoJo");
//
//        System.out.println(firstPerson.getEnergy());
        System.out.println(firstPerson.getEnergy());

        firstPerson.work(5);

        System.out.println(firstPerson.getEnergy());

        firstPerson.eat();

        System.out.println(firstPerson.getEnergy());

        firstPerson.greet();




    }
}
