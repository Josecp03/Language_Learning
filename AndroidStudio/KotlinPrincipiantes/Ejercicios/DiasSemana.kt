package com.example.variablesyconstantes.Ejercicios

fun main() {

    var diasSemana = arrayListOf<String>("Lunes", "Martes", "Miércoles", "Jueves", "Sábado", "Domingo")
    diasSemana.forEachIndexed { i, dia ->
        println("Día ${i+1}: $dia")
    }
}