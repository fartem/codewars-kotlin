package com.smlnskgmail.jaman.codewarskotlin.kyu8

// https://www.codewars.com/kata/5aa736a455f906981800360d
class TheFeastOfManyBeasts(
        private val beast: String,
        private val dish: String
) {

    fun solution(): Boolean {
        return beast.first() == dish.first() && beast.last() == dish.last()
    }

}
