package org.example.part_2

import org.example.aChanceHasBeenRealized

abstract class AbstractWarrior(
    maxHealth: Int,
    evasion: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : Warrior {
    var currentHealth = maxHealth
    override var isKilled: Boolean = false
    override val aChanceToAvoidBeingHit: Int = evasion

    override fun attack(warrior: Warrior) {
        if (weapon.ammoInMagazine){
            val listAmmo = weapon.getAmmoShot()
            listAmmo.forEach {
                if (accuracy.aChanceHasBeenRealized() && !(warrior.aChanceToAvoidBeingHit.aChanceHasBeenRealized())){
                    warrior.takeDamage(it.currentDamage())
                }
            }
        }
        else weapon.recharge()
    }

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        if (currentHealth <= 0) isKilled = true
    }
}