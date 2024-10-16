package org.example

import kotlinx.coroutines.yield
import java.math.BigInteger

object Fibonacci {
    suspend fun take(number: Int): BigInteger {
        var fib1: BigInteger = 1.toBigInteger()
        var fib2: BigInteger = 1.toBigInteger()

        var i = 0
        while (i < (number - 2)){
            val fibSum = fib1 + fib2
            fib1 = fib2
            fib2 = fibSum
            i += 1
            yield()
        }
        return fib2
    }
}