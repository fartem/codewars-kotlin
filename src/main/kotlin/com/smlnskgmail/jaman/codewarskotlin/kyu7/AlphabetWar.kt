package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/59377c53e66267c8f6000027
class AlphabetWar(
        private val input: String
) {

    private val leftSideCharacters = "sbpw"
    private val rightSideCharacters = "zdqm"

    fun solution(): String {
        val result = input.numbersOf(leftSideCharacters) - input.numbersOf(rightSideCharacters)
        return when {
            result > 0 -> "Left side wins!"
            result < 0 -> "Right side wins!"
            else -> "Let's fight again!"
        }
    }

    private fun String.numbersOf(sideCharacters: String): Int {
        return this.sumBy { character ->
            sideCharacters.indexOf(character) + 1
        }
    }

}
