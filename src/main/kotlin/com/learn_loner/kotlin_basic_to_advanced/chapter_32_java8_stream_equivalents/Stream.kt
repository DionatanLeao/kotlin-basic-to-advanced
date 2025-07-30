package com.learn_loner.kotlin_basic_to_advanced.chapter_32_java8_stream_equivalents

fun main() {
    val people = People("Name 1")
    val people2 = People("Name 2")
    val pl = listOf(people, people2)
    val list = pl.map {
        println(it.name)
    }
    val persons = listOf(
        Person("Max", 18),
        Person("David", 12),
        Person("Peter", 23),
        Person("Pamela", 23)
    )
    persons.map {
        println("Name is ${it.name} and age is ${it.age}")
    }
}

data class People(val name: String)

data class Person(val name: String, val age: Int)