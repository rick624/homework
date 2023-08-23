package com.train

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import java.util.Scanner

fun main() {
    var ticket:Int = 0
    var rtTicket:Int = 0
//    val scanner = Scanner(System.`in`)

    while (ticket != -1){
        println("如果要結束訂票，請輸入 -1")
        print("Please enter number of tickets: ")
        ticket = readLine()!!.toInt()

        if (ticket != -1){
            print("How many round-trip tickets: ")
            rtTicket = readLine()!!.toInt()
            val tickets = TesterKotlin(ticket, rtTicket)
            tickets.print()
        }
    }
}

class TesterKotlin(var ticket:Int, var rtTicket:Int){
    fun getTotal():Int{
        return ((ticket-rtTicket)*1000+(rtTicket*2000*0.9)).toInt()
    }

    fun print(){
        println("Total tickets: $ticket")
        println("Round-trip: $rtTicket")
        println("Total: " + getTotal())
    }
}