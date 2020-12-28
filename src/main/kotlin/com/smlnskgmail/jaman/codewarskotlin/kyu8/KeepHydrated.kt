package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/582cb0224e56e068d800003c
class KeepHydrated(
        private val input: Double
) {

    fun solution(): Int {
        @Suppress("MagicNumber")
        return (input * 0.5).toInt()
    }

}
