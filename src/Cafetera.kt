class Cafetera(val ubicacion: String) {

    var capacidad: Int = 1000
    var cantidad:Int = 0
    val agregar: Int = 200

    constructor(ubicacion: String, capacidad: Int): this(ubicacion){
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion, capacidad){
        this.capacidad = capacidad

        if (cantidad > capacidad){
            this.cantidad = capacidad
        }else{
            this.cantidad = cantidad
        }
    }

    fun llenar(){
        cantidad = capacidad
    }

    fun servirTaza(taza: Taza){
        if(cantidad > taza.capacidad){
            taza.cantidad = taza.capacidad
            cantidad -= taza.capacidad
        }
        if(cantidad < taza.capacidad){
            taza.capacidad = cantidad
            cantidad = 0
        }
    }

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cantidad : Int = 200){

        if(cantidad + this.cantidad > this.capacidad){
            capacidad = 1000
            println("No se puede agregar mas café.")
        }else{
            this.cantidad += cantidad
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}