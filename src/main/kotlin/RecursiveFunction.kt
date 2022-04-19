fun main() {
    fun factorialLoop(value:Int):Int{
        var result = 1;
        for(i in value downTo 1){
            result *= i
        }
        return result
    }
    
    println("Masukkan angka factorial")
    val pilih = Integer.valueOf(readLine())
    println(factorialLoop(pilih))


    //contoh menggunakan recursive function
    fun factorialRecursive(value:Int):Int{
        return when(value){
            1->{1}
            else->{value * factorialRecursive(value - 1)} //lihat , dia menggunakan fungsinya sendiri
        }
    }

    println("Masukkan angka factorial")
    val pilih2 = Integer.valueOf(readLine())
    println(factorialRecursive(pilih2))
}