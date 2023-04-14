open class Vehiculo(var registration : String , var brand : String , var model : String){

    open fun showData() : String{
        return ("Registration = $registration Brand = $brand Model = $model")
    }

}




