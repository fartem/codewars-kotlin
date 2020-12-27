package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class GoingToTheCinemaTest {

    @Test
    fun test1() {
        assertEquals(
                43,
                GoingToTheCinema(
                        500,
                        15,
                        0.9
                ).solution()
        )
        assertEquals(
                24,
                GoingToTheCinema(
                        100,
                        10,
                        0.95
                ).solution()
        )
    }

}
