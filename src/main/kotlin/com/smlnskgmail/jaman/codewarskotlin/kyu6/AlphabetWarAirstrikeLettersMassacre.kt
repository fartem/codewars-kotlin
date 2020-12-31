package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/5938f5b606c3033f4700015a
class AlphabetWarAirstrikeLettersMassacre(
        private val input: String
) {

    fun solution(): String {
        val leftSide = "sbpw"
        val rightSide = "zdqm"

        val survivors = survivors(input)
        val result = survivors.numbersOf(leftSide) - survivors.numbersOf(rightSide)
        return when {
            result > 0 -> "Left side wins!"
            result < 0 -> "Right side wins!"
            else -> "Let's fight again!"
        }
    }

    private fun survivors(fight: String): String {
        if (fight.length < 2) {
            return fight
        }
        val survivors = StringBuilder()
        loop@ for (i in fight.indices) {
            when {
                fight[i] == '*' -> continue@loop
                fight.getOrNull(i - 1) != '*' && fight.getOrNull(i + 1) != '*' -> survivors.append(fight[i])
            }
        }
        return survivors.toString()
    }

    private fun String.numbersOf(sideCharacters: String): Int {
        return this.sumBy { character ->
            sideCharacters.indexOf(character) + 1
        }
    }

}
