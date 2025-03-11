package com.learn_loner.kotlin_basic_to_advanced.conditional_statements

fun main() {
    validCountry("English")
    validName("John")
    validName(50)
    validCountryUseAnExpression("German")
}

fun validCountry(x: String) {
    when(x) {
        "English" -> println("How are you?")
        "German" -> println("Wie geht es dir?")
        else -> println("I don't know that language yet :(")
    }
}

fun validName(x: Any) {
    val names = listOf("John", "Sarah", "Tim", "Maggie")
    when (x) {
        in names -> println("I know that name!")
        !in 1..10 -> println("Argument was not in the range from 1 to 10")
        is String -> println(x.length)
    }
}

fun validCountryUseAnExpression(x: String) {
    val greeting = when(x) {
        "English" -> println("How are you?")
        "German" -> println("Wie geht es dir?")
        else -> println("I don't know that language yet :(")
    }
    println(greeting)
}