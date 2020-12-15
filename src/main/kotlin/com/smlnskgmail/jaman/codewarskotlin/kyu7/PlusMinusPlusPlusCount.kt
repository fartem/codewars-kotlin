package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca
class PlusMinusPlusPlusCount(private val input: Array<Int>) {

    fun solution() = input
            .map { it < 0 }
            .zipWithNext { a, b -> a != b }
            .count { it }

}
