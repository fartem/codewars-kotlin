package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/526c7363236867513f0005ca
class LeapYear(private val input: Int) {

    fun solution(): Boolean {
        @Suppress("MagicNumber")
        return input % 4 == 0 && (input % 400 == 0 || input % 100 != 0)
    }

}
