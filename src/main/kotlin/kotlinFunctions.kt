fun main() {
    printMessage()
    printMessage2("Ben Ali")
    printMessage2("Eddie Ali")
    printMessage2("Muna Ali")
    printMessage2("Isaac Agyemang")

    add(20, 22)
    add(41, 19)
    add(a = 21, 199)
    add(21)
    add(b = 50, a = 120)
    add(a = 100)
    println(max(199, 201))

    greeting("ben", "ike", "eddie", "muna")
    greeting("ike", "eddie", "muna")

    println(func(2, 3))
    println(addOne(25))

    println(increase(80))

    println(factorial(20))
}

fun printMessage(){
    println("Hello Ben")
}

fun printMessage2(msg:String){
    println("Hello, $msg")
}

fun add(a:Int, b:Int=0){
    println(a + b)
}

fun max(a:Int, b:Int):Int {
    return if( a > b) a else b
}


// Arbitrary Number of Arguments
fun greeting(vararg persons:String) {
    persons.forEach { print("${ it } ") }
}

// Parameters are vals
fun add(i: Int): Int {
    return i * 2
}


// Anonymous Functions
var func = fun (a:Int, b:Int):Int {return a * b}


// Single Expression
fun addOne (a:Int):Int = a * a


// Lambda
val increase = {a:Int -> a * a}


// Recursive Functions
fun factorial(n:Int):Long{
    return if (n <= 1){
        1
    } else {
        n * factorial(n - 1)
    }
}



