package com.learn_loner.kotlin_basic_to_advanced.hello_world

fun main(args: Array<String>) {
    println("Enter Two number")
    val (a, b) = readln().split(' ')
    println("Max number is: ${maxNum(a.toInt(), b.toInt())}")
}

private fun maxNum(a: Int, b: Int): Int {
    return if (a > b) {
        println("The value of a is $a")
        a
    } else {
        println("The value of b is $b")
        b
    }
}