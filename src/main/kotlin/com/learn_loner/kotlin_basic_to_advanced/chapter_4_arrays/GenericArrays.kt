package com.learn_loner.kotlin_basic_to_advanced.chapter_4_arrays

fun main(args: Array<String>) {
    emptyArray()
    givenSize()
    get()
    arraysOfPrimitives()
    createAnArray()
    createAnArrayUsingAClosure()
    createAnUninitializedArray()
    extensions()
    iterateArray()
}

private fun emptyArray() {
    val empty = emptyArray<String>()
    println(empty)
}

private fun givenSize() {
    val strings = Array<String>(size = 5, init = { index -> "Item #$index" })
    println(strings.toString())
    println(strings.size)
}

private fun get() {
    val strings = Array<String>(size = 5, init = { index -> "Item #$index" })
    strings.set(2, "ChangedItem")
    println(strings.get(2))
    strings[2] = "ChangedItem"
    println(strings[2])
}

private fun arraysOfPrimitives() {
    println(booleanArrayOf(true, false))
    println(byteArrayOf(1, 2, 3))
    println(charArrayOf('a', 'b', 'c'))
    println(doubleArrayOf(1.2, 5.0))
    println(floatArrayOf(1.2F, 5.0F))
    println(intArrayOf(1, 2, 3))
    println(longArrayOf(1, 2, 3))
    println(shortArrayOf(1, 2, 3))
}

private fun createAnArray() {
    val a = arrayOf(1, 2, 3)
    println(a)
}

private fun createAnArrayUsingAClosure() {
    val a = Array(3) { i -> i * 2 }
    println(a)
}

private fun createAnUninitializedArray() {
    val a = arrayOfNulls<Int>(3)
    println(a)
}

private fun extensions() {
    val doubles = doubleArrayOf(1.5, 3.0)
    println(doubles.average())
    val ints = intArrayOf(1, 4)
    println(ints.average())
    println(ints.getOrNull(1))
    println(ints.first())
    println(ints.last())
    println(ints.toHashSet())
    println(ints.sortedArray())
    println(ints.sort())
    println(ints.min())
    println(ints.max())
}

private fun iterateArray() {
    val asc = Array(5) { i -> (i * i).toString() }
    for (s: String in asc) {
        println(s)
    }
    for (s in asc) {
        println(s)
    }
}

