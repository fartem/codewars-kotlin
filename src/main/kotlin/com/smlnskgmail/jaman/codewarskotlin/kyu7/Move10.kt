package com.smlnskgmail.jaman.codewarskotlin.kyu7

import java.util.stream.Collectors

class Move10(private val input: String) {

    fun solution(): String {
        @Suppress("MagicNumber")
        return input.chars().mapToObj { c ->
            var character = c + 10
            if (character > 122) {
                character = 96 + character - 122
            }
            character.toChar().toString()
        }.collect(Collectors.joining(""))
    }

}
