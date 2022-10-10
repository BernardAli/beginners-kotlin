fun main() {
    val list0: List<String> = ArrayList()
    val list1: MutableList<String> = ArrayList()
    val list2: MutableList<String> = ArrayList()
    println("myList0: $list0")
    println("myList1: $list1")

    val myList1 = listOf<String>("One", "Two", "Three")
    val myList2 = listOf("One", "Two", "Three")
    val myList3 = mutableListOf("Denise", "Adam", "Phoebe")
    val myList4 = listOf<String>() // Create an empty list

    println("myList1: $myList1")
    println("myList2: $myList2")
    println("myList3: $myList2")
    println("myList4: $myList4")

    val rootList = listOf("John", myList1, myList2, "Denise")
    println(rootList)

    println("Take a slice of a list")
    val group = listOf("John", "Paul", "George", "Ringo")
    println(group)
    println(group.slice((1..3)))

    val list01= mutableListOf("John", "Paul", "George", "Ringo")
    list1.add("Pete")
    println(list01)

    println("list.first(): ${myList1.first()}")
    println("list.last(): ${myList1.last()}")
    println("list.takeLast(2): ${myList1.takeLast(2)}")
    println("list.isEmpty(): ${myList1.isEmpty()}")
    println("list.isNotEmpty(): ${myList1.isNotEmpty()}")
    println("list.asReversed(): ${myList1.asReversed()}")
}

