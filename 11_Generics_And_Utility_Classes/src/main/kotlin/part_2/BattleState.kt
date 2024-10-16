package org.example.part_2

sealed class BattleState {
     class Progress(
        private val totalHealthFirstTeam: Int,
        private val totalHealthSecondTeam: Int,
        private val allWarriorsFirstTeam: Int,
        private val allWarriorsSecondTeam: Int
    ) : BattleState() {
        override fun toString(): String {
            return ("""
                |The total health of the team is 1: $totalHealthFirstTeam
                |The number of warriors in 1 team: $allWarriorsFirstTeam
                |The total health of the team is 2: $totalHealthSecondTeam
                |The number of warriors in 2 team: $allWarriorsSecondTeam
                |
            """.trimMargin())
        }
    }

    class VictoryFirstTeam(private val victoryFirstTeam: String) : BattleState() {
        override fun toString(): String {
            return victoryFirstTeam
        }
    }

    class VictorySecondTeam(private val victorySecondTeam: String) : BattleState() {
        override fun toString(): String {
            return victorySecondTeam
        }

    }

    class Draw(private val draw: String) : BattleState() {
        override fun toString(): String {
            return draw
        }
    }

}