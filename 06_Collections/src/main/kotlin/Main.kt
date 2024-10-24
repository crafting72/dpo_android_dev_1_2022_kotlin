package org.example

/*import kotlin.random.Random

fun main() { //Part 1
    println("Enter the number N (the number of numbers in the list), which is > 0.")
    var number = readln().toIntOrNull()
    while (true) {
        if (number != null){
            if (number <= 0) println("You entered a number <= 0, try again.")
            else break
        }
        else println("You haven't entered anything, try again.")
        number = readln().toIntOrNull()
    }
    var numbers = List<Int>(size = number.toInt()) { Random.nextInt(-5, 5 ) }
   //println(numbers.joinToString(", ")) //The output is separated by a string and a separator.
    println(numbers) //output via a list
    numbers = numbers.toMutableList()
    numbers.forEachIndexed { index, value -> if (value % 2 == 0) numbers[index] = value * 10 }
    println(numbers.sumOf { it })
    println(numbers.filter { it > 0 })
}*/

fun main() { //Часть 2
    println("""Data preparation has begun:
        |In order to finish entering new users, send an empty field, i.e. null.
    """.trimMargin())
    var i = 1
    var login: String
    var password: String
    val table = hashMapOf<String, String>()
    while (true) {
        print("Fill in the login for $i the user: ")
        login = readln()
        if (login == "") break
        print("Fill in the password for $i the user: ")
        password = readln()
        if (password == "") break
        table[login] = password
        i++
    }
    println("""Data preparation is finished!
        |$table
        |
        |User authorization:
    """.trimMargin())
    while (true){
        print("Enter your login: ")
        login = readln()
        print("Enter the password: ")
        password = readln()
        if (!table.keys.contains(login) || table[login] != password) println("Invalid login or password is specified\n")
        else {
            println("Welcome $login")
            break
        }
    }
    println(table)
}