package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class BeginnerLostWithoutAMapTest {

    @Test
    fun `Basic Tests`() {
        assertArrayEquals(
                intArrayOf(2, 4, 6),
                BeginnerLostWithoutAMap(
                        intArrayOf(1, 2, 3)
                ).solution()
        )
        assertArrayEquals(
                intArrayOf(8, 2, 2, 2, 8),
                BeginnerLostWithoutAMap(
                        intArrayOf(4, 1, 1, 1, 4)
                ).solution()
        )
        assertArrayEquals(
                intArrayOf(4, 4, 4, 4, 4, 4),
                BeginnerLostWithoutAMap(
                        intArrayOf(2, 2, 2, 2, 2, 2)
                ).solution()
        )
    }

}
