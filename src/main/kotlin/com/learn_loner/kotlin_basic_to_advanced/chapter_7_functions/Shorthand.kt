package com.learn_loner.kotlin_basic_to_advanced.chapter_7_functions

fun main() {
    println(sayMyNameShorthand("Name 1"))
}

fun sayMyNameShorthand(name: String) = "Your name is $name"