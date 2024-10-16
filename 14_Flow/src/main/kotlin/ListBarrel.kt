package org.example

object ListBarrel {
    val listBarrel = (1..90).map { Barrel(it) }.toMutableList()
}