fun main() {
    val map1: Map<Int, String> = mapOf(
        1 to "John",
        2 to "Peter"
    )

    val map2 = mapOf(
        1 to "John",
        2 to "Peter"
    )

    val map = mutableMapOf(
        "Ireland" to "Dublin",
        "UK" to "London",
        "France" to "Paris",
        "Spain" to "Madrid",
    )

    println(map1)
    println(map2)
    println(map)

    // Properties
    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.isEmpty())

    for (i in map.keys){
        println(i)
    }

    for (i in map.values){
        println(i)
    }

    for (i in map){
        println(i)
    }
}