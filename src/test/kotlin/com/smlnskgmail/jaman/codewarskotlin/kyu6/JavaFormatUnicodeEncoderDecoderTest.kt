package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class JavaFormatUnicodeEncoderDecoderTest {

    @Test
    fun decode() {
        assertEquals(
                "hola",
                JavaFormatUnicodeEncoderDecoder(
                        "\\u0068\\u006f\\u006c\\u0061"
                ).decode()
        )
    }

    @Test
    fun encode() {
        assertEquals(
                "\\u0068\\u006f\\u006c\\u0061",
                JavaFormatUnicodeEncoderDecoder(
                        "hola"
                ).encode()
        )
    }

}
