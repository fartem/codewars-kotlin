package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class ComplementaryDNATest {

    @Test
    fun test01() {
        assertEquals(
                "TTTT",
                ComplementaryDNA("AAAA").solution()
        )
    }

    @Test
    fun test02() {
        assertEquals(
                "TAACG",
                ComplementaryDNA("ATTGC").solution()
        )
    }

}
