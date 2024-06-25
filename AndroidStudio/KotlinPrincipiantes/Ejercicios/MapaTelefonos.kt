package com.example.variablesyconstantes.Ejercicios

fun main() {

    var telefonos: Map<String, Int>
    telefonos = mutableMapOf("José" to 123456789, "Pepe" to 987654321, "Adrián" to 111111111, "Lucas" to 123123123)
    telefonos.putAll(mapOf("María" to 234256916, "Adriana" to 634892639))
    telefonos.put("Raúl", 527391283)
    println(telefonos)

    telefonos["José"] = 222222222
    println(telefonos["José"])

    telefonos.remove("José")
    println(telefonos)

    for (telefono in telefonos) {
        println("El teléfono de ${telefono.key} es ${telefono.value}")
    }

}