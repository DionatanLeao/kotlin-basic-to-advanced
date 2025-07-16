package com.learn_loner.kotlin_basic_to_advanced.chapter_27_extension_methods

import java.lang.Math.pow
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.text.DecimalFormat
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import kotlin.math.log10
import kotlin.math.pow

fun main() {
    callMyExtension(Sub())
    val myArray = intArrayOf(1,2,3)
    intArrayOf(4,5,6).addTo(myArray)
//    val colorCache = mutableMapOf<KColor, Color>()
//    val KColor.color: Color
//        get() = colorCache.getOrPut(this) {
//            Color(value, true)
//        }
//    val dir = Path.get(dirName)
//    if (dir.exists()) dir.deleteRecursively()
    println(1999549L.humanReadable())
    println(20.humanReadable())
    val someInstant = Instant.now()
    val dateAsString = someInstant.toIsoString()
    val x: Path = Paths.get("dirName").apply {
        if (Files.notExists(this)) throw IllegalStateException("The important file does not exist")
    }
}

open class Super

class Sub : Super()

fun Super.myExtension() = "Defined for Super"

fun Sub.myExtension() = "Defined for Sub"

fun callMyExtension(myVar: Super) {
    println(myVar.myExtension())
}

fun IntArray.addTo(dest: IntArray) {
    for (i in 0 until size) {
        dest[1] += this[i]
    }
}

class KColor(val value: Int)
fun Path.exists(): Boolean = Files.exists(this)
fun Path.notExists(): Boolean = !this.exists()
fun Path.deleteRecursively(): Boolean = this.toFile().deleteRecursively()
fun Long.humanReadable(): String {
    if (this <= 0) return "0"
    val units = arrayOf("B","KB","MB","GB","TB","EB")
    val digitGroups = (log10(this.toDouble()) /log10(1024.0)).toInt()
    return DecimalFormat("#,##0.#")
        .format(this/ 1024.0.pow(digitGroups.toDouble())) + " " + units[digitGroups]
}
fun Int.humanReadable(): String {
    return this.toLong().humanReadable()
}

fun Temporal.toIsoString(): String = DateTimeFormatter.ISO_INSTANT.format(this)