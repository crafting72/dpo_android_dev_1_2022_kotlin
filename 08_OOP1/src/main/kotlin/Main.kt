package org.example

fun main() {
    println("""Welcome to the virtual nature reserve!
        |We have five birds, three fish, two dogs and 1 ordinary animal.
    """.trimMargin())
    print("Enter the number of iterations N: ")
    var number = readln().toIntOrNull()
    while (true) {
        if (number != null){
            if (number <= 0) println("You entered a number <= 0, try again")
            else break
        }
        else println("You haven't entered anything, try again")
        number = readln().toIntOrNull()
    }
    val natureReserve = NatureReserve()
    natureReserve.everyoneDoesAnAction(number.toInt())
}