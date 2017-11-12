package kotlincode.SimpleCode.collection

fun main(args: Array<String>) {

    // ".filter" return collection of values which return true in condition block
    val number: Collection<Int> = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var cutNumber = number.filter { it % 2 == 0 } // return collection of values which pass validated.

    cutNumber.forEach(::println)
}
