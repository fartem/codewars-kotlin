package com.smlnskgmail.jaman.codewarskotlin.kyu6

import java.security.MessageDigest

// https://www.codewars.com/kata/587f0abdd8730aafd4000035
class SHA256Cracker(
        private val hash: String,
        private val chars: String
) {

    fun solution(): String? {
        val data = mutableListOf<String>()
        loadPermutations(data, chars, "")
        data.forEach {
            if (hash.equals(hashOf(it), ignoreCase = true)) {
                return it
            }
        }
        return null
    }

    private fun loadPermutations(
            data: MutableList<String>,
            input: String,
            result: String
    ) {
        if (input.isEmpty()) {
            data.add(result)
            return
        }
        for (i in input.indices) {
            val ch = input[i]
            val ros = input.substring(0, i) + input.substring(i + 1)
            loadPermutations(data, ros, result + ch)
        }
    }

    private fun hashOf(word: String): String {
        val hexChars = "0123456789ABCDEF"
        val messageDigest = MessageDigest.getInstance("SHA-256")
        val bytes = messageDigest.digest(word.toByteArray())
        val hash = StringBuilder(bytes.size * 2)
        bytes.forEach {
            val i = it.toInt()
            @Suppress("MagicNumber")
            hash.append(hexChars[i shr 4 and 0x0f])
            hash.append(hexChars[i and 0x0f])
        }
        return hash.toString()
    }

}
