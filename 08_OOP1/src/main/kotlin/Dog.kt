package org.example

import kotlin.random.Random

class Dog(name : String, weight: Int = 25, maximumAge: Int = 13, energy: Int): Animal(name, weight, maximumAge, energy) {

    override fun movement() {
        super.movement()
        if (check) {
            println("Running.")
        }
    }

    override fun toGiveBirth(): Dog? {
        if (!isTooOld){
            val theCub = Dog(name, Random.nextInt(1, 5), maximumAge, Random.nextInt(1, 10))
            println("""The dog was born.
                |Name - ${theCub.name}, Weight - ${theCub.weight},
                |Maximum Age - ${theCub.maximumAge}, Energy - ${theCub.energy} 
            """.trimMargin())
            return theCub
        }
        return null
    }
}