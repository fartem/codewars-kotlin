package com.smlnskgmail.jaman.codewarskotlin.kyu5

// https://www.codewars.com/kata/5282b48bb70058e4c4000fa7
class ConvertAHexStringToRGB(
        private val input: String
) {

    fun solution(): RGB {
        @Suppress("MagicNumber")
        return RGB(
                input.substring(IntRange(1, 2)).toInt(16),
                input.substring(IntRange(3, 4)).toInt(16),
                input.substring(IntRange(5, 6)).toInt(16)
        )
    }

}

data class RGB(
        val r: Int,
        val g: Int,
        val b: Int
)
