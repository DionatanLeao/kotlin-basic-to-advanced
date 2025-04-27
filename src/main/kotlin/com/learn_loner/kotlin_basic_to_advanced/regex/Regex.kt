package com.learn_loner.kotlin_basic_to_advanced.regex

fun main() {
    regexImmutable("regex.")
    regexAnonymous("regex.")
    regexClass()
    nullSafety()
    find()
    findAll()
    matchEntire()
    matches()
    containsMatchIn()
    split()
    replace()
}

fun regexImmutable(string: String) {
    val regex1 = Regex(".")
    val regex2 = Regex("x")
    println(regex1.matches(string))
    println(regex2.matches(string))
}

fun regexAnonymous(string: String) {
    println(Regex("a").matches(string))
    println(Regex("b").matches(string))
}

fun regexClass() {
    val regex = Regex("c|d")
    val matched = regex.containsMatchIn("abc")
    println(matched)
}

fun nullSafety() {
    val matchResult = Regex("c|d").find("efg")
    val a = matchResult?.value
    val b = matchResult?.value.orEmpty()
    println(a?.toUpperCase())
    println(b.toUpperCase())
}

fun find() {
    val phoneNumber = Regex("""\d{3}-\d{3}-\d{4}""").find("phone: 123-456-7890, e..")?.value
    println(phoneNumber)
}

fun findAll() {
    val matchedResults = Regex("""\d+""").findAll("ab12cd34ef")
    val result = StringBuilder()
    for (matchedText in matchedResults) {
        result.append(matchedText.value + " ")
    }
    println(result)
}

fun matchEntire() {
    val a = Regex("""\d+""").matchEntire("100")?.value
    val b = Regex("""\d+""").matchEntire("100 dollars")?.value
    println(a)
    println(b)

}

fun matches() {
    val regex = Regex("""\d+""")
    println(regex.matches("50"))
    println(regex.matches("50 dollars"))
}

fun containsMatchIn() {
    println(Regex("""\d+""").containsMatchIn("50 dollars"))
    println(Regex("""\d+""").containsMatchIn("Fifty dollars"))
}

fun split() {
    println(Regex("""\d+""").split("ab12cd34ef"))
    println(Regex("""\d+""").split("This is a test"))
}

fun replace() {
    println(Regex("""\d+""").replace("ab12cd34ef", "x"))
}



