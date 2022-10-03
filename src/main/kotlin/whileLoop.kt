import kotlin.math.pow

fun main() {
    var number = 0

    println("Starting")
    while (number <= 10){
        print("$number ")
        if (number == 8){
            break
        }
        number++
    }
    println("\nDone")

    number = 0
    do {
        print("$number ")
        number++
    } while (number <= 10)


    while (true){
        println("q: quit")
        val toContinue = readLine()
        if (toContinue == "q"){
            break
        }
    }

    var values = 0 .. 20
    for (i in values){
        println(i)
        println(i.toDouble().pow(5))
    }
    println()

    repeat(3){
        println("I love Muna")
    }

    loop@ for (i in 0 until 4) {
        for (j in 0 until 3) {
            if (i == 3) {
                break@loop
            }
            println("$i - $j, ")
        }
    }
}