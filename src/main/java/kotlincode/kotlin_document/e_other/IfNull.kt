package kotlincode.kotlin_document.e_other

fun main(args: Array<String>) {
    Body("Park")
    Body()
}

class Body(var name: String? = null) {
    init {
        var a = name ?: "Anonymous" // Using ?: it's likely to if (name != null) name else "Anonymous"
        println("Result: $a")
    }
}