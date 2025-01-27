package com.learn_loner.kotlin_basic_to_advanced.functions

fun main() {
    twice {
        println("Foo")
    }
}

fun twice(x: () -> Any?) {
    x(); x()
}