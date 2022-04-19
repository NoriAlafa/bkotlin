fun toUpper(value:String):String =value.uppercase()
fun main(){
    val lambdaName:(String)->String = {value:String->
        value.uppercase() //otomatis ke return value nya
    }
    //lambda seperti function tetapi bisa disimpan di variable ataupun array , tanpa perlu meginisialisasi fun lagi
    println(lambdaName("alfa"))

    //contoh lainnya
    val lambdaNameDua:(String,String)->String/*<-ini return value nya*/ = {firstName:String , lastName:String->
        firstName.uppercase()
        lastName.lowercase()
    }
    println(lambdaNameDua("alfa","NAOKI"))

    //lambda it , ini hanya untuk lambda yang mempunyai 1 parameter
    val lambdaUmur:(String)->String = {
        "Hello ${it.uppercase()}"
    }
    println(lambdaUmur("tujuh belas"))

    //lambda method reference
    val reference:(String)->String = ::toUpper //::ini digunakan untuk reference fungsi diatas
    println(reference("babi"))
}