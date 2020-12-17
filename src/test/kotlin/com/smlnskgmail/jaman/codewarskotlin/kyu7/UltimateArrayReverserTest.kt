package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class UltimateArrayReverserTest {

    @Test
    fun fixedTest1() {
        assertEquals(
                listOf(
                        "!",
                        "eilt",
                        "onn",
                        "acIdn",
                        "ast",
                        "t",
                        "ubgibe",
                        "kilI"
                ),
                UltimateArrayReverser(
                        listOf(
                                "I",
                                "like",
                                "big",
                                "butts",
                                "and",
                                "I",
                                "cannot",
                                "lie!"
                        )
                ).solution()
        )
    }

    @Test
    fun fixedTest2() {
        assertEquals(
                listOf(
                        "How",
                        "many",
                        "shrimp",
                        "do",
                        "you",
                        "have",
                        "to",
                        "eat",
                        "before",
                        "your",
                        "skin",
                        "starts",
                        "to",
                        "turn",
                        "pink?"
                ),
                UltimateArrayReverser(
                        listOf(
                                "?kn",
                                "ipnr",
                                "utotst",
                                "ra",
                                "tsn",
                                "iksr",
                                "uo",
                                "yer",
                                "ofebta",
                                "eote",
                                "vahu",
                                "oyodpm",
                                "ir",
                                "hsyn",
                                "amwoH"
                        )
                ).solution()
        )
    }

}
