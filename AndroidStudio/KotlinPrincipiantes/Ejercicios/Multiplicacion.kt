package com.example.variablesyconstantes.Ejercicios

fun main() {
    var a = 6
    var b = 5
    var resultado = multiplicarNumeros(a,b)
    println("$a x $b = $resultado")
}

fun multiplicarNumeros(a:Int, b:Int):Int {
    return a*b
}


