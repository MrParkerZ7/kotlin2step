package kotlincode.simplecode.collection

fun main(args: Array<String>) {
//    immutableList()
//    mutableList()
    objectList()
}

private data class Human(var name: String, var age: Int)

private fun objectList() {
    var obj: MutableList<Human> = mutableListOf(Human("Park", 24), Human("Maria", 27))

    for (o in obj)
        println(o)
}

private fun mutableList() {
    // Mutable can be change value inside
    var name: MutableList<String> = mutableListOf("Mark", "Musk", "Fuck")
    var named: MutableList<String> = mutableListOf<String>("Samaru", "Nick", "Jame", "Micro")

    named.add(1, "Park")
    named.addAll(0, name)
    named.remove("Samaru")
    for (n in named)
        println(" $n ")
}

private fun immutableList() {
    // The mutable list is can't not be add more value.
    var named: List<String> = listOf<String>("Park", "Mark", "Sonia", "Max")

    println(named.get(2))
    println(named.indexOf("Max"))
    for (n in named)
        print(" $n ")
}

