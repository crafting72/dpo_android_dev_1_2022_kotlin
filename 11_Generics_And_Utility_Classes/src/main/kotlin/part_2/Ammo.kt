package org.example.part_2

import org.example.aChanceHasBeenRealized

enum class Ammo(private val damage: Int, private val chance: Int, private val ratio: Int) {
    EXPLOSIVE(40,30,6),
    SIMPLE(5,90,2),
    BUCKSHOT(10,60,4);

    fun currentDamage(): Int {
        return if (chance.aChanceHasBeenRealized()) damage*ratio
        else damage
    }
}