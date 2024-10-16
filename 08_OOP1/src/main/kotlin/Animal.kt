package org.example

import kotlin.random.Random

open class Animal(val name: String, var weight: Int, val maximumAge: Int, var energy: Int) {
    private var currentAge: Int = 0
    var isTooOld = currentAge >= maximumAge
    protected var check = false

    fun sleep(){
        if (!isTooOld) {
            energy += 5
            currentAge += 1
            isTooOld()
            println("$name is asleep.")
        }
    }

    fun eat(){
        if (!isTooOld) {
            energy += 3
            weight += 1
            tryIncrementAge()
            println("$name is eating.")
        }
    }

    open fun movement(){
        if (canAnAnimalDoAnAction(5,1) && !isTooOld) {
            energy -= 5
            weight -= 1
            tryIncrementAge()
            println("$name is moving around.")
            check = true
        }
        else check = false
    }

    open fun toGiveBirth(): Animal?{
        if (!isTooOld){
            val theCub = Animal(name, Random.nextInt(1, 5), maximumAge, Random.nextInt(1, 10))
            println("""The animal was born.
                |Name - ${theCub.name}, Weight - ${theCub.weight},
                |Maximum Age - ${theCub.maximumAge}, Energy - ${theCub.energy} 
            """.trimMargin())
            return theCub
        }
        return null
    }

    fun canAnAnimalDoAnAction(energy: Int, weight: Int) = this.energy - energy >= 0 &&
            this.weight - weight >= 0

    private fun tryIncrementAge(){
        if (Random.nextBoolean()) currentAge += 1
    }

    private fun isTooOld(){
        isTooOld = currentAge >= maximumAge
    }
}