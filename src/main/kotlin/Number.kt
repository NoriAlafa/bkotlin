fun main() {
    var age: Byte = 18
    var tinggi: Int = 180
    var uangjajan: Short = 2000
    var saldo: Long = 50000000L

    var sampleFloat: Float = 14.14F //harus ada F jika tidak di anggap sebagai variable double
    var sampleDouble: Double = 14.14

    //literal
    var binary: Int = 0b010101010
    var hexaDecimal: Int = 0xFF

    //underscore in number
    var underScore: Byte =3_0
    var underScore2: Int = 1_7_0
    var underScore3: Short = 2_000
    var underScore4: Long = 50_000_000L

    //conversi
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var double: Double = number.toDouble()
    var float: Float = number.toFloat()
    var long: Long = number.toLong()
    
    println(age)
    println(tinggi)
    println(uangjajan)
}