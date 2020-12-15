package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class FIXMEHelloTest {

    @Test
    fun testBob27Male() {
        assertEquals(
                "Hello. My name is Bob. I am 27. I am male.",
                FIXMEHello().setName("Bob").setAge(27).setSex('M').hello()
        )
    }

    @Test
    fun test27MaleBob() {
        assertEquals(
                "Hello. I am 27. I am male. My name is Bob.",
                FIXMEHello().setAge(27).setSex('M').setName("Bob").hello()
        )
    }

    @Test
    fun testAliceFemale() {
        assertEquals(
                "Hello. My name is Alice. I am female.",
                FIXMEHello().setName("Alice").setSex('F').hello()
        )
    }

    @Test
    fun testBatman() {
        assertEquals(
                "Hello. My name is Batman.",
                FIXMEHello().setName("Batman").hello()
        )
    }

}
