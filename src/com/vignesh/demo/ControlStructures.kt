package com.vignesh.demo

var language: String ?= null
fun main() {
    println("${getMessage()}!")
    language = "Ta"
    println("${getMessage()}!")
    language = "Zh"
    println("${getMessage()}!")
    language = "MY"
    println("${getMessage()}!")
}

private fun getMessage(): String {
    return when (language) {
        null -> "Hi"
        "Fr" -> "Bon jour"
        "Zh" -> "Ni hao"
        "Ta" -> "Vanakkam"
        "My" -> "Selamat"
        else -> "Hello there"
    }
}
