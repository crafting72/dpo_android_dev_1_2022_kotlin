package org.example

fun main() {
    print("Enter the number of mobile numbers: ")
    val n = check()
    val listPhoneNumbers = enteringPhoneNumbers(n)
    println("Phone numbers that start with \"+7\": " +
            "${listPhoneNumbers.filter { it.startsWith("+7") }.toMutableList()}")
    val setPhoneNumbers = listPhoneNumbers.toSet()
    val setSize = setPhoneNumbers.size
    println("There are $setSize unique numbers in this list.")
    println("The sum of the lengths of all mobile numbers is ${listPhoneNumbers.sumOf { it.length }}")
    val mapPhoneNumbers = mutableMapOf<String, String>()
    for (i in setPhoneNumbers){
        print("Enter the name of the owner of the phone number \"$i\": ")
        mapPhoneNumbers[i] = readln()
    }
    mapPhoneNumbers.forEach { (key, value) -> println("Person: $value. Phone number: $key") }
}

fun check(): Int{
    while (true){
        try {
            val count = readln().toInt()
            if (count <= 0) throw NumberFormatException()
            return count
        } catch (_: NumberFormatException){
            print("""You have entered an invalid value.
                |Try again: 
            """.trimMargin())
        }
    }
}

fun enteringPhoneNumbers(n: Int): MutableList<String>{
    val listPhoneNumbers = mutableListOf<String>()
    repeat(n){
        print("Enter the phone number: ")
        listPhoneNumbers.add(readln())
    }
    return listPhoneNumbers
}