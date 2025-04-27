package com.learn_loner.kotlin_basic_to_advanced.chapter_10_loops

fun main() {
    standardFor()
    zeroToNine()
    repeat()
    breakAndContinue(false, true)
    overMap()
    whileLoops(false)
    functionalConstructsIteration()
}

private fun standardFor() {
    val list = listOf("Hello", "World", "!")
    for (str in list) {
        println(str)
    }
}

private fun zeroToNine() {
    for (i in 0..9) {
        println(i)
    }
}

private fun repeat() {
    repeat(10) { i ->
        println("This line will be printed 10 times")
        println("We are on the ${i + 1}. loop iteration")
    }
}

private fun breakAndContinue(attr1: Boolean, attr2: Boolean) {
    while (attr1) {
        if (attr2) continue
        break
    }
}

private fun overMap() {
    val map = hashMapOf(1 to "foo", 2 to "bar", 3 to "baz")
    for ((key, value) in map) {
        println("Map[$key] = $value")
    }
}

private fun whileLoops(attr: Boolean) {
    while(attr) {
        println("Nothing")
    }

    do {
        println("Nothing")
    } while (attr)
}

private fun functionalConstructsIteration() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
    val numberMap = numbers.map { "Number $it" }
    println(numberMap)
    val numberFilter = numbers.filter { it % 2 == 0 }.map { "Number $it" }
    println(numberFilter)
}