package org.example

class CreditCardWithBonusPoints(creditLimit: Int, private val percentageOfCosts: Int): CreditCardWithBonus(creditLimit) {

    override fun pay(value: Int): Boolean {
        return if (super.pay(value)) {
            bonus += (value * percentageOfCosts / 100)
            true
        }else false
    }
}