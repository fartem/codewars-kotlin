package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.*
import org.junit.Test

class MaximumLengthDifferenceTest {

    @Test
    fun test() {
        assertEquals(
                13,
                MaximumLengthDifference(
                        arrayOf(
                                "hoqq",
                                "bbllkw",
                                "oox",
                                "ejjuyyy",
                                "plmiis",
                                "xxxzgpsssa",
                                "xxwwkktt",
                                "znnnnfqknaz",
                                "qqquuhii",
                                "dvvvwz"
                        ),
                        arrayOf(
                                "cccooommaaqqoxii",
                                "gggqaffhhh",
                                "tttoowwwmmww"
                        )
                ).solution()
        )
        assertEquals(
                10,
                MaximumLengthDifference(
                        arrayOf(
                                "ejjjjmmtthh",
                                "zxxuueeg",
                                "aanlljrrrxx",
                                "dqqqaaabbb",
                                "oocccffuucccjjjkkkjyyyeehh"
                        ),
                        arrayOf("bbbaaayddqbbrrrv")
                ).solution()
        )

    }

}
