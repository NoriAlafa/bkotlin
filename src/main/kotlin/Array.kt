const val ARRAY: String = "Selamat datang di array"
fun main() {
    println("$ARRAY")

    val member: Array<String> = arrayOf("Alfa","Naoki","Erin")
    val item: Array<Byte>   = arrayOf(5,5,4)
    val defence: Array<Int> = arrayOf(10_000,5_000,8_000)

    println(member[0])
    println("item " + item[0])
    println("defence " + defence[0])
    println(defence.size)
    defence.set(1,6_000) //val kok diubah? val datanya bisa diubah ttp tidak dengan tipedatanya
    println("Naoki Upgrade defence " + defence[1])

    //array nullable

    /*
    * standart array tidak boleh null , jika kita memaksa membuat null
    * maka diperlukan tanda tanya (?)
    * */
    val hewan: Array<String?> = arrayOfNulls(5)
    hewan.set(1,"pradit anjing")
    hewan.set(2,null) //ini tidak akan error karena kita sudah menginisialisasi array boleh null
    println(hewan[1])
    println(hewan[2])
}