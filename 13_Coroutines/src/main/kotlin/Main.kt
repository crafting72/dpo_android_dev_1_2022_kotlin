package org.example

import kotlinx.coroutines.*
import java.math.BigInteger

val job = Job()
val scope = CoroutineScope(job + Dispatchers.Default)

val job2 = Job()
val scope2 = CoroutineScope(job2 + Dispatchers.Default)

val listFib = mutableListOf<BigInteger>()

suspend fun main() {
    check6()
    try {
        withTimeout(3000) {
            (scope.coroutineContext.job as? CompletableJob)?.let {
                it.complete()
                it.join()
                job2.cancel()
                println()
                listFib.forEach { fib -> println(fib) }
            }
        } ?: throw IllegalStateException()
    }catch(_: TimeoutCancellationException){
        println("The calculation time has been exceeded.")
    }
}