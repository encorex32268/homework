package com.train;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int tickets;
        try {
            tickets = scanner.nextInt();
        }catch (InputMismatchException e){
            tickets = 0 ;
        }
        if (tickets == 0){
            System.out.println("Tickets is 0 . Exit .");
        }else{
            System.out.print("How many round-trip tickets: ");
            int roundTripTickets;
            try {
                roundTripTickets = scanner.nextInt();
            }catch (InputMismatchException e){
                roundTripTickets = 0 ;
            }
            if (tickets < roundTripTickets){
                System.out.println("Error - roundTrip more than the total ticket");
            }else{
                Ticket ticket = new Ticket(tickets,roundTripTickets);
                ticket.printTotal();
            }

        }

    }
}
