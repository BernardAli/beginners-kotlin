fun main() {
    // Comparison Operators
    // ==, !==, >, >=, <, <=

    // Logical Operators
    // &, &&, |, ||, ^, !

    // Numerical Operators
    // +, -, *, /, %

    // Unary Operators
    // ++, --

    // Assignment Operators
    // +=, -=, *=, /=, %=

    // If statement
    val a = 5
    val b = 20
    val min = if (a < b) a else b
    val max = if (a > b) a else b
    println(max)
    println(min)

    println("Starting")
    print("Enter a number: ")

    val inputString = readLine()
    val number = inputString!!.toInt()

    if (number > 0) {
        // Multiple lines grouped together for the if statement
        println("$number is positive")
        println("$number squared is ${number *number}")
    } else if (number == 0) {
        println(" $number Its Zero")
    } else {
        println("$number Its negative")
    }
    println("Bye")


    val age = 18
    var status = ""
    status = if (age > 12 && age < 20) "teenager" else "not a teenager"
    println("$age - you are $status")

    var temp = 0
    var feeling = "cold"
    while (feeling == "cold"){
        temp ++
        if (temp == 20){
            feeling = "warm"
        }
    }
    println(temp)
    println(feeling)


}