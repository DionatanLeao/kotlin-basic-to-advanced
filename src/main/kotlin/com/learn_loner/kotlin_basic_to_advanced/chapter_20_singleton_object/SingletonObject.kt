package com.learn_loner.kotlin_basic_to_advanced.chapter_20_singleton_object

fun main() {
    CommonUtils.dispMsg("Name")
    SharedRegistry.register("a", "apple")
    SharedRegistry.register("b", "boy")
    SharedRegistry.register("c", "cat")
    SharedRegistry.register("d", "dog")
}

object CommonUtils {
    var anyName: String = "Hello"

    fun dispMsg(message: String) {
        println(message)
    }
}

object SharedRegistry {
    fun register(key: String, thing: String) {
        println("key: $key")
        println("thing: $thing")
    }
}