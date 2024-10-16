package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import org.example.Fibonacci.take


fun check6(){
    scope.launch {
        listFib.add(take(300000))
    }
    scope.launch {
        listFib.add(take(200000))
    }
    scope.launch {
        listFib.add(take(100000))
    }
    scope2.launch {
        while (true) {
            yield()
            delay(100)
            print('.')
        }
    }
}