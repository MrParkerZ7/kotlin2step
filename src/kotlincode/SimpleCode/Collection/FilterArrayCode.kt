package kotlincode.SimpleCode.collection

fun main(args: Array<String>) {
//    fullManner()
    shrinkManner()
}

private fun shrinkManner() {
    val value = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).filter { it % 2 == 0 }.map { it * 2 }

    value.forEach(::println)
}

private fun fullManner() {
    val value = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var couples = value.filter { it % 2 == 0 }
    var doubleValue = couples.map { it * 2 }

    doubleValue.forEach(::println)
}