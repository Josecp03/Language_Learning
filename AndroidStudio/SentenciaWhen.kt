package com.example.variablesyconstantes

fun main () {
    sentenciaWhen()
}

private fun sentenciaWhen() {
    val pais = "España"

    when(pais) {
        "España" -> {
            println("El país es España")
        } "Mexico" -> {
            println("El país es Mexico")
        } "Brasil" -> {
            println("El país es Brasil")
        } else -> {
            println("No se conoce el idioma")
        }
    }
}