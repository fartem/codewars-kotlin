package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class PlusMinusPlusPlusCountTest {

    @Test
    fun testFixed() {
        assertEquals(
                0,
                PlusMinusPlusPlusCount(
                        arrayOf(1, 3, 4, 5)
                ).solution()
        )
        assertEquals(
                0,
                PlusMinusPlusPlusCount(
                        arrayOf()
                ).solution()
        )
        assertEquals(
                2,
                PlusMinusPlusPlusCount(
                        arrayOf(1, -3, -4, 0, 5)
                ).solution()
        )
        assertEquals(
                3,
                PlusMinusPlusPlusCount(
                        arrayOf(-47, 84, -30, -11, -5, 74, 77)
                ).solution()
        )
    }

}
