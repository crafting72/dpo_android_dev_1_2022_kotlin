package org.example

import org.example.throwable.IncorrectPressure
import org.example.throwable.TooHighPressure
import org.example.throwable.TooLowPressure
import kotlin.properties.Delegates

class Wheel() {
    private var currentPressure by Delegates.notNull<Float>()
    fun pumpItUp(pressure: Float){
        checkPressure(pressure)
        currentPressure = pressure
    }

    private fun checkPressure(pressure: Float){
        if (pressure < 0 || pressure > 10) throw IncorrectPressure()
        else if (pressure < 1.6) throw TooLowPressure()
        else if (pressure > 2.5) throw TooHighPressure()
    }
}