package org.example

class Player(val number: Int, countCard: Int) {
    private val listCard = List(countCard) { Card() }

    fun checkWin(): Boolean{
        for (i in listCard){
            if (i.checkWin()) return true
        }
        return false
    }
}