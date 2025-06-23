package com.learn_loner.kotlin_basic_to_advanced.chapter_26_reflection

import com.learn_loner.kotlin_basic_to_advanced.chapter_19_interfaces.MyClass
import java.lang.reflect.Modifier
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaGetter

fun main() {
    val a1 = String::class
    val a2 = MyClass::class

    val stringKClass: KClass<String> = String::class
    val b1: Class<String> = stringKClass.java
    val b2: Class<MyClass> = MyClass::class.java

    val numbers = listOf(-2, -1, 0, 1, 2)
    println(numbers.filter(::isPositive))

    val example = Example(field1 = "abc", field2 = 1, baseField = "someText")
    example::class.memberProperties.forEach { member ->
        println(member.name)
//        println("${member.name} -> ${member.get(example)}")
    }

    example::class.memberProperties.filter { isFieldAccessible(it) }.forEach { member ->
        println(member.name)
//        println("${member.name} -> ${member.get(example)}")
    }
}

fun isPositive(x: Int) = x > 0

open class BaseExample(val baseField: String)

class Example(val field1: String, val field2: Int, baseField: String) : BaseExample(baseField) {
    val field3: String
        get() = "Property without backing field"

    val field4 by lazy { "Delegated value" }
    private val privateField: String = "Private value"
}

fun isFieldAccessible(property: KProperty1<*, *>): Boolean {
    return property.javaGetter?.modifiers?.let { !Modifier.isPrivate(it) } ?: false
}

