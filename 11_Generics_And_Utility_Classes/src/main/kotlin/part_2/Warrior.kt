package org.example.part_2

interface Warrior {
    var isKilled: Boolean
    val aChanceToAvoidBeingHit: Int
    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}