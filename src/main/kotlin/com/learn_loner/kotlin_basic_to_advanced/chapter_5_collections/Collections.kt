package com.learn_loner.kotlin_basic_to_advanced.chapter_5_collections

fun main() {
    usingList()
    usingMap()
    usingSet()
}

private fun usingList() {
    val list = listOf("Item 1", "Item 2", "Item 3")
    println(list)
}

private fun usingMap() {
    val map = mapOf(Pair(1, "Item 1"), Pair(2, "Item 2"), Pair(3, "Item 3"))
    println(map)
}

private fun usingSet() {
    val set = setOf(1, 3, 5)
    println(set)
}