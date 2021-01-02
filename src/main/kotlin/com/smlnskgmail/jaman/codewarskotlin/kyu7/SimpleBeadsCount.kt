package com.smlnskgmail.jaman.codewarskotlin.kyu7

import kotlin.math.max

// https://www.codewars.com/kata/58712dfa5c538b6fc7000569
class SimpleBeadsCount(
        private val input: Int
) {

    fun solution(): Int = max(0, (input - 1) * 2)

}
