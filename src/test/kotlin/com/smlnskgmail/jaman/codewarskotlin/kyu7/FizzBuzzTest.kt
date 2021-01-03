package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `One Number`() {
        assertArrayEquals(
                arrayOf("1"),
                FizzBuzz(1).solution()
        )
    }

    @Test
    fun `Ten Numbers`() {
        assertArrayEquals(
                arrayOf(
                        "1",
                        "2",
                        "Fizz",
                        "4",
                        "Buzz",
                        "Fizz",
                        "7",
                        "8",
                        "Fizz",
                        "Buzz"
                ),
                FizzBuzz(10).solution()
        )
    }

}
