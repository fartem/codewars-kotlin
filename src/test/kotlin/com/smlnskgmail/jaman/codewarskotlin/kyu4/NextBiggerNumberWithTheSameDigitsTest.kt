package com.smlnskgmail.jaman.codewarskotlin.kyu4

import org.junit.Assert.assertEquals
import org.junit.Test

class NextBiggerNumberWithTheSameDigitsTest {

    @Test
    fun basicTests() {
        assertEquals(
                21,
                NextBiggerNumberWithTheSameDigits(
                        12
                ).solution()
        )
        assertEquals(
                531,
                NextBiggerNumberWithTheSameDigits(
                        513
                ).solution()
        )
        assertEquals(
                2071,
                NextBiggerNumberWithTheSameDigits(
                        2017
                ).solution()
        )
        assertEquals(
                441,
                NextBiggerNumberWithTheSameDigits(
                        414
                ).solution()
        )
        assertEquals(
                414,
                NextBiggerNumberWithTheSameDigits(
                        144
                ).solution()
        )
    }

}
