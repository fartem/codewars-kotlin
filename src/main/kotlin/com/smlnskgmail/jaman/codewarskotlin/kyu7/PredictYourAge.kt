package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5aff237c578a14752d0035ae
class PredictYourAge(vararg input: Int) {

    private var ages: IntArray = input;

    fun solution(): Int {
        return kotlin.math.floor(kotlin.math.sqrt(ages.map { i -> i * i }.sum().toDouble())).toInt() / 2
    }

}
