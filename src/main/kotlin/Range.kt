fun main() {
    val range = 1..100 //membuat data nilai dari 1 sampai 100
    println(range.count())
    println(range.contains(50)) //apakah ada 50 di 100
    println(range.contains(200))
    println(range.first)
    println(range.last)

    //range terbalik
    val terbalik = 100 downTo  1
    println(range.step)
    println(terbalik.step)

    //mengubah step range
    val rangeStep1 = 1..100 step 5
    val rangeStep2 = 100 downTo 1 step 5
    println(rangeStep1.step)
    println(rangeStep1.count())
    println(rangeStep1.last)
    println(rangeStep2.step)
}