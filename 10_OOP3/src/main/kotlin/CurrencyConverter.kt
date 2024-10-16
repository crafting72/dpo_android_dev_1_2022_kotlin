package org.example

interface CurrencyConverter {

    val currencyCode: String
    val theExchangeRateFromTheRuble: Double
    fun convertRub(theNumberOfRubles: Double) = (theNumberOfRubles*theExchangeRateFromTheRuble).toString()
}