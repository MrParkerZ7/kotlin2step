package kotlincode.kotlin_document.a_getting_started

fun main(args: Array<String>) {
    lamdas()
}

fun lamdas() {
    var list = listOf(2, 3, 34, 22, 52, 66, 13, 21)
    list.filter { it > 10 }.map { element -> element * 2 }
    println(list)
}
