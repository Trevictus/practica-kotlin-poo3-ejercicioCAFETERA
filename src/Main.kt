fun main() {


    //TODO: Crear 3 cafeeras en la Sala, Cocina y Oficina
    val cafeteras = listOf(
        Cafetera("Salón"),
        Cafetera("Sótano", 750),
        Cafetera("Armario", 500, 200)
    )

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias
    val capacidades = listOf(50, 75, 100)
    val conjuntoTazas = mutableListOf<Taza>()
    repeat(20) {
        val tazas = Taza(color = Color.entries.random(), capacidades.random())
        conjuntoTazas.add(tazas)
    }



    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    for (cafetera in cafeteras) {
        println(cafetera)
    }
    for (taza in conjuntoTazas) {
        println(taza)
    }

    println("**********************************************")
    //TODO: Llenar la cafetera1 de café.
    println("Llenar la cafetera1 de café...")
    cafeteras[0].llenar()
    println(cafeteras[0])
    //TODO: Vaciar la cafetera2.
    println("Vaciar la cafetera2...")
    cafeteras[1].vaciar()
    println(cafeteras[1])
    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    cafeteras[1].agregarCafe(375)
    println(cafeteras[1])
    //TODO: Agregar 400 c.c. de café a la cafereta3
    println("Agregar 400 c.c. de café a la cafereta3...")
    cafeteras[2].agregarCafe(400)
    println(cafeteras[2])

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    for (cafetera in cafeteras) {
        println(cafetera)
    }

    println("**********************************************")
    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.
    println("Servir café en las tazas...")
    for (cafetera in cafeteras) {

        for (taza in conjuntoTazas) {
            if (cafetera.cantidad > 0) {
                if (taza.cantidad < taza.capacidad) {
                    cafetera.servirTaza(taza)
                }
            }
        }
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    for (cafetera in cafeteras) {
        println(cafetera)
    }
    for (taza in conjuntoTazas) {
        println(taza)
    }

}