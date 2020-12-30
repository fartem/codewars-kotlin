package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.*
import org.junit.Test

class FindTheParityOutlierTest {

    @Test
    fun testExample() {
        assertEquals(
                3,
                FindTheParityOutlier(
                        arrayOf(2, 6, 8, -10, 3)
                ).solution()
        )
        assertEquals(
                206847684,
                FindTheParityOutlier(
                        arrayOf(
                                206847684,
                                1056521,
                                7,
                                17,
                                1901,
                                21104421,
                                7,
                                1,
                                35521,
                                1,
                                7781
                        )
                ).solution()
        )
        assertEquals(
                0,
                FindTheParityOutlier(
                        arrayOf(Integer.MAX_VALUE, 0, 1)
                ).solution()
        )
    }

}
