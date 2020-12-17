package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class ClosestElevatorTest {

    @Test
    fun testFixed() {
        assertEquals(
                "left",
                ClosestElevator(0, 1, 0).solution()
        )
        assertEquals(
                "right",
                ClosestElevator(0, 1, 1).solution()
        )
        assertEquals(
                "right",
                ClosestElevator(0, 1, 2).solution()
        )
        assertEquals(
                "right",
                ClosestElevator(0, 0, 0).solution()
        )
        assertEquals(
                "right",
                ClosestElevator(0, 2, 1).solution()
        )
    }

}
