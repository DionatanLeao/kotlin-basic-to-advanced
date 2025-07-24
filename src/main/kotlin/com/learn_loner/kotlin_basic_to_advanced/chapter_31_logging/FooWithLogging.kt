package com.learn_loner.kotlin_basic_to_advanced.chapter_31_logging

import mu.KLogging

class FooWithLogging {
    companion object: KLogging()

    fun bar(name: String) {
        logger.info { "Hello $name"}
    }

    fun logException(e: Exception) {
        logger.error(e) { "Error occurred" }
    }
}