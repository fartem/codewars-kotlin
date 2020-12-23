package com.smlnskgmail.jaman.codewarskotlin.kyu6

import java.util.stream.Collectors

// https://www.codewars.com/kata/58e2c062542a419083000033
class JavaFormatUnicodeEncoderDecoder(
        private val input: String?
) {

    fun decode(): String {
        @Suppress("MagicNumber")
        return input!!
                .split("\\u")
                .drop(1)
                .map { s -> Integer.parseInt(s, 16).toChar() }
                .joinToString("")
    }

    fun encode(): String? {
        return input!!
                .chars()
                .mapToObj { c -> "\\u%04x".format(c) }
                .collect(Collectors.joining())
    }

}
