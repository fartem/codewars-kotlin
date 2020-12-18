package com.smlnskgmail.jaman.codewarskotlin.kyu4

// https://www.codewars.com/kata/51e056fe544cf36c410000fb/
class MostFrequentlyUsedWordsInAText(private val input: String) {

    @Suppress("MagicNumber")
    fun solution(): List<String> {
        val words = Regex("[A-Za-z][A-Za-z']*")
                .findAll(input)
                .map { it.groupValues[0].toLowerCase() }
        val occurrences = mutableMapOf<String, Int>()
        words.forEach { occurrences.merge(it, 1, Integer::sum) }
        return occurrences
                .toList()
                .sortedByDescending { it.second }
                .map { it.first }
                .take(3)
    }

}
