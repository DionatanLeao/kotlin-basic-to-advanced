package com.learn_loner.kotlin_basic_to_advanced.chapter_23_type_aliases

import com.learn_loner.kotlin_basic_to_advanced.chapter_17_visibility_modifiers.Person

typealias StringValidator = (String) -> Boolean
typealias Reductor<T, U, V> = (T,U) -> V
typealias Parents = Pair<Person, Person>
