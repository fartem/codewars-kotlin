package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/57519060f2dac7ec95000c8e
class DecomposeDoubleStrandDNAInto6ReadingFrames(
        private val input: String
) {

    @Suppress("MagicNumber", "ComplexMethod", "MaxLineLength")
    fun solution(): String {
        val firstFrame = input
                .mapIndexed { index, c -> if ((index + 1) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()
        val secondFrame = input
                .mapIndexed { index, c -> if (index == 0 || index > 2 && (index + 3) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()
        val thirdFrame = input
                .mapIndexed { index, c -> if (index == 1 || index > 2 && (index + 5) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()

        val reversedDNA = input
                .reversed()
                .map {
                    when (it) {
                        'A' -> 'T'
                        'T' -> 'A'
                        'C' -> 'G'
                        else -> 'C'
                    }
                }
                .joinToString("")

        val firstFrameReversed = reversedDNA
                .mapIndexed { index, c -> if ((index + 1) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()
        val secondFrameReversed = reversedDNA
                .mapIndexed { index, c -> if (index == 0 || index > 2 && (index + 3) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()
        val thirdFrameReversed = reversedDNA
                .mapIndexed { index, c -> if (index == 1 || index > 2 && (index + 5) % 3 == 0) "$c " else c.toString() }
                .joinToString("")
                .trim()

        return "Frame 1: $firstFrame\n" +
                "Frame 2: $secondFrame\n" +
                "Frame 3: $thirdFrame\n\n" +
                "Reverse Frame 1: $firstFrameReversed\n" +
                "Reverse Frame 2: $secondFrameReversed\n" +
                "Reverse Frame 3: $thirdFrameReversed"
    }

}
