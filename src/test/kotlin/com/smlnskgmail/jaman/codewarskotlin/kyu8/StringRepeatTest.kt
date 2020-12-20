package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class StringRepeatTest {

    @Test
    fun test4a() {
        assertEquals(
                "aaaa",
                StringRepeat(4, "a").solution()
        )
    }

    @Test
    fun test3Hello() {
        assertEquals(
                "HelloHelloHello",
                StringRepeat(3, "Hello").solution()
        )
    }

    @Test
    fun test5empty() {
        assertEquals(
                "",
                StringRepeat(5, "").solution()
        )
    }

    @Test
    fun test0kata() {
        assertEquals(
                "",
                StringRepeat(0, "kata").solution()
        )
    }

}
