package org.example

//NumberFormatException

fun check(): Float{
    return try {
        readln().toFloat()
    } catch (_: NumberFormatException){
        print("""You have entered an invalid value.
            |Try again: 
        """.trimMargin())
        check()
    }
}