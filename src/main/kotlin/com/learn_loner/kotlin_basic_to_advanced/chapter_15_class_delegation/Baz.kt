package com.learn_loner.kotlin_basic_to_advanced.chapter_15_class_delegation

fun main() {
    Baz(Bar()).example()
}

class Baz(b: Bar) : Foo by b