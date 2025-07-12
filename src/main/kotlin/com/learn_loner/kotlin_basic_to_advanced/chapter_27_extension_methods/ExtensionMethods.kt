package com.learn_loner.kotlin_basic_to_advanced.chapter_27_extension_methods

fun main() {
    callMyExtension(Sub())
}

open class Super

class Sub : Super()

fun Super.myExtension() = "Defined for Super"

fun Sub.myExtension() = "Defined for Sub"

fun callMyExtension(myVar: Super) {
    println(myVar.myExtension())
}