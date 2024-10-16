package org.example.part_2

private const val stepFirst = 0
private const val stepSecond = 0
class Battle(private val firstTeam: MutableList<AbstractWarrior>, private val secondTeam: MutableList<AbstractWarrior>) {


    private fun getProgress() {
        if (firstTeam.isNotEmpty() && secondTeam.isNotEmpty()) {
            println(
                BattleState.Progress(
                    Team().getHealth(firstTeam),
                    Team().getHealth(secondTeam),
                    firstTeam.size,
                    secondTeam.size
                ).toString()
            )
        } else if (firstTeam.isEmpty() && secondTeam.isNotEmpty()) {
            println(BattleState.VictoryFirstTeam("The winning team is 2").toString())
        } else if (firstTeam.isNotEmpty()) {
            println(BattleState.VictorySecondTeam("The winning team is 1").toString())
        } else {
            println(BattleState.Draw("Draw").toString())
        }
    }

    fun battle() {
        while (true) {
            getProgress()
            val tempFirstTeam = firstTeam.shuffled().toMutableList()
            val tempSecondTeam = secondTeam.shuffled().toMutableList()
            val warriorFirstTeam = tempFirstTeam[stepFirst]
            val warriorSecondTeam = tempSecondTeam[stepSecond]
            warriorFirstTeam.attack(warriorSecondTeam)
            warriorSecondTeam.attack(warriorFirstTeam)
            if (warriorFirstTeam.isKilled)
                tempFirstTeam.remove(warriorFirstTeam)
            if (warriorSecondTeam.isKilled)
                tempSecondTeam.remove(warriorSecondTeam)
            if (tempFirstTeam.isEmpty() || tempSecondTeam.isEmpty()) {
                updateTeam(tempFirstTeam, tempSecondTeam)
                break
            }
            updateTeam(tempFirstTeam, tempSecondTeam)
        }
        getProgress()
    }

    private fun updateTeam(tempFirstTeam: MutableList<AbstractWarrior>, tempSecondTeam: MutableList<AbstractWarrior>) {
        firstTeam.clear()
        firstTeam.addAll(tempFirstTeam)
        secondTeam.clear()
        secondTeam.addAll(tempSecondTeam)
    }
}