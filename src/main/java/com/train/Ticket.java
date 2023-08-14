package com.train;

public class Ticket {
    int ticket;
    int RTticket;
    int total;

    public Ticket(int ticket, int RTticket) {
        this.ticket = ticket;
        this.RTticket = RTticket;
        total = (int) ((ticket-RTticket)*1000+(RTticket*2000*0.9));
    }

    public void print(){
        System.out.println("Total tickets: " + ticket);
        System.out.println("Round-trip: " + RTticket);
        System.out.println("Total: " + total);
    }
}
