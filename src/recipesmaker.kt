fun main(args: Array<String>){

    var recetas: String? = ""
    var numero: Int = 0
    val ingredientes: List<String> = listOf("Agua,", "Leche,", "Carne,", "Verduras,", "Frutas,","Cereal,", "Huevos,", "Aceite,")

    // Opciones del Menú

    do {
        println("Selecciona una opción de las siguientes")
        println("1. Hacer una receta\n2. Ver mis recetas\n3. Salir")
        println("# opción: ")

        do {
            numero = readLine()!!.toInt()
        }while (numero>3 || numero<1)

        // Impresion de opciones

        if (numero ==1){
            println("Título de la receta: ")
            recetas += readLine() + "\n"

            // Ahora añadimos los ingredientes

            println("Selecciona los ingredientes")
            println("""
                1. Agua
                2. Leche
                3. Carne
                4. Verduras
                5. Frutas
                6. Cereal
                7. Huevos
                8. Aceite
                9. Volver al Menú principal.
            """.trimIndent())

            do {
                println("Opción:")
                var ingrediente = 0

                do {
                    ingrediente = readLine()!!.toInt()
                }while (ingrediente>9 || ingrediente<1)

                if (ingrediente!=9)
                    recetas += ingredientes[ingrediente!!.minus(1)] + " "
            }while (ingrediente!=9)
            recetas += "\n\n\n\n"
        }else if (numero == 2){
            println(recetas)
        }

    }while (numero !=3)
    println("Hasta pronto!!!")
}