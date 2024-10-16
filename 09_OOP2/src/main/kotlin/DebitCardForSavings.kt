package org.example

class DebitCardForSavings(private val percentageOfReplenishment: Int): DebitCard() {

    private var bonus: Int = 0

    override fun pay(value: Int): Boolean {
        return if (!super.pay(value)) {
            if (balance + bonus >= value) {
                bonus -= (value - balance)
                balance = 0
                true
            } else false
        } else true
    }

    override fun replenish(value: Int) {
        super.replenish(value)
        bonus += (value * percentageOfReplenishment / 100)
    }

    override fun getInformationAboutAvailableFunds(): MutableList<Int> {
        val availableFunds = super.getInformationAboutAvailableFunds()
        availableFunds.add(bonus)
        return  availableFunds
    }
}