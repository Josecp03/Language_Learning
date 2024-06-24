package com.example.variablesyconstantes.Clases

class Programador(var nombre:String,
                  var edad:Int,
                  var lenguajes: Array<lenguajesProgramacion>,
                  val amigos: Array<Programador>? = null // Se pueden añadir atributos de otros objetos, y se puedne instanciar cmo nulos con lo de la ?
) {

    fun codigo() {
        for (lenguaje:lenguajesProgramacion in lenguajes) {
            println(lenguaje)
        }
    }

    // Las enum class sirven para definir las únicas posibilidades que hay para un tipo de dato en específico.
    // Sustituye a lo que sería un String o Int, pero especificando los datos específicos que se pueden manejar,
    // para así evitar errores
    enum class lenguajesProgramacion {
        KOTLIN,
        JAVA,
        SQL,
        CSS
    }



}