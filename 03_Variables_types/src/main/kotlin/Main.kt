package org.example

fun main() {
    val firstName: String = "Matvey"
    val lastName: String = "Revnivykh"
    var height: Double = 1.8
    val weight: Float = 66.0F
    var isChild: Boolean = height < 1.5 || weight < 40
    var info: String = """My name is $firstName $lastName, I have a weight of $weight kg and a height of $height m.
        |Am I a child? - $isChild
    """.trimMargin()
    println(info)
    height -= 0.8
    isChild = height < 1.5 || weight < 40
    info = """My name is ${firstName + " " + lastName}, I have a weight of $weight kg and a height of $height m.
        |Am I a child? - $isChild
    """.trimMargin()
    println(info)
}