package org.example

import kotlin.random.Random

fun Int.aChanceHasBeenRealized() = Random.nextInt(1,101) >= this