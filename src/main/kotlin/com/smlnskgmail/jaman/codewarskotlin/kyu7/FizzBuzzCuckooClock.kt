package com.smlnskgmail.jaman.codewarskotlin.kyu7

import java.util.*

// https://www.codewars.com/kata/58485a43d750d23bad0000e6
class FizzBuzzCuckooClock(
        private val input: String
) {

    @Suppress(
            "ComplexMethod",
            "MagicNumber",
            "UseIfInsteadOfWhen"
    )
    fun solution(): String {
        val data = input.split(":")
        var hours = data[0].toInt()
        val minutes = data[1].toInt()
        return when {
            minutes > 0 -> {
                when {
                    minutes == 30 -> "Cuckoo"
                    minutes % 3 == 0 && minutes % 5 == 0 -> "Fizz Buzz"
                    minutes % 3 == 0 -> "Fizz"
                    minutes % 5 == 0 -> "Buzz"
                    else -> "tick"
                }
            }
            else -> {
                if (hours == 0 || hours == 12) {
                    hours = 12
                } else if (hours > 12) {
                    hours -= 12
                }
                Collections.nCopies(hours, "Cuckoo").joinToString(" ")
            }
        }
    }

}
