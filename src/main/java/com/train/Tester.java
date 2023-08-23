package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = 0;
        int rtTicket = 0;

        while (ticket != -1){
            System.out.println("如果要結束訂票，請輸入 -1");
            System.out.print("Please enter number of tickets: ");
            ticket = scanner.nextInt();
            if(ticket != -1){
                System.out.print("How many round-trip tickets: ");
                rtTicket = scanner.nextInt();
                Ticket ticket_ = new Ticket(ticket, rtTicket);
                ticket_.print();
            }
        }
    }
}
