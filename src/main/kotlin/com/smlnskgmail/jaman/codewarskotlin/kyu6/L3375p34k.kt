package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/543bfbecdef6345f52000e4d
class L3375p34k : Encoder() {

    override fun encode(source: String?): String {
        return (source ?: "").asSequence().map {
            when (it.toLowerCase()) {
                'a' -> "4"
                'e' -> "3"
                'l' -> "1"
                'm' -> "/^^\\"
                'o' -> "0"
                'u' -> "(_)"
                else -> it.toString()
            }
        }.joinToString("")
    }

}

abstract class Encoder {

    abstract fun encode(source: String?): String

}
