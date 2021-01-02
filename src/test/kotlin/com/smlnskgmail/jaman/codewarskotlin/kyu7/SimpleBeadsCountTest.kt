package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class SimpleBeadsCountTest {

    @Test
    fun testFixed() {
        assertEquals(
                0,
                SimpleBeadsCount(0).solution()
        )
        assertEquals(
                0,
                SimpleBeadsCount(1).solution()
        )
        assertEquals(
                4,
                SimpleBeadsCount(3).solution()
        )
        assertEquals(
                8,
                SimpleBeadsCount(5).solution()
        )
    }

}
