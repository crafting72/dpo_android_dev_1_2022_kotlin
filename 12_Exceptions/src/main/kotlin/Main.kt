package org.example

import org.example.throwable.IncorrectPressure
import org.example.throwable.TooHighPressure
import org.example.throwable.TooLowPressure

fun main() {
    repeat(3) {
        print("Put pressure on the wheel: ")
        val pressure = check()
        val wheel = Wheel()
        try {
            wheel.pumpItUp(pressure)
            println("When pumping $pressure atmospheres, the procedure was successful. Operation is possible.")
        } catch (_: IncorrectPressure) {
            println("When pumping $pressure atmospheres, the procedure failed.")
        } catch (_: TooHighPressure) {
            println("When pumping $pressure atmospheres, the procedure was successful. Operation is impossible — " +
                    "the pressure exceeds normal.")
        } catch (_: TooLowPressure) {
            println("When pumping $pressure atmospheres, the procedure was successful. Operation is impossible — " +
                    "the pressure is below normal.")
        }
    }
}