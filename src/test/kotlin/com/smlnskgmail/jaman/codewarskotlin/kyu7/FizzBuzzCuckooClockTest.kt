package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzCuckooClockTest {

    @Test
    fun someBasicTimesTests() {
        assertEquals(
                "tick",
                FizzBuzzCuckooClock("13:34").solution()
        )
        assertEquals(
                "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo",
                FizzBuzzCuckooClock("21:00").solution()
        )
        assertEquals(
                "Fizz Buzz",
                FizzBuzzCuckooClock("11:15").solution()
        )
        assertEquals(
                "Fizz",
                FizzBuzzCuckooClock("03:03").solution()
        )
        assertEquals(
                "Cuckoo",
                FizzBuzzCuckooClock("14:30").solution()
        )
        assertEquals(
                "Buzz",
                FizzBuzzCuckooClock("08:55").solution()
        )
        assertEquals(
                "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo",
                FizzBuzzCuckooClock("00:00").solution()
        )
        assertEquals(
                "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo",
                FizzBuzzCuckooClock("12:00").solution()
        )
    }

}
