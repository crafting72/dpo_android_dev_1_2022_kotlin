package org.example

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