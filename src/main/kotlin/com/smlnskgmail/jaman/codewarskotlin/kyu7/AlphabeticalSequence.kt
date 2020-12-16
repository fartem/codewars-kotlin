package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5bd00c99dbc73908bb00057a
class AlphabeticalSequence(private val input: String) {

    fun solution(): String {
        return input
                .toLowerCase()
                .toCharArray()
                .sorted()
                .joinToString(",") {
                    @Suppress("MagicNumber")
                    it.toString().repeat(it.toInt() - 96).capitalize()
                }
    }

}
