    class TipoFurgoneta(registration : String?, brand : String?, model : String?, var load : String?)
    : Vehiculo(registration!!, brand!!, model!!) {

        override fun showData() : String{
            return "Registration = $registration Brand = $brand Model = $model Load Capacity = $load"
        }
}