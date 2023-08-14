package com.train

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var RTticket = scanner.nextInt()

    val Ticket = TesterKotlin(ticket, RTticket)
    Ticket.print()
}

class TesterKotlin(var ticket:Int, var RTticket:Int){
    fun print(){
        println("Total tickets: " + ticket)
        println("Round-trip: " + RTticket)
        println("Total: " + ((ticket-RTticket)*1000+(RTticket*2000*0.9)).toInt())
    }
}