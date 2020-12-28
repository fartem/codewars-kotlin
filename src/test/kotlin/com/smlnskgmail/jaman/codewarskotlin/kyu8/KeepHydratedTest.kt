package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class KeepHydratedTest {

    @Test
    fun testFixed() {
        assertEquals(
                1,
                KeepHydrated(2.0).solution()
        )
        assertEquals(
                0,
                KeepHydrated(1.4).solution()
        )
        assertEquals(
                6,
                KeepHydrated(12.3).solution()
        )
        assertEquals(
                0,
                KeepHydrated(0.82).solution()
        )
        assertEquals(
                5,
                KeepHydrated(11.8).solution()
        )
        assertEquals(
                893,
                KeepHydrated(1787.0).solution()
        )
        assertEquals(
                0,
                KeepHydrated(0.0).solution()
        )
    }

}
