package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertTrue
import org.junit.Test

class L3375p34kTest {

    @Test
    fun simpleTest() {
        assertTrue(
                L3375p34k().encode("") == ""
        )
        assertTrue(
                L3375p34k().encode("abcdef") == "4bcd3f"
        )
    }

}
