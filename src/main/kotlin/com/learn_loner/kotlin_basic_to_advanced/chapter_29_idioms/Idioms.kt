package com.learn_loner.kotlin_basic_to_advanced.chapter_29_idioms

import java.io.Serializable

fun main() {

}

class MySpecialCase : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }
}

class MySpecialCase2 : Serializable {
    companion object {
        private val serialVersionUID: Long = 123
    }
}

class MySpecialCase3 : Serializable {
    companion object {
        @JvmStatic
        private val serialVersionUID: Long = 123
    }
}