package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/55a2d7ebe362935a210000b2
class FindTheSmallestIntegerInTheArray(
        private val input: List<Int>
) {

    fun solution(): Int {
        return input.min()!!
    }

}
