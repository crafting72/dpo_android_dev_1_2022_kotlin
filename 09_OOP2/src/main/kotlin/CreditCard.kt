package org.example

open class CreditCard(private val creditLimit: Int): BankCard() {

    protected var creditFacilities = creditLimit

    override fun replenish(value: Int) {
        if (creditFacilities + value >= creditLimit){
            super.replenish(creditLimit - creditFacilities + value)
            creditFacilities = creditLimit
        }
        else creditFacilities += value
    }

    override fun pay(value: Int): Boolean {
        return if (!super.pay(value)) {
            if (creditFacilities + balance >= value) {
                creditFacilities -= (value - balance)
                balance = 0
                true
            } else false
        } else true
    }

    override fun getInformationAboutAvailableFunds(): MutableList<Int> {
        val availableFunds = super.getInformationAboutAvailableFunds()
        availableFunds.add(creditFacilities)
        return  availableFunds
    }
}