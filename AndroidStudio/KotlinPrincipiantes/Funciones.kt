package com.example.variablesyconstantes

fun main() {
    funciones()
}

fun funciones() {

    // Función normal
    diHola()

    // Función con parámetro
    diHolaNombre("José")

    // Función con varios parámetros
    diHolaNombreEdad("José", 21)

    // Función con valor de retorno
    println(sumaNumeros(1,2))
}

fun diHola() {
    println("Hola")
}

fun diHolaNombre (nombre:String) {
    println("Hola $nombre")
}

fun diHolaNombreEdad(nombre:String, edad:Int) {
    println("Hola $nombre que tiene $edad años")
}

fun sumaNumeros(primerNumero:Int, segundoNumero:Int):Int {
    return primerNumero + segundoNumero
}