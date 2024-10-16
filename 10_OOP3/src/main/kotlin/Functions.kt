package org.example

fun enterTheExchangeRateFromTheRuble(currencyCode: String): Double{
    print("""
        |
        |You have entered the currency code,
        |which is not in our database.
        |Enter the course "RUB to $currencyCode": """.trimMargin())
    return readln().toDouble()
}

fun convertRub(currencyConverter: CurrencyConverter, theNumberOfRubles: Double) {
    println(
        """
        
        $theNumberOfRubles rubles = ${currencyConverter.convertRub(theNumberOfRubles)} """.trimIndent() +
                currencyConverter.currencyCode
    )
}