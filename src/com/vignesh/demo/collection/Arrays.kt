package com.vignesh.demo.collection

fun main() {
    val languages = arrayOf("Ta", "Zh", "My", "En", "Fr")
    println(languages.size)
    println(languages[0])
    println(languages.get(0) == languages[0])

    // Conventional for loop
    for(language in languages) {
        print("$language ")
    }
    println()

    // Can also be written as
    languages.forEach { language -> print("$language ") }
    println()

    // Iterate with index
    languages.forEachIndexed { index, language -> println("The value at $index is $language") }
}
