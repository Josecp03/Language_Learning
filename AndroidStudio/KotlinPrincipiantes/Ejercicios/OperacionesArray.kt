package com.example.variablesyconstantes.Ejercicios

fun main() {
    var array = arrayListOf<Int>(1,2,3,4,5)
    array.add(6)
    println(array)

    array[1] = 10
    println(array)

    array.removeAt(2)
    println(array)

    for (elemento in array) {
        println(elemento)
    }

}

