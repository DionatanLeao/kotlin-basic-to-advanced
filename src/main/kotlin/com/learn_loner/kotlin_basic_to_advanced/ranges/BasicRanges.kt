package com.learn_loner.kotlin_basic_to_advanced.ranges

fun main() {
    integralTypeRanges()
    downTo()
    step()
    untilFunction()
}

fun integralTypeRanges() {
    for (i in 1..4) {
        println(i)
    }
    println("-----------")
    for (i in 4..1) {
        println(i)
    }
}

fun downTo() {
    for (i in 4 downTo 1) {
        println(i)
    }
    println("-----------")
}

fun step() {
    for (i in 1..4 step 2) {
        println(i)
    }
    println("-----------")
    for (i in 4 downTo 1 step 2) {
        println(i)
    }
    println("-----------")
}

fun untilFunction() {
    for (i in 1 until 10) {
        println(i)
    }
}