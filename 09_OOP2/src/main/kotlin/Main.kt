package org.example

fun main() {
    val card1 = CreditCardWithBonusCashback(10000, 5, 5000)
    val card2 = DebitCard()
    val card3 = DebitCardForSavings(5)
    val card4 = CreditCardWithBonusPoints(10000, 5)
    val card5 = CreditCard(10000)
    check(card1)
    check(card2)
    check(card3)
    check(card4)
    check(card5)
}