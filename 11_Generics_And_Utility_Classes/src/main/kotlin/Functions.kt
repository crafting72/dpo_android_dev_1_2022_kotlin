package org.example

fun check(): Int {
    print("Lead the number of wars: ")
    var n: Int?
    while (true) {
        n = readln().toIntOrNull()
        if (n == null) {
            print("You entered an empty string. Enter it again: ")
            continue
        } else if (n <= 0) {
            print("Enter a number > 0: ")
            continue
        }
        return n
    }
}