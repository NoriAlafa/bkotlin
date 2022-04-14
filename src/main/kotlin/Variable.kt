const val APP: String = "Kotlin" //variable const bisa diakses secara global/menyeluruh
const val VERSION:String = "1.7.0"
fun main() {
    println("Welcome to $APP versi $VERSION") //walaupun const tidak dideklarasi disini tetapi ttp bisa diakses
    //dan const tidak boleh dideklarasikan di local , jika di local gunakan val

    var anjing: String = "pradit"
    var babi = "indra"

    val pacar: String = "Naoki" //ini tidak bisa dirubah

    //jika var kita bebas mengubah tipedata variable jika val tidak bisa mengubah tipedata byukan datanya
    //mengubah variable
    babi = "indra ajg"

    //variable null
    var kosong: String? = null //ini jika variable bernilai kosong , variable tidak boleh tidak diinisialisasi
    //tanda tanya ini memberi tahu bahwa varible boleh diisi data null
    //ini tidak direkomendasikan , sebagai jalan akhir saja jika sudah mentok atau jika mengakses kode java
    println(kosong?.length) //cara mengakses yang benar
    println(kosong)
}