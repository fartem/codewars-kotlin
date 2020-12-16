package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class FindScreenSizeTest {

    @Test
    fun test4By3() {
        assertEquals(
                "1024x768",
                FindScreenSize(
                        1024,
                        "4:3"
                ).solution()
        )
    }

    @Test
    fun test16By9() {
        assertEquals(
                "1280x720",
                FindScreenSize(
                        1280,
                        "16:9"
                ).solution()
        )
    }

    @Test
    fun test32By9() {
        assertEquals(
                "3840x1080",
                FindScreenSize(
                        3840,
                        "32:9"
                ).solution()
        )
    }

}
