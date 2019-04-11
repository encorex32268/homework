package com.train;

public class Ticket {

    static double discount = 0.9;
    static int onewayPrice = 1000;
    static int roundtripPrice = 2000;

    int tickets;
    int roundtripTicktes;

    public Ticket(int tickets, int roundtripTicktes) {
        this.tickets = tickets;
        this.roundtripTicktes = roundtripTicktes;
    }

    private int calculateTotal(){
        int onewaySum = (tickets - roundtripTicktes) * onewayPrice;
        int roundtripSum = roundtripTicktes * (int)(roundtripPrice*discount);
        return onewaySum + roundtripSum;
    }

    public void printTotal() {
        System.out.println("Total tickets: "+tickets);
        System.out.println("Round-trip: "+roundtripTicktes);
        System.out.println("Total tickets: "+calculateTotal());
    }
}
