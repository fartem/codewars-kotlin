package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class GrowthOfAPopulationTest {

    @Test
    fun test1() {
        assertEquals(
                15,
                GrowthOfAPopulation(
                        1500,
                        5.0,
                        100,
                        5000
                ).solution()
        )
        assertEquals(
                10,
                GrowthOfAPopulation(
                        1500000,
                        2.5,
                        10000,
                        2000000
                ).solution()
        )
    }

}
