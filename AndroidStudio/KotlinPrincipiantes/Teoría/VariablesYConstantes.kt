package com.example.variablesyconstantes

/*
Este es el método main que ejecuta AndroidStudio
 */
fun main() {
    variablesYConstantes() // Llamada al método
}

/*
Método para manejar variables y constantes
 */
private fun variablesYConstantes() {
    // Variables
    var miPrimeraVariable = "Hola que tal estás"

    println(miPrimeraVariable)

    // Constantes
    val miPrimeraConstante = 2

    println(miPrimeraConstante)

    // Cambiar de valor la primera variable
    miPrimeraVariable = "Adiós"
    println(miPrimeraVariable)
}