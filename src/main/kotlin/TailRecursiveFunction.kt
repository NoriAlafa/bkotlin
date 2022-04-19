fun main() {
    tailrec fun display(value:Int){
        println(value)
        if(value > 0){
            display(value - 1)
            /*
            ketika menggunakan tail recursive maka ketika memanggil recursive nya tidak boleh ada embel embel lainnya
            contoh display(value - 1) + 2 ini adalah contoh yang salah
            */
        }
    }
    display(10)

    //contoh pada recursive function sebelumnya kita ganti ke tailrec
    //supaya jika memasukkan data yang besar tidak terjadi error stack overflow
    tailrec fun factorialLoop(value:Int , total:Int = 1):Int{
        return when(value){
            1->{total}
            else->factorialLoop(value - 1,total * value)
        }
    }
    println("Masukkan Angka Factorial")
    val oke = Integer.valueOf(readLine())
    println(factorialLoop(oke))
}