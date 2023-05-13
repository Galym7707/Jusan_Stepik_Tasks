fun <T> T.displayTypeInfo(){
    when(this){
        is String -> println("это String")
        is Int -> println("это Int")
        else -> println("тип у $this неизвестен")
    }
}

fun main(){
    3.displayTypeInfo()
}
