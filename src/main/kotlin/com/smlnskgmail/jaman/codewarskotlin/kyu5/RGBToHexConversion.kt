package com.smlnskgmail.jaman.codewarskotlin.kyu5

// https://www.codewars.com/kata/513e08acc600c94f01000001
class RGBToHexConversion(
        private val r: Int,
        private val g: Int,
        private val b: Int
) {

    fun solution(): String {
        @Suppress("MagicNumber")
        return "%02X%02X%02X".format(
                r.coerceIn(0..255),
                g.coerceIn(0..255),
                b.coerceIn(0..255)
        )
    }

}
