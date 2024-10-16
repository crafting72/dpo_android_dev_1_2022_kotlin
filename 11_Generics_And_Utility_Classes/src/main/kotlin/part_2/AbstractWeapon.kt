package org.example.part_2

import org.example.part_1.Stack

abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {
    var magazineOfCartridges = Stack<Ammo>()
    val ammoInMagazine: Boolean
        get() = !(magazineOfCartridges.isEmpty())

    abstract fun creatingAPatron(): Ammo

    fun recharge(){
        val newMagazineOfCartridges = Stack<Ammo>()
        repeat(maxAmmo) {
            newMagazineOfCartridges.push(creatingAPatron())
        }
        magazineOfCartridges = newMagazineOfCartridges
    }

    fun getAmmoShot(): List<Ammo>{
        val ammo = mutableListOf<Ammo>()
        if (fireType is FireType.FiringBursts){
            repeat(fireType.queueSize){
                ammo.add(magazineOfCartridges.pop() ?: return ammo.toList())

            }
        }
        else {
            ammo.add(magazineOfCartridges.pop() ?: return ammo.toList())
        }
        return ammo.toList()
    }
}