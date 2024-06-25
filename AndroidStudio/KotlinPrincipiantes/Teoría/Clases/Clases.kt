package com.example.variablesyconstantes.Clases

fun main() {

    val José = Programador("José", 21, arrayOf(Programador.lenguajesProgramacion.KOTLIN, Programador.lenguajesProgramacion.JAVA)) // Es necesario especificar así el tipo de dato que hemos definido en la clase
    println(José.edad)

    José.edad = 20
    println(José.edad)

    val Pepe = Programador("Pepe", 40, arrayOf(Programador.lenguajesProgramacion.CSS, Programador.lenguajesProgramacion.SQL), arrayOf(José))
    Pepe.codigo()
    println("${Pepe.amigos?.first()?.nombre} es amigo de ${Pepe.nombre}")
}