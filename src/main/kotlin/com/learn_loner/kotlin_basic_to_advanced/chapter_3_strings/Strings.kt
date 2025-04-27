package com.learn_loner.kotlin_basic_to_advanced.chapter_3_strings

fun main(args: Array<String>) {
    structuralEquality()
    referentialEquality()
    literals()
    elementsOfString()
    stringTemplates()
}

fun structuralEquality() {
    val str1 = "Hello, World!"
    val str2 = "Hello," + " World!"
    println(str1 == str2)
}

fun referentialEquality() {
    val str1 = """ |Hello, World! """.trimMargin()
    val str2 = """ #Hello, World! """.trimMargin("#")
    val str3 = str1

    println(str1 == str2)
    println(str1 === str2)
    println(str1 === str3)
}

fun literals() {
    val s = "Hello, world!\n"
    println(s)

    val text1 = """
        for (c in "foo")
            println(c)
    """
    println(text1)

    val text2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        | (Benjamin Franklin)
    """.trimMargin()
    println(text2)
}

fun elementsOfString() {
    val str = "Hello, World!"
    println(str[1])

    for (c in str) {
        println(c)
    }
}

fun stringTemplates() {
    val i = 10
    val s1 = "i = $i"
    println(s1)

    val s2 = "abc"
    val str1 = "$s2.length is ${s2.length}"
    println(str1)

    val str2 = "\$foo"
    println(str2)

    val price = """
        ${'$'}9.99
    """
    println(price)
}