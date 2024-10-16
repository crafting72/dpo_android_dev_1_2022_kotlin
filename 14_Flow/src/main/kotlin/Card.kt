package org.example

class Card {
    private val listNumber = (0..89).shuffled().take(15)
    private val card = listOf(
        creatingLine(listNumber.take(5)),
        creatingLine(listNumber.drop(5).take(5)),
        creatingLine(listNumber.takeLast(5)))

    private fun creatingLine(listNumber: List<Int>) : List<Barrel>{
        var count = -1
        val line =
            mutableListOf(Barrel(0),Barrel(0),Barrel(0),Barrel(0), //Barrel(0) - пустое поле
                Barrel(1),Barrel(1),Barrel(1),Barrel(1),Barrel(1))
                .shuffled().toMutableList()
        line.forEachIndexed { index, s ->
            if (s.number == 1){
                count++
                line[index] = ListBarrel.listBarrel[listNumber[count]]
            }
        }
        return line
    }

    fun checkWin(): Boolean{
        for (i in card) {
            var count = 0
            i.forEach { if (it.isCrossedOut) count += 1 }
            if (count == 5 ) return true
        }
        return false
    }
}