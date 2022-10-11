fun main() {
    val pair1 = Pair<Int, String>(1, "John")
    val pair2 = Pair(1, "Denise")
    val pair3 = Pair("Kumasi Academy", "Kumasi")
    var pair4 = "Ike" to "Ashanti"

    println(pair1)
    println(pair2)
    println(pair3)
    println(pair4)

    val pair5 = pair1.copy(first = 20)
    println(pair5)
}