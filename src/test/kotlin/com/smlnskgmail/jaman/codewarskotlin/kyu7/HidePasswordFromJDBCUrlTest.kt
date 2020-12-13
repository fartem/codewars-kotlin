package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.*
import org.junit.Test

class HidePasswordFromJDBCUrlTest {

    @Test
    fun hidePasswordFromConnection() {
        assertEquals(
                "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****",
                HidePasswordFromJDBCUrl(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"
                ).solution()
        )
    }

}
