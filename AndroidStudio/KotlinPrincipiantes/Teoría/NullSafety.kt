package com.example.variablesyconstantes

import kotlinx.coroutines.runInterruptible

fun main() {
    nullSafety()
}

private fun nullSafety() {

    // En las operaciones donde un valor puede ser nulo, se añade una ? para que imprima null en vez de lanzar una excepcion.
    // También se puede pner un mensaje personalizado después de la interrogación en vez de que ponga null
    var nombre: String? = "Pedro"
    nombre = null
    println(nombre)
    println(nombre?.length ?:"La variable es null")
    
    // Comprobamos que cuando la variable no es nula, se muestra con normalidad aunque hayamos puesto la ? o el mensaje personalizado
    nombre = "Pepe"
    println(nombre)
    println(nombre?.length?:"La variable es null")

}

