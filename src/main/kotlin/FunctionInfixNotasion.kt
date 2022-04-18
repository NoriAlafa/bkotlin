infix fun String.tebal(type:String):String{
    if(type == "UP"){
        return this.uppercase()
    }
    else{
        return this.lowercase()
    }
}
fun main() {
    val result:String = "alfa" tebal "UP" //tidak perlu menggunakan titik
    println(result)
}