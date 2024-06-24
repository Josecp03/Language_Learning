package com.example.variablesyconstantes.Maps

fun main () {
    maps()
}

private fun maps() {

    // Sintaxis
    var miMapa: Map<String, Int> = mapOf()
    println(miMapa)

    // Añadir elementos
    miMapa = mutableMapOf("Clave1" to 1, "Calve2" to 2, "Clave3" to 3)
    println(miMapa)

    // Añadir datos uno a uno
    miMapa["ClaveNueva"] = 7 // No me dejaba añadir un nuevo elemento porque el mapa no es mutable, para ello tenemos que definirlo como mutable anteriormente
    println(miMapa)

    // Otra forma de añadir elementos
    miMapa.put("Clave10", 10)
    println(miMapa)

    /*
    - SE PUEDEN DAR VALORES IGUALES EN DIFERENTE CLAVES, ES DECIR ->
        CLAVE1 = 2  CLAVE2 = 2
    - NO PUEDE HABER DISTINTOS VALORES PARA LA MISMA CLAVE, ES DECIR ->
        CLAVE1 = 1  CLAVE1 = 2     (CLAVE1, sería igual a 2 porque es lo último modificado, pero no habría dos elementos, sino solo uno)
     */

    // Acceso a un dato
    println(miMapa["Clave1"])

    // Actualización de datos
    miMapa.put("ClaveNueva",50) // También se puede hacer miMapa["ClaveNueva"] = 50
    println(miMapa["ClaveNueva"])

    // Elminar un dato
    miMapa.remove("ClaveNueva")
    println(miMapa)

}