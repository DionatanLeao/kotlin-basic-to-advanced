package com.learn_loner.kotlin_basic_to_advanced.chapter_14_null_safety

fun main() {
    smartCasts()
    eliminateNull()
    nullCoalescingElvisOperator(listOf("a", "b", null))
    nullCoalescingElvisOperator(listOf(null))
    elvisOperator("Hello!")
    safeCallOperator()
}

fun smartCasts() {
    var string: String? = "Hello!"
    println(string!!.length)
    if (string != null) {
        println(string.length)
    }
}

fun eliminateNull() {
    val a: List<Int?> = listOf(1, 2, 3, null)
    println(a)
    val b: List<Int> = a.filterNotNull()
    println(b)
}

fun nullCoalescingElvisOperator(data: List<String?>) {
    val value: String = data.first() ?: "Nothing here."
    println(value)
}

fun elvisOperator(a: String?) {
    val b: Int = if(a != null) a.length else -1
    println(b)
    val bb: Int = a?.length ?: -1
    println(bb)
}

fun safeCallOperator() {
    val string: String? = "Hello World!"
    println(string?.length)
    string?.apply {
        println(this)
    }
    string?.let {
        println(it)
    }
}