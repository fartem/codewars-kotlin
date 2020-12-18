package com.smlnskgmail.jaman.codewarskotlin.kyu4

import org.junit.Assert.assertEquals
import org.junit.Test

class MostFrequentlyUsedWordsInATextTest {

    @Test
    fun sampleTests() {
        assertEquals(
                listOf("e", "d", "a"),
                MostFrequentlyUsedWordsInAText(
                        "a a a  b  c c  d d d d  e e e e e"
                ).solution()
        )
        assertEquals(
                listOf("e", "ddd", "aa"),
                MostFrequentlyUsedWordsInAText(
                        "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"
                ).solution()
        )
        assertEquals(
                listOf("won't", "wont"),
                MostFrequentlyUsedWordsInAText(
                        "  //wont won't won't "
                ).solution()
        )
        assertEquals(
                listOf("e"),
                MostFrequentlyUsedWordsInAText(
                        "  , e   .. "
                ).solution()
        )
        assertEquals(
                emptyList<String>(),
                MostFrequentlyUsedWordsInAText(
                        "  ...  "
                ).solution()
        )
        assertEquals(
                emptyList<String>(),
                MostFrequentlyUsedWordsInAText(
                        "  '  "
                ).solution()
        )
        assertEquals(
                emptyList<String>(),
                MostFrequentlyUsedWordsInAText(
                        "  '''  "
                ).solution()
        )
        assertEquals(
                listOf("a", "of", "on"),
                MostFrequentlyUsedWordsInAText(
                        sequenceOf(
                                "In a village of La Mancha, the name of which I have no desire to call to",
                                "mind, there lived not long since one of those gentlemen that keep a lance",
                                "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                                "coursing. An olla of rather more beef than mutton, a salad on most",
                                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                                "on Sundays, made away with three-quarters of his income."
                        ).joinToString("\n")
                ).solution()
        )
    }

}
