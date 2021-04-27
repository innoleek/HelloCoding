package com.example.hellocoding.class1Lecture

import org.junit.Test

class IfLecture {

    @Test
    fun `if`() {
        var sunnyDaysInSeattle = 200
        var sunnyDaysInVancouver = 100

        if (sunnyDaysInSeattle > sunnyDaysInVancouver) {
            println("Seattle has more sunny days!")
        }
    }

    @Test
    fun `if | else if`() {
        var sunnyDaysInSeattle = 200
        var sunnyDaysInVancouver = 100
        var sunnyDaysInNewYork = 50

        if (sunnyDaysInVancouver > sunnyDaysInSeattle) {
            println("Vancouver has more sunny days than Seattle!")
        } else if (sunnyDaysInVancouver > sunnyDaysInNewYork) {
            println("Vancouver has more sunny days than NewYork!")
        }
    }

    @Test
    fun `if | else if | else`() {
        var sunnyDaysInSeattle = 200
        var sunnyDaysInVancouver = 100
        var sunnyDaysInNewYork = 50
        var sunnyDaysInParis = 10

        if (sunnyDaysInParis > sunnyDaysInSeattle) {
            println("Paris has more sunny days than Seattle!")
        } else if (sunnyDaysInParis > sunnyDaysInVancouver) {
            println("Paris has more sunny days than Vancouver!")
        } else if (sunnyDaysInParis > sunnyDaysInNewYork) {
            println("Paris has more sunny days than NewYork!")
        } else {
            println("NewYork must be rainy!")
        }
    }
}