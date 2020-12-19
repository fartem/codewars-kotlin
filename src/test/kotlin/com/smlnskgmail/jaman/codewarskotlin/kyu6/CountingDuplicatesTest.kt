package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class CountingDuplicatesTest {

    @Test
    fun `abcde returns zero`() {
        assertEquals(
                0,
                CountingDuplicates(
                        "abcde"
                ).solution()
        )
    }

    @Test
    fun `abcdea returns one`() {
        assertEquals(
                1,
                CountingDuplicates(
                        "abcdea"
                ).solution()
        )
    }

    @Test
    fun `indivisibility returns one`() {
        assertEquals(
                1,
                CountingDuplicates(
                        "indivisibility"
                ).solution()
        )
    }

    @Test
    fun `really long string containing duplicates returns three`() {
        assertEquals(
                3,
                CountingDuplicates(
                        "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
                ).solution()
        )
    }

}
