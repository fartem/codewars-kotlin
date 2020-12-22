package com.smlnskgmail.jaman.codewarskotlin.kyu8

class BeginnerReduceButGrow(
        private val input: IntArray
) {

    fun solution(): Int {
        return input.reduce { acc, i -> acc * i }
    }

}
