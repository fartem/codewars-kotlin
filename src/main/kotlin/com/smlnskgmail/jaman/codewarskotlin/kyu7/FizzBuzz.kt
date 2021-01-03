package com.smlnskgmail.jaman.codewarskotlin.kyu7

// https://www.codewars.com/kata/5300901726d12b80e8000498
class FizzBuzz(
        private val input: Int
) {

    @Suppress("MagicNumber")
    fun solution(): Array<String> {
        return (1..input)
                .map { index ->
                    when {
                        index % 3 == 0 && index % 5 == 0 -> "FizzBuzz"
                        index % 3 == 0 -> "Fizz"
                        index % 5 == 0 -> "Buzz"
                        else -> index.toString()
                    }
                }
                .toTypedArray()
    }

}
