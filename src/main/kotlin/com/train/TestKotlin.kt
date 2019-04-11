package com.train.kotlin

import java.util.*

fun main(args: Array<String>) {

    var tickets = 0

    while (tickets != -1)
    {
        val scanner = Scanner(System.`in`)
        println("----------Start----------")
        print("Please enter number of tickets: ")
        tickets = try { scanner.nextInt() }catch (e :InputMismatchException){ 0 }
        if (tickets == -1) {
            println("Exit")
            println("-----------End-----------")
            break
        }
        else if (tickets <= 0){
            println("!! Error - Please enter correct tickets count !!")
            println("-----------End-----------")
        }else{
            print("How many round-trip tickets: ")
            var roundtripTickets = try { scanner.nextInt() }catch (e :InputMismatchException){ 0 }
            if (roundtripTickets < 0){
                println("Please enter correct Round-trip count")
                println("-----------End-----------")
            }else{
                if (tickets < roundtripTickets){
                    println("!! Error - roundTrip more than the total ticket !!")
                    println("-----------End-----------")
                }else{
                    Ticket(tickets,roundtripTickets).printTotal()
                    println("-----------End-----------")
                }
            }

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