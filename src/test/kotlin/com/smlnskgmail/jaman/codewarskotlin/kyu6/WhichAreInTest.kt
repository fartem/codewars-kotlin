package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class WhichAreInTest {

    @Test
    fun testFixed() {
        assertArrayEquals(
                arrayOf("live", "strong"),
                WhichAreIn(
                        arrayOf("xyz", "live", "strong"),
                        arrayOf("lively", "alive", "harp", "sharp", "armstrong")
                ).solution()
        )
        assertArrayEquals(
                arrayOf("arp", "live", "strong"),
                WhichAreIn(
                        arrayOf("live", "strong", "arp"),
                        arrayOf("lively", "alive", "harp", "sharp", "armstrong")
                ).solution()
        )
        assertArrayEquals(
                arrayOf<String>(),
                WhichAreIn(
                        arrayOf("tarp", "mice", "bull"),
                        arrayOf("lively", "alive", "harp", "sharp", "armstrong")
                ).solution()
        )
    }

}
