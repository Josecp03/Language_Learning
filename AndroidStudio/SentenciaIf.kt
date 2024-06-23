package com.example.variablesyconstantes

fun main() {
    sentenciaIf()
}

private fun sentenciaIf() {

    val miNumero = 12

    /*
    OPERADORES CONDICIONALES
    > mayor que
    < menor que
    >= mayor o igual que
    <= menor o igual que
    == igualdad
    != desigualdad
     */
    if (miNumero <= 12) {
        println("$miNumero es menor o igual que 12")
    } else {
        println("$miNumero es mayor que 12")
    }

    /*
    OPERADORES LÓGICOS
    && "y"
    || "o"
    ! "no"
     */
    if (miNumero <= 10 && miNumero > 7) {
        println("$miNumero es menor o igual que 10 y mayor que 5")
    } else if (miNumero == 1 || miNumero == 12){
        println("$miNumero es 1 o 12")
    }



}