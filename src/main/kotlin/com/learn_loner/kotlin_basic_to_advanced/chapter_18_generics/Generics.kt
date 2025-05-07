package com.learn_loner.kotlin_basic_to_advanced.chapter_18_generics

fun main() {
    val stringConsumer = Consumer<String>()
    println(stringConsumer.consume("Test"))
    val booleanConsumer = Consumer<Boolean>()
    println(booleanConsumer.consume(true))
}

class Consumer<in T> { fun consume(t: T) {println(t)}}
