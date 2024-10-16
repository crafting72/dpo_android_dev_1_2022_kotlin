package org.example

import kotlin.random.Random

class Fish(name : String, weight: Int = 30, maximumAge: Int = 11, energy: Int): Animal(name, weight, maximumAge, energy) {

    override fun movement() {
        super.movement()
        if (check) {
            println("Swims.")
        }
    }

    override fun toGiveBirth(): Fish? {
        if (!isTooOld){
            val theCub = Fish(name, Random.nextInt(1, 5), maximumAge, Random.nextInt(1, 10))
            println("""The fish was born.
                |Name - ${theCub.name}, Weight - ${theCub.weight},
                |Maximum Age - ${theCub.maximumAge}, Energy - ${theCub.energy} 
            """.trimMargin())
            return theCub
        }
        return null
    }
}