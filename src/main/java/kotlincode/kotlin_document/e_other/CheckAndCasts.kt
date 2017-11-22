package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
//    isOparetor()
    asOparetor()
}

private fun asOparetor() {
    try {
        println(23 as String) // similar with is but throw exception.
    } catch (e: ClassCastException) {
        println("It's wasn't right: $e")
    }
}

private fun isOparetor() {
    var park = Any()
    park = 23
    park = "Park"
    if (park is String)
        println("It alive!")
    else
        println("It's Dead")
}