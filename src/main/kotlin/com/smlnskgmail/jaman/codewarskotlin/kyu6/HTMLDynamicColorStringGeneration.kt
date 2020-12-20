package com.smlnskgmail.jaman.codewarskotlin.kyu6

import java.util.*

// https://www.codewars.com/kata/56f1c6034d0c330e4a001059
class HTMLDynamicColorStringGeneration(
        private val input: Random
) {

    fun solution(): String {
        @Suppress("MagicNumber")
        return "#%02X%02X%02X".format(
                input.nextInt(256),
                input.nextInt(256),
                input.nextInt(256)
        )
    }

}
