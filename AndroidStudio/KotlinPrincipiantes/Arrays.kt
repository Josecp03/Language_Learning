package com.example.variablesyconstantes

fun main () {
    arrays()
}

private fun arrays() {

    val nombre = "José"
    val apellido = "Corrochano"
    val edad = "21"

    // Creación del array
    val miArray = arrayListOf<String>()

    // Añadir datos
    miArray.add(nombre)
    miArray.add(apellido)
    miArray.add(edad)
    miArray.add(edad) // Se pueden añadir elementos repetidos

    // Añadir un conjunto de datos
    miArray.addAll(listOf("Hola", "Bienvenidos"))

    // Acceso a datos
    val miNombre = miArray[0]
    println(miNombre)

    // Modificación de datos
    miArray[5] = "Adiós"

    // Elminació de datos
    miArray.removeAt(4)

    // Recorrer arrays
    miArray.forEach {
        println(it)
    }

    // Contar los elemetos
    val numeroElementos = miArray.count() // Contar elementos
    println(numeroElementos)

    // Ordenar por orden alfabético
    miArray.sort()
    
    // Imprimir el array por pantalla
    println(miArray)

    // Borrar todos los elementos del array
    miArray.clear()
    println(miArray)
}