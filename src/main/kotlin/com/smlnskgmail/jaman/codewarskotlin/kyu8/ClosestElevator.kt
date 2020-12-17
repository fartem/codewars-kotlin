package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/5c374b346a5d0f77af500a5a
class ClosestElevator(
        private val left: Int,
        private val right: Int,
        private val call: Int
) {

    fun solution(): String {
        @Suppress("UseIfInsteadOfWhen")
        return when {
            kotlin.math.abs(left - call) < kotlin.math.abs(right - call) -> "left"
            else -> "right"
        }
    }

}
