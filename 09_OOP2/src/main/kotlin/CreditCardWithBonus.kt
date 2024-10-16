package org.example

abstract class CreditCardWithBonus(creditLimit: Int): CreditCard(creditLimit) {
    //Bonus points will be spent last.
    protected var bonus: Int = 0

    override fun pay(value: Int): Boolean {
        return if (!super.pay(value)) {
            if (creditFacilities + balance + bonus >= value) {
                bonus -= (value - balance - creditFacilities)
                balance = 0
                creditFacilities = 0
                true
            } else false
        } else true
    }

    override fun getInformationAboutAvailableFunds(): MutableList<Int> {
        val availableFunds = super.getInformationAboutAvailableFunds()
        availableFunds.add(0,bonus)
        return  availableFunds
    }
}