fun main() {
    val menu1 = "Paket Nasi"
    val menu2 = "Paket Minum"
    val menu = """
        ==========================================
                        Menu
        1.$menu1
        2.$menu2
        ==========================================
    """.trimIndent()
    println(menu)
    println("Pilih yang mana")
    val pilih = readLine()
    when(pilih){
        "1"->{
            println("$menu1 berhasil dipesan")
        }
        "2"->{
            println("$menu2 berhasil dipesan")
        }
        else->{
            println("Upps")
        }
    }

    //when expression banyak pilihan
    println("Masukkan nilai")
    val nilai = readLine()

    when(nilai){
        "90","80","75"->{
            println("lulus")
        }
        else->{
            println("gagal")
        }
    }

    //when expression in
    println("Masukkan nama")
    val cariNama = readLine()
    val nama:Array<String> = arrayOf("Alfa" , "Naoki" , "Erin")
    when(cariNama){
        in nama->{
            println("$cariNama ditemukan")
        }
        !in nama->{
            println("$cariNama tidak ditemukan")
        }
    }

    //when expression is
    val tipeData = "halo"
    when(tipeData){
        is String->{
            println("ini string")
        }
        !is String->{
            println("ini bukan string")
        }
    }

    //when pengganti if else
    val oknilai = 90
    when{
        oknilai > 80->{
            println("GG")
        }
        oknilai < 80->{
            println("CobaLagi")
        }
        else->{
            println("Tidak lulus")
        }
    }

}