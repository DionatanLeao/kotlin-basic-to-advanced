package com.learn_loner.kotlin_basic_to_advanced.chapter_28_dsl_building

import kotlin.random.Random

fun main() {
    val r = Random(233)
//    infix inline operator fun Int.rem(block: () -> Unit) {
//        if (r.nextInt(100) < this) block()
//    }
//    20 % { println("The possibility you see this message is 20%") }

    val ex = MyExample(233)
    ex {
        if (777.bigger()) println("why")
    }

//    "it should return 2" {
//        parse("1 + 1").buildAST().evaluate() shouldBe 2
//    }
}

//infix fun <T> T?.shouldBe(expected: T?) = assertEquals(expected, this)

//@Test
//fun test() {
//    100.plusOne() shouldBe 101
//}

class MyExample(val i: Int) {
    operator fun <R> invoke(block: MyExample.() -> R) = block()
    fun Int.bigger() = this > i
}

//operator fun <R> String.invoke(block: () -> R) = {
//    try { block.invoke()}
//    catch (e: AssertException) { println("$this\n${e.message}") }
//}

