package org.example

import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    var countMove = 1
    print("Enter the number of players: ")
    val countPlayer = check()
    print("Enter the number of cards: ")
    val countCard = check()
    val game = Game(countPlayer,countCard)
    runBlocking {
        launch {
            game.stateFlow.collect{
                when(it){
                    State.Play -> {
                        game.checkWin()
                    }
                    is State.Draw -> {
                        print("A draw between the players under the numbers: ")
                        val listPlayer = (game.stateFlow.value as State.Draw).listPlayer
                        listPlayer.forEachIndexed { index, player ->
                            print("${player.number}")
                            if (index != listPlayer.lastIndex) print(", ")
                        }
                        cancel()
                    }
                    is State.WinPlayer -> {
                        println("The player under the number won \"${(game.stateFlow.value as State.WinPlayer).player.number}\"")
                        cancel()
                    }
                    is State.Get -> {
                        val barrel = (game.stateFlow.value as State.Get).barrel
                        game.getBarrel(barrel)
                        println("""$countMove step: 
                            |The presenter took out a barrel under the number "${barrel.number}"""".trimMargin())
                        countMove++
                    }
                }
            }
        }
    }
}