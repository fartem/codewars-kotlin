package com.smlnskgmail.jaman.codewarskotlin.kyu7

import kotlin.math.ceil

// https://www.codewars.com/kata/562f91ff6a8b77dfe900006e
class GoingToTheCinema(
        private val card: Int,
        private val ticket: Int,
        private val percentage: Double
) {

    fun solution(): Int {
        var systemA = 0
        var systemB = card.toDouble()
        var prev = ticket.toDouble()
        var times = 0
        while (systemA <= ceil(systemB)) {
            systemA += ticket
            prev *= percentage
            systemB += prev
            times++
        }
        return times
    }

}
