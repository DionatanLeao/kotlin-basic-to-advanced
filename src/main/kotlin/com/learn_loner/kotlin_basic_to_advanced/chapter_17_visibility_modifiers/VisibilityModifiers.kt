package com.learn_loner.kotlin_basic_to_advanced.chapter_17_visibility_modifiers
fun main() {
    val person = Person("public name", "private name", "internal name")
    person.printAttributesInsideClass()
}

data class Person(
    val publicName: String,
    private val privateName: String,
    internal val internalName: String
) {
    protected val protectedName: String = "Protected Name"

    fun printAttributesInsideClass() {
        println("Inside class:")
        println("publicName = $publicName")
        println("privateName = $privateName")
        println("internalName = $internalName")
        println("protectedName = $protectedName")
    }
}