package com.learn_loner.kotlin_basic_to_advanced.chapter_25_delegated_properties

import java.lang.ref.WeakReference
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
//    var foo: Int by Delegates.observable("1") { property, oldValue, newValue ->
////        println("${property.name} was changed from $oldValue to $newValue")
////    }
////    foo = 2

    val foo: String by MyDelegate()
    println(foo)

    val fooLazy: Int by lazy { 1 + 1 }
    println(fooLazy)

//    val map = mapOf("foo" to 1)
//    val fooMap: String by map
//    println(fooMap)

}

class MyDelegate {
    operator fun getValue(owner: Any?, property: KProperty<*>): String {
        return "Delegated value"
    }
}

class InitialMyMemoryExpensiveClass {
    companion object {
        private var reference: WeakReference<InitialMyMemoryExpensiveClass>? = null

        fun doWithReference(block: (InitialMyMemoryExpensiveClass) -> Unit) {
            reference?.let {
                it.get()?.let(block)
            }
        }
    }

    init {
        reference = WeakReference(this)
    }
}

class WeakReferenceDelegate<T>(initialValue: T? = null): ReadWriteProperty<Any, T?> {
    private var reference = WeakReference(initialValue)

    override fun getValue(thisRef: Any, property: KProperty<*>): T? = reference.get()

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        reference = WeakReference(value)
    }
}

class MyMemoryExpensiveClass {
    companion object {
        private var reference: MyMemoryExpensiveClass? by WeakReferenceDelegate()

        fun doWithReference(block: (MyMemoryExpensiveClass) -> Unit) {
            reference?.let(block)
        }
    }

    init {
        reference = this
    }
}
