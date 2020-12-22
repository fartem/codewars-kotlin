package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class BeginnerReduceButGrowTest {

    @Test
    fun exampleTests() {
        assertEquals(
                6,
                BeginnerReduceButGrow(
                        intArrayOf(1, 2, 3)
                ).solution()
        )
        assertEquals(
                16,
                BeginnerReduceButGrow(
                        intArrayOf(4, 1, 1, 1, 4)
                ).solution()
        )
        assertEquals(
                64,
                BeginnerReduceButGrow(
                        intArrayOf(2, 2, 2, 2, 2, 2)
                ).solution()
        )
    }

}
