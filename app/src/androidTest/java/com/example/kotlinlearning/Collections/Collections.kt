package com.example.kotlinlearning.Collections

/*
List Map Set
 */
fun main() {


    val numbers = listOf("1", "2", "3", "4")


    val firstNumber = numbers[0] // returns 1
    val lastNumber = numbers[numbers.size - 1] // returns 5

    //prints element at index 0
    //println(firstNumber)
    //prints size of array.
    //println(lastNumber)

    //Sorting
    //Sorts out items using Lexographical order.
    println(listOf("1", "2", "5", "aaa", "bb", "c").sortedWith(compareBy { it.length }))

    //Natural Sorting
    val sorting = listOf("one", "two", "three", "four")

    println("Sorted ascending: ${sorting.sorted()}")
    println("Sorted descending: ${sorting.sortedDescending()}")


    //Reverse order
    val animals = listOf("ape", "giant", "goat", "four")
    println(animals.reversed())

    //Reversing Mutable List.
    val revNumber = mutableListOf("one", "two", "three", "four")
    val reversedNumbers = revNumber.asReversed()
    println(reversedNumbers)
    revNumber.add("five")
    println(reversedNumbers)

    //Maps
    /*
    A collection that holds pairs of objects (keys and values)
    and supports efficiently retrieving the value corresponding to each key.

    Note: Map keys are unique; the map holds only one value for each key.
     */

    val ranks = mapOf(1 to "Asia", 2 to "Africa", 3 to "North America", 4 to "Australia")

    //method 1
    println("Continent having rank #1 is: " + ranks[1])
    //method 2
    println("Continent having rank #3 is: " + ranks.getValue(3))
    //method 3
    println("Continent having rank #4 is: " + ranks.getOrDefault(4, 0))
    // method  4

    // Prints Value at key (2)
    val team = ranks.getOrElse(2, { 0 })
    println(team)


    //lets make two values with same key
    val mapTest2 = mapOf(1 to "geeks1", 2 to "for", 1 to "geeks2")
    // return the map entries
    println("Entries of map : " + mapTest2.entries)
}