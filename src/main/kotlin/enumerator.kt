enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {
    val d = Direction.NORTH
    println(d)
    println("d.name: ${d.name}")
    println("d.ordinal: ${d.ordinal}")

    if (d == Direction.NORTH) {
        println("We are heading North")
    }
    println(d < Direction.SOUTH)

}