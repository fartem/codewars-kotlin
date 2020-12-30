package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5663f5305102699bad000056
class MaximumLengthDifference(
        private val firstArray: Array<String>,
        private val secondArray: Array<String>
) {

    fun solution(): Int {
        return firstArray.flatMap { s1 -> secondArray.map { kotlin.math.abs(s1.length - it.length) } }.max() ?: -1
    }

}
