fun tampilMenu(){
    println("ini Menu")
}
fun main() {
    val menu = """
        Pilih menu
        1.Menu utama
    """.trimIndent()
    println(menu)
    val pilih = readLine()
    when(pilih){
        "1"->{
            tampilMenu()
        }
        else->{
            println("tidak ada")
        }
    }
}