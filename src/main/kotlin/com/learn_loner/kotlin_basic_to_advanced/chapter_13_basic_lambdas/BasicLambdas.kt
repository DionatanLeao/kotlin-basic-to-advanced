package com.learn_loner.kotlin_basic_to_advanced.chapter_13_basic_lambdas

import java.time.Duration
import java.time.Instant

fun main() {
    val time = Benchmark.realtime {
        println("This is a test")
    }
    println("Executed the code in $time")
}

object Benchmark {
    fun realtime(body: () -> Unit): Duration {
        val start = Instant.now()
        try {
            body()
        } finally {
            val end = Instant.now()
            return Duration.between(start, end)
        }
    }
}