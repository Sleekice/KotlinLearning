package com.example.kotlinlearning.FlowControl


// if-else traditional Usage
fun main(args: Array<String>) {
  //  println(multi(30,30))
   // ifExpressionEX()
    EqualTo()

    val number= 1000000000
    if (number > 0 && number <1000000) {
        print(" You are Broke\n")
    } else {
        print("You are Not so broke\n")
    }}


fun multi(num1: Int = 0, num2: Int = 0) :Int {
    /* val numOne = 30
    val numTwo = 30
*/

    var result =  num1 * num2
    return result
}

//Here an If statement if used as an expression.
fun ifExpressionEX() {
    val ch:String = "AEIOU"
    print("Enter A Character  To See If It's Vowel: ")
    val charUserInput = readLine()
    val result = if ( charUserInput.toString() !in ch) {
        "Not A Vowel"
    } else {
        "Vowel Found"
    }
    println(result)

}

//The curly braces are optional if the body of if has only one statement. For example,
/*.....
        //SKipped
*/

fun EqualTo() {

    val a = 100
    val b = -11
    val c = 1744762785363

    //Use Boolean Statement to Check if All three User Inputs are Equal

    val equalcheck = if (a==b && b.toLong() ==c && c.toInt() ==a) {
        println("$a,$b,$c are Equal To Each Other")
    } else if(!(a==b && b.toLong() ==c && c.toInt() ==a )) {
        println("$a,$b,$c are not Equal.")
    }
    else{
        "It won't even Get Here"
    }
}


