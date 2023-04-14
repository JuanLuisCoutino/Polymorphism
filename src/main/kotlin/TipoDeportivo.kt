class TipoDeportivo(registration : String?, brand : String?, model : String?, var cylinders : Int)
    : Vehiculo(registration!!, brand!!, model!! ) {

        override fun showData() : String{
            return "Registration = $registration Brand = $brand Model = $model Cyilinders  = $cylinders"
        }

}