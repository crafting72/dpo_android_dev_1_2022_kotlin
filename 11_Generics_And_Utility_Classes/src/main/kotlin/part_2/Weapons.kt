package org.example.part_2

object Weapons {
    fun createPistol() = object : AbstractWeapon(20, FireType.SingleShot) {
        override fun creatingAPatron() = Ammo.SIMPLE
    }

    fun createBazooka() = object : AbstractWeapon(1, FireType.SingleShot){
        override fun creatingAPatron() = Ammo.EXPLOSIVE
    }
    fun createShotgun() = object : AbstractWeapon(8, FireType.FiringBursts(2)){
        override fun creatingAPatron() = Ammo.BUCKSHOT
    }
    fun createAutomatic() = object : AbstractWeapon(30, FireType.FiringBursts(3)){
        override fun creatingAPatron() = Ammo.SIMPLE
    }
}