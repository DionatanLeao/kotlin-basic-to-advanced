package com.learn_loner.kotlin_basic_to_advanced.regex

class RegexWhenArgument(private val whenArgument: CharSequence) {
    fun equals(whenEntry: Regex) = whenEntry.matches(whenArgument)
    override operator fun equals(whenEntry: Any?) = (whenArgument == whenEntry)
}