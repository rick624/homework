package com.train

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var rtTicket = scanner.nextInt()

    val Ticket = TesterKotlin(ticket, rtTicket)
    Ticket.print()
}

class TesterKotlin(var ticket:Int, var rtTicket:Int){
    fun print(){
        println("Total tickets: " + ticket)
        println("Round-trip: " + rtTicket)
        println("Total: " + ((ticket-rtTicket)*1000+(rtTicket*2000*0.9)).toInt())
    }
}