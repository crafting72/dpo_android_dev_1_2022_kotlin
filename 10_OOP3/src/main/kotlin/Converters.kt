package org.example

object Converters {
    private val currencyConverters = listOf(USD(),GBR(),EUR())

    fun get(currencyCode: String): CurrencyConverter {
        currencyConverters.forEach { if( currencyCode.uppercase() == it.currencyCode ) return it }
        return object : CurrencyConverter {
            override val currencyCode = currencyCode.uppercase()
            override val theExchangeRateFromTheRuble = enterTheExchangeRateFromTheRuble(this.currencyCode)
        }
    }
}