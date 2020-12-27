package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/563b662a59afc2b5120000c6
class GrowthOfAPopulation(
        private val pp: Int,
        private val percent: Double,
        private val aug: Int,
        private val p: Int
) {

    @Suppress("MagicNumber")
    fun solution(): Int {
        var years = 0
        var population = pp
        while (p > population) {
            population += (population * (percent / 100) + aug).toInt()
            years++
        }
        return years
    }

}
