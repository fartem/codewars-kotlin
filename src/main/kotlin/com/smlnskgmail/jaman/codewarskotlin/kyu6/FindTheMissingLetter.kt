package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/5839edaa6754d6fec10000a2
class FindTheMissingLetter(
        private val input: CharArray
) {

    fun solution(): Char {
        var letter: Char = input[0]
        for (i in 1..input.size) {
            val letterAtPosition = input[i]
            if (letter != letterAtPosition - 1) {
                return letterAtPosition - 1
            } else {
                letter = letterAtPosition
            }
        }
        return ' '
    }

}
