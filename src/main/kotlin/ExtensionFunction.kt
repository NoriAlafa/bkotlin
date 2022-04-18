fun String.hello():String{
    return "Hello $this"
}

fun Int.angka():Int{
    println("Ini Angka $this")
    return this
}
fun main() {
    val name = "Alfa"
    val hello : String = name.hello()
    println(hello)
    val huruf = 120
    println(huruf.angka())
}