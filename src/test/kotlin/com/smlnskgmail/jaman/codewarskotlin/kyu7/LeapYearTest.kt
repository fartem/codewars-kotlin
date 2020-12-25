package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LeapYearTest {

    @Test
    fun `Basic Tests`() {
        assertFalse(LeapYear(1234).solution())
        assertTrue(LeapYear(1984).solution())
        assertTrue(LeapYear(2000).solution())
        assertFalse(LeapYear(2010).solution())
        assertFalse(LeapYear(2013).solution())
    }

}
