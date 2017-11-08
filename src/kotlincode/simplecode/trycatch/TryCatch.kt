package kotlincode.simplecode.trycatch

fun main(args: Array<String>) {

    commonTryCatch()
    expressionTryCatch()

}

private fun commonTryCatch() {
    var str = "5x"
    var result: Int = 0

    try {
        str.toInt()
        println("CommonTryCatch: $result")
    } catch (e: NumberFormatException) {
        println("Error: $e")
    }

}

private fun expressionTryCatch() {
    var str = "5x"
    var result: Int

    result = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        1
    }

    println("ExTryCatch: $result")
}