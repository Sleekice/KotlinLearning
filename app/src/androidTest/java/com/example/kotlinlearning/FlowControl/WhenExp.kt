package com.example.kotlinlearning.FlowControl

fun main(args: Array<String>) {
    //Functions
    whenEx("A")


    //Basic Concatenation
    val a = "Statement 1"
    val b = "Statement 2"
    val c = "Statement 3"

    println("Enter operator ++")
    val operator = readLine()

    val result = when (operator) {
        "++" -> a + b + c
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}

fun whenEx(n:String) {


    when (n) {
        "A"-> println("n is a positive integer less than 4.")
        "B" -> println("n is zero")
        "E" -> println("n is a negative integer greater than 3.")
    }
}
