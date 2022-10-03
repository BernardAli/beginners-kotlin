import kotlin.math.*

fun main() {
    println("Hello World!")
    println("Please Enter your Name:")
//    val name = readLine()
    var name = "Ben Ali"
    name = "Muna"
    println("Hello $name")


    /**
     * comments
     * this *main function
     * @author Ben Ali
     * @since 2022
     * @exception
     */

    // single line comment

    // Basic Types
    // Integer Types
    // Byte(8), Short(16), Int(32), Long(64)
    val worldPopulation = 7_900_000_000
    println(worldPopulation)

    // Floating Point Types
    // Float(F), Double
    val temperature = 45.23
    val price = 2.78
    println(price * 0.5)

    println(PI)

    // Boolean
    // true, false
    val isMale = true
    println(isMale)

    // Unsigned Integer Types
    val age = 27L
    var newAge = age.toUShort()
    newAge = 28.toUShort()
    println(newAge)

    // Numeric Conversion
    // toByte, toInt, toLong, toFloat, toDouble, toChar(), toString
    println(newAge.toString() + 2)
    println(newAge.toInt() + 2)

}