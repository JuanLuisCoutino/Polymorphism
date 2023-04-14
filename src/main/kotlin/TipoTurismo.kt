class TipoTurismo(registration : String?, brand : String?, model : String?, var numDoors : String?)
    : Vehiculo(registration!!, brand!!, model!!){

        override fun showData() : String{
            return "Registration = $registration Brand = $brand Model = $model Numero de puertas = $numDoors"
        }
    }