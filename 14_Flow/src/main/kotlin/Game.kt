package org.example

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class Game(countPlayer: Int, countCard: Int) {
    private val listPlayer = mutableListOf<Player>()

    private var playersWin: MutableList<Player> = emptyList<Player>().toMutableList()

    private val listNumber = (0..89).shuffled()
    private var count = -1

    private val _stateFlow = MutableStateFlow<State>(State.Play)
    val stateFlow = _stateFlow.asStateFlow()

    init {
        for (i in 1..countPlayer) listPlayer.add(Player(i,countCard))
    }

    fun getBarrel(barrel: Barrel){
        Host.getBarrel(barrel)
        _stateFlow.value = State.Play
    }

    fun checkWin(){
        var count = 0
        for (i in listPlayer) {
            if (i.checkWin()) {
                count += 1
                playersWin.add(i)
            }
        }
        if (count == 1) _stateFlow.value = State.WinPlayer(playersWin[0])
        else if (count > 1) _stateFlow.value = State.Draw(playersWin)
        else {
            this.count++
            _stateFlow.value = State.Get(ListBarrel.listBarrel[listNumber[this.count]])
        }
    }
}