package com.learn_loner.kotlin_basic_to_advanced.chapter_32_java8_stream_equivalents

fun main() {
    val people = People("Name 1")
    val people2 = People("Name 2")
    val pl = listOf(people, people2)
    pl.map {
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

    val map1 = persons.map {
        it.age to it.name
    }.toMap()
    println(map1)

//    val map2 = personsMap.toMap({ it.age }, { it.name })
//    println(map2)

//    val map3 = persons.toMapBy { it.name }
//    println(map3)

    val map4 = persons.groupBy { it.age }
    println(map4)

    val map5 = persons.groupBy { it.age }.mapValues { it -> it.value.map { it.name } }
    println(map5)
}

data class People(val name: String)

data class Person(val name: String, val age: Int)
