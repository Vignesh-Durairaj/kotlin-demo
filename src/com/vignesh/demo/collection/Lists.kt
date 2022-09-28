package com.vignesh.demo.collection

fun main() {
    val languages = listOf("Tamil", "Chinese", "Malay", "English", "French")
    println(languages[0] == languages.get(0))
    languages.forEachIndexed { index, language -> println("The entry $language is at index $index") }
}
