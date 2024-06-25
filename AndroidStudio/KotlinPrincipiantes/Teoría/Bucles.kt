package com.example.variablesyconstantes

fun main() {
    bucles()
}

private fun bucles() {

    val miArray = listOf("Hola", "que", "tal", "estás")
    val miMapa = mutableMapOf("Clave1" to 1, "Clave2" to 2, "Clave3" to 3, "Clave4" to 4)

    // BUCLE FOR
    for (miString in miArray) {
        println(miString)
    }
    println()

    for (miElemento in miMapa) { // Hay que tener en cuenta que al recorrer un mapa, los elementos no tienen por qué estar ordenados
        println("${miElemento.key} = ${miElemento.value}")
    }

    println()
    for (x in 0..10) {
        println(x)
    }

    println()
    for (x in 0 until 10) { // El until no tiene en cuenta el último número
        println(x)
    }

    println()
    for (x in 0 until 10 step 2) { // El step, indica el número de elementos que se salta
        println(x)
    }

    println()
    for (x in 10 downTo 0 step 3) { // Lo recorre al revés y saltando de 3 en 3
        println(x)
    }

    // Crear un array numérico de forma rápida
    val miArrayNumerico = (0..20)
    for (miNumero in miArrayNumerico) {
        println(miNumero)
    }

    println()

    // BUCLE WHILE
    var x = 0
    while (x < 10) {
        println(x)
        x++ // También sde podría poner x += 2
    }

}