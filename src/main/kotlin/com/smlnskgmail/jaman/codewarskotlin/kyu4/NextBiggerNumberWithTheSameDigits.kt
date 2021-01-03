package com.smlnskgmail.jaman.codewarskotlin.kyu4

class NextBiggerNumberWithTheSameDigits(
        private val input: Long
) {

    @Suppress("ComplexMethod", "ReturnCount")
    fun solution(): Long {
        val splittedInput = input.toString()
                .split("")
                .filter { s -> s.isNotEmpty() }
        var pivot = -1
        for (i in splittedInput.size - 1 downTo 0) {
            val nextIndex = i - 1
            if (nextIndex >= 0 && splittedInput[i] > splittedInput[nextIndex]) {
                pivot = nextIndex
                break
            }
        }

        if (pivot == -1) {
            return -1
        }

        val rightSide = ArrayList(splittedInput.subList(pivot, splittedInput.size))
        val extractedPivot = rightSide.removeAt(0)
        var minimum: String? = null
        var minimumIndex = -1
        rightSide.indices.forEach {
            if (rightSide[it] > extractedPivot) {
                val number = rightSide[it]
                if (minimum == null || number < minimum!!) {
                    minimum = number
                    minimumIndex = it
                }
            }
        }

        if (minimumIndex == -1) {
            return -1
        }

        rightSide.removeAt(minimumIndex)
        rightSide.add(extractedPivot)
        rightSide.sort()

        val result = "${
            splittedInput.subList(0, pivot)
                    .joinToString("")
        }$minimum${rightSide.joinToString("")}"
                .toLong()
        if (result < input) {
            return -1
        }
        return result
    }

}
