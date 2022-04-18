fun hello(firstName: String,lastName:String? = null){
    if(lastName == null){
        println("Halo $firstName")
    }
    else {
        println("Halo $firstName $lastName")
    }    //lastName adalah default parameter
}
fun main() {
    hello("Alfa")
    hello("Alfa","Naoki")
}