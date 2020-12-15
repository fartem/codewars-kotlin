package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class CatYearsDogYearsTest {

    @Test
    fun one() {
        assertArrayEquals(
                arrayOf(1, 15, 15),
                CatYearsDogYears(1).solution()
        )
    }

    @Test
    fun two() {
        assertArrayEquals(
                arrayOf(2, 24, 24),
                CatYearsDogYears(2).solution()
        )
    }

    @Test
    fun ten() {
        assertArrayEquals(
                arrayOf(10, 56, 64),
                CatYearsDogYears(10).solution()
        )
    }

}
