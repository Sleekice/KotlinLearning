package com.example.kotlinlearning.Advance

fun main(){
    var a: Int? = null


    a?.let{
        print(it)
    }

    a = 2
    a?.let{
        print(a)
    }
}