package com.smlnskgmail.jaman.codewarskotlin.kyu6

import org.junit.Assert.assertEquals
import org.junit.Test

class DecomposeDoubleStrandDNAInto6ReadingFramesTest {

    @Test
    fun basic() {
        assertEquals(
                "Frame 1: AGG TGA CAC CGC AAG CCT TAT ATT AGC\nFrame 2: A GGT GAC ACC GCA AGC CTT ATA TTA GC\nFrame 3: AG GTG ACA CCG CAA GCC TTA TAT TAG C\n\nReverse Frame 1: GCT AAT ATA AGG CTT GCG GTG TCA CCT\nReverse Frame 2: G CTA ATA TAA GGC TTG CGG TGT CAC CT\nReverse Frame 3: GC TAA TAT AAG GCT TGC GGT GTC ACC T",
                DecomposeDoubleStrandDNAInto6ReadingFrames(
                        "AGGTGACACCGCAAGCCTTATATTAGC"
                ).solution()
        )
    }

}
