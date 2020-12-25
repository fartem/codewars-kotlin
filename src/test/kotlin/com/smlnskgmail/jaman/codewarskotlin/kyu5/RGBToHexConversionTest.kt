package com.smlnskgmail.jaman.codewarskotlin.kyu5

import org.junit.Assert.assertEquals
import org.junit.Test

class RGBToHexConversionTest {

    @Test
    fun testFixed() {
        assertEquals(
                "000000",
                RGBToHexConversion(0, 0, 0).solution()
        )
        assertEquals(
                "000000",
                RGBToHexConversion(0, 0, -20).solution()
        )
        assertEquals(
                "FFFFFF",
                RGBToHexConversion(300, 255, 255).solution()
        )
        assertEquals(
                "ADFF2F",
                RGBToHexConversion(173, 255, 47).solution()
        )
        assertEquals(
                "9400D3",
                RGBToHexConversion(148, 0, 211).solution()
        )
    }

}
