package org.example

fun main() {
    println("""Enter the international currency code
        |
        |For example:
        |USD - the American dollar,
        |GBR - pound sterling,
        |EUR - euro.
        |
    """.trimMargin())
    val currency = Converters.get(readln())
    println()
    print("Enter the number of rubles to count the convert: ")
    convertRub(currency, readln().toDouble())
}