package kotlincode.simple_code.collections.predicates

fun main(args: Array<String>) {

    // ".all" return true when all values return true in condition block. else return false.
    var salary: MutableList<Int> = mutableListOf(4_500, 7_600, 3_200, 8_900, 12_000)
    var validate = salary.all { it < 20_000 } // return boolean

    println(validate)
}