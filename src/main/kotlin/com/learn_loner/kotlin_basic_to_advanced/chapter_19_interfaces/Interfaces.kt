package com.learn_loner.kotlin_basic_to_advanced.chapter_19_interfaces

fun main() {
    val instance = MyClass()
    instance.withImplementation()
    instance.test()
}

interface MyInterface {
    fun withImplementation() {
        println("withImplementation() was called")
    }
}

class MyClass : MyInterface {
    fun test() {
        println("Test my class")
    }
}

interface MyInterface2 {
    val helloWorld
        get() = "Hello World!"
}

interface A {
    fun notImplemented()
    fun implementedOnlyInA() { println("only A") }
    fun implementedInBoth() { println("both, A") }
    fun implementedInOne() { println("implemented in A") }
}

interface B {
    fun implementedInBoth() { println("both, A") }
    fun implementedInOne() { println("implemented in B") }
}

/*class MyClass: A, B {
    override fun notImplemented() {
        TODO("Not yet implemented")
    }

    override fun implementedInBoth() {
        TODO("Not yet implemented")
    }

    override fun implementedInOne() {
        TODO("Not yet implemented")
    }

}*/