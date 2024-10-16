package org.example.part_2

sealed class FireType {
    object SingleShot : FireType()
    data class FiringBursts(val queueSize: Int) : FireType()
}