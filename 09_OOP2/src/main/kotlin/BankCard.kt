package org.example

abstract class BankCard {

    protected var balance: Int = 0

    open fun replenish(value: Int) {
        balance += value
    }

    open fun pay(value: Int): Boolean{
        if (balance >= value) {
            balance -= value
            return true
        }
        return false
    }

    open fun getInformationAboutTheBalance(): Int{
        return balance
    }

    open fun getInformationAboutAvailableFunds(): MutableList<Int> {
        return mutableListOf()
    }
}