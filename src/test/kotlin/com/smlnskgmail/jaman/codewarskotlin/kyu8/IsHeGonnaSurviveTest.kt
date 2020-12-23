package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class IsHeGonnaSurviveTest {

    @Test
    fun testFixed() {
        assertTrue(IsHeGonnaSurvive(10, 5).solution())
        assertFalse(IsHeGonnaSurvive(7, 4).solution())
        assertFalse(IsHeGonnaSurvive(4, 5).solution())
        assertTrue(IsHeGonnaSurvive(100, 40).solution())
        assertFalse(IsHeGonnaSurvive(1500, 751).solution())
        assertFalse(IsHeGonnaSurvive(0, 1).solution())
    }

}
