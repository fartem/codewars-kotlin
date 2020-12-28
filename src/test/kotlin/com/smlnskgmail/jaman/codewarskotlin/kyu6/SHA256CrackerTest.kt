package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class SHA256CrackerTest {

    @Test
    fun testExamples() {
        assertEquals(
                "GoOutside",
                SHA256Cracker(
                        "b8c49d81cb795985c007d78379e98613a4dfc824381be472238dbd2f974e37ae",
                        "deGioOstu"
                ).solution()
        )
        assertNull(
                SHA256Cracker(
                        "f58262c8005bb64b8f99ec6083faf050c502d099d9929ae37ffed2fe1bb954fb",
                        "abc"
                ).solution()
        )
    }

}
