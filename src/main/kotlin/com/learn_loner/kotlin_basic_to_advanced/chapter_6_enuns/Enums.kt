package com.learn_loner.kotlin_basic_to_advanced.chapter_6_enuns

fun main() {
    println(InitializationColor.RED)
    println(InitializationColor.GREEN)
    println(InitializationColor.BLUE)
    println(AbstractColor.RED.colorString())
    println(AbstractColor.GREEN.colorString())
    println(AbstractColor.BLUE.colorString())
    println(SimpleColor.RED.ordinal)
    println(SimpleColor.GREEN.ordinal)
    println(SimpleColor.BLUE.ordinal)
    println(Planet.EARTH)
    println(Planet.MARS)
    Planet.MARS.population = 3
    println(Planet.MARS)
}

enum class InitializationColor(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class AbstractColor {
    RED {
        override val rgb: Int = 0xFF0000
    },
    GREEN {
        override val rgb: Int = 0x00FF00
    },
    BLUE {
        override val rgb: Int = 0x0000FF
    };

    abstract val rgb: Int

    fun colorString() = "#%06X".format(0xFFFFFF and rgb)
}

enum class SimpleColor() {
    RED, GREEN, BLUE
}

enum class Planet(var population: Int = 0) {
    EARTH(7 * 1000000000),
    MARS();

    override fun toString() = "$name[population=$population]"
}