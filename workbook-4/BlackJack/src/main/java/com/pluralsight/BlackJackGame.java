package com.pluralsight;

import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Player 1 name: ");
        String firstPlayer = scanner.nextLine();

        System.out.println("Please enter Player 2 name: ");
        String secondPlayer = scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        Hand firstHand = new Hand();
        firstHand.deal(deck.deal());
        firstHand.deal(deck.deal());

        Hand secondHand = new Hand();
        secondHand.deal(deck.deal());
        secondHand.deal(deck.deal());


        System.out.println("\n" + firstPlayer + " has: ");
        firstHand.print();

        System.out.println("\n" + secondPlayer + " has: ");
        secondHand.print();

        int player1Score = firstHand.getValue();
        int player2Score = secondHand.getValue();
        
        if (player1Score <= 21 && (player1Score > player2Score || player2Score > 21)) {
            System.out.println("\n" + firstPlayer + " wins!");

        } else if (player2Score <= 21 && (player2Score > player1Score || player1Score > 21)) {
            System.out.println(secondPlayer + " wins!");

        } else {
            System.out.println("It's a tie!");

        }
        scanner.close();

    }
}
