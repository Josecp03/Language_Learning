package com.example.variablesyconstantes.Ejercicios

fun main() {
    saludarAmigo("Pepe", 30)
    saludarAmigo("Juan", 35)
    saludarAmigo("Maria", 26)
    saludarAmigo("Ivan", 21)
    saludarAmigo("Pedro", 40)
}

fun saludarAmigo(nombre:String, edad:Int) {
    println("Hola $nombre, tienes $edad años")
}