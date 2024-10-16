package org.example

import kotlin.random.Random

class Bird(name : String, weight: Int = 1, maximumAge: Int = 20, energy: Int): Animal(name, weight, maximumAge, energy) {

    override fun movement() {
        super.movement()
        if (check) {
            println("Flying.")
        }
    }

    override fun toGiveBirth(): Bird? {
        if (!isTooOld){
            val theCub = Bird(name, Random.nextInt(1, 5), maximumAge, Random.nextInt(1, 10))
            println("""The bird was born.
                |Name - ${theCub.name}, Weight - ${theCub.weight},
                |Maximum Age - ${theCub.maximumAge}, Energy - ${theCub.energy} 
            """.trimMargin())
            return theCub
        }
        return null
    }
}