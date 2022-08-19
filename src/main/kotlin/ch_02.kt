fun main() {
    println("Hello World!")
    println("Please Enter your Name:")
//    val name = readLine()
//    println("Hello $name")

    /**
     * comments
     * this *main function
     * @author Ben Ali
     * @since 2019
     */

    // single line comment

    // Basic Types
    // Integer Types
    // Byte(8), Short(16), Int(32), Long(64)
    var worldPopulation = 7_900_000_000L
    println(worldPopulation)

    // Floating Point Types
    // Float, Double
    val temperature = 45.23
    val price = 2.78

    println(price * 0.5)

    // Boolean
    // true, false
    val isMale = true
    println(isMale)

    // Unsigned Integer Types
    var age = 27
    val newAge = age.toUShort()
    println(newAge)

    // Numeric Conversion
    // toByte, toInt, toLong, toFloat, toDouble, toChar(), toString
    println(newAge.toString() + 2)

}