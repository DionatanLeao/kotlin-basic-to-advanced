package com.learn_loner.kotlin_basic_to_advanced.conditional_statements

fun main() {
    WhenWithEnums.doOnDay(WhenWithEnums.Wednesday)
}

enum class WhenWithEnums {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

    companion object {
        fun doOnDay(day: WhenWithEnums) {
            when (day) {
                Sunday -> println("today is Sunday")
                Monday -> println("today is Monday")
                Tuesday -> println("today is Tuesday")
                Wednesday -> println("today is Wednesday")
                Thursday -> println("today is Thursday")
                Friday -> println("today is Friday")
                Saturday -> println("today is Saturday")
            }
        }
    }
}