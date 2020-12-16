package com.smlnskgmail.jaman.codewarskotlin.kyu7

import org.junit.Assert.assertEquals
import org.junit.Test

class AlphabeticalSequenceTest {

    @Test
    fun testFixed() {
        assertEquals(
                "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz",
                AlphabeticalSequence(
                        "ZpglnRxqenU"
                ).solution()
        )
        assertEquals(
                "Bb,Eeeee,Ffffff,Ffffff,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Sssssssssssssssssss,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy",
                AlphabeticalSequence(
                        "NyffsGeyylB"
                ).solution()
        )
        assertEquals(
                "Bb,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Ooooooooooooooo,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Tttttttttttttttttttt,Uuuuuuuuuuuuuuuuuuuuu,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv",
                AlphabeticalSequence(
                        "MjtkuBovqrU"
                ).solution()
        )
        assertEquals(
                "Dddd,Eeeee,Iiiiiiiii,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Mmmmmmmmmmmmm,Nnnnnnnnnnnnnn,Ooooooooooooooo,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv",
                AlphabeticalSequence(
                        "EvidjUnokmM"
                ).solution()
        )
        assertEquals(
                "Bb,Bb,Ccc,Ccc,Dddd,Eeeee,Hhhhhhhh,Iiiiiiiii,Nnnnnnnnnnnnnn,Vvvvvvvvvvvvvvvvvvvvvv,Xxxxxxxxxxxxxxxxxxxxxxxx",
                AlphabeticalSequence(
                        "HbideVbxncC"
                ).solution()
        )
    }

}
