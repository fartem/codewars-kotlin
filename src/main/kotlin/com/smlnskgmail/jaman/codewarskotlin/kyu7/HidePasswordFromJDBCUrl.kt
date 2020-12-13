package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5a726f16373c2ee6c60000db
class HidePasswordFromJDBCUrl(private val input: String) {

    fun solution(): String {
        return Regex("(?<=password=)[^&]*").replace(input) { "*".repeat(it.value.length) }
    }

}
