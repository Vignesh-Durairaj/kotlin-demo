package com.vignesh.demo.collection

fun main() {
    val languageByCode = mapOf(
        "Ta" to "Tamil",
        "Zh" to "Chinese",
        "My" to "Malay",
        "En" to "English",
        "Fr" to "French",
    )

    printPairs(languageByCode)

    val mutableMap = mutableMapOf<String, String>();
    mutableMap.putAll(languageByCode)
    mutableMap["Kr"] = "Korean"
    mutableMap["Jp"] = "Japanese"

    printPairs(mutableMap)
}

private fun printPairs(languageByCode: Map<String, String>) {
    languageByCode.forEach { (code, language) -> println("The code for language $language is $code") }
}