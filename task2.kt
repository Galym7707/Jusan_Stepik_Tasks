fun Int.powerTo(degree: Int, result: (Int) -> Unit){
    var degreed = 1
    repeat(degree) {
        degreed *= this
    }
    result(degreed)
}
fun main(){
    val initial = 3
    val degree = 5
    initial.powerTo(degree) {
        print("$initial в степени $degree равен $it")
    }
}
