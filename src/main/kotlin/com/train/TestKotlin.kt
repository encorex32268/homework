package com.train.kotlin

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = try { scanner.nextInt() }catch (e :InputMismatchException){ 0 }
    if (tickets == 0){
        println("Tickets is 0 . Exit .")
    }else{
        print("How many round-trip tickets: ")
        var roundtripTickets = try { scanner.nextInt() }catch (e :InputMismatchException){ 0 }
        if (tickets < roundtripTickets){
            println("Error - roundTrip more than the total ticket")
        }else{
            Ticket(tickets,roundtripTickets).printTotal()
        }
    }


}

class Ticket(private val tickets :Int, private val roundtripTickets:Int){
    companion object {
        const val discount = 0.9
        const val onewayPrice = 1000
        const val roundtripPrice = 2000
    }
    private fun calculate():Int{
        val onewayPriceSum = (tickets - roundtripTickets) * onewayPrice
        val roundtripPriceSum = roundtripTickets * (roundtripPrice* discount).toInt()
        return onewayPriceSum+roundtripPriceSum

    }
    fun printTotal(){
        println("Total tickets: $tickets")
        println("Round-trip: $roundtripTickets")
        println("Totals: ${calculate()}")
    }
}