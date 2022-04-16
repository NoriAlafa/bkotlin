fun main() {
    val nama: String = "Nama kamu siapa"
    print(nama)
    val jawab = readLine()
    val jumNilai: String = "Masukkan nilai"
    print(jumNilai)
    var nilai = readLine().toString()


    if(nilai >= "80"){
        println("Lulus Grade A")
    }
    else if(nilai>="75"){
        println("Lulus Grade B")
    }
    else{
        println("Gagal")
    }



}