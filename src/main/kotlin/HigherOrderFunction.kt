fun main() {
    //higher order function itu menjadikan lambda sebagai paramater
    //walaupun rumit tapi ini sangat powerfull:)

    fun hello(value:String , transform:(String)->String):String{
        return "Hello ${transform(value)}"
    }

    //kita inisialisasi lambda nya
    val capslock = {value:String->value.uppercase()}
    val biasa = {value:String->value.lowercase()}

    println(hello("alfa",capslock))
    println(hello("ALFA",biasa))

    //cara lain
    println(hello("naoki",{value:String->value.uppercase()}))

    //cara lain menggunakan trailing lambda agar enak pembacaan kode
    val result = hello("NAOKI"){value:String->
        value.lowercase()
    }
    println(result)
}