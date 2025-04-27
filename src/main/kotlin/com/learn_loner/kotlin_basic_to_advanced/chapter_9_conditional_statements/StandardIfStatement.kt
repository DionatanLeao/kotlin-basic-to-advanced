package com.learn_loner.kotlin_basic_to_advanced.chapter_9_conditional_statements

fun main() {
    validLength("Hello!")
    whenIfElseChains("Hello!")
}

fun validLength(str: String) {
    if (str.isEmpty()) {
        println("The string is empty!")
    } else if (str.length > 5) {
        println("The string is short!")
    } else {
        println("The string is long!")
    }
}

fun whenIfElseChains(str: String) {
    when {
        str.isEmpty() -> println("The string is empty!")
        str.length > 5 -> println("The string is short!")
        else -> println("The string is long!")
    }
}