package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class AlphabetWarAirstrikeLettersMassacreTest {

    @Test
    fun testFixed() {
        assertEquals(
                "Right side wins!",
                AlphabetWarAirstrikeLettersMassacre(
                        "z"
                ).solution()
        )
        assertEquals(
                "Let's fight again!",
                AlphabetWarAirstrikeLettersMassacre(
                        "****"
                ).solution()
        )
        assertEquals(
                "Let's fight again!",
                AlphabetWarAirstrikeLettersMassacre(
                        "z*dq*mw*pb*s"
                ).solution()
        )
        assertEquals(
                "Let's fight again!",
                AlphabetWarAirstrikeLettersMassacre(
                        "zdqmwpbs"
                ).solution()
        )
        assertEquals(
                "Right side wins!",
                AlphabetWarAirstrikeLettersMassacre(
                        "zz*zzs"
                ).solution()
        )
        assertEquals(
                "Left side wins!",
                AlphabetWarAirstrikeLettersMassacre(
                        "sz**z**zs"
                ).solution()
        )
        assertEquals(
                "Left side wins!",
                AlphabetWarAirstrikeLettersMassacre(
                        "z*z*z*zs"
                ).solution()
        )
        assertEquals(
                "Left side wins!",
                AlphabetWarAirstrikeLettersMassacre(
                        "*wwwwww*z*"
                ).solution()
        )
    }

}
