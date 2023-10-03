package com.example.kotlinlearning


fun main() {
    // println("Hello, world!!!")

    //val -> Immutable/Static, cannot change the value.package
    //var -> Mutable/Variable, can change the value.package
    val kotlin = "😂"
    var variableKotlin = "☺️"

    variableKotlin = "Something new!"

    println(kotlin)
    println(variableKotlin)

    //int,double,float,String,Boolean. . .
    val dataTypeInt: Int = 12
    val dataTypeDouble: Double = 10.2
    val dataTypeString: String = "Any kind of message"
    val dataTypeBoolean: Boolean = true


    //NUllable variable / data types - > Datatype?

    var datatypeIntNull: Int? = null

    //DataTypeIntNull =12
    println(datatypeIntNull)

}