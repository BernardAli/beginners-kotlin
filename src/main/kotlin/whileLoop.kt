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
    println("Done")

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
        print(i * 2)
    }
    println()

    repeat(3){
        println("I love Muna")
    }

    loop@ for (i in 0 until 4) {
        for (j in 0 until 2) {
            if (i == 3) {
                break@loop
            }
            println("$i - $j, ")
        }
    }
}