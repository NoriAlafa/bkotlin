fun main() {
    //for array
    val anggota:Array<String> = arrayOf("Nori","Alafa","oke")
    for(angg in anggota){
        println(angg)
    }

    val ukuranArray = anggota.size - 1
    for(uk in 0..ukuranArray){
        println("index ke $uk = ${anggota[uk]}")
    }

    //for range
    for(a in 1..10){
        println(a)
    }
    for(b in 100 downTo 1 step 10){
        println(b)
    }
}