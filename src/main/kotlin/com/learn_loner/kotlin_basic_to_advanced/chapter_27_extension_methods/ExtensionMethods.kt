package com.learn_loner.kotlin_basic_to_advanced.chapter_27_extension_methods

fun main() {
    callMyExtension(Sub())
    val myArray = intArrayOf(1,2,3)
    intArrayOf(4,5,6).addTo(myArray)
}

open class Super

class Sub : Super()

fun Super.myExtension() = "Defined for Super"

fun Sub.myExtension() = "Defined for Sub"

fun callMyExtension(myVar: Super) {
    println(myVar.myExtension())
}

fun IntArray.addTo(dest: IntArray) {
    for (i in 0 until size) {
        dest[1] += this[i]
    }
}