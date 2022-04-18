fun satu(){

}
fun dua(){
    satu() //jika membuat fungsi diluar main maka bisa diakses oleh fungsi diluar lainnya
}
fun main() {
    //membuat function yang hanya bisa diakses oleh function main
    //function dalam function hehe
    fun sayBAKA(baka:String) = println(baka) //function single expression

    sayBAKA("BAKAYARO")
}