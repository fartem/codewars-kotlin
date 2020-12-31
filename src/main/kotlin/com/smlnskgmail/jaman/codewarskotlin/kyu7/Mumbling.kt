package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
class Mumbling(
        private val input: String
) {

    fun solution(): String {
        val result = StringBuilder()
        val inputList = input.toList()
        input.toList().forEachIndexed { index, c ->
            val letter = c.toString()
            val end = if (inputList.size != index + 1) "-" else ""
            result.append("${letter.toUpperCase()}${letter.toLowerCase().repeat(index)}$end")
        }
        return result.toString()
    }

}
