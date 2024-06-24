package com.example.variablesyconstantes

fun main() {
    tiposDeDatos()
}

private fun tiposDeDatos() {

    // String
    var miString = "Hola"
    var miString2: String = "que tal" // Se puede especificar antes del igual el tipo de dato que es, pero no es necesario
    var miString3 = miString + " " + miString2
    println(miString3)

    // Enteros
    var miEntero = 1
    var miEntero2: Int = 2
    var miEntero3 = miEntero + miEntero2
    println(miEntero3)

    // Decimales
    var miDouble = 1.5
    var miEntero4 = 1
    var miDouble3 = miDouble + miEntero4
    println(miDouble3)

    // Booleanos
    var miBooleano = true
    var miBooleano2 = false
    println(miBooleano && miBooleano2)
}