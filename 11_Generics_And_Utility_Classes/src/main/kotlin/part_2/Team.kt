package org.example.part_2

import org.example.aChanceHasBeenRealized


const val theChanceOfCreatingABoss = 25
const val theChanceOfCreatingAGeneral = 35
const val theChanceOfCreatingACapitan = 45
class Team {

    fun addArmy(number: Int) : MutableList<AbstractWarrior>{
        val teamWarriors = mutableListOf<AbstractWarrior>()
        repeat(number) {
            if (theChanceOfCreatingABoss.aChanceHasBeenRealized()) teamWarriors.add(Boss())
            else if (theChanceOfCreatingAGeneral.aChanceHasBeenRealized()) teamWarriors.add(General())
            else if (theChanceOfCreatingACapitan.aChanceHasBeenRealized()) teamWarriors.add(Capitan())
            else teamWarriors.add(Soldier())
        }
        return teamWarriors
    }

    fun getHealth(team: MutableList<AbstractWarrior>) = team.sumOf { it.currentHealth }
}