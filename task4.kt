sealed class DataType{
    class DoubleType (val value : Double) : DataType()
    object UnitType : DataType()
}
fun <T> T.displayTypeInfo(){
    when (this){
        is String -> println("это String")
        is Int -> println("это Int")
        is Double -> println("это Double")
        else -> println("тип у $this неизвестен")
    }
}
fun DataType.displayTypeInfo(){
    when (this){
        is DataType.DoubleType -> println("это DoubleType со значением $value")
        is DataType.UnitType -> println("это Unit")
    }
}
