package com.example.variablesyconstantes.Ejercicios

fun main() {

    var nombres = arrayListOf<String>("Pepe", "Juan", "María", "Ivan", "Pedro")
    nombres.addAll(listOf("Marta", "Carlos"))
    println(nombres)

    nombres.sort()
    println(nombres)

    println(nombres.count())

    nombres.forEachIndexed { i, nombre ->
        println("Amigo ${i+1}: $nombre")
    }

}