
class Taza(val color: Color = Color.BLANCO, var capacidad: Int = 50, var cantidad: Int = 0) {

    fun llenar(){
        cantidad = capacidad
    }

    fun llenar(agregar: Int){
        cantidad = agregar
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}