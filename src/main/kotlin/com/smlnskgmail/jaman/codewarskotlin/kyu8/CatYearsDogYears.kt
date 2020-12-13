package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
class CatYearsDogYears(private val input: Int) {

    fun solution(): Array<Int> {
        return when (input) {
            1 -> arrayOf(1, 15, 15)
            2 -> arrayOf(input, 24, 24)
            else -> arrayOf(
                    input, 24 + 4 * (input - 2),
                    24 + 5 * (input - 2)
            )
        }
    }

}
