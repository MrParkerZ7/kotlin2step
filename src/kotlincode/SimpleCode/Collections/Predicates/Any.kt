package kotlincode.SimpleCode.collection

fun main(args: Array<String>) {
    conditionAny()
}

private fun conditionAny() {

    // ".any" return true when any values which one or more is return true in condition block
    val number: Collection<Int> = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var validate: Boolean = number.any { it % 3 == 0 } // return boolean

    println(validate)
}

