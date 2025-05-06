package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // Get current date and time in system default time zone
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime localZone = now.atZone(ZoneId.systemDefault());
        ZonedDateTime gmtZone = localZone.withZoneSameInstant(ZoneOffset.UTC);

        // Format 1:
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy\n");
        System.out.println("Format 1:\n" + now.format(format1));

        // Format 2:
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd\n");
        System.out.println("Format 2:\n" + now.format(format2));

        // Format 3:
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy\n");
        System.out.println("Format 3:\n" + now.format(format3));

        // Format 4: GMT Time
        DateTimeFormatter gmtFormat = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm\n");
        System.out.println("GMT Time: " + gmtZone.format(gmtFormat));

        // CHALLENGE: Local time zone
        DateTimeFormatter challenge = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy\n");
        System.out.println("Local Time: " + now.format(challenge));
    }
}