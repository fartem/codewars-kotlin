package com.smlnskgmail.jaman.codewarskotlin.kyu5

import org.junit.Assert.*
import org.junit.Test
import java.math.BigInteger

class LastDigitOfALargeNumberTest {

    @Test
    fun `Basic Tests`() {
        assertEquals(
                4,
                LastDigitOfALargeNumber(
                        BigInteger("4"),
                        BigInteger("1")
                ).solution()
        )
        assertEquals(
                6,
                LastDigitOfALargeNumber(
                        BigInteger("4"),
                        BigInteger("2")
                ).solution()
        )
        assertEquals(
                9,
                LastDigitOfALargeNumber(
                        BigInteger("9"),
                        BigInteger("7")
                ).solution()
        )
        assertEquals(
                0,
                LastDigitOfALargeNumber(
                        BigInteger("10"),
                        BigInteger("10000000000")
                ).solution()
        )
        assertEquals(
                1,
                LastDigitOfALargeNumber(
                        BigInteger("10"),
                        BigInteger("0")
                ).solution()
        )
        assertEquals(
                1,
                LastDigitOfALargeNumber(
                        BigInteger("9435756757744477447576867898089079079808908347583277453475"),
                        BigInteger("0")
                ).solution()
        )
        assertEquals(
                6,
                LastDigitOfALargeNumber(
                        BigInteger("1606938044258990275541962092341162602522202993782792835301376"),
                        BigInteger("2037035976334486086268445688409378161051468393665936250636140449354381299763336706183397376")
                ).solution()
        )
        assertEquals(
                7,
                LastDigitOfALargeNumber(
                        BigInteger("3715290469715693021198967285016729344580685479654510946723"),
                        BigInteger("68819615221552997273737174557165657483427362207517952651")
                ).solution()
        )
    }

}
