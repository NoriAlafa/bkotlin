fun main() {
    var i = 0
    while(true){
        println("Stop $i")
        i++
        if(i>5){
            break
        }
    }

    for(j in 1..10){
        if(j%2 == 0){
            continue
        }
        println(j)
    }
}