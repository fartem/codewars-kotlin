package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class DecodeTheMorseCodeTest {

    @Test
    fun exampleTestCases() {
        assertEquals(
                "HEY JUDE",
                DecodeTheMorseCode(
                        ".... . -.--   .--- ..- -.. ."
                ).solution()
        )
    }

}
