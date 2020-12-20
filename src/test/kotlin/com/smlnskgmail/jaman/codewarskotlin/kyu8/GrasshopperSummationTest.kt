package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class GrasshopperSummationTest {

    @Test
    fun test1() {
        assertEquals(
                1,
                GrasshopperSummation(1).solution()
        )
    }

    @Test
    fun test2() {
        assertEquals(
                36,
                GrasshopperSummation(8).solution()
        )
    }

}
