package com.learn_loner.kotlin_basic_to_advanced.chapter_7_functions

fun main() {
    listOf(1, 2, 3, 4).map {
        println(addTwo(it))
    }
    println(makeList("d"))
    println(sayMyName("Name 1"))
    println(sayYourName("Name 2"))
}

fun addTwo(x: Int) = x + 2

fun makeList(last: String?): List<String> {
    val list = mutableListOf("a", "b", "c")
    last?.let(list::add)
    return list
}

fun sayMyName(name: String): String {
    return "Your name is $name"
}

inline fun sayYourName(name: String): String {
    return "Your name is $name"
}