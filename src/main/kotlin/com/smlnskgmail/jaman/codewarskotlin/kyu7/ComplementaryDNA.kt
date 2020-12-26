package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/554e4a2f232cdd87d9000038
class ComplementaryDNA(
        private val input: String
) {

    fun solution(): String {
        return input.map {
            when (it) {
                'A' -> 'T'
                'T' -> 'A'
                'C' -> 'G'
                else -> 'C'
            }
        }.joinToString("")
    }

}
