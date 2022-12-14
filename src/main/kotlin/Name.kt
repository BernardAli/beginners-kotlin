inline class Name(val value: String) {

    val length: Int
        get() = value.length

    fun greet() {
        println("Hello, $value")
    }
}

fun main() {
    val name = Name("Kotlin")
    name.greet()
    println(name.length)
}