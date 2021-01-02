package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class AlphabetWarTest {

    @Test
    fun testFixed() {
        assertEquals(
                "Right side wins!",
                AlphabetWar("z").solution()
        )
        assertEquals(
                "Let's fight again!",
                AlphabetWar("zdqmwpbs").solution()
        )
        assertEquals(
                "Right side wins!",
                AlphabetWar("zzzzs").solution()
        )
        assertEquals(
                "Left side wins!",
                AlphabetWar("wwwwww").solution()
        )
    }

}
