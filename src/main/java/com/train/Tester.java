package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int RTticket = scanner.nextInt();

        Ticket ticket_ = new Ticket(ticket, RTticket);
        ticket_.print();
    }
}
