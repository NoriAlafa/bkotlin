fun tambah(angka:Int,angkaDua:Int){
    println("Hasilnya adalah = ")
    println(angka + angkaDua)
}
fun main() {
    val menu = """
        =========================================
        1.penjumlahan
        =========================================
    """.trimIndent()
    println(menu)
    val pilih = readLine()
    when(pilih){
        "1"->{
            println("Masukkan angka")
            val angkaSatu = Integer.valueOf(readLine())
            println("Masukkan angka ke 2")
            val angkaDua = Integer.valueOf(readLine())
            tambah(angkaSatu,angkaDua)
        }
        else->{
            println("Oops")
        }
    }



}