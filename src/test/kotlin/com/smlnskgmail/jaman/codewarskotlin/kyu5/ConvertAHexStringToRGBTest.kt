package com.smlnskgmail.jaman.codewarskotlin.kyu5

import org.junit.Assert.*
import org.junit.Test

class ConvertAHexStringToRGBTest {

    @Test
    fun testFixed() {
        assertEquals(
                RGB(r = 255, g = 153, b = 51),
                ConvertAHexStringToRGB("#FF9933").solution()
        )
        assertEquals(
                RGB(r = 190, g = 173, b = 237),
                ConvertAHexStringToRGB("#beaded").solution()
        )
        assertEquals(
                RGB(r = 0, g = 0, b = 0),
                ConvertAHexStringToRGB("#000000").solution()
        )
        assertEquals(
                RGB(r = 17, g = 17, b = 17),
                ConvertAHexStringToRGB("#111111").solution()
        )
        assertEquals(
                RGB(r = 250, g = 52, b = 86),
                ConvertAHexStringToRGB("#Fa3456").solution()
        )
    }

}
