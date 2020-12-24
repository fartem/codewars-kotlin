package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/511f11d355fe575d2c000001
class TwoOldestAges(
        private val input: List<Int>
) {

    fun solution(): List<Int> {
        return input.sorted().takeLast(2)
    }

}
