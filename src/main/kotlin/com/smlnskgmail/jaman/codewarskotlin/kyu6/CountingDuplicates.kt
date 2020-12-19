package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
class CountingDuplicates(private val input: String) {

    fun solution(): Int {
        return input
                .toList()
                .groupingBy { it.toLowerCase() }
                .eachCount()
                .filter { it.value > 1 }
                .size
    }

}
