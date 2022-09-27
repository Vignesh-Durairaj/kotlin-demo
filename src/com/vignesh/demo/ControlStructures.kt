package com.vignesh.demo

import com.vignesh.demo.utils.getMessageForLanguage

fun main() {
    println("${getMessageForLanguage()}!")
    println("${getMessageForLanguage("Ta")}!")
    println("${getMessageForLanguage("Zh")}!")
    println("${getMessageForLanguage("MY")}!")
}
