package com.example.hellocoding.class1Homework

import junit.framework.TestCase.assertEquals
import org.junit.Test

class OperatorHomework {

    @Test
    fun `task 1`() {
        /*
            Find out what should go into input in order to make "result" equal to 0
         */
        var input = 1234
        var result = 10 - 50 / 2 + (input * 5)
        assertEquals(0, result)
    }
}