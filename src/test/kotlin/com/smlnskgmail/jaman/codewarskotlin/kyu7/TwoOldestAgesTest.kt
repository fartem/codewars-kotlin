package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class TwoOldestAgesTest {

    @Test
    fun basicTests() {
        assertEquals(
                listOf(45, 87),
                TwoOldestAges(
                        listOf(1, 5, 87, 45, 8, 8)
                ).solution()
        )
        assertEquals(
                listOf(18, 83),
                TwoOldestAges(
                        listOf(6, 5, 83, 5, 3, 18)
                ).solution()
        )
    }

}
