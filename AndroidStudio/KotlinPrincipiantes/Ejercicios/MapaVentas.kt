package com.example.variablesyconstantes.Ejercicios

fun main() {
    var ventas: Map<String, Int>
    ventas = mutableMapOf("Portatil" to 20, "Television" to 10, "Ratón" to 54)

    ventas.putAll(mapOf("Teclado" to 23, "PC" to 4, "Micrrondas" to 15, "Lavadora" to 56, "Frigorífico" to 6))

    ventas["Teclado"] = ventas["Teclado"]!! + 10
    println(ventas["Teclado"])

    println("El mayor número de unidades vendidas de las ventas son ${ventas.values.max()} del la ${ventas.keys.max()}")


}
