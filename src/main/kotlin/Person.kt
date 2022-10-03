class Person constructor(var name: String, var age: Int)
    {

        init {
            println("In Init")
        }

        constructor(age: Int) : this("unnamed", age) {
            println("In auxiliary constructor")
        }

        override fun toString() = "Person($name, $age)"

        fun birthday() {
            var age = this.age
            age--
            println("Happy birthday you were $age")
            age++
            println("You are now ${this.age}")
        }
    }


fun main() {
    var p1 = Person(name = "Ben", age = 30)
    val p2 = Person(name = "Eddie", age = 27)
    val p3 = Person(30)
    println(p1.name)
    println(p2)

    val px = p1
    p1.name = "Ike"
    println(p1.name)
    println(px.name)
    println(p1.toString())

    println(p3.name)
    p3.birthday()
}