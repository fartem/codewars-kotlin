package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/59ca8246d751df55cc00014c
class IsHeGonnaSurvive(
        private val bullets: Int,
        private val dragons: Int
) {

    fun solution(): Boolean {
        return bullets >= dragons * 2
    }

}
