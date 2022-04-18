fun hitungTotal(nama:String ,vararg values:Int)/*vararg harus diakhir parameter*/:Int{
    var total = 0
    for(value in values){
        total += value
    }
    return total
}

fun main() {
    println(hitungTotal("Alfa",10,10,10,10))

}