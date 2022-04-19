fun main() {

    fun yoi(name:String=""):String{
        return if(name == ""){
            "Hello bro"
        }
        else{
           "Halo $name"
        }
    }

    fun pilih(menu:String = ""):String{
        return when(menu){
            ""  -> {"Belum Pesan"}
            else->{"Menu anda $menu"}
        }
    }

    println(yoi())
    println(yoi("Alfa"))
    println(pilih())
    println(pilih("Mie Goreng"))
}