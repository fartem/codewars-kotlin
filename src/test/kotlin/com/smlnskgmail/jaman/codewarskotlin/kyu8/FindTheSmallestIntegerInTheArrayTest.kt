package com.smlnskgmail.jaman.codewarskotlin.kyu8

import org.junit.Assert.assertEquals
import org.junit.Test

class FindTheSmallestIntegerInTheArrayTest {

    @Test
    fun exampleTests() {
        assertEquals(
                10,
                FindTheSmallestIntegerInTheArray(
                        listOf(15, 20, 10, 17, 22, 9001)
                ).solution()
        )
    }

}
