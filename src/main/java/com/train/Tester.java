package com.train;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

            int tickets = 0 ;
            while (tickets != -1)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("----------Start----------");
                System.out.print("Please enter number of tickets:");
                try {
                    tickets = scanner.nextInt();
                }catch (InputMismatchException e){
                    tickets = 0 ;
                }
                if (tickets == -1)
                {
                    System.out.println("Exit");
                    System.out.println("-----------End-----------");
                    break;
                }else if (tickets <=0){
                    System.out.println("!! Error - Please enter correct tickets count !!");
                    System.out.println("-----------End-----------");
                }else{
                    System.out.print("How many round-trip tickets: ");
                    int roundTripTickets = 0;
                    try {
                        roundTripTickets = scanner.nextInt();
                    }catch (InputMismatchException e){
                        roundTripTickets = 0 ;
                    }
                    if (roundTripTickets < 0){
                        System.out.println("Please enter correct Round-trip count");
                        System.out.println("-----------End-----------");
                    }else{
                        if (tickets < roundTripTickets){
                            System.out.println("!! Error - roundTrip more than the total ticket !!");
                            System.out.println("-----------End-----------");

                        }else{
                            Ticket ticket = new Ticket(tickets,roundTripTickets);
                            ticket.printTotal();
                            System.out.println("-----------End-----------");

                        }
                    }

                }



            }

    }
}
