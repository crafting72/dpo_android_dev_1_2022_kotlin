package org.example

fun main() {
    println("Enter a number > 0 and < 93") //At >=93, the Fibonacci number goes beyond Long, and we have not studied more than Long
    var number = readln().toLongOrNull()
    while (true){
        if (number != null) {
            if (number <= 0) println("You entered a number <= 0, try again")
            else if (number >= 93) println("You entered a number >= 93, try again")
            else break
        } else{
            println("You haven't entered anything, try again")
        }
        number = readln().toLongOrNull()
    }
    //println(fibonacciWithRecursion(number = number!!.toLong()))
    //println(fibonacciWithImprovementsRecursion(number = number!!.toLong() - 2, 1, 1))
    //println(fibonacciWithWhile(number!!.toLong()))
    println(fibonacciWithFor(number!!.toLong()))
}

/*fun fibonacciWithRecursion(number: Long): Long { //At > 50 it works for a long time
    if (number == 1.toLong() || number == 2.toLong()) return 1
    return fibonacciWithRecursion(number - 1)+fibonacciWithRecursion(number - 2)
}*/

/*tailrec fun fibonacciWithImprovementsRecursion(number: Long, currentFibonacci: Long, currentFibonacci2: Long): Long{ //through recursion
    if (number < 1) return currentFibonacci2
    return fibonacciWithRecursion(number - 1, currentFibonacci2, currentFibonacci2 + currentFibonacci)
}*/

/*fun fibonacciWithWhile(number: Long): Long{ //through while
    var currentFibonacci2: Long = 1
    var currentFibonacci: Long = 1
    var swap: Long
    var localNumber = number - 2
    while (localNumber > 0){
        swap = currentFibonacci
        currentFibonacci = currentFibonacci2
        currentFibonacci2 += swap
        localNumber--
    }
    return currentFibonacci2
}*/

fun fibonacciWithFor(number: Long): Long{ //through for
    var currentFibonacci2: Long = 1
    var currentFibonacci: Long = 1
    var swap: Long
    for (i in number - 2 downTo 1){
        swap = currentFibonacci
        currentFibonacci = currentFibonacci2
        currentFibonacci2 += swap
    }
    return currentFibonacci2
}