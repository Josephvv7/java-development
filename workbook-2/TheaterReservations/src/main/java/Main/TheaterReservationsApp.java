package Main;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Inputs for name, date attending, and amount of tickets
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        //Substring for first and last name
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);


        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like?: ");
        int ticketCount = scanner.nextInt();

        //Processing the inputs name, date, and ticket amount.

//        fullName = fullName;
//        System.out.println(fullName);

        System.out.println("==========================================================");

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate userDate = LocalDate.parse(date, inputFormatter);
        System.out.println(userDate);

        System.out.println("==========================================================");

        String ticketText = ticketCount == 1 ? "ticket" : "tickets";
        String confirmation = String.format("%d %s reserved for %s under %s, %s.", ticketCount, ticketText, userDate, lastName, firstName);
        System.out.println(confirmation);















    }
}
