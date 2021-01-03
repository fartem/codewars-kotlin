package com.smlnskgmail.jaman.codewarskotlin.kyu6

class WhichAreIn(
        private val firstArray: Array<String>,
        private val secondArray: Array<String>
) {

    fun solution(): Array<String> {
        return firstArray
                .filter { s -> secondArray.find { d -> d.contains(s) } != null }
                .distinct()
                .sorted()
                .toTypedArray()
    }

}
