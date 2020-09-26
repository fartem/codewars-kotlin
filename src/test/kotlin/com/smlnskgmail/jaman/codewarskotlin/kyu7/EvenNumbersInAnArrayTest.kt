package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class EvenNumbersInAnArrayTest {

    @Test
    fun `Basic tests`() {
        assertEquals(
                listOf(4, 6, 8),
                EvenNumbersInAnArray(
                        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
                        3
                ).solution()
        )
        assertEquals(
                listOf(-8, 26),
                EvenNumbersInAnArray(
                        listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26),
                        2
                ).solution()
        )
        assertEquals(
                listOf(6),
                EvenNumbersInAnArray(
                        listOf(6, -25, 3, 7, 5, 5, 7, -3, 23),
                        1
                ).solution()
        )
    }

}
