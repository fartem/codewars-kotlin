package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc
class FindTheParityOutlier(
        private val input: Array<Int>
) {

    @Suppress("MagicNumber")
    fun solution(): Int {
        val isEven = (input[0] and 1) + (input[1] and 1) + (input[2] and 1) < 2
        return input.first {
            if (isEven) {
                it % 2 != 0
            } else {
                it % 2 == 0
            }
        }
    }

}
