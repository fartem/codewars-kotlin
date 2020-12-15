package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TheFeastOfManyBeastsTest {

    @Test
    fun testFixed() {
        assertTrue(
                TheFeastOfManyBeasts(
                        "great blue heron",
                        "garlic naan"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "chickadee",
                        "chocolate cake"
                ).solution()
        )
        assertFalse(
                TheFeastOfManyBeasts(
                        "brown bear",
                        "bear claw"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "marmot",
                        "mulberry tart"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "porcupine",
                        "pie"
                ).solution()
        )
        assertFalse(
                TheFeastOfManyBeasts(
                        "electric eel",
                        "lasagna"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "slow loris",
                        "salsas"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "ox", "orange lox"
                ).solution()
        )
        assertTrue(
                TheFeastOfManyBeasts(
                        "blue-footed booby",
                        "blueberry"
                ).solution()
        )
    }

}
