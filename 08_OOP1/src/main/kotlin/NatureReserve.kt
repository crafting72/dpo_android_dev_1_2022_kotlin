package org.example

import kotlin.random.Random

class NatureReserve {

    private var listAnimal = mutableListOf(
        Bird("Oliver", energy = 5),
        Bird("Knight", weight = 2, energy = 4),
        Bird("Orlik", maximumAge = 30, energy = 6),
        Bird("Osman", 3, 15, 9),
        Bird("Tungus", energy = 10),
        Fish("Yenisei", energy = 2),
        Fish("Irbis", 3, 4, 1),
        Fish("Rex", maximumAge = 15, energy = 7),
        Dog("Sharik", energy = 5),
        Dog("Yeshka", 30, 25, 5),
        Animal("Felix", 15, 15, 15)
    )

    fun everyoneDoesAnAction(number: Int) {
        for (i in 1..number) {
            val listAnimal2 = listAnimal.toMutableList()
            listAnimal2.forEach { randomAction(it) }
            if (listAnimal.isEmpty()) {
                println("There are no animals left.")
                break
            }
        }
        println("There are ${listAnimal.size} animals left")
    }

    private fun randomAction(animal: Animal) {
        if (!animal.canAnAnimalDoAnAction(5, 1)) when (Random.nextInt(1, 4)) {
            1 -> {
                animal.sleep()
                if (animal.isTooOld) listAnimal.remove(animal)
            }

            2 -> animal.eat()
            3 -> {
                animal.toGiveBirth()?.let {
                    listAnimal.add(it)
                }
            }
        }
        else when (Random.nextInt(1, 5)) {
            1 -> {
                animal.sleep()
                if (animal.isTooOld) listAnimal.remove(animal)
            }

            2 -> animal.eat()
            3 -> animal.movement()
            4 -> animal.toGiveBirth()?.let {
                listAnimal.add(it)
            }
        }
    }
}