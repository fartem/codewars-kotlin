package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f
class FindScreenSize(
        private val width: Int,
        private val ratio: String
) {

    fun solution(): String {
        return "%dx%d".format(
                width,
                (ratio
                        .substring(ratio.indexOf(":") + 1)
                        .toDouble()
                        .div(ratio.substring(0, ratio.indexOf(":")).toDouble()) * width).toInt()
        )
    }

}
