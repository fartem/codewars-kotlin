package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class Move10Test {

    @Test
    fun `Example tests`() {
        assertEquals(
                "docdmkco",
                Move10("testcase").solution()
        )
        assertEquals(
                "mynogkbc",
                Move10("codewars").solution()
        )
        assertEquals(
                "ohkwzvodocdrobo",
                Move10("exampletesthere").solution()
        )
    }

}
