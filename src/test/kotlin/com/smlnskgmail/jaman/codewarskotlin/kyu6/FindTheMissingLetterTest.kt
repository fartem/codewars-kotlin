package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class FindTheMissingLetterTest {

    @Test
    fun exampleTests() {
        assertEquals(
                'e',
                FindTheMissingLetter(
                        charArrayOf('a', 'b', 'c', 'd', 'f')
                ).solution()
        )
        assertEquals(
                'P',
                FindTheMissingLetter(
                        charArrayOf('O', 'Q', 'R', 'S')
                ).solution()
        )
    }

}
