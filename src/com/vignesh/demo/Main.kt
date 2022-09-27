package com.vignesh.demo

const val myName: String = "Kotlin"

fun main() {
    sayHelloTo();
    sayHelloTo("Vignesh")
}

fun sayHelloTo(yourName: String ?= null) {
    val userName = yourName ?: "World"
    println("Hello $userName! I'm $myName!");
}