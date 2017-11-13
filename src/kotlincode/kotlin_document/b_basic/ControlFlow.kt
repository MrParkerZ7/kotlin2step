package kotlincode.kotlin_document.b_basic

fun main(args: Array<String>) {
//    whenLogic()
//    whenIn()
//    whileLoop()
//    doWhile()
    
}

fun doWhile() {
    var x = 10

    do {
        println(x--)
    } while (x > 0)
}

fun whileLoop() {
    var x = 10
    while (x > 0)
        println("While: ${x--}")
}

private fun whenLogic() {
    var x = 1
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
}

private fun whenIn() {
    var customer = listOf<String>("Park", "Thor", "Hulk", "Odin")
    var owner = listOf<String>("Marry", "Mass", "Ray")

    var who = "ray"
    when (who) {
        in customer -> println("There is customer.")
        in owner -> println("There is owner")
        else -> println("There is THIEF!!")
    }
}