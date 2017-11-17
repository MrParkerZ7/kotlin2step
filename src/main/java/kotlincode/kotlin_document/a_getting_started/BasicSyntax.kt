package kotlincode.kotlin_document.a_getting_started

fun main(args: Array<String>) {
    var von = ValueOrNull()
    von.getValue("6")

    var a = listOf(1, 2, 4, 6, 7)

    println(2 in a)
}

class ValueOrNull {
    fun parseInt(value: String): Int? {
        return value.toIntOrNull()
    }

    fun getValue(value: String) {
        var v = parseInt(value)
        if (v != null)
            println("GetResult: $v")
        else
            println("Not number.")

    }
}