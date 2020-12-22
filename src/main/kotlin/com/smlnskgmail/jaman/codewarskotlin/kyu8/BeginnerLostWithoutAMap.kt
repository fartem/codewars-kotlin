package com.smlnskgmail.jaman.codewarskotlin.kyu8

class BeginnerLostWithoutAMap(
        private val input: IntArray
) {

    fun solution(): IntArray {
        return input.map { it * 2 }.toIntArray()
    }

}
