package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class MumblingTest {

    @Test
    fun test() {
        assertEquals(
                "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu",
                Mumbling("ZpglnRxqenU").solution()
        )
        assertEquals(
                "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb",
                Mumbling("NyffsGeyylB").solution()
        )
    }

}
