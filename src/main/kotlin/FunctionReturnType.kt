fun jumlah(a:Int, b:Int):Int{
    val total = a + b

     println("totalnya adalah $total")

    return total
}

fun main() {
    println("Masukkan angka ke 1")
    val angka1 = Integer.valueOf(readLine())
    println("Masukkan angka ke 2")
    val angka2 = Integer.valueOf(readLine())
    jumlah(a = angka1 , b = angka2)
}