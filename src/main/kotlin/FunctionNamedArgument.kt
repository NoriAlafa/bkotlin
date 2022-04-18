fun namaLengkap(
    firstName:String,
    middleName:String,
    lastName:String
){
    println("Halo $firstName $middleName $lastName")
}
fun main() {
    namaLengkap(
        firstName = "Alfa",
        lastName = "Naoki",
        middleName = "Nori"
    ) //gak harus urut sesuai param yang terpenting sesua dengan nama param
}