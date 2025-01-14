package com.learn_loner.kotlin_basic_to_advanced.hello_world

class HelloWorldUsingACompanionObject {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            HelloWorldUsingACompanionObject().run()
        }
    }

    fun run() {
        println("Hello World")
    }
}