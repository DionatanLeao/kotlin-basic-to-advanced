package com.learn_loner.kotlin_basic_to_advanced.chapter_7_functions

fun main() {
    listOf("Name 1", "Name 2").map{ name: String ->
        println("Your name is $name")
    }

    listOf("Name 1", "Name 2").map{
        println("Your name is $it")
    }

    listOf(1, 2, 3, 4).map {
        println(it + 2)
    }

    val a = IntListWrapper(listOf(10, 20, 30))
    println(a[0])
    println(a[1])
    println(a[2])
}

data class IntListWrapper(val wrapper: List<Int>) {
    operator fun get(position: Int): Int = wrapper[position]
}

