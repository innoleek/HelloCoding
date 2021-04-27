package com.example.hellocoding.class1Lecture

import org.junit.Test

class StringLecture {
    @Test
    fun `print name`() {
        var name: String = ""
        println(name)
    }

    @Test
    fun `concatenation`() {
        var firstText: String = "Play"
        var secondText: String = "basket"
        var thirdText: String = "ball"
        var combinedText = firstText + secondText + thirdText
        println(combinedText)
    }

    @Test
    fun `make new line`() {
        var sentence: String = "I like eating an apple. Apple is delicious."
        println(sentence)
    }
}