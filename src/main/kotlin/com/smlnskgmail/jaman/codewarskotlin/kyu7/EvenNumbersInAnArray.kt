package com.smlnskgmail.jaman.codewarskotlin.kyu7

class EvenNumbersInAnArray(
        private val array: List<Int>,
        private val number: Int
) {

    fun result(): List<Int> {
        return array.filter { it % 2 == 0 }.takeLast(number)
    }

}
