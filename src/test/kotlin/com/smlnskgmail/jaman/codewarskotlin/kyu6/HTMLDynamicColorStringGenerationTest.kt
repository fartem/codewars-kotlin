package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class HTMLDynamicColorStringGenerationTest {

    @Test
    fun symbolTest() {
        assertEquals(
                "#",
                HTMLDynamicColorStringGeneration(
                        Random()
                ).solution().substring(0, 1)
        )
    }

}
