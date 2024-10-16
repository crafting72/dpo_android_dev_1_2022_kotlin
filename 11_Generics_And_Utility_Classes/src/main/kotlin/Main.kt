package org.example

import org.example.part_2.Battle
import org.example.part_2.Team


fun main() {
    Battle(Team().addArmy(check()), Team().addArmy(check())).battle()
        /*repeat(100){
        Battle(Team().addArmy(1), Team().addArmy(1)).battle() //I checked if a draw was possible.
    }*/
}