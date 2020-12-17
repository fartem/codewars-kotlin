package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5c3433a4d828182e420f4197
class UltimateArrayReverser(private val input: List<String>) {

    fun solution(): List<String> {
        var contentsReversed = input.joinToString("").reversed()
        val output = mutableListOf<String>()
        input.forEach { word ->
            val newWord = contentsReversed.take(word.length)
            contentsReversed = contentsReversed.drop(word.length)
            output.add(newWord)
        }
        return output
    }

}
