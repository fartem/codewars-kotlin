package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c
class EvenNumbersInAnArray(
        private val array: List<Int>,
        private val number: Int,
) {

    fun solution(): List<Int> {
        return array.filter { it % 2 == 0 }.takeLast(number)
    }

}
