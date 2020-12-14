package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.*
import org.junit.Test

class PredictYourAgeTest {

    @Test
    fun basicTest() {
        assertEquals(
                86,
                PredictYourAge(65, 60, 75, 55, 60, 63, 64, 45).solution()
        )
        assertEquals(
                79,
                PredictYourAge(32, 54, 76, 65, 34, 63, 64, 45).solution()
        )
    }

}
