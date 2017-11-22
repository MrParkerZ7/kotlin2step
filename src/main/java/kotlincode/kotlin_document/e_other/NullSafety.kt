package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
//    letCheckNull()
//    nullFilter()
    nonOrNull()
}

fun nonOrNull() {
    val b :String? = null
    val l = b!!.length // throw null exception when it's null
    println(l)
}

private fun nullFilter() {
    var list = listOf(500, 210, null, 564, 97, 654, null, 14, 35, 76).filterNotNull()
    println("FilterNullOut: $list")
}

private fun letCheckNull() {
    var list = listOf("Park", "Mark", null, "Suck", "Bark")
    for (name in list) {
        name?.let { print(" $it ") } // ignore null when put ? after variable.
    }
}