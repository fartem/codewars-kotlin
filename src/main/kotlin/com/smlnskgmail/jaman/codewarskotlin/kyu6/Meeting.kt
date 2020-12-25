package com.smlnskgmail.jaman.codewarskotlin.kyu6

// https://www.codewars.com/kata/59df2f8f08c6cec835000012
class Meeting(private val input: String) {

    fun solution(): String {
        val meetingUnits = mutableListOf<MeetingUnit>()
        input.split(";").forEach {
            val separatorIndex = it.indexOf(":")
            meetingUnits.add(
                    MeetingUnit(
                            it.substring(0, separatorIndex).toUpperCase(),
                            it.substring(separatorIndex + 1, it.length).toUpperCase()
                    )
            )
        }
        return meetingUnits
                .sortedByDescending { it }
                .joinToString("") { it.toString() }
    }

    class MeetingUnit(
            private val name: String,
            private val lastName: String
    ) : Comparable<MeetingUnit> {

        override fun compareTo(other: MeetingUnit): Int {
            return if (other.lastName != lastName) {
                other.lastName.compareTo(lastName, true)
            } else {
                other.name.compareTo(name, true)
            }
        }

        override fun toString(): String {
            return "(${lastName}, ${name})"
        }

    }

}
