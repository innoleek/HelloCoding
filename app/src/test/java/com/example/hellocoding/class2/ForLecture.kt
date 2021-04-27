package com.example.hellocoding.class2

import org.junit.Test

class ForLecture {

    @Test
    fun `for Number`() {
        for (number in 0..5) {
            println(number)
        }
    }

    @Test
    fun `for String`() {
        for (count in 0..5) {
            println(count)
        }
    }
}