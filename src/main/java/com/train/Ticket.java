package com.train;

public class Ticket {
    int ticket;
    int rtTicket;
    int total;

    public Ticket(int ticket, int rtTicket) {
        this.ticket = ticket;
        this.rtTicket = rtTicket;
        total = (int) ((ticket-rtTicket)*1000+(rtTicket*2000*0.9));
    }

    public void print(){
        System.out.println("Total tickets: " + ticket);
        System.out.println("Round-trip: " + rtTicket);
        System.out.println("Total: " + total);
    }
}
