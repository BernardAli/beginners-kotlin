fun main() {
    val age:Any = 20.5
    var check = when (age) {
        in 12 .. 16 -> "Must be in School"
        in 17.. 18 -> "Can Drive"
        else -> "Can Vote"
    }
    println(check)

    var myDataType = when (age) {
        is Int -> println("Its a Int")
        is Double -> println("Its a Double")
        is Boolean -> println("Its a Boolean")
        is String -> println("Its a String")
        else -> println("its something else")
    }
    println(myDataType)
}