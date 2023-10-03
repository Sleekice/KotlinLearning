package com.example.kotlinlearning.Advance

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay

fun main(){
    GlobalScope.launch{
        this.CoroutineScope
        delay(1000L)

        println("Hi -> ")

        println("Buddy!")

        println()
    }
}