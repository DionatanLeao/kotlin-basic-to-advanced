package com.learn_loner.kotlin_basic_to_advanced.chapter_8_vararg

fun main() {
    printNumbers(0, 1)
    printNumbers(10, 20, 30, 500)
    val numbers = intArrayOf(1, 2, 3)
    printNumbers(*numbers)
    printNumbers(10, 30, *numbers, 30, 40)
}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        print("$number ")
    }
    println()
}