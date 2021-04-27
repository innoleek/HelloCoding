package com.example.hellocoding.class1Lecture

import org.junit.Test

class OperatorLecture {

    @Test
    fun `plus`() {
        var firstNumber: Int = 10
        var secondNumber: Int = 20

        var result: Int = firstNumber + secondNumber
        println(result)
    }

    @Test
    fun `minus`() {
        var firstNumber: Int = 30
        var secondNumber: Int = 20

        var result: Int = firstNumber - secondNumber
        println(result)
    }

    @Test
    fun `multiply`() {
        var firstNumber: Int = 5
        var secondNumber: Int = 10

        var result: Int = firstNumber * secondNumber
        println(result)
    }

    @Test
    fun `divide`() {
        var firstNumber: Int = 100
        var secondNumber: Int = 10

        var result: Int = firstNumber / secondNumber
        println(result)
    }

    @Test
    fun `equal`() {
        var firstNumber: Int = 10
        var secondNumber: Int = 5

        if (firstNumber == secondNumber) {
            println("equal")
        }
    }

    @Test
    fun `greater`() {
        var firstNumber: Int = 20
        var secondNumber: Int = 10

        if (firstNumber > secondNumber) {
            println("greater")
        }
    }

    @Test
    fun `less`() {
        var firstNumber: Int = 20
        var secondNumber: Int = 10

        if (firstNumber < secondNumber) {
            println("less")
        }
    }

    @Test
    fun `greater or equal`() {
        var firstNumber: Int = 20
        var secondNumber: Int = 20

        if (firstNumber == secondNumber) {
            println("equal")
        }

        if (firstNumber >= secondNumber) {
            println("greater or equal")
        }
    }

    @Test
    fun `not equal to Number`() {
        var firstNumber: Int = 20
        var secondNumber: Int = 20

        if (firstNumber != secondNumber) {
            println("not equal to Number")
        }
    }

    @Test
    fun `equal | not equal to String`() {
        var firstText: String = "Kyungmin Lee"
        var secondText: String = "Min Lee"

        if (firstText == secondText) {
            println("equal to string")
        }

        if (firstText != secondText) {
            println("not equal to String")
        }
    }
}