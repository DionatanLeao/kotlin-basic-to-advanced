package com.learn_loner.kotlin_basic_to_advanced.chapter_16_class_inheritance

fun main() {
    val derivedClass = DerivedClass()
    derivedClass.foo()

    val ninja = Ninja()
    ninja.jump()
    ninja.sneak()

    val car: Car = BrokerCar("Lada")
    car.speed = 10
}

open class BaseClass {
    val x = 10
}

class DerivedClass : BaseClass() {
    fun foo() {
        println("x is equal to $x")
    }
}

open class Person {
    fun jump() {
        println("Jumping...")
    }
}

class Ninja : Person() {
    fun sneak() {
        println("Sneaking around...")
    }
}

abstract class Car {
    abstract val name: String
    open var speed: Int = 0
}

class BrokerCar(override val name: String) : Car() {
    override var speed: Int
        get() = super.speed
        set(value) {
            throw UnsupportedOperationException("The car is broken")
        }
}

interface Ship {
    fun sail()
    fun sink()
}

object Titanic : Ship {
    private var canSail = true

    override fun sail() {
        sink()
    }

    override fun sink() {
        canSail = false
    }
}