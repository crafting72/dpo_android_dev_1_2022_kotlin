package org.example

sealed class State {
    data class WinPlayer(val player: Player) : State()
    object Play : State()
    data class Get(val barrel: Barrel) : State()
    data class Draw(val listPlayer: List<Player>) : State()
}