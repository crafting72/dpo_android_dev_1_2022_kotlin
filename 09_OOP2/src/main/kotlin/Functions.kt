package org.example

fun check(card: BankCard){
    getInformationAboutTheBalance(card)
    replenish(card, 10000)
    getInformationAboutAvailableFunds(card)
    pay(card, 11000)
    getInformationAboutAvailableFunds(card)
    replenish(card, 9000)
    pay(card, 5000)
    getInformationAboutAvailableFunds(card)
    pay(card, 5000)
    getInformationAboutAvailableFunds(card)
    pay(card, 11000)
    getInformationAboutAvailableFunds(card)
    pay(card, 600)
    getInformationAboutAvailableFunds(card)
    pay(card, 9000)
    getInformationAboutAvailableFunds(card)
    println()
}

fun replenish(card: BankCard, value: Int){
    card.replenish(value)
    println("You have topped up your account.")
}

fun pay(card: BankCard, value: Int){
    if (card.pay(value)) println("The payment has been completed.")
    else println("The payment failed.")
}

fun getInformationAboutTheBalance(card: BankCard){
    println("Your own funds: ${card.getInformationAboutTheBalance()}")
}

fun getInformationAboutAvailableFunds(card: BankCard){
    getInformationAboutTheBalance(card)
    val availableFunds = card.getInformationAboutAvailableFunds()
    val size = availableFunds.size
    if (card !is CreditCard || card is CreditCardWithBonus) {
        if (size >= 1) println("Your bonuses: ${availableFunds[0]}")
        if (size >= 2) println("Credit facilities: ${availableFunds[1]}")
    }
    else println("Credit facilities: ${availableFunds[0]}")
}