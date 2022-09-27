package com.vignesh.demo.utils

const val myName: String = "Kotlin"

fun getPlainGreeting() = "Hello World !!!"

fun sayHello() = println(getPlainGreeting())

fun sayHelloTo(yourName: String ?= null) = println("Hello ${getName(yourName)}! I'm $myName!")

private fun getName(yourName: String ?) = yourName ?: "World"

fun getMessageForLanguage(language: String ?= null): String {
    return when (language) {
        null -> "Hi"
        "Zh" -> "Ni hao"
        "Ta" -> "Vanakkam"
        "My" -> "Selamat"
        "Fr" -> "Bon jour"
        else -> "Hello there"
    }
}
