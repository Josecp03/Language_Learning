package com.example.variablesyconstantes

fun main () {
    sentenciaWhen()
}

private fun sentenciaWhen() {
    val pais = "España"
    val edad = 100

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

    when(edad) {
        0, 1, 2 -> {
            println("Eres un bebé")
        } in 3..10 -> {
            println("Eres un niño")
        } in 11..17 -> {
            println("Eres un adolescente")
        } in 18..69  -> {
            println("Eres un adulto")
        } in 70..99 -> {
            println("Eres un anciano")
        } else -> {
            println("\uD83D\uDE00")
        }
    }

}
