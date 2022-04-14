fun main() {
    var firstName: String = "NORI"
    var lastName: String = "ALAFA"
    var lengkap: String = firstName + " " + lastName
    var alamat: String = """
        Jalan belum jadi RT 05 RW 06
        Kabupaten Kediri
        Indonesia
    """.trimIndent() //fungsi ini menghilangkan string spasi
    println(lengkap)
    println(alamat)

    //string template
    var anjing: String = "PRADIT"
    var babi: String = "INDRA"
    var bajingan: String = "$anjing $babi"
    var panjang: String = "Panjang $anjing char = ${anjing.length}"

    println(bajingan)
    println(panjang)
}