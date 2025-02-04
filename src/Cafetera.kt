class Cafetera(val ubicacion: String) {

    var capacidad: Int = 1000
    var cantidad:Int = 0
    val agregar: Int = 200

    constructor(ubicacion: String, capacidad: Int): this(ubicacion){
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion, capacidad){
        if (cantidad > capacidad){
            this.cantidad = capacidad
        }
    }

    fun llenar(){
        this.cantidad = this.capacidad
    }

    fun servirTaza(taza: Taza){
        if(cantidad > taza.capacidad){
            taza.cantidad = taza.capacidad
            cantidad -= taza.capacidad
        }
        if(cantidad < taza.capacidad){
            taza.capacidad = cantidad
            cantidad
        }
    }

    fun vaciar(){
        cantidad
    }

    fun agregarCafe(){
        capacidad += agregar
    }
}