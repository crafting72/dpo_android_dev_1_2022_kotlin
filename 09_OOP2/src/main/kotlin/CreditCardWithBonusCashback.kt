package org.example

class CreditCardWithBonusCashback(
    creditLimit: Int,
    private val percentageOfCosts: Int,
    private val theAmountForCashback: Int)
    : CreditCardWithBonus(creditLimit) {

    override fun pay(value: Int): Boolean {
        return if (super.pay(value)) {
            if  (value >= theAmountForCashback) {
                bonus += (value * percentageOfCosts / 100)
            }
            true
        }else false
    }
}