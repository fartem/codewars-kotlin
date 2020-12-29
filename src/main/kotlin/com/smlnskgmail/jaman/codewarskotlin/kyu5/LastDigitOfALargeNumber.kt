package com.smlnskgmail.jaman.codewarskotlin.kyu5

import java.math.BigInteger

// https://www.codewars.com/kata/5511b2f550906349a70004e1
class LastDigitOfALargeNumber(
        private val base: BigInteger,
        private val exponent: BigInteger
) {

    fun solution(): Int {
        return base.modPow(exponent, BigInteger("10")).toInt()
    }

}
