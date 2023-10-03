package com.example.kotlinlearning.Advance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
    val job1 = GlobalScope.launch { //Linear Execution
        delay(2900L)
        println("Buddy!!1")
    }

    val job2 = GlobalScope.async {//Parallel Execution
        delay(10000L)
        println("Hi ")
    }
    val job3 = runBlocking {//Parallel Execution
        delay(2900L)
        println("Buddy!!1")
    }
    print("Hello Outside")
}}