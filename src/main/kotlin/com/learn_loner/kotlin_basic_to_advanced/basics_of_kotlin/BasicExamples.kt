package com.learn_loner.kotlin_basic_to_advanced.basics_of_kotlin

fun main(args: Array<String>) {
    printHello("John")
    println("${double(2)}")
    println("${doubleInferred(2)}")
    println(nonNullReferences("abc", null))
}

fun printHello(name: String?): Unit {
    if (!name.isNullOrEmpty()) {
        println("Hello $name")
    }
}

fun double(x: Int): Int = x * 2

fun doubleInferred(x: Int) = x * 2

fun nonNullReferences(aX: String, bX: String?): Boolean {
    val a: String = aX
//    a = null // compilation error
    val b: String? = bX
//    b = null // ok
    return (a == b) ?: (b === null)
}