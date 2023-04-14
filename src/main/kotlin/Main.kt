fun main(args: Array<String>) {

    var array = arrayOfNulls<Vehiculo>(4)

    array[0] = Vehiculo("M8A1", "Mercedes Benz", "2029")
    array[1] = TipoTurismo("BRECCI 205", "Mercedes Benz", "2029", "6")
    array[2] = TipoDeportivo("Scar H", "Mercedes benz", "2029", 2029)
    array[3] = TipoFurgoneta("MSMC", "Mercedes Benz Clase S", "2029", "3000KG")

    for (i in array.indices){
        println(array[i]!!.showData())
    }
}

// JUAN LUIS COUTINO LOPEZ
